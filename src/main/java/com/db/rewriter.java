package com.db;

import com.db.antlr.xpathgrammarParser;

import java.util.*;

public class rewriter {
    // $b <-> doc("input")/book,
    Map<String, String> map_var_xpath = new HashMap<>();
    // for each doc, we create new tree
    List<Tree> trees = new LinkedList<>();
    // know the var in which tree
    Map<String, Integer> map_var_tree = new HashMap<>();
    // know the link var eq var
    Map<String, String> map_var_eq_var = new HashMap<>();
    // know the link tree
    Map<Integer, Set<Integer>> tree_link = new HashMap<>();


    // int treeCounter = 0;
    String finalOutputString;

    // rewriter(xpathgrammarParser.Xq_for_let_where_returnContext c) {
    rewriter(xpathgrammarParser.XqContext ctx_Xq) {
        System.out.println(ctx_Xq.getText());
        if (ctx_Xq.getText().contains("join(")) {
            finalOutputString = "JOIN FOUND";
            return;
        }
        xpathgrammarParser.Xq_for_let_where_returnContext ctx = (xpathgrammarParser.Xq_for_let_where_returnContext) ctx_Xq;
        // handle for
        xpathgrammarParser.ForClauseContext ctx_for = ctx.forClause();
        // $b in doc("input")/book
        // classify var to teams
        for (int i = 0; i < ctx_for.var().size(); i++) {
            String var = ctx_for.var(i).getText();
            String xpath = ctx_for.xq(i).getText();

            map_var_xpath.put(var, xpath);

            if (xpath.startsWith("doc(")) {
                Tree tree = new Tree(trees.size());
                tree.addVar(var);
                map_var_tree.put(var, tree.getTreeNum());
                trees.add(tree);
                // treeCounter += 1;
            } else if (xpath.startsWith("$")){
                String xpath_var= xpath.substring(0, xpath.indexOf('/'));
                int treeNum = map_var_tree.get(xpath_var);
                // put new var into the same tree
                map_var_tree.put(var, treeNum);
                trees.get(treeNum).addVar(var);
            }
        }
        System.out.println("map_var_tree: " + map_var_tree);
        System.out.println("map_var_xpath: " + map_var_xpath);

        // handle where
        // Need to handle
        // (1) cond AND cond => (xq eq xq) AND (xq eq xq)
        // (2.1) var eq "string"
        // (2.2) var eq var
        xpathgrammarParser.WhereClauseContext ctx_where = ctx.whereClause();
        xpathgrammarParser.CondContext ctx_cond = ctx_where.cond();
        System.out.println("ctx_cond: " + ctx_cond.getText());
        condTraverse(ctx_cond);

        // handle return
        xpathgrammarParser.ReturnClauseContext ctx_return = ctx.returnClause();
        String endReturnString = "return " + ctx_return.xq().getText().replaceAll("\\$([a-zA-Z0-9_]+)", "\\$tuple/$1/*");
        System.out.println("endReturnString: " + endReturnString);
        buildFinalOutputRewrite(endReturnString);
    }

    private void condTraverse(xpathgrammarParser.CondContext ctx_cond) {
        // (1.1) cond AND cond => (1.2) cond = xq eq xq =>
        // (2.1) var eq "string"
        // (2.2) var eq var
        // -----------------------------
        if (ctx_cond instanceof xpathgrammarParser.Cond_and_condContext) {
            // (1.1) cond AND cond
            System.out.println("condTraverse: cond AND cond = " + ctx_cond.getText());
            xpathgrammarParser.Cond_and_condContext ctx_cond_and_cond = (xpathgrammarParser.Cond_and_condContext) ctx_cond;
            condTraverse(ctx_cond_and_cond.cond(0));
            condTraverse(ctx_cond_and_cond.cond(1));
        } else if(ctx_cond instanceof xpathgrammarParser.Cond_eqContext){
            // (1.2) xq eq xq
            System.out.println("condTraverse: xq eq xq = " + ctx_cond.getText());
            xpathgrammarParser.Cond_eqContext ctx_eq = (xpathgrammarParser.Cond_eqContext) ctx_cond;
            // start handle
            // (2.1) var eq "string"
            // (2.2) var eq var
            if (ctx_eq.xq(0).getText().indexOf('$') != 0 || ctx_eq.xq(1).getText().indexOf('$') != 0) {
                // (2.1) var eq "string"
                // need to output where and the statement in the same FLWR
                System.out.println("condTraverse: var eq \"string\" = " + ctx_cond.getText());
                if (ctx_eq.xq(0).getText().indexOf('$') == 0) {
                    int treeNum = map_var_tree.get(ctx_eq.xq(0).getText());
                    trees.get(treeNum).addWhere(ctx_eq.getText().replace("eq", " eq "));
                    trees.get(treeNum).printWhere();
                } else if (ctx_eq.xq(1).getText().indexOf('$') == 0) {
                    int treeNum = map_var_tree.get(ctx_eq.xq(1).getText());
                    trees.get(treeNum).addWhere(ctx_eq.getText().replace("eq", " eq "));
                    trees.get(treeNum).printWhere();
                } else {
                    System.out.println("ERROR");
                    assert false;
                }
            } else {
                // (2.2) var eq var
                // need to link var
                System.out.println("condTraverse: var eq var = " + ctx_cond.getText());
                map_var_eq_var.put(ctx_eq.xq(0).getText(), ctx_eq.xq(1).getText());
                System.out.println("map_var_eq_var: " + map_var_eq_var);
                Map<Integer, Integer> tempMap = new HashMap<>();
                int treeNum1 = map_var_tree.get(ctx_eq.xq(0).getText());
                int treeNum2 = map_var_tree.get(ctx_eq.xq(1).getText());
                // make sure treeNum1 is smaller
                if (treeNum1 > treeNum2) {
                    int temp = treeNum1;
                    treeNum1 = treeNum2;
                    treeNum2 = temp;
                }
                if (tree_link.get(treeNum1) == null) {
                    tree_link.put(treeNum1, new HashSet<Integer>());
                }
                if (!tree_link.get(treeNum1).contains(treeNum2)) {
                    Set temp_set = tree_link.get(treeNum1);
                    temp_set.add(treeNum2);
                    tree_link.put(treeNum1, temp_set);
                    System.out.println("tree_link: " + tree_link);
                }
            }
        }
    }

    private String buildFinalOutputRewrite(String endReturnString) {
        // // $b <-> doc("input")/book,
        // Map<String, String> map_var_xpath = new HashMap<>();
        // // for each doc, we create new tree
        // List<Tree> trees = new LinkedList<>();
        // // know the var in which tree
        // Map<String, Integer> map_var_tree = new HashMap<>();
        // // know the link var eq var
        // Map<String, String> map_var_eq_var = new HashMap<>();
        // // know the link tree
        // Map<Integer, List<Integer>> tree_link = new HashMap<>();

        finalOutputString = "for $tuple in ";
        for(Map.Entry<String, String> entry: map_var_eq_var.entrySet()) {
            System.out.println("entry: " + entry);
        }
        // has tree link, need to add join
        String joinString = "";
        if (tree_link.size() > 0) {
            List<Integer> finish = new LinkedList<>();
            for (Map.Entry e : tree_link.entrySet()) {
                System.out.println("**** tree_link entry ****");
                System.out.println(e.getKey());
                System.out.println(finish.contains(e.getKey()));
                System.out.println(e.getValue());
                System.out.println(finish.contains(e.getValue()));
                System.out.println("*************************");
                Iterator<Integer> iterator = ((Set)e.getValue()).iterator();
                while (iterator.hasNext()) {
                    int value = iterator.next();
                    if((!finish.contains(e.getKey()) && !finish.contains(value))) {
                        // happen first time, both have not implement before
                        String result1 = buildFWR((int)e.getKey());
                        String result2 = buildFWR(value);
                        System.out.println("FWR_result1: " + result1);
                        System.out.println("FWR_result2: " + result2);
                        // argument 3, 4
                        String arg3 = "[";
                        String arg4 = "[";
                        for (Map.Entry e2 : map_var_eq_var.entrySet()) {
                            if (map_var_tree.get(e2.getKey()) == (int)e.getKey() && map_var_tree.get(e2.getValue()) == value) {
                                arg3 = arg3 + e2.getKey().toString().substring(1) + ", ";
                                arg4 = arg4 + e2.getValue().toString().substring(1) + ", ";
                            } else if (map_var_tree.get(e2.getValue()) == (int)e.getKey() && map_var_tree.get(e2.getKey()) == value) {
                                arg3 = arg3 + e2.getValue().toString().substring(1) + ", ";
                                arg4 = arg4 + e2.getKey().toString().substring(1) + ", ";
                            }
                        }
                        arg3 = arg3.substring(0, arg3.length()-2) + "]";
                        arg4 = arg4.substring(0, arg4.length()-2) + "]";
                        finish.add((int)e.getKey());
                        finish.add(value);
                        joinString = "join ( \n" + result1 + ",\n" + result2 + ",\n" + arg3 + ", " + arg4 + " \n)";
                    } else if (!finish.contains(e.getKey()) && finish.contains(value)) {
                        // TODO test
                        String result = buildFWR((int)e.getKey());
                        System.out.println("FWR_result: " + result);
                        System.out.println("ZZZ");
                        String arg3 = "[";
                        String arg4 = "[";
                        for (Map.Entry e2 : map_var_eq_var.entrySet()) {
                            // System.out.println(e2.getKey());
                            // System.out.println(map_var_tree.get(e2.getKey()));
                            // System.out.println(e.getKey());
                            // System.out.println(e2.getValue());
                            // System.out.println(map_var_tree.get(e2.getValue()));
                            // System.out.println(value);
                            if (map_var_tree.get(e2.getValue()) == (int)e.getKey() && map_var_tree.get(e2.getKey()) == value) {
                                arg3 = arg3 + e2.getKey().toString().substring(1) + ", ";
                                arg4 = arg4 + e2.getValue().toString().substring(1) + ", ";
                            } else if (map_var_tree.get(e2.getKey()) == (int)e.getKey() && map_var_tree.get(e2.getValue()) == value) {
                                arg3 = arg3 + e2.getValue().toString().substring(1) + ", ";
                                arg4 = arg4 + e2.getKey().toString().substring(1) + ", ";
                            }
                        }
                        arg3 = arg3.substring(0, arg3.length()-2) + "]";
                        arg4 = arg4.substring(0, arg4.length()-2) + "]";
                        finish.add((int)e.getKey());
                        joinString = "join ( \n" + joinString + ",\n" + result + ",\n" + arg3 + ", " + arg4 + " \n)";
                    } else if (!finish.contains(value) && finish.contains(e.getKey())) {
                        // TODO test
                        String result = buildFWR(value);
                        System.out.println("FWR_result: " + result);
                        System.out.println("XYZ");
                        String arg3 = "[";
                        String arg4 = "[";
                        for (Map.Entry e2 : map_var_eq_var.entrySet()) {
                            // System.out.println(e2.getKey());
                            // System.out.println(map_var_tree.get(e2.getKey()));
                            // System.out.println(e.getKey());
                            // System.out.println(e2.getValue());
                            // System.out.println(map_var_tree.get(e2.getValue()));
                            // System.out.println(value);
                            if (map_var_tree.get(e2.getKey()) == (int)e.getKey() && map_var_tree.get(e2.getValue()) == value) {
                                arg3 = arg3 + e2.getKey().toString().substring(1) + ", ";
                                arg4 = arg4 + e2.getValue().toString().substring(1) + ", ";
                            } else if (map_var_tree.get(e2.getValue()) == (int)e.getKey() && map_var_tree.get(e2.getKey()) == value) {
                                arg3 = arg3 + e2.getValue().toString().substring(1) + ", ";
                                arg4 = arg4 + e2.getKey().toString().substring(1) + ", ";
                            }
                        }
                        arg3 = arg3.substring(0, arg3.length()-2) + "]";
                        arg4 = arg4.substring(0, arg4.length()-2) + "]";
                        finish.add(value);
                        joinString = "join ( \n" + joinString + ",\n" + result + ",\n" + arg3 + ", " + arg4 + " \n)";
                    }
                }
            }
            System.out.println("**************");
            System.out.println(joinString);
            System.out.println("**************");

            finalOutputString = finalOutputString + joinString + "\n" + endReturnString;
            System.out.println("---------------");
            System.out.println("finalOutputString: " + finalOutputString);
            System.out.println("---------------");
        } else {
            finalOutputString = "NO JOIN FOUND";
        }
        return finalOutputString;
    }
    private String buildFWR(int treeNum) {
        String FWR = "for ";
        Tree tree = trees.get(treeNum);
        List<String> varList = tree.getVarList();
        // build for
        for (int i = 0; i < varList.size(); i++) {
            FWR = FWR + varList.get(i) + " in " + map_var_xpath.get(varList.get(i)) + ",\n";
        }
        // eliminate for final ,
        FWR = FWR.substring(0, FWR.length()-2);
        FWR = FWR + "\n";

        // build where
        List<String> whereList = tree.getWhereList();
        if (whereList.size() > 0) {
            FWR = FWR + "where ";
            for (int i = 0; i < whereList.size(); i++) {
                FWR = FWR + whereList.get(i) + " ";
            }
        }
        // eliminate for final space
        FWR = FWR.substring(0, FWR.length()-1);

        // build return
        FWR = FWR + "\nreturn <tuple>\n";
        for (int i = 0; i < varList.size(); i++) {
            FWR = FWR + "<" + varList.get(i).substring(1) + ">{" + varList.get(i) + "}</" + varList.get(i).substring(1) + ">,\n";
        }
        FWR = FWR.substring(0, FWR.length()-2);
        FWR = FWR + "\n</tuple>";

        return FWR;
    }
}

class Tree {
    private int treeNum;
    private List<String> varList = new LinkedList<>();
    private List<String> whereList = new LinkedList<>();
    Tree(int treeNum) {
        this.treeNum = treeNum;
    }
    public void addVar(String var) {
        varList.add(var);
    }
    public int getTreeNum(){
        return treeNum;
    }
    public void addWhere(String statement) {
        whereList.add(statement);
    }
    public void printWhere() {
        System.out.println("whereList: " + whereList);
    }
    public List<String> getVarList() {
        return varList;
    }
    public List<String> getWhereList() {
        return whereList;
    }
}