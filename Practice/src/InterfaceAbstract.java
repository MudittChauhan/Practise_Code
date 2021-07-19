interface Ade
{
	static int t=10;
	public int x();
}

interface bcd extends Ade
{
	public String y();
}

abstract class C5 implements bcd
{
	public int x()
	{
		System.out.println(t);
		return t;
	}
}


public class InterfaceAbstract extends C5 
{
	public String y()
	{
		String s="Muditt";
		System.out.println(s);
		return s;
	}
	public static void main(String[] args) 
	{
	C5 c1=new InterfaceAbstract();
	c1.x();
	c1.y();
	}

}
