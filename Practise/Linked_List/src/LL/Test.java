package LL;

public class Test
{

	public static void main(String[] args) 
	{
		Linked_List ll= new Linked_List();
		
		ll.Inserte_at_Beg(12);
		ll.Inserte_at_Beg(13);
		ll.Inserte_at_Beg(14);
		ll.Inserte_at_Beg(15);
		ll.Inserte_at_Beg(16);
		ll.Inserte_at_Beg(17);
		ll.Inserte_at_Beg(18);
		ll.display();
		
		
//		ll.Insert_At_Last(11);
//		ll.display();
//		
//		
//		ll.Inserte_At_pos(100, 2);
//		ll.display();
//		
//		ll.Delete_At_Beg();
//		ll.display();
//		
//		ll.Delete_At_Last();
//		ll.display();
		
		ll.Delete_At_Pos(6);
		ll.display();
			
	}
	
	
	
	
	

}
