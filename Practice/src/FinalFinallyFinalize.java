public class FinalFinallyFinalize 
{
	public void finalize()
	{
		System.out.println("Finalize Called");	
	}
		
	public static void main(String[] args) 
	{
		FinalFinallyFinalize f=new FinalFinallyFinalize();
	final int a=100;
	System.out.println(a);
	try
	{
		int b=a/120;
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.exit(0);
	}
	finally
	{
		System.out.println("Exception not Occured");
	}
		f=null;
		System.gc();
	}

}
