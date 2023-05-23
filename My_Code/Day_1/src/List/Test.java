//Implement Linked List for int values

package List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singly_Linked_List l1=new Singly_Linked_List();
		l1.insertAtBeg(23); //call to insert function will create 1st node in memory
		l1.insertAtBeg(56);
		l1.insertAtBeg(6);
		l1.insertAtBeg(8);
		l1.insertAtBeg(16);
		l1.insertAtBeg(88);
	
		l1.display();
		
		l1.insertAtLast(100);
		l1.display();
		
		//l1.deleteAtLast();
		//	l1.display();
		
		l1.deleteAtBeg();
		l1.display();
		
		l1.reverse();
		l1.display();
//		
//		l1.search(56);
	}

}
