interface Another
{
	public void a1();
}

interface Another1 extends Another
{
	public void b1();
}

class Interfaces implements Another1
{
	public void a1()
	{
		System.out.println("Interface A Method"); 
	}
	
	public void b1()
	{
		System.out.println("Interface B Method");
	}
		
	public static void main(String[] args)
	{
	Another1 i=new Interfaces();
	i.a1();
	i.b1();
	}

}
