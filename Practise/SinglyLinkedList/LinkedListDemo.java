package SinglyLinkedList;

import java.util.Scanner;

import javax.management.RuntimeErrorException;



class LinkedList
{	
	static class Node
	{
		private int data;
		private Node next;
	
		public  Node()
		{
			data=0;
			next=null;
		}
	
		public Node(int val)
		{
			data=val;
			next=null;
		}
		
	}
	
	private Node head;
	
	public LinkedList()
	{
		head=null;
	}

	///Display
	
	public void display() 
	{
		System.out.println("List : ");
		Node trav = head;
		while(trav != null) 
		{
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	//Add First
	
	
	public void addfirst(int v)
	{
		Node nn =new Node(v);
		nn.next=head;
		head=nn;
	}
	
	public void addLast(int v)
	{
		Node nn=new Node(v);
		
		Node trav=head;
		
		if(head==null)
		{
			head=nn;
		}
		else
		{
		while(trav.next !=null)
		{
			
			trav=trav.next;
		}
		trav.next=nn;
		}
	}
	
	public void addAtPosition(int v,int pos)
	{
		
		if(head == null || pos <= 1)
		
			addfirst(v);
		
		else
		{
			Node nn= new Node(v);
			Node trav=head;
			
			for(int i=0;i<pos-1;i++)
			{
				if(trav.next==null)
					break;
				trav=trav.next;
			}
			nn.next=trav.next;
			trav.next=nn;
		}	
	}
	
	public void deleteFirst()
	{
		if(head==null)
		
			//System.out.println(">>>>>>>>>>Inavalid Posttion");
			throw new RuntimeException("<<<<<<<List is empty.");
		
		head=head.next;
	}
	
	public void deleteLast()
	{
		
		if(head==null)
		//	System.out.println("<<<<<<Invalid ");
			throw new RuntimeException("<<<<<<<List is empty.");
		
		Node temp=null;
		Node trav=head;
		
		if(head.next == null)
			head = null;
		else
		{
		while(trav.next !=null)
		{
			temp=trav;
			trav=trav.next;
		}
		temp.next=null;
		}
	}
	
	public void deleteAll()
	{
		head=null;
	}
	
	
	public void deleteAtposition(int pos)
	{
		
		if(pos==1)
		 deleteFirst();
		
		if(head==null || pos<1)
			throw new RuntimeException("Invalid Postion .");
		else
		{
			Node trav=head;
			Node temp=null;
		for(int i=0;i<pos-1;i++)
		{
			if(trav == null)
				throw new RuntimeException("Invalid position.");
			temp = trav;
			trav = trav.next;
		}
		 temp.next=trav.next;
		}	
			
	}
}



public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		
		Scanner sc =new Scanner(System.in);
		
		int choice,val,pos;
		do
		{
			System.out.println("Choice>>>>>>");
			System.out.println("1.Display  \n2.AddFirst  \n3.Add Last \n4.Add At Position \n5.Delete First");
			System.out.println("6.Delete Last \n7.Delete All \n8.Delete At Position");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: //Display
				list.display();
				break;
				
			case 2://add first 
				System.out.println("Enter the element");
				val=sc.nextInt();
				list.addfirst(val);
				break;
			
			case 3://Add last
				System.out.println("Enter the element");
				val=sc.nextInt();
				list.addLast(val);
				break;
				
			case 4: //Add At Position
					System.out.println("Enter the position");
					pos=sc.nextInt();
					System.out.println("Enter the element");
					val=sc.nextInt();
					list.addAtPosition(val, pos);
					break;
				
			case 5://Delete First
				
				try
				{
					list.deleteFirst();
				}catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 6://Delete Last
				try
				{
					list.deleteLast();
				}catch (Exception e)
				{
					System.out.println(	e.getMessage());
				}
				
				break;
			
			case 7://Delete all
				
				list.deleteAll();
				break;
				
			case 8:// Delete At position
				
				System.out.println("enter the position");
				pos=sc.nextInt();
				try 
				{
					list.deleteAtposition(pos);
				}catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				
			}
		}
		while(choice !=0);
		sc.close();
			
	}
}
