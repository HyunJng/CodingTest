package p2.linkedlist_practice;

class Node {
	int coef;
	int expo;
	Node next;
	
	Node(){
		
	}
	
	Node(int coef, int expo){
		this.coef = coef;
		this.expo = expo;
	}
}

public class Poly { // �ܹ���
	Node head;	// ������ ���� ��� ��������
	
	Poly(){
		head = new Node();
	}
	
	// ������ ��忡 append
	void appendTerm(int coef, int expo) {
		Node temp = new Node(coef, expo);
		Node n = head;
		
		while(n.next != null) {
			n = n.next;
		}
		n.next = temp;
	}
	
	void print() {
		Node n = head.next;
		while(n.next != null) {
			System.out.print(n.coef + "x^" + n.expo + " ");
			n = n.next;
		}
		System.out.println(n.coef + "x^" + n.expo);
	}
}
