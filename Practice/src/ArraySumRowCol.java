import java.util.Arrays;

class ArraySumRowCol
{
	public static void main(String[] args)
	{
		int rowTotal, colTotal, rowSum, colSum;
		int[][] arr = {{1,5,3},{6,4,2,},{9,5,8},{4,7,10},{15,6,4}};
		rowTotal = arr.length;
		colTotal = arr[0].length;
		
		// Calculate sum of each row
		for (int i=0; i<rowTotal; i++)
		{
			rowSum = 0;
			for (int j=0; j<colTotal; j++)
			{
				rowSum = arr[i][j] + rowSum;
			}
			System.out.println("Sum of "+(i+1)+" row is "+rowSum);
		}
		
		//Calculate sum of each column
		for (int i=0; i<colTotal; i++)
		{
			colSum = 0;
			for (int j=0; j<rowTotal; j++)
			{
				colSum = arr[j][i] + colSum;
			}
			System.out.println("Sum of "+(i+1)+" column is "+colSum);
		}
	}
}