import java.io.*;
public class FileInput
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			FileInputStream f=new FileInputStream("D:\\File.txt");
			int a=f.read();
			System.out.println((char)a);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}