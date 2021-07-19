//Multiple Inheritance using Interfaces and Implements

//   ** Muditt Chauhan  **

interface A1
{
	public void methodA();
}
interface B1 extends A1
{
	public void methodB();
	}
interface C1 extends B1
{
	public void methodC();
	}
class Multiple implements C1
{
	public void methodA()
	{
		System.out.println("Method A");
	}
	public void methodB()
	{
		System.out.println("Method B");
	}
	public void methodC()
	{
		System.out.println("Method C");
	}
	public static void main(String args[])
	{
		Multiple d1=new Multiple();
		d1.methodA();
		d1.methodB();
		d1.methodC();
	}
}