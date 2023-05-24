package LL;

public class Linked_List 
{
	private Node head;
	public boolean Inserte_at_Beg(int v)
	{
		Node nn = new Node(v);
		
		if(head==null)
		{
			nn.setNext(head);
			head=nn;
		}
		else
		{
			nn.setNext(head);
			head=nn;
			
		}
		return true;		
	}
	
	public boolean Insert_At_Last(int v)
	{
		Node nn = new Node(v);
		
		if(head==null)
		{
			nn.setNext(head);
			head=nn;
		}
		else
		{
			Node temp=head;
			
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(nn);
			
			
		}
		
		return true;
	}
	
	public boolean Inserte_At_pos(int v,int p)
	{
		Node nn = new Node(v);
		
		if(p<=0)
		{
			return false;
		}
		if(p==1)
		{
			Inserte_at_Beg(v);
		}
		int i=1;
		Node temp=head;
		
		while(i<p-1)
		{
			
			temp.getNext();
			i++;
		}
		if(temp==null)
		{
			System.out.println("Inavalid postion");
		}
		else
		{
			nn.setNext(temp.getNext());
			temp.setNext(nn);

		}
		
		return true;
	}
	
	public boolean Delete_At_Beg()
	{
		if(head==null)
		{
			return false;
		}
		else
		{
			Node temp=head;
			
			head=temp.getNext();
			temp.setNext(null);
		}
		
		return true;
	}
	
	
	public boolean Delete_At_Last()
	{
		if(head==null)
		{
			return false;
		}
		Node temp=head;
		
		while(temp.getNext().getNext()!=null)
		{
			temp=temp.getNext();
		}
		
		temp.setNext(null);
		
		return true;
	}
	
	public boolean Delete_At_Pos(int p)
	{
		if(p<=0)
		{
			return false;
		}
		if(p==1)
		{
			Delete_At_Beg();
		}
		int i=1;
		Node temp=head;
		while(i<p-1)
		{
			i++;
			temp=temp.getNext();
		}
		
		if(temp.getNext().getNext()==null)
		{
			temp.setNext(null);
		}
		else
		{
		Node t=temp.getNext();
		temp.setNext(t.getNext());
		t.setNext(null);
	
		}

		
		return true;
		
	}

	public void display()
	{
		Node temp=head;
		System.out.println("\nList Elements  -");
		while(temp!=null) 
		{
			System.out.print("\t"+temp.getData());
			temp=temp.getNext();
		}
		
	}
	
}
