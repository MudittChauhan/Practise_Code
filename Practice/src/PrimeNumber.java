import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
	int num,n=0,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no.: ");
	num=s.nextInt();
	for(i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			System.out.println("Not prime");
			n=1;
			break;
		}
	}
		if(n==0)
		{
			System.out.println("Prime");
		}
	}
	
	}


