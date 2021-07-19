public class ParamConstructor 
{
	int x;
	String y;
	ParamConstructor(int a, String b)
	{
	x=a;
	y=b;
	}
	void display()
	{
		System.out.println(x+" "+y);
	}
		public static void main(String[] args) 
	{
			ParamConstructor p=new ParamConstructor(111,"Mudit");
			ParamConstructor p1=new ParamConstructor(222,"Chauhan");
			p.display();
			p1.display();
	}

}
