import java.util.*;

class ArrayDuplicate
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,5,2,1,1,5,4,5,3,10,11,11,12,13,14,15,15};
		boolean[] result = new boolean[arr.length];
		
		for (int i=0; i<arr.length; i++)
		{
			boolean dup = false;
			
			if (result[i] == true)
			{
				continue;
			}
			
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					dup = true;
					result[j] = true;
				}
			}
			
			if (dup)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}