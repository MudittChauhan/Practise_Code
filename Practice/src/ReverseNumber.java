import java.util.Scanner;

public class ReverseNumber 
/*{
	public static void main(String[] args)
	{
		int num=0,r=0;
		System.out.print("Enter the number to reverse:: ");
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		
		//		**from while loop
		while(num!=0)
		
		//		**from for loop
		/*for( ;num!=0; )
		{
			r=r*10;
			r=r+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is "+r);
	}
}*/

//		**From iteration
{
public static void Reverse(int n)
{
if(n<10)
{
	System.out.print(n);
	return;
}
else
{
	System.out.print(n%10);
	Reverse(n/10);
}
}
	
public static void main(String[] args) 
{
	int num=0;
	System.out.print("Enter the number to reverse:: ");
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	System.out.print("Reverse Number is ");
	Reverse(num);
	
	
}
}

