class Practise1
{
	void display()
	{
		System.out.print("Helllo");
	}
}

class Practise extends Practise1
{
	void display()
	{
		System.out.print("sjfws");
	}
	public static void main(String args[])
	{
		Practise1 p=new Practise();
		//Practise p1= (Practise) new Practise1();
		p.display();
		//p1.display();
	}
}