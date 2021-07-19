abstract class AbstractClass
{
	public void display1()
	{
		System.out.println("Concrete Method");
	}
	abstract public void display2();
}

public class AbstractDemo extends AbstractClass
{
	public void display2()
	{
		System.out.println("Overridden method");
	}
	public static void main(String [] args)
	{
		AbstractDemo a=new AbstractDemo();
		a.display1();
		a.display2();
		
	}
}
