import java.io.*;
public class FileOutputString
{
	public static void main(String arga[]) throws IOException
	{
		try
		{
			FileOutputStream f=new FileOutputStream("D:\\StringArray.txt");
			String s="My name is Jarvis";
			byte b[]=s.getBytes();
			f.write(b);
			f.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}