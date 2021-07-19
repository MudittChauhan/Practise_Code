public class StringImmutable 
{
	public static void main(String[] args) 
	{
	String a="Hello";
	String b=" World";
	String c=a.concat(b);
	//a.concat(" worldss");		
	a=a.concat(" Worldss");     //We explicitly assign worldss to reference variable a
	System.out.println(a);
	System.out.println(c);
	}

}
