public class ArrayAscDesc
{
	static int[] arr = new int[] {1,2,3,5,2,4};
	static int temp=0;
	static void asc()
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}System.out.print(arr[i]+" ");
		}	
	}
	
	static void desc()
	{
		for (int i=0; i< arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}System.out.print(arr[i]+" ");
		}
	}
		
		
	public static void main(String[] args)
	{
		System.out.println("Ascending order is: ");
		asc();
		System.out.println("\nDescending order is: ");
		desc();
		
		
		
	}
}