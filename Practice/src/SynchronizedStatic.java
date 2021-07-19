class Synchr
{
	synchronized static void print(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(400);
				}catch(Exception e)
			{
					System.out.println(e);
			}
		}
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		Synchr.print(3);
	}
}
class Thread4 extends Thread
{
	public void run()
	{
		Synchr.print(7);
	}
}

public class SynchronizedStatic 
{
	public static void main(String[] args) 
	{
	Thread3 t=new Thread3();
	Thread4 t2=new Thread4();
	t.start();
	t2.start();
	}

}
