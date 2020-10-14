
public class BubbleSortExample {
	
	public void bubblesort(int[] arr)
	{
		int i,j,temp,key;
		int n=arr.length;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(arr[j+1] < arr[j] )
				{
					temp=arr[j]; //temp=2
					arr[j]=arr[j+1];// arr[j]=1
					arr[j+1]=temp; //arr[j+1]=2
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSortExample bs= new BubbleSortExample();
		 int[] arr = {2,1,3,7,5};
		
		 System.out.println("\n The Array before sort");
		
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 bs.bubblesort(arr);
		 System.out.println("\n The Array After sort");
			
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }

	}

}
