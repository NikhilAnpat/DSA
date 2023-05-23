package List;

//1. Write a Java program to find the index of an array element.
import java.util.*;


public class Assignment1
{

	public static void main(String[] args)
	{
		int arr1[]= {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		int a=sc.nextInt();
		
		int c=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==a)
			{
				System.out.println(arr1[i]);
				System.out.println("The index is "+c);

			return;	
			}
			
			
			c++;
		}
		System.out.println("The number is not valid");
		
	}

}
