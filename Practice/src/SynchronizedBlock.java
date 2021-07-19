class Synchoo
{
	public void print(int n)
	{
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				try 
				{
					Thread.sleep(400);	
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}

class Thread1 extends Thread
{
	Synchoo t;
	Thread1(Synchoo t)
	{
		this.t=t;
	}
	public void run()
	{
		t.print(2);
	}
}

class Thread2 extends Thread
{
	Synchoo t;
	Thread2(Synchoo t)
	{
		this.t=t;
	}
	public void run()
	{
		t.print(5);
	}
}


public class SynchronizedBlock 
{
	public static void main(String[] args) 
	{
	Synchoo obj=new Synchoo();
	Thread1 m=new Thread1(obj);
	Thread2 m1=new Thread2(obj);
	m.start();
	m1.start();
	}
}
