public class ArrayEvenOddPos
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {1,2,3,5,2,4};
				
		System.out.print("Even position numbers are: ");
		for( int i=1; i<arr.length; i=i+2)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\nOdd position numbers are: ");
		for (int j=0; j<arr.length; j=j+2)
		{
			System.out.print(arr[j]+" ");
		}
	}
}