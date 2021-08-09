import java.util.Arrays;

public class ArrayMultiplication 
{
	public static void main(String[] args)
	{
		int[][] a= {{1,2,3},{4,5,6}};
		int[][] b= {{4,5,6},{3,2,1}};
		
		int rowTotal, colTotal;
		
		rowTotal = a.length;
		colTotal = a[0].length;
		
		int[][] c= new int[rowTotal][colTotal];
		
		for (int i=0; i<rowTotal; i++)
		{
			for (int j=0; j<colTotal; j++)
			{
				//c[i][j] = 0;
				for (int k=0; k<colTotal; k++)
				{
					c[i][j] = a[i][j] * b[i][j];	
				}
				System.out.print(c[i][j]+" ");
			}	System.out.println();
		}
	}
}

