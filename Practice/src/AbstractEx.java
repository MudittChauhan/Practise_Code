abstract class A2
{
	public abstract int x();
	public abstract String y();
}

class B5 extends A2
{
	public int x()
	{
		int m=10,n=2,p;
		p=m+n;
		System.out.println(p);
		return p;
		
	}
	
	public String y()
	{
		String o="Hello";
		System.out.println(o);
		return o;
	}
}

class AbstractEx 
{
	public static void main(String args[])

	{
		A2 b1=new B5();
		b1.x();
		b1.y();
	}
}

