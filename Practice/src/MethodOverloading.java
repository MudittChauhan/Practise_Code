//Print a string and a Integer by using Method Overloading. It is a method of Polymorphism.

//   ** Muditt Chauhan  **

class Ans
{
	String met(String b)
	{
		System.out.println("String is "+b);
		return b;
	}
	
	int met(int b)
	{
		System.out.println("Integer is "+b);
		return b;
	}
}

public class MethodOverloading
{
	public static void main(String[] args)
	{
		Ans x=new Ans();
		x.met("Mudit");
		x.met("10");
		x.met(10);
	}
}