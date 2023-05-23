//3. You are given array consisting of n integers. Your task is to find the maximum length of an increasing 
//subarray of the given array.
//A subarray is the sequence of consecutive elements of the array. Subarray is called increasing 
//if each element of this subarray strictly greater than previous.
//i/p-5 1  7  2  11  15
//o/p -3


package List;

public class Assignment3 
{
	public static void main(String[] args)
	{
		int arr[]= {5,1,7,2,11,15};
		int count=1;
		int max=1;
		
		for(int i=0;i<arr.length-1;i++)
		{
			int j=i+1;
			
			if(arr[i]<arr[j])
			{
				count++;
			}
			else
			{
				count=1;
			}
			if(max<count)
			{
				max=count;
			}
		}
		System.out.println("Total Maxarray is: "+max);
		
		
	}
	
}
