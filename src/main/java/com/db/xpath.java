package com.db;

import com.db.antlr.*;

import org.antlr.v4.runtime.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class xpath {
    public static void main(String[] args) {
        // executeCode("doc(\"input_caesar.xml\")/FM");
        // String xpath = args[0];
        // System.out.println("xpath: " + args[0]);
    	
    	
    	try {
            Lexer lexer = new xpathgrammarLexer(CharStreams.fromFileName("./join_test.txt"));
            // Lexer lexer = new xpathgrammarLexer(CharStreams.fromString(xpath));
            TokenStream tokenStream = new CommonTokenStream(lexer);

            xpathgrammarParser parser = new xpathgrammarParser(tokenStream);
            // xpathNodeVisitor nodeVisitor = new xpathNodeVisitor();

            rewriter r = new rewriter(parser.xq());
            Lexer lexer2 = new xpathgrammarLexer(CharStreams.fromString(r.finalOutputString));
            if (r.finalOutputString.equals("NO JOIN FOUND")) {
                // use original one
                lexer2 = new xpathgrammarLexer(CharStreams.fromFileName("./join_test.txt"));
            } else if (r.finalOutputString.equals("JOIN FOUND")) {
                lexer2 = new xpathgrammarLexer(CharStreams.fromFileName("./join_test.txt"));
            }
            TokenStream tokenStream2 = new CommonTokenStream(lexer2);
            xpathgrammarParser parser2 = new xpathgrammarParser(tokenStream2);
            xpathNodeVisitor nodeVisitor2 = new xpathNodeVisitor();
            xpathNode xpathnode2 = nodeVisitor2.visit(parser2.xq());
            // xpathNode xpathnode = nodeVisitor.visit(parser.xq());
            // System.out.println("=========== xpathNode: " + xpathnode.getResult().size());
            // xpathnode2.iterateResult();
            System.out.println("===== After rewrite is =====");
            System.out.println(r.finalOutputString);
            System.out.println("============================");
            outputXML(xpathnode2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    	
    }

    public static void outputXML(xpathNode xpathnode) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            if (xpathnode.getResult().size() == 0) {
                Element rootElement = doc.createElement("result");
                Node textnode = doc.createTextNode("");
                rootElement.appendChild(textnode);
                doc.appendChild(rootElement);
            } else {
            	
            	if (xpathnode.getResult().size() > 1) {
            		Element rootElement = doc.createElement("result");
                	for (int i=0; i<xpathnode.getResult().size(); i++) {
                		Node importnode = doc.importNode(xpathnode.getResult().get(i), true);
                        rootElement.appendChild(importnode);
                	}
                	doc.appendChild(rootElement);
            	} else {
            		 Node importnode = doc.importNode(xpathnode.getResult().get(0), true);
                     doc.appendChild(importnode);
            	}
            	
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //write to console or file
//            StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File("output.xml"));

            //write data
//            t.transform(source, console);
            t.transform(source, file);
            System.out.println("OutputXML DONE");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void getOutput(String xpathQuery) {
        try {
            // Lexer lexer = new xpathgrammarLexer(CharStreams.fromFileName("./xpath_test.txt"));
            Lexer lexer = new xpathgrammarLexer(CharStreams.fromString(xpathQuery));
            TokenStream tokenStream = new CommonTokenStream(lexer);

            xpathgrammarParser parser = new xpathgrammarParser(tokenStream);
            xpathNodeVisitor nodeVisitor = new xpathNodeVisitor();
            xpathNode xpathnode = nodeVisitor.visit(parser.ap());

            xpathnode.iterateResult();
            xpathnode.outputResult();
        } catch (Exception e) {
            System.out.println("query error");
            e.printStackTrace();
        }
    }


    public static String executeCode(String xpath_test) {
        try {
            // Lexer lexer = new xpathgrammarLexer(CharStreams.fromFileName("./xpath_test.txt"));
            Lexer lexer = new xpathgrammarLexer(CharStreams.fromString(xpath_test));
            TokenStream tokenStream = new CommonTokenStream(lexer);

            xpathgrammarParser parser = new xpathgrammarParser(tokenStream);
            xpathNodeVisitor nodeVisitor = new xpathNodeVisitor();
            xpathNode xpathnode = nodeVisitor.visit(parser.xq());

            xpathnode.iterateResult();
            return xpathnode.testResult();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Wrong";

    }

}