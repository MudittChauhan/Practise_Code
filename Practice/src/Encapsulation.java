class Abc
{
	private int x,y,z;
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	public int getz()
	{
		return z;
	}
	public void setx(int newValue)
	{
		x=newValue;
	}
	public void sety(int newValue)
	{
		y=newValue;
	}
	public void setz(int newValue)
	{
		z=newValue;
	}
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
	Abc b=new Abc();
	b.setx(10);
	b.sety(20);
	b.setz(30);
	System.out.println("First no is "+b.getx()+" \nSecond one is "+b.gety()+"\nLast one is "+b.getz());
	}

}
