import java.util.Scanner;

public class Fibonacci
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int num1=0, num2=1, num3, count;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number for Fibonacci length: ");
		count=sc.nextInt();
		System.out.print(num1+" "+num2);
		for(int i=0; i<count-2; i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3);
		}
	}
}