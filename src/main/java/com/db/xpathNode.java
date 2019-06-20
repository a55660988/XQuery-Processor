package com.db;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xpathNode implements Cloneable {

	// private String name;
	// private String attribute;
	// private String text;
	private List<Node> result;
	private boolean t_f = false;
	private List<String> atts;

	xpathNode() {
		atts = new ArrayList<>();
	}

	@Override
	public xpathNode clone() throws CloneNotSupportedException {
		xpathNode xpathnode = (xpathNode) super.clone();
		xpathnode.result = new LinkedList<>(result);
		return xpathnode;

	}

	xpathNode(List<Node> result) {
		this.result = new LinkedList<>(result);
	}

	xpathNode(List<Node> result, List<Node> result2) {
		this.result = new LinkedList<>(result);
		this.result.addAll(result2);
	}
	
	

	// xpathNode(String name, List<Node> result) {
	// this.name = name;
	// this.result = result;
	// }

	public void addResult(List<Node> result) {
		this.result = new LinkedList<>(result);
	}

	public void addResult(List<Node> result, List<Node> result2) {
		this.result = new LinkedList<>(result);
		this.result.addAll(result2);
	}

	public List<Node> getResult() {
		return result;
	}

	public boolean getT_f() {
		return t_f;
	}
	
	public void setT_f(boolean b) {
		t_f = b;
	}
	
	public List<String> getAtts() {
		return atts;
	}
	
	public void setAtts(List<String> atts) {
		this.atts.addAll(atts);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atts == null) ? 0 : atts.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		xpathNode other = (xpathNode) obj;
		if (atts == null) {
			if (other.atts != null)
				return false;
		} else if (!atts.equals(other.atts))
			return false;
		return true;
	}

	public void iterateResult() {
		System.out.println("### Iterate ###");
		for (int i = 0; i < result.size(); i++) {
			short nodeType = result.get(i).getNodeType();
			if (nodeType == Node.ELEMENT_NODE) {
				System.out.println("(" + i + ")" + result.get(i).getNodeName());
			} else if (nodeType == Node.ATTRIBUTE_NODE) {
				System.out.println(result.get(i).getNodeName());
				System.out.println(result.get(i).getNodeValue());
			} else if (nodeType == Node.TEXT_NODE) {
				System.out.println(result.get(i).getNodeValue());
			}
		}
	}

	public String testResult() {
		String str = "";
		for (int i = 0; i < result.size(); i++) {
			short nodeType = result.get(i).getNodeType();
			if (nodeType == Node.ELEMENT_NODE) {
				str = str.concat(result.get(i).getNodeName());
			} else if (nodeType == Node.ATTRIBUTE_NODE) {
				str = str.concat(result.get(i).getNodeName());
				str = str.concat(result.get(i).getNodeValue());
			} else if (nodeType == Node.TEXT_NODE) {
				str = str.concat(result.get(i).getNodeValue());
			}
		}
		return str;
	}

	public void outputResult() {
		System.out.println("======================================");
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.xml"));
			System.out.println("<Result>");
			bw.write("<Result>\n");
			for (int i = 0; i < result.size(); i++) {
				prettyPrint(result.get(i), "  ", bw);
			}
			System.out.println("</Result>");
			bw.write("</Result>\n");
			bw.close();
		} catch (IOException ioe) {
			System.out.println("========= IO ERROR: " + ioe.getMessage());
		}

	}

	private static void prettyPrint(Node node, String tab, BufferedWriter bw) throws IOException {

		if (node.getNodeType() == Node.TEXT_NODE) {
			System.out.print(tab);
			bw.write(tab);
			System.out.println(node.getNodeValue());
			bw.write(node.getNodeValue() + "\n");
		} else if (node.getNodeType() == Node.ELEMENT_NODE) {
			System.out.print(tab);
			bw.write(tab);
			System.out.println("<" + node.getNodeName() + ">");
			bw.write("<" + node.getNodeName() + ">\n");
			NodeList kids = node.getChildNodes();
			for (int i = 0; i < kids.getLength(); i++) {
				prettyPrint(kids.item(i), tab + "  ", bw);
			}
			System.out.print(tab);
			bw.write(tab);
			System.out.println("</" + node.getNodeName() + ">");
			bw.write("</" + node.getNodeName() + ">\n");
		} else if (node.getNodeType() == Node.ATTRIBUTE_NODE) {
			System.out.print(tab);
			bw.write(tab);
			System.out.println("<" + node.getNodeName() + ">");
			bw.write("<" + node.getNodeName() + ">\n");
			System.out.println(node.getNodeValue());
			bw.write(node.getNodeValue() + "\n");
			System.out.print(tab);
			bw.write(tab);
			System.out.println("</" + node.getNodeName() + ">");
			bw.write("</" + node.getNodeName() + ">\n");
		}
	}

}
