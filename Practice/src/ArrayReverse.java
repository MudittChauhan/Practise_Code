
public class ArrayReverse 
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {1,2,3,5,2,4};
		int[] rev = new int[arr.length];
		
		for (int i=arr.length-1; i>=0; i--) 
		{
			System.out.print(arr[i]);
		}
	}
}
