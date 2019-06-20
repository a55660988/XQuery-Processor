package com.db;

import com.db.antlr.xpathgrammarBaseVisitor;
import com.db.antlr.xpathgrammarParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.*;

public class xpathNodeVisitor extends xpathgrammarBaseVisitor<xpathNode> {

	List<Node> tempOutputResult = new LinkedList<>();
	List<Node> tempStringNode = new LinkedList<>();
	Map<String, List<Node>> tempVar = new HashMap<>();
	List<Node> tempElementNode = new LinkedList<>();
	List<Node> finalOutputResult = new LinkedList<>();
	List<Node> tempFinalOutputResult = new LinkedList<>();

	@Override
	public xpathNode visitAp_ap(xpathgrammarParser.Ap_apContext ctx) {
		System.out.println("*** visitAp_ap ***");
		// TODO
		// problem: open two doc in one xquery
		List<Node> nodes = new LinkedList<>();
		String filename = "";
		xpathNode output = new xpathNode();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			dbFactory.setIgnoringElementContentWhitespace(true);
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			filename = ctx.filename().getText().replace("\"", "");
			Document doc = dBuilder.parse(filename);
			Element root = doc.getDocumentElement();
			root.normalize();

			if (ctx.SLASH().size() == 1) {
				nodes.add(root);
				tempOutputResult = new LinkedList<>(nodes);
			} else if (ctx.SLASH().size() == 2) {
				nodes.add(root);
				NodeList nodelist = root.getElementsByTagName("*");
				for (int i = 0; i < nodelist.getLength(); i++) {
					nodes.add(nodelist.item(i));
				}
				tempOutputResult = new LinkedList<>(nodes);
			}
			System.out.println("ap_ap input rp: " + ctx.rp().getText());
			output = visit(ctx.rp());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}

	@Override
	public xpathNode visitRp_tagName(xpathgrammarParser.Rp_tagNameContext ctx) {
		System.out.println("*** visitRp_tagName ***");
		List<Node> nodes = new LinkedList<>();
		xpathNode output = new xpathNode();
		List<Node> temp_output = new LinkedList<>(tempOutputResult);
		for (Node node : temp_output) {
//			System.out.println("Node(visitRp_tagName): " + node.getNodeName());
			if (node.hasChildNodes()) {
				for (int i = 0; i < node.getChildNodes().getLength(); i++) {
					if (node.getChildNodes().item(i).getNodeName().equals(ctx.getText())) {
						nodes.add(node.getChildNodes().item(i));
					}
				}
			}
		}
		output.addResult(nodes);
		tempOutputResult = new LinkedList<>(nodes);
		return output;
	}

	@Override
	public xpathNode visitRp_star(xpathgrammarParser.Rp_starContext ctx) {
		System.out.println("*** visitRp_star ***");
		List<Node> nodes = new LinkedList<>();
		xpathNode output = new xpathNode();
		List<Node> temp_output = tempOutputResult;
		System.out.println("rp_star temp output result size: " + temp_output.size());
		for (Node node : temp_output) {
			System.out.println("Node(visitRp_star): " + node.getNodeName());
			System.out.println("node childnode size: " + node.getChildNodes().getLength());
			for (int i = 0; i < node.getChildNodes().getLength(); i++) {
				System.out.println("child node type: " + node.getChildNodes().item(i).getNodeType());
				if (node.getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE || node.getChildNodes().item(i).getNodeType() == Node.TEXT_NODE) {
					nodes.add(node.getChildNodes().item(i));
				}
			}
		}
		output.addResult(nodes);
		tempOutputResult = new LinkedList<>(nodes);
		return output;
	}

	@Override
	public xpathNode visitRp_dot_dot(xpathgrammarParser.Rp_dot_dotContext ctx) {
		System.out.println("*** visitRp_dot_dot ***");
		xpathNode output = new xpathNode();
		List<Node> nodes = new LinkedList<>();
		Set<Node> set = new HashSet<>();
		if (ctx.DOT().size() == 1) {
			for (Node node : tempOutputResult) {
				set.add(node);
			}
			nodes = new LinkedList<>(set);
		} else {
			if (tempOutputResult.isEmpty()) {

			} else {
				// invalid multiple ".." or node is empty so no parent
				System.out.println("============ tempoutputReuslt size: " + tempOutputResult.size());
				for (int i = 0; i < tempOutputResult.size(); i++) {
					set.add(tempOutputResult.get(i).getParentNode());
				}
				// set.add(tempOutputResult.get(0).getParentNode());
				nodes = new LinkedList<>(set);
			}
		}
		tempOutputResult = new LinkedList<>(set);
		System.out.println("=============== set length: "  + set.size()) ;
		output.addResult(tempOutputResult);
		return output;
	}

	@Override
	public xpathNode visitRp_text(xpathgrammarParser.Rp_textContext ctx) {
		System.out.println("*** visitRp_text ***");
		xpathNode output = new xpathNode();
		List<Node> nodes = new LinkedList<>();
		List<Node> temp_output = tempOutputResult;
		for (Node node : temp_output) {
			if (node.hasChildNodes()) {
				for (int i = 0; i < node.getChildNodes().getLength(); i++) {
					if (node.getChildNodes().item(i).getNodeType() == Node.TEXT_NODE) {
						// System.out.println("Get Text " + node.getChildNodes().item(i).getTextContent());
						nodes.add(node.getChildNodes().item(i));
					}
				}
			}
		}
		output.addResult(nodes);
		// System.out.println("&&&&&&");
		// output.iterateResult();
		// for (Node n : nodes) {
		// 	System.out.println(n.getNodeValue());
		// }
		return output;
	}

	@Override
	public xpathNode visitRp_at(xpathgrammarParser.Rp_atContext ctx) {
		System.out.println("*** visitRp_at ***");
		xpathNode output = new xpathNode();
		List<Node> nodes = new LinkedList<>();
		List<Node> temp_output = tempOutputResult;
		for (Node node : temp_output) {
//			System.out.println("Node(visitRp_at): " + node.getNodeName());
			if (node.hasAttributes()) {
//				System.out.println("node attribute length" + node.getAttributes().getLength());
				for (int i = 0; i < node.getAttributes().getLength(); i++) {
//					System.out.println("att name: " + ctx.attName().getText());
//					System.out.println("current node name: " + node.getAttributes().item(i).getNodeName());
					if (node.getAttributes().item(i).getNodeName().equals(ctx.attName().getText())) {
//						System.out.println("match attribute: " + i);
						nodes.add(node.getAttributes().item(i));
					}
				}
			}
		}
		output.addResult(nodes);
		return output;
	}

	@Override
	public xpathNode visitRp_rp(xpathgrammarParser.Rp_rpContext ctx) {
		System.out.println("*** visitRp_rp ***");
		xpathNode output = new xpathNode();
		List<Node> nodes = new LinkedList<>();
		nodes.addAll(visit(ctx.rp()).getResult());
		output.addResult(nodes);
		tempOutputResult = output.getResult();
		return output;
	}

	@Override
	public xpathNode visitRp_slash_rp(xpathgrammarParser.Rp_slash_rpContext ctx) {
		System.out.println("*** visitRp_slash_rp ***");
		System.out.println("(Rp1, Rp2): (" + ctx.rp(0).getText() + ", " + ctx.rp(1).getText() + ")");
		xpathNode output = new xpathNode();

		xpathNode xpn1 = visit(ctx.rp(0));
		tempOutputResult = new LinkedList<>(xpn1.getResult());

		if (ctx.SLASH().size() == 1) {

		} else if (ctx.SLASH().size() == 2) {
			List<Node> temp_output = tempOutputResult;
			List<Node> nodes = new LinkedList<>();

			for (Node node : temp_output) {
				System.out.println("Node(visitRp_slash_rp): " + node.getNodeName());
				nodes.add(node);
				slash_helper(node, nodes);

			}
			tempOutputResult = new LinkedList<>(nodes);
		}
		xpathNode xpn2 = visit(ctx.rp(1));
		tempOutputResult = new LinkedList<>(xpn2.getResult());
		output.addResult(xpn2.getResult());

		return output;
	}
	private void slash_helper(Node n, List<Node> nodes) {
		for (int i=0; i<n.getChildNodes().getLength(); i++) {
			nodes.add(n.getChildNodes().item(i));
			slash_helper(n.getChildNodes().item(i), nodes);
		}
	}


	@Override
	public xpathNode visitRp_filter(xpathgrammarParser.Rp_filterContext ctx) {
		System.out.println("*** visitRp_filter***");
		xpathNode xpn1 = visit(ctx.rp());
		xpathNode output = new xpathNode();
		List<Node> temp_output = new LinkedList<>(tempOutputResult);
		List<Node> nodes = new LinkedList<>();
		tempOutputResult = new LinkedList<>(xpn1.getResult());
		for (Node node : temp_output) {
			tempOutputResult.add(node);
			xpathNode filter_result = visit(ctx.f());
			if (!filter_result.getResult().isEmpty()) {
				nodes.add(node);
			}
		}

		output.addResult(nodes);
		tempOutputResult = new LinkedList<>(nodes);
		return output;
	}

	@Override
	public xpathNode visitRp_comma_rp(xpathgrammarParser.Rp_comma_rpContext ctx) {
		System.out.println("*** visitRp_comma_rp ***");
		List<Node> nodes = new LinkedList<>();
		xpathNode output = new xpathNode();
		List<Node> temp_output = new LinkedList<>(tempOutputResult);

		System.out.println("rp1: " + ctx.rp(0).getText());
		nodes.addAll(visit(ctx.rp(0)).getResult());
		tempOutputResult = temp_output;

		System.out.println("rp2: " + ctx.rp(1).getText());
		nodes.addAll(visit(ctx.rp(1)).getResult());
		tempOutputResult = temp_output;

		output.addResult(nodes);
		return output;
	}

	/*
	 * ask what this means ex: doc(".xml")//book[./prize] output books that have a
	 * prize ./ -> book/prize
	 */
	@Override
	public xpathNode visitF_rp(xpathgrammarParser.F_rpContext ctx) {
		System.out.println("*** visitF_rp***");
		List<Node> checkList = tempOutputResult;
		List<Node> originalTempOutputResult = new LinkedList<>(tempOutputResult);
		List<Node> candidateChild = visit(ctx.rp()).getResult();
		System.out.println("tempoutput result size: " + tempOutputResult.size());
//		System.out.println("candidate child size: " + candidateChild.size());

		tempOutputResult = originalTempOutputResult;
		List<Node> outputResult = new LinkedList<>();
		for (int i = 0; i < checkList.size(); i++) {
			if(!candidateChild.isEmpty()) {
				if(candidateChild.get(0).getNodeType() == Node.ATTRIBUTE_NODE) {
					for (int j = 0; j < checkList.get(i).getAttributes().getLength(); j++) {
						if (candidateChild.contains(checkList.get(i).getAttributes().item(j))) {
							outputResult.add(checkList.get(i));
							break;
						}
					}
				}else if(candidateChild.get(0).getNodeType() == Node.TEXT_NODE) {
					for (int j = 0; j < checkList.size(); j++) {
						if(checkList.get(j).getTextContent().equals(candidateChild.get(0).getTextContent())) {
							outputResult.add(checkList.get(i));
							break;
						}
					}
				}else if(candidateChild.get(0).getNodeType() == Node.ELEMENT_NODE) {
					for (int j = 0; j < checkList.get(i).getChildNodes().getLength(); j++) {
						if (candidateChild.contains(checkList.get(i).getChildNodes().item(j))) {
							outputResult.add(checkList.get(i));
							break;
						}
					}
				}
			}

		}
		System.out.println("get rp visit_f: " + ctx.rp().getText());
		xpathNode output = new xpathNode(outputResult);
		tempOutputResult = new LinkedList<>(output.getResult());
		return output;

	}

	@Override
	public xpathNode visitF_eq(xpathgrammarParser.F_eqContext ctx) {

		System.out.println("*** visitF_eq ***");
		List<Node> originalTempOutputResult = new LinkedList<>(tempOutputResult);
		List<Node> rp1 = visit(ctx.rp(0)).getResult();
		tempOutputResult = originalTempOutputResult;
		List<Node> rp2 = visit(ctx.rp(1)).getResult();
		tempOutputResult = originalTempOutputResult;
		xpathNode output = new xpathNode();
		List<Node> outputResult = new LinkedList<>();
		for (int i = 0; i < rp1.size(); i++) {
			for (int j = 0; j < rp2.size(); j++) {
				if (equalHelper(rp1.get(i), rp2.get(j))) {
					outputResult.add(rp1.get(i));
					output.addResult(outputResult);
					tempOutputResult = new LinkedList<>(output.getResult());
					return output;
				}
			}
		}
		output.addResult(outputResult);
		return output;
	}

	private boolean equalHelper(Node n1, Node n2) {
		if (n1.getNodeType() != n2.getNodeType()) {
			return false;
		}
		if (n1.getNodeType() == Node.ATTRIBUTE_NODE) {
			if (n1.getNodeName() != n2.getNodeName()) {
				return false;
			}

			if (n1.getNodeValue() != n2.getNodeValue()) {
				return false;
			}
			if(n1.getAttributes().getLength() != n2.getAttributes().getLength()) {
				return false;
			}
			for (int i = 0; i < n1.getAttributes().getLength(); i++) {
				boolean childEquality = equalHelper(n1.getAttributes().item(i), n2.getAttributes().item(i));
				if (!childEquality)
					return false;
			}
		} else if(n1.getNodeType() == Node.ELEMENT_NODE) {
			if (n1.getNodeName() != n2.getNodeName()) {
				return false;
			}
			if (n1.getChildNodes().getLength() != n2.getChildNodes().getLength()) {
				return false;
			}

			for (int i = 0; i < n1.getChildNodes().getLength(); i++) {
				boolean childEquality = equalHelper(n1.getChildNodes().item(i), n2.getChildNodes().item(i));
				if (!childEquality)
					return false;
			}
		} else if(n1.getNodeType() == Node.TEXT_NODE) {
			if(!n1.getTextContent().replace("\"", "").equals(n2.getTextContent().replace("\"", ""))) {
				return false;
			}
		}
		return true;

	}

	@Override
	public xpathNode visitF_is(xpathgrammarParser.F_isContext ctx) {
		System.out.println("*** visitF_is ***");
		xpathNode output = new xpathNode();
		List<Node> outputResult = new LinkedList<>();
		List<Node> originalTempOutputResult = new LinkedList<>(tempOutputResult);
		List<Node> result1 = visit(ctx.rp(0)).getResult();
		tempOutputResult = originalTempOutputResult;
		List<Node> result2 = visit(ctx.rp(1)).getResult();
		tempOutputResult = originalTempOutputResult;

		for (int i = 0; i < result1.size(); i++) {
			for (int j = 0; j < result2.size(); j++) {
				if (result1.get(i).equals(result2.get(i))) {
					outputResult.add(result1.get(i));
					output.addResult(outputResult);
					tempOutputResult = new LinkedList<>(output.getResult());
					return output;
				}
			}
		}
		output.addResult(outputResult);
		return output;
	}

	@Override
	public xpathNode visitF_f(xpathgrammarParser.F_fContext ctx) {
		System.out.println("*** visitF_f ***");
		List<Node> originalTempOutputResult = new LinkedList<>(tempOutputResult);
		xpathNode output = new xpathNode();
		List<Node> result = new LinkedList<>();
		result.addAll(visit(ctx.f()).getResult());
		tempOutputResult = originalTempOutputResult;
		output.addResult(new LinkedList<>(result));
		tempOutputResult = new LinkedList<>(output.getResult());
		return output;
	}

	@Override
	public xpathNode visitF_and_f(xpathgrammarParser.F_and_fContext ctx) {
		System.out.println("*** visitF_and_f***");
		// A = {1,2,3} B= {2,5,6} -> output = {2}
		List<Node> originalTempOutputResult = new LinkedList<>(tempOutputResult);
		List<Node> filter1 = visit(ctx.f(0)).getResult();
		tempOutputResult = originalTempOutputResult;
		List<Node> filter2 = visit(ctx.f(1)).getResult();
		tempOutputResult = originalTempOutputResult;
		List<Node> difference = new LinkedList<>(filter2);
		difference.removeAll(filter1);
		filter2.removeAll(difference);
		xpathNode output = new xpathNode(filter2);
		tempOutputResult = new LinkedList<>(output.getResult());
		return output;

	}

	@Override
	public xpathNode visitF_or_f(xpathgrammarParser.F_or_fContext ctx) {
		System.out.println("*** visitF_or_f ***");
		List<Node> originalTempOutputResult = new LinkedList<>(tempOutputResult);
		List<Node> filter1 = visit(ctx.f(0)).getResult();
		tempOutputResult = originalTempOutputResult;
		List<Node> filter2 = visit(ctx.f(1)).getResult();
		tempOutputResult = originalTempOutputResult;
		// A = {1,2,3}, B= {1,5,6} output = {1,2,3,5,6}
		filter1.removeAll(filter2);
		filter2.addAll(filter1);
		xpathNode output = new xpathNode(filter2);
		tempOutputResult = new LinkedList<>(output.getResult());
		return output;
	}

	@Override
	public xpathNode visitF_not_f(xpathgrammarParser.F_not_fContext ctx) {
        System.out.println("*** visitF_not_f ***");
        List<Node> temp_output = new LinkedList<>(tempOutputResult);
        List<Node> filter_result = visit(ctx.f()).getResult();
        List<Node> nodes = new LinkedList<>();
        tempOutputResult = temp_output;
        boolean isContain = false;
        for (Node node : temp_output) {
            if (node.hasChildNodes()) {
				for (int i = 0; i < node.getChildNodes().getLength(); i++) {
					for (Node f_node : filter_result) {
						if (node.getChildNodes().item(i).equals(f_node)) {
							isContain = true;
							break;
						}
                    }
					if (isContain) {
						break;
					}
                }
				if (!isContain) {
					nodes.add(node);
					isContain = false;
				}
			}
        }
        xpathNode output = new xpathNode(nodes);
        tempOutputResult = new LinkedList<>(nodes);
        return output;
	}

	// milestone 2

	private Element makeElem(String t, List<Node> l) {
		System.out.println("*** makeElem ***");
		Element rootElement = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbf.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			rootElement = doc.createElement(t);
			doc.appendChild(rootElement);
			for (Node n : l) {
				Node importnode = doc.importNode(n, true);
				rootElement.appendChild(importnode);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("makeElem: " + rootElement);
		return rootElement;
	}

	private Node makeText(String s) {
		Node node = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.newDocument();

			node = document.createTextNode(s);

		} catch(Exception e) {
			e.printStackTrace();
		}
		return node;
	}


	@Override
	public xpathNode visitXq_var(xpathgrammarParser.Xq_varContext ctx) {
		System.out.println("*** visitVar ***");
		System.out.println("var(visitXq_var): " + ctx.var().getText());
		xpathNode output = new xpathNode(tempVar.get(ctx.getText()));
		output.setT_f(true);
		output.iterateResult();
		return output;
	}

	@Override
	public xpathNode visitXq_stringcon(xpathgrammarParser.Xq_stringconContext ctx) {
		System.out.println("*** visitXq_stringcon ***");
		System.out.println("stringconstant(visitXq_stringcon): " + ctx.getText());
		tempStringNode.add(makeText(ctx.getText()));
		xpathNode output = new xpathNode(tempStringNode);
		tempStringNode.clear();
		output.setT_f(true);
		return output;
	}

	@Override
	public xpathNode visitXq_ap(xpathgrammarParser.Xq_apContext ctx) {
		System.out.println("*** visitXq_ap ***");
		System.out.println("ap(visitXq_ap): " + ctx.getText());
		xpathNode output = visit(ctx.ap());
		tempOutputResult = output.getResult();
		
		return output;
	}

	@Override
	public xpathNode visitXq_xq(xpathgrammarParser.Xq_xqContext ctx) {
		System.out.println("*** visitXq_xq ***");
		xpathNode output = new xpathNode();
		List<Node> nodes = new LinkedList<>();
		nodes.addAll(visit(ctx.xq()).getResult());
		output.addResult(nodes);
		tempOutputResult = output.getResult();
		return output;
	}

	@Override
	public xpathNode visitXq_slash_rp(xpathgrammarParser.Xq_slash_rpContext ctx) {
		System.out.println("*** visitXq_slash_rp ***");
		System.out.println("(XQ, RP): (" + ctx.xq().getText() + ", " + ctx.rp().getText() + ")");
		xpathNode output = new xpathNode();

		xpathNode xpn1 = visit(ctx.xq());
		tempOutputResult = new LinkedList<>(xpn1.getResult());

		if (ctx.SLASH().size() == 1) {
			
		} else if (ctx.SLASH().size() == 2) {
			List<Node> temp_output = tempOutputResult;
			List<Node> nodes = new LinkedList<>();

			for (Node node : temp_output) {
				System.out.println("Node(visitXq_slash_rp): " + node.getNodeName());
				nodes.add(node);
				slash_helper(node, nodes);
			}
			tempOutputResult = new LinkedList<>(nodes);
		}
		xpathNode xpn2 = visit(ctx.rp());
		tempOutputResult = new LinkedList<>(xpn2.getResult());
		output.addResult(xpn2.getResult());
		return output;
	}

	@Override
	public xpathNode visitXq_comma_xq(xpathgrammarParser.Xq_comma_xqContext ctx) {
		System.out.println("*** visitXq_comma_xq ***");
		List<Node> nodes = new LinkedList<>();
		xpathNode output = new xpathNode();
		List<Node> temp_output = new LinkedList<>();
		if (tempOutputResult != null) {
			temp_output = new LinkedList<>(tempOutputResult);
		}

		System.out.println("xq1: " + ctx.xq(0).getText());
		nodes.addAll(visit(ctx.xq(0)).getResult());
		tempOutputResult = temp_output;

		System.out.println("xq2: " + ctx.xq(1).getText());
		nodes.addAll(visit(ctx.xq(1)).getResult());
		tempOutputResult = temp_output;

		output.addResult(nodes);
		return output;
		
	}

	@Override
	public xpathNode visitXq_t_xq_t(xpathgrammarParser.Xq_t_xq_tContext ctx) {
		System.out.println("* visitXq_t_xq_t *");
		xpathNode xq_output = visit(ctx.xq());
		Element e = makeElem(ctx.tagName(0).getText(), xq_output.getResult());
		tempElementNode.add(e);
		xpathNode output = new xpathNode(tempElementNode);
		tempElementNode.clear();
		return output;
	}

	@Override
	public xpathNode visitXq_t_xq_t_no_bracket(xpathgrammarParser.Xq_t_xq_t_no_bracketContext ctx) {
		System.out.println("* visitXq_t_xq_t_no_bracket *");
		xpathNode xq_output = visit(ctx.xq());
		Element e = makeElem(ctx.tagName(0).getText(), xq_output.getResult());
		tempElementNode.add(e);
		xpathNode output = new xpathNode(tempElementNode);
		tempElementNode.clear();
		return output;
	}

	@Override
	public xpathNode visitXq_for_let_where_return(xpathgrammarParser.Xq_for_let_where_returnContext ctx) {
		System.out.println("*** visitXq_for_let_where_return ***");
		System.out.println("FLWR clause is " + ctx.getText());
		visitForClause(ctx.forClause());

		xpathNode output = new xpathNode(finalOutputResult);
		if (!output.getResult().isEmpty()) {
			output.setT_f(true);
		}
		System.out.println("output: " + output.getResult());
		return output;

	}


	@Override
	public xpathNode visitForClause(xpathgrammarParser.ForClauseContext ctx) {
		System.out.println("*** visitForClause ***");
		System.out.println("Our for clause is " + ctx.getText());
		// System.out.println("Our for clause is " + ctx.xq(0));
		// System.out.println("Our for clause is " + ctx.getText());
		// System.out.println("Our for clause is " + ctx.getText());
		List<Node> tempList = new LinkedList<>();
		F(0, ctx, tempList);
		finalOutputResult = new LinkedList<>(tempList);
//		System.out.println("=============== final output result for clause: " + finalOutputResult.size());
		return new xpathNode(finalOutputResult);
	}

	private void F(int varIndex, xpathgrammarParser.ForClauseContext ctx, List<Node> tempList) {
		System.out.println("*** F ***");
		// System.out.println(ctx.getText());
		// System.out.println("varIndex: " + varIndex + " ctx.var().size(): " + ctx.var().size());
		if (varIndex < ctx.var().size()) {
			System.out.println("Finding One");
			// System.out.println("ctx.getText(): " + ctx.getText());
			// System.out.println("ctx.xq(varIndex).getText(): " + ctx.xq(varIndex).getText());
			xpathNode xp = visit(ctx.xq(varIndex));
			// System.out.println("~~~~" + xp.getResult().size());
//			System.out.println("========== F length: " + ctx.var(varIndex).getText()+ " " + xp.getResult().size());
			System.out.println(ctx.xq(varIndex).getText());
			System.out.println(xp.getResult());
			for (Node node : xp.getResult()) {
				List<Node> temp = new LinkedList<>();
				temp.add(node);
				tempVar.put(ctx.var(varIndex).getText(), new LinkedList<>(temp));
				// System.out.println("@@@@@@@@@@" + node);
				F(varIndex + 1, ctx, tempList);
			}
		} else {
			System.out.println("Get One");
			System.out.println(ctx.getParent().getText());
			if (((xpathgrammarParser.Xq_for_let_where_returnContext)(ctx.getParent())).letClause() != null) {
				visit(((xpathgrammarParser.Xq_for_let_where_returnContext) (ctx.getParent())).letClause());
			}
			if (((xpathgrammarParser.Xq_for_let_where_returnContext)(ctx.getParent())).whereClause() != null) {
				System.out.println("WHERE: " + ((xpathgrammarParser.Xq_for_let_where_returnContext) (ctx.getParent())).whereClause().getText());
				xpathNode whereOutput = visit(((xpathgrammarParser.Xq_for_let_where_returnContext) (ctx.getParent())).whereClause());
				if (!whereOutput.getT_f()) {
					return;
				}
			}
			List<Node> returnNodes = visit(((xpathgrammarParser.Xq_for_let_where_returnContext) (ctx.getParent())).returnClause()).getResult();
			tempList.addAll(returnNodes);
		}
	}

	@Override
	public xpathNode visitLetClause(xpathgrammarParser.LetClauseContext ctx) {
		System.out.println("*** visitLetClause ***");
		for (int i = 0; i < ctx.var().size(); i++) {
			tempVar.put(ctx.var(i).getText(), visit(ctx.xq(i)).getResult());
		}
		return new xpathNode();
	}

	@Override
	public xpathNode visitWhereClause(xpathgrammarParser.WhereClauseContext ctx) {
		System.out.println("*** visitWhereClause ***");
		xpathNode output = new xpathNode();
		output.setT_f(visit(ctx.cond()).getT_f());
		System.out.println("==============  where true false: "+ output.getT_f() );
		return output;
	}

	@Override
	public xpathNode visitReturnClause(xpathgrammarParser.ReturnClauseContext ctx) {
		System.out.println("*** visitReturnClause ***");
		System.out.println("========== return clause " + ctx.getText());
		xpathNode output = visit(ctx.xq());
		return output;
	}

	@Override
	public xpathNode visitCond_eq(xpathgrammarParser.Cond_eqContext ctx) {
		System.out.println("*** visitCond_eq ***");
		List<Node> originalTempOutputResult = new LinkedList<>(tempOutputResult);
		List<Node> xq0 = visit(ctx.xq(0)).getResult();
		tempOutputResult = originalTempOutputResult;
		List<Node> xq1 = visit(ctx.xq(1)).getResult();
		tempOutputResult = originalTempOutputResult;
		xpathNode output = new xpathNode();
		List<Node> outputResult = new LinkedList<>();
		System.out.println("second node size: " + xq1.size());

		for (int i = 0; i < xq0.size(); i++) {
			for (int j = 0; j < xq1.size(); j++) {
//				System.out.println("======================== herehere");
//				System.out.println((xq0.get(i)).hashCode() + "    " + (xq1.get(j)).hashCode());
				if (equalHelper(xq0.get(i), xq1.get(j))) {
					outputResult.add(xq1.get(j));
					output.addResult(outputResult);
					output.setT_f(true);
					tempOutputResult = new LinkedList<>(output.getResult());
					return output;
				}
			}
		}
		output.setT_f(false);
		output.addResult(outputResult);
		return output;
	}
	
	/*where not $a is 'bbbb' -> return nodes in $a that is not equal to 'bbbb'*/  
	@Override
	public xpathNode visitCond_not_cond(xpathgrammarParser.Cond_not_condContext ctx) {
		System.out.println("*** visitCond_not_cond ***");
        
        xpathNode output = new xpathNode();
        // means no match for this condition, so not should return true
        if(!visit(ctx.cond()).getT_f()) {
        	output.setT_f(true);
        }
        return output;
	}
	
	@Override
	public xpathNode visitCond_is(xpathgrammarParser.Cond_isContext ctx) {
		System.out.println("*** visitCond_is ***");
		xpathNode output = new xpathNode();
		List<Node> outputResult = new LinkedList<>();
		List<Node> originalTempOutputResult = new LinkedList<>(tempOutputResult);
		List<Node> result1 = visit(ctx.xq(0)).getResult();
		tempOutputResult = originalTempOutputResult;
		List<Node> result2 = visit(ctx.xq(1)).getResult();
		tempOutputResult = originalTempOutputResult;

		for (int i = 0; i < result1.size(); i++) {
			for (int j = 0; j < result2.size(); j++) {
				if (result1.get(i).equals(result2.get(i))) {
					outputResult.add(result1.get(i));
					output.addResult(outputResult);
					output.setT_f(true);
					tempOutputResult = new LinkedList<>(output.getResult());
					return output;
				}
			}
		}
		output.setT_f(false);
		output.addResult(outputResult);
		return output;
	}
	
	@Override
	public xpathNode visitCond_or_cond(xpathgrammarParser.Cond_or_condContext ctx) {
		System.out.println("*** visitCond_or_cond ***");
		xpathNode output = new xpathNode();
		output.setT_f(visit(ctx.cond(0)).getT_f() || visit(ctx.cond(1)).getT_f());
		return output; 
	}
	
	@Override
	public xpathNode visitCond_and_cond(xpathgrammarParser.Cond_and_condContext ctx) {
		System.out.println("*** visitCond_and_cond ***");
		xpathNode output = new xpathNode();
		output.setT_f(visit(ctx.cond(0)).getT_f() && visit(ctx.cond(1)).getT_f());
		return output;
	}
	
	@Override
	public xpathNode visitCond_empty(xpathgrammarParser.Cond_emptyContext ctx) {
		System.out.println("*** visitCond_empty ***");
		xpathNode output = new xpathNode();
		output.setT_f(!visit(ctx.xq()).getT_f());
		System.out.println("empty result tf: " + output.getT_f());
		return output;
	}
	
	@Override
	public xpathNode visitCond_cond(xpathgrammarParser.Cond_condContext ctx) {
		System.out.println("*** visitCond_cond ***");
		xpathNode output = new xpathNode();
		output.setT_f(visit(ctx.cond()).getT_f());
		return output;
	}
	
	@Override
	public xpathNode visitCond_some(xpathgrammarParser.Cond_someContext ctx) {
		System.out.println("*** visitCond_some ***");
		xpathNode output = new xpathNode();
		for (int i=0; i<ctx.var().size(); i++) {
			tempVar.put(ctx.var(i).getText(), visit(ctx.xq(i)).getResult());
		}
		output.setT_f(visit(ctx.cond()).getT_f());
		return output;
	}

	@Override
	public xpathNode visitJoin_clause(xpathgrammarParser.Join_clauseContext ctx) {
		System.out.println("** visitJoinClause ** ");
		xpathNode output = new xpathNode();
		List<Node> tuple1 = visit(ctx.xq(0)).getResult();
		List<Node> tuple2 = visit(ctx.xq(1)).getResult();
		List<String> joinAtt1 = visit(ctx.joinAtt(0)).getAtts(); // join statement
		List<String> joinAtt2 = visit(ctx.joinAtt(1)).getAtts(); // join statement
		Map<Integer, ArrayList<Integer>> attrTable = new HashMap<>(); // first attr table. hashcode to tuple indexes
		Map<Integer, ArrayList<Integer>> tupleToHashCode = new HashMap<>(); // tuple Index to other attribute hashcode
		// if either tuple is empty then return empty output
		System.out.println("========= tuple1 size:  "+ tuple1.size() + " tuple2 size: " + tuple2.size());
		if (tuple1.size() == 0 || tuple2.size() == 0) {
			System.out.println("xq0 : " + ctx.xq(0).getText() + " xq1: " + ctx.xq(1).getText());
			System.out.println("either tuple1 or tuple2 has size 0");
			output.addResult(new ArrayList<Node>());
			return output;
		}
		
		for (int i=0; i<tuple1.size(); i++) {
			Node curTuple = tuple1.get(i);
			for (int j=0; j < joinAtt1.size(); j++) {
				String attName = joinAtt1.get(j);
				Node attrNode = findNodeByAttrName(curTuple, attName);
				System.out.println("attrnode node name " + attrNode.getNodeName());
				System.out.println(attrNode.getTextContent().hashCode());
				if (j == 0) {
					ArrayList<Integer> bucketList = attrTable.getOrDefault(attrNode.getTextContent().hashCode(), new ArrayList<Integer>());
					bucketList.add(i);
					System.out.println("==== text " + attrNode.getTextContent());
					attrTable.put(attrNode.getTextContent().hashCode(), bucketList);
				} else {
					ArrayList<Integer> hashCodes = tupleToHashCode.getOrDefault(i, new ArrayList<Integer>());
					System.out.println("==== text " + attrNode.getTextContent());
					hashCodes.add(attrNode.getTextContent().hashCode());
					tupleToHashCode.put(i, hashCodes);
				}
			}
		}
		
		List<Node> outputResult = new ArrayList<>();
		for (int i=0; i<tuple2.size(); i++) {
			System.out.println("================ start iterating tuple2 ==============");
			Node curTuple = tuple2.get(i);
			String attName = joinAtt2.get(0);
			Node attrNode = findNodeByAttrName(curTuple, attName);
			int curHashCode = attrNode.getTextContent().hashCode();
			System.out.println("hashcode 2: " +attrNode.getTextContent());
			System.out.println("=============== tuple2 hashCode: " + curHashCode);
			List<Integer> bucketList = attrTable.getOrDefault(curHashCode, new ArrayList<Integer>());
			System.out.println("curHashCode: "+ curHashCode  + " bucket list: " + bucketList.size());
			for (int j=0; j<bucketList.size(); j++) {
				int nodeIndex = bucketList.get(j);
				boolean allSame = true;
				for (int k = 0; k < tupleToHashCode.getOrDefault(nodeIndex, new ArrayList<Integer>()).size(); k++) {
					attName = joinAtt2.get(k+1);
					attrNode = findNodeByAttrName(curTuple, attName);
					curHashCode = attrNode.getTextContent().hashCode(); // tuple2's hashcode
					if (curHashCode != tupleToHashCode.get(nodeIndex).get(k)) {
						allSame = false;
						break;
					}
				}
				if (allSame) {
					// join two tuples
					joinTwoTuple(tuple1.get(nodeIndex), tuple2.get(i), joinAtt2, outputResult);
				}
			}
		}
		output.addResult(outputResult);
		System.out.println("join result: " + output.getResult());
		return output;
	}

	private Node findNodeByAttrName(Node tuple, String attrName) {
		System.out.println("* findNodeByAttrName * ");
		Node returnNode = null;
		System.out.println("searching attrname: " + attrName);
		for (int i=0; i<tuple.getChildNodes().getLength(); i++) {
			System.out.println("current node name: " + tuple.getChildNodes().item(i).getNodeName());
			if (tuple.getChildNodes().item(i).getNodeName().equals(attrName)) {
				System.out.println("===== node name: " +tuple.getChildNodes().item(i).getFirstChild().getNodeName());
				returnNode = tuple.getChildNodes().item(i).getFirstChild();
				break;
			}
		}
		return returnNode;
	}
	
	private void joinTwoTuple(Node tuple1Node, Node tuple2Node, List<String> joinAttr2, List<Node> output) {
		System.out.println("** joinTwoTuple ** ");
		
		List<Node> toMergeList = new ArrayList<>();
		for (int i=0; i<tuple1Node.getChildNodes().getLength(); i++) {
			toMergeList.add(tuple1Node.getChildNodes().item(i));
		}
		
		for (int i=0; i<tuple2Node.getChildNodes().getLength(); i++) {
			System.out.println("tuple2 node name: " + tuple2Node.getChildNodes().item(i).getTextContent());
			toMergeList.add(tuple2Node.getChildNodes().item(i));
//			if (!joinAttr2.contains(curNode.getNodeName())) {
//				toMergeList.add(curNode);
//			}
		}
		
		Node joinTuple = makeElem("tuple", toMergeList);
		output.add(joinTuple);
	}

	@Override
	public xpathNode visitJoin_attr(xpathgrammarParser.Join_attrContext ctx) {
		System.out.println("** visitJoinAtt ** ");
		xpathNode output = new xpathNode();
		List<String> attrNames = new ArrayList<>();
		for (int i=0; i<ctx.varName().size(); i++) {
			attrNames.add(ctx.varName().get(i).getText());
		}
		output.setAtts(attrNames);
		return output;
	}



}