import java.util.Scanner;
public class PalindromeNumber
{
	public static void main(String[] args) 
	{
		int r=0,n,num,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			r=r*10;
			r=r+num%10;
			num=num/10;
		}
		if(temp==r)
		{
			System.out.println("It's a Palindrome");
		}
		else
		{
			System.out.println("It's not Palindrome");
		}
			
		
	}

}
