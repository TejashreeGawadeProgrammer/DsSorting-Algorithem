import java.io.*;
public class InsertionsortExample {
	
	 
	public void insertionsort(int[] arr)
	{ 
		int n= arr.length;
		int key,j,temp;
		for(int i=1;i<n;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>=0 && key < arr[j])
			{
				//arr 2,1,3,7,5
				temp=arr[j]; //temp=2
				arr[j]=arr[j+1];//arr[j]=1
				arr[j+1]=temp; //arr[j+1]=2
				j=j-1;
			}
			
		}
		
	}
	public static void main(String args[])
	{
		InsertionsortExample is=new InsertionsortExample();
		 int[] arr = {2,1,3,7,5};
		
		 System.out.println("\n The Array before sort");
		
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 is.insertionsort(arr);
		 System.out.println("\n The Array After sort");
			
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}

}
