package List;

public class Singly_Linked_List {
	private Node head;

//	public Singly_Linked_List() {
//		this.head = null;
//	}
//
//	public Node getHead() {
//		return head;
//	}
//
//	public void setHead(Node head) {
//		this.head = head;
//	}
	
	public boolean insertAtBeg(int v) {
		
		Node nn=new Node(v);//here new node will be created with data and null value
		if(nn==null)
			return false;
		if(head==null)
			head=nn;
		else {
			nn.setNext(head);
			head=nn;
		}
//		
//		if(head!=null)
//			nn.setNext(head);
//		head=nn;
		return true;
		
	}
	public boolean insertAtLast(int v)
	{
		Node nn = new Node(v);
				if(head==null)
		{			
					head=nn;
		}
				
			
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
			
		}
		temp.setNext(nn);
		return true;
	}
	public boolean deleteAtBeg()
	{
		
		if(head==null)
		{
			return false;
		}
		else
		{
			Node temp=head;
			
			temp=temp.getNext();
			head=temp;
		}
		return true;
		
		
		
	}
	
	
	
	public boolean deleteAtLast() {
		if(head==null)
			return false;
		
		Node temp=head;
		
		while(temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(null);

		
		return true;
		
	}
	
	
	public void reverse()
	{
		Node p,q,r;
		
		p=head;
		q=p.getNext();
		
		while(q!=null)
		{
			r=q.getNext();
			q.setNext(p);
			
			p=q;
			q=r;
		}
		head.setNext(null);
		head=p;
		
		
		
	}
	
	
	
	public void display() {
		Node temp=head;
		System.out.println("\nList Elements  -");
		while(temp!=null) {
			System.out.print("\t"+temp.getData());
			temp=temp.getNext();
		}
		
	}
	public void search(int v) {
		//temp points to first node
		Node temp=head;
		int c=0;
		while(temp!=null) {
			//c is position every time it will increase if data not found
			c++;
			//if will run when ata found
			if(v==temp.getData()) {
				//print msg found with position
				System.out.println("\n"+v+"found at position "+c);
				break;
			}
			//temp go ahead till it becomes null
				temp=temp.getNext();
		}
	}
	
}
