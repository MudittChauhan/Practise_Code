import java.util.Scanner;
public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String s,temp,r="";
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the string:: ");
		s=scan.nextLine();
		temp=s;
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(temp.equals(r))
		{
			System.out.print("String palindrome");
		}
		else
		{
			System.out.print("String not palindrome");
		}
	}

}
