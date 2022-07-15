import java.util.Scanner;
public class ArraySortjava 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++) 
		{
		 
		arr[i]=s.nextInt();
		}
		System.out.println("Here is the Array");
		for(int i=0;i<n;i++) 
		{
		 
		System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		    }
		}
		System.out.println();
		System.out.println("Here is the Sorted Array");
		 for(int i=0;i<n;i++) 
		 {
		System.out.print(arr[i]+" ");
		}
	}
}

		
		

	


