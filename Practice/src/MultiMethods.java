public class MultiMethods extends Thread 
{
	public void run()
	{
		System.out.println("Running thread");
	}
	
	public static void main(String[] args) 
	{
	MultiMethods m=new MultiMethods();
	MultiMethods m1=new MultiMethods();
	System.out.println("Name of m : "+m.getName());
	System.out.println("Priority of m : "+m.getPriority());
	System.out.println("Name of m1 : "+m1.getName());
	System.out.println("Priority of m1 : "+m1.getPriority());
	m.setPriority(MIN_PRIORITY);
	m1.setPriority(8);
	System.out.println("New Priority of m : "+m.getPriority());
	System.out.println("New Priority of m1 : "+m1.getPriority());
	System.out.println("Id of m : "+m.getId());
	System.out.println("Id of m1 : "+m1.getId());
	m.start();
	m1.start();

	m.setName("m3");
	System.out.println("New name of m : "+m.getName());
	}

}
