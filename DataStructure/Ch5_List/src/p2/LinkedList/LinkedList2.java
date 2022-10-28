package p2.LinkedList;
// �����Ͼ� ���ѹα��� NodeList. 
class SinglyLinkedList {
	Node head;	// head�� �����Ͱ� �ִ� Node�� ����.
	
	SinglyLinkedList(String data){
		this.head = new Node(data);
	}
	// ���� node �߰�
	public void append(String data) {
		Node end = new Node(data);
		Node temp = head;
		// �� ���ϱ�
		while(temp.next != null)
			temp = temp.next;
		
		temp.next = end;
	}
	
	// ����
	public void delete(String data) {
		Node temp = head;
		//��� ã��
		while(temp.next != null) { // �̸� ������ ���� �Ʒ� �˻縦 ���� �ʰ� ��
			// ������ ��带 ������ ������ �� �� ��忡�� ����(�̷��� ���ϸ� head�� �˻����� �ʴ� ����� ���� )
			// => ����Ƶ� �� �� �� �� ���� �˻� X ���� ó���ؾ���.
			if(temp.next.getData().equals(data)) // head�� �˻� ���ϰ� ������ ���� �˻�
				temp.next = temp.next.next;		// head�� linkedList�� �����ϴ� �߿��� ����̱� ������ �Ժη� �ǵ����� �ʱ� ����
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