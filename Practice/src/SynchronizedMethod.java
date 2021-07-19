class Synco
{
	synchronized void print(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
			try {
				Thread.sleep(400);
			}catch(Exception e)
			{
			System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread
{
	Synco t;
	MyThread1(Synco t)
	{
		this.t=t;
	}
	public void run()
	{
	t.print(5);
	}
}

class MyThread2 extends Thread
{
	Synco t;
	MyThread2(Synco t)
	{
		this.t=t;
	}
	public void run()
	{
	t.print(100);
	}
}

class SynchronizedMethod
{
	public static void main(String args[])
	{
		Synco obj=new Synco();
		MyThread1 m1=new MyThread1(obj);
		MyThread2 m2=new MyThread2(obj);
		m1.start();
		m2.start();
	}
}