import java.io.*;
public class FileOutput
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			FileOutputStream f=new FileOutputStream("D:\\File.txt");
			f.write(77);
			f.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}