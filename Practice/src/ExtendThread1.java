//Print a statement by using thread

//   ** Muditt Chauhan  **

public class ExtendThread1 extends Thread
{
	public void run()
	{
		System.out.println("this is a run method of multithread");
	}
	public static void main(String args[])
	{
		ExtendThread1 b=new ExtendThread1();
		b.start();
	}
}