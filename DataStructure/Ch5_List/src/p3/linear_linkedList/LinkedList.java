package p3.linear_linkedList;

class Node {
	private String data;
	private Node link; // primitive타입 아니면 다 reference타입 
	
	public Node() {
		data = "";
		link = null;
	}
	public Node(Node link, String data) {
		this.data = data;
		this.link = link;
	}
	
}

public class LinkedList {
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insertFirstNode(Node node, String data) {
		Node temp = new Node(head, data);
		head = temp;
	}
}
