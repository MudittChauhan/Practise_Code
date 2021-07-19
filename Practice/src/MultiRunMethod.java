public class MultiRunMethod extends Thread 
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try{
				Thread.sleep(500);
				}
			catch(Exception e)
			{
					System.out.println(e);
			}
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) 
	{
		MultiRunMethod r=new MultiRunMethod();
		MultiRunMethod r1=new MultiRunMethod();
		r.run();
		r1.run();
	}

}
