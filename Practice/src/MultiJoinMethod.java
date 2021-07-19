public class MultiJoinMethod extends Thread 
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try {
				Thread.sleep(500);
				}catch(Exception e)
			{
					System.out.println(e);
			}
			System.out.println(i);
		}
	}	
	
	public static void main(String[] args) 
	{
		MultiJoinMethod m1=new MultiJoinMethod();
		MultiJoinMethod m2=new MultiJoinMethod();
		MultiJoinMethod m3=new MultiJoinMethod();
		m1.start();
		try {
			m1.join();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		m2.start();
		m3.start();
	}

}
