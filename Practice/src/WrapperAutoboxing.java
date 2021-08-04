public class WrapperAutoboxing 
{
	public static void main(String[] args) 
	{
	int a=10,b=20;
	Integer i=Integer.valueOf(a);
	Integer j=Integer.valueOf(b);
	Integer k=a;
	Integer l=b;
	System.out.print(a+" "+b+" "+i+" "+j+" "+k+" "+l);
	
	
	char c='C';
	Character c1=Character.valueOf(c);
	Character c2=c;
	System.out.print("\n"+c1+" "+c2);
	}

}
