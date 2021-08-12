public class ArrayRotate
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {1,2,3,5,2,4};
		int[] rev = new int[arr.length];
		int rot = 2;
		for (int i=rot; i<arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		for (int i=0; i<rot; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}