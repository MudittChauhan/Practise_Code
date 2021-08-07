import java.util.Arrays;

public class ArrayCopy 
{
	public static void main(String[] args) 
	{
		// Copy single integer array using arraycopy method
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[a.length];
		System.arraycopy(a,0,b,0,a.length);
		System.out.println(Arrays.toString(b));
		System.out.println();
		
		// Copy single string array using arraycopy method
		String a1[]= {"a","b","c","d"};
		String b1[]=new String[a1.length];
		System.arraycopy(a1,0,b1,0,a1.length);
		System.out.println(Arrays.toString(b1));
		System.out.println();
		
		// Copy 2D integer array using direct approach
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] arrcopy = arr;
		System.out.println(Arrays.deepToString(arrcopy));
		System.out.println();
		
		// Copy 2D integer array using arraycopy
		int[][] ar = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] dest = new int[ar.length][];
		System.arraycopy(ar,0,dest,0,ar.length);
		System.out.println(Arrays.deepToString(dest));
	}

}
