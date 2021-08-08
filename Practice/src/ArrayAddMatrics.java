import java.util.Arrays;

public class ArrayAddMatrics
{
	public static void main(String[] args)
	{
		int[][] a = {{1,5,8,6},{4,7,2,6}};
		int[][] b = {{4,8,2,1},{9,5,3,9}};
		int rowTotal = a.length;
		int colTotal = a[0].length;
		int[][] c = new int[rowTotal][colTotal];
		
		for (int i=0; i<rowTotal; i++)
		{
			for (int j=0; j<colTotal; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
