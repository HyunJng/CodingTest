package p2.linkedList_basic;
// �����Ͼ� ���ѹα�
public class LinkedList {
	Node header; // header�� data�� �� ��尡 �ƴ϶� �׳� ���������� ��

	static class Node {
		int data;
		Node next = null;
	}

	LinkedList() {
		header = new Node();
	}

	void append(int data) {
		Node end = new Node();
		end.data = data;
		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = end;
	}

	Node delete(int data) {
		Node pre = header;

		while (pre.next.data != data) { // ù��° ��� �˻� X, �ٵ� data�� �ȵ� header�̹Ƿ� ����
			pre = pre.next;
		}
		Node del = pre.next;
		pre.next = del.next;
		return del;
	}

	void retrieve() {
		Node n = header.next;
		while(n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println(n.data);
	}
	// �ߺ� ����(��, ���� ��� X) : ���� ��� �����ϸ� Hashset�̿�(�ð�O(n) ����O(n))
	void removeDups() { // ���� O(1), �ð� O(N**2)
		Node n = header;
		while(n.next != null) {
			Node r = n.next;
			while(r.next != null) {
				if(n.next.data != r.next.data) {
					r = r.next;
				}else {
					r.next = r.next.next; 
				}
			}
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.append(1);
		list.append(1);
		list.append(3);
		list.append(2);
		list.append(5);
		list.append(3);
		list.append(1);
		
		list.retrieve();
		
		list.removeDups();
		list.retrieve();
	}
}
