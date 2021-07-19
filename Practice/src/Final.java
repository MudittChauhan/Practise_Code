
public class Final 
{
	final int A;
	Final(int num)
	{
		A=num;
	}
	void b()
	{
		System.out.println(A);
	}
	public static void main(String[] args) 
	{
		Final f=new Final(100);
		f.b();

	}

}
