//
//4.Rearrange Everything
//Given an array of size n where all elements are in range from 0 to n-1, change contents of arr[] so that arr[i] = j is changed to arr[j] = i.
//i/p - 22   13 9 41
//o/p  - 22  9  13  41


package List;

import java.util.Arrays;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		int arr1[]= {22,13,9,41};
		int temp=0;
	
		
		for(int i=1,j=arr1.length-2;i<arr1.length/2;i++,j--)
		{
				temp=arr1[j];
				arr1[j]=arr1[i];
				arr1[i]=temp;
		}
		
		System.out.println(Arrays.toString(arr1));
		
				
		
	}
}
