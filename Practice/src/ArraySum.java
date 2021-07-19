import java.util.Scanner;
public class ArraySum 
{
	public static void main(String[] args) 
	{
		int sum=0;
		//User number::
		/*int[] array = new int[5];
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:: ");
		for(int i=0;i<5;i++)
		{
			array[i]=s.nextInt();
		}*/
		
		//Pre-value sum::
		int[] array= {10,20,30,40,50};
		for(int num=0;num<array.length;num++)
		{
			sum=array[num]+sum;
		}
		System.out.print("Sum is "+sum);

	}

}
