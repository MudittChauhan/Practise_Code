import java.io.*;
class FileConsole 
{
	public static void main(String args[]) throws IOException
	{
		try 
		{
			Console c=System.console();
			System.out.println("Enter your name : ");
			String s=c.readLine();
			System.out.println("Welcome "+s);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
