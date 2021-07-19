import java.util.*;

class BinToDec
{
	public static void main(String args[])
	{
	String s;
	System.out.print("Enter Binary number:: ");
	Scanner in=new Scanner(System.in);
	s=in.nextLine();
	System.out.print("The Decimal number of "+s+" is "+Integer.parseInt(s,2));
	}
}