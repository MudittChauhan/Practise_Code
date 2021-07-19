public class TryCatchFinally
{
	public static void main(String args[])
	{
		int a=10,b=2,c;
		try
		{
			c=(a*b)/0;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurs");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println("Out of Try-Catch-Finally block");
	}
}