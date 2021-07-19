import java.io.*;
public class FileInputString
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			FileInputStream f=new FileInputStream("D:\\StringArray.txt");
			int a=0;
			while((a=f.read())!=-1)
			{
				System.out.print((char)a);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}