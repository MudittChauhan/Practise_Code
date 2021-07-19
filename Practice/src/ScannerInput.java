import java.util.Scanner;
public class ScannerInput 
{
public static void main(String[] args) 
{
	String a;
	int b;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the string:: ");
	a=in.nextLine();
	System.out.print("Enter a number:: ");
	b=in.nextInt();
	System.out.println("Enter String is "+a+" and Number is "+b);
}
}
