package crackingthecoding.chap2;

public class KthElementFromLastInLinkedList {

	Node head;

	public KthElementFromLastInLinkedList() {
		head = null;
	}

	public void insert(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}


	private void printFromEnd(Node head2, int n) {
		Node current = head2, previous = null;
		int count = 1;
		if(current ==  null)
			return ;
		while(current != null && count < n) {
			count++;
			current = current.next;
		}
		
		previous = head2;
		current = current.next;
		
		while(current != null) {
			previous= previous.next;
			current = current.next;
		}
		System.out.println();
		System.out.println(previous.data);
	}

	public void print() {
		Node current = head;
		if(current ==  null)
			return ;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
	}


	public static void main(String[] args) {


		KthElementFromLastInLinkedList l1 = new KthElementFromLastInLinkedList();

		//insert at start
		l1.insert(30);
		l1.insert(20);
		l1.insert(10);
		l1.insert(100);
		l1.insert(60);
		l1.insert(70);
		l1.insert(80);
		l1.insert(0);
		l1.print();


		//print nth element from end
		int n =3;
		l1.printFromEnd(l1.head, n);
		
		
	}


}
