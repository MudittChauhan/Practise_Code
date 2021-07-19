public class ToString 
{
	int a;
	String b,c;
	ToString(int a,String b,String c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public String toString()
	{
		return a+" "+b+" "+c;
	}
		
	public static void main(String[] args) 
	{
	ToString t=new ToString(111," Mudit ","Chauhan");
	System.out.print(t);
	}

}
