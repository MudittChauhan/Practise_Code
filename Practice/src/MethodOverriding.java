class Aio
{
	public void Xyz()
	{
		System.out.print("Superclass");
	}
}
class MethodOverriding extends Aio
{
	public void Xyz()
	{
		System.out.print("Sub-Class");
	}
	public static void main(String args[])
	{
		MethodOverriding o=new MethodOverriding();
		o.Xyz();
	}
}