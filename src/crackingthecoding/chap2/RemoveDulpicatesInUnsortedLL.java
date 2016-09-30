package crackingthecoding.chap2;

public class RemoveDulpicatesInUnsortedLL {

	public static void main(String[] args) {
		
		SinglyLinkedList l1 = new SinglyLinkedList();
		
		//insert at start
		l1.insertAtStart(100);
		l1.insertAtStart(20);
		l1.insertAtStart(10);
		l1.insertAtStart(50);
		l1.insertAtStart(20);
		l1.insertAtStart(0);
		l1.insertAtStart(0);
		l1.print();
		
		System.out.println("--------------------------------");
		l1.removeDuplicate();
		l1.print();

	}

}
