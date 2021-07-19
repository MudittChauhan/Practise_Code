import java.util.*;

class RandomNumber
{
	public static void main(String args[])
	{
	int num,limit=0;
	Random r=new Random();
	System.out.print("Enter the number till you want a random number:: ");
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	for(limit=1;limit<=1;limit++)
	{
		System.out.print("One Random number till "+num+" is "+r.nextInt(num));
	}
	}
	
}