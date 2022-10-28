package p2.LinkedList;
// 책에 있는 것
class Node{
	private String data;
	public Node next;
	public Node() {
		this.data = null;
		this.next = null;
	}
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}
	public String getData() {
		return data;
	}
}

public class LinkedList{
	private Node head;
	public LinkedList() {
		head = null;
	}
	
	public void insertMiddleNode(Node pre, String data) {
		Node nextNode = new Node(data);
		nextNode.next = pre.next;
		pre.next = nextNode;
	}
	
	public void insertLastNode(String data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			Node temp = head;
			while(temp.next != null) temp = temp.next;
			temp.next = newNode;
		}
	}
	
	public void deleteLastNode(){
		Node pre, temp;
		if(head == null) return;
		if(head.next == null) head = null;
		else {
			pre = head;
			temp = head.next;
			while(temp.next != null) {
				pre = temp;
				temp = temp.next;
			}
			pre.next = null;
			
		}
	}
	public Node searchNode(String data) {
		Node temp = this.head;
		while(temp != null) {
			if(temp.getData().equals(data)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	public void reverse() {
		Node pre = null;
		Node current = null;
		Node next = head;
		
		while(next != null) {
			pre = current;
			current = next;
			next = next.next;
			
			current.next = pre;
		}
		head = current;
		
	}
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
	}
}