import java.util.Scanner;
public class FactorialDiff
{
	public static void main(String args[])
	{
		int fact1=1,fact2=1,num1,num2,i,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers to get their factoral:: ");
		num1=s.nextInt();
		num2=s.nextInt();
		for(i=1;i<=num1;i++)
		{
		fact1=fact1*i;	
		}
		for(i=1;i<=num2;i++)
		{
			fact2=fact2*i;
		}
		if(fact1>=fact2)
		{
			d=fact1-fact2;
		}
		else
		{
			d=fact2-fact1;
		}
		System.out.println("Factorial of "+num1+" is "+fact1+" and of "+num2+" is "+fact2+" and their difference is "+d);
		
	}
}