public class WrapperAutoboxing 
{
	public static void main(String[] args) 
	{
	int a=10,b=20;
	Integer i=Integer.valueOf(a);
	Integer j=Integer.valueOf(b);
	//Integer i=a;
	//Integer j=b;
	System.out.print(a+" "+b+" "+i+" "+j);
	}

}
