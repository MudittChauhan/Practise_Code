import java.io.*;
class FileCharArray
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			CharArrayWriter p=new CharArrayWriter();
			p.write("My name is Mudit");;
			FileWriter f1=new FileWriter("D:\\A.txt");
			FileWriter f2=new FileWriter("D:\\B.txt");
			p.writeTo(f1);
			p.writeTo(f2);
			f1.close();
			f2.close();
		}catch(Exception e)
		{
			System.out.print(e);
		}
	}
}