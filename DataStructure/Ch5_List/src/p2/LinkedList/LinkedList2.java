package p2.LinkedList;
// 엔지니어 대한민국의 NodeList. 
class SinglyLinkedList {
	Node head;	// head에 데이터가 있는 Node를 넣음.
	
	SinglyLinkedList(String data){
		this.head = new Node(data);
	}
	// 끝에 node 추가
	public void append(String data) {
		Node end = new Node(data);
		Node temp = head;
		// 끝 구하기
		while(temp.next != null)
			temp = temp.next;
		
		temp.next = end;
	}
	
	// 삭제
	public void delete(String data) {
		Node temp = head;
		//노드 찾기
		while(temp.next != null) { // 이면 마지막 노드는 아래 검사를 하지 않게 됨
			// 마지막 노드를 지울지 말지를 그 전 노드에서 결정(이렇게 안하면 head를 검사하지 않는 방법이 있음 )
			// => 어찌됐든 양 끝 중 한 노드는 검사 X 따로 처리해야함.
			if(temp.next.getData().equals(data)) // head는 검사 안하고 마지막 노드는 검사
				temp.next = temp.next.next;		// head는 linkedList를 유지하는 중요한 노드이기 때문에 함부로 건들이지 않기 위해
			else
				temp = temp.next;
		}
	}
	
	// print
	public void retrieve() {
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.getData() + "-> ");
			temp = temp.next;
		}
		System.out.println(temp.getData());
	}
}
public class LinkedList2{
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList("1");
		list.append("2");
		list.append("3");
		list.append("4");
		list.retrieve();
		list.delete("2");
		list.retrieve();
	}
}