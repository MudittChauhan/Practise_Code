//Print the Table of 2 by using thread

//   ** Muditt Chauhan  **
public class ExtendThread2 extends Thread
{
	public void run()
	{
		int i,a=2,b;
		for(i=1;i<=10;i++)
			{
			b=(i*a);
			System.out.println(a+" * "+i+" = "+b);
			}
	}
	public static void main(String[] args) 
	{
	ExtendThread2 x=new ExtendThread2();
	x.start();
	}

}
