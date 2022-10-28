package p2.linkedList_basic;
// 엔지니어 대한민국
public class LinkedList {
	Node header; // header은 data가 들어간 노드가 아니라 그냥 관리용으로 씀

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

		while (pre.next.data != data) { // 첫번째 노드 검사 X, 근데 data가 안든 header이므로 괜찮
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
	// 중복 제거(단, 버퍼 사용 X) : 버퍼 사용 가능하면 Hashset이용(시간O(n) 공간O(n))
	void removeDups() { // 공간 O(1), 시간 O(N**2)
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
