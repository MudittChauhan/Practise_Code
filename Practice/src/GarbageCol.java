public class GarbageCol 
{
	public void finalize()
	{
		System.out.println("Finalize called");
	}
	public static void main(String[] args) 
	{
		GarbageCol g=new GarbageCol();
		g=null;     //Method 1
		new GarbageCol();		//Method 2
		System.gc();
	}
}
