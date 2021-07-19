import java.io.*;
public class FileConsolePassword 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
			Console c=System.console();
			System.out.println("Enter password : ");
			char c1[]=c.readPassword();
			String s1=String.valueOf(c1);
			System.out.println("Password is "+s1);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
