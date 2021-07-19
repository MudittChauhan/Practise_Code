public class StringCompare 
{
	public static void main(String[] args) 
	{
	String a="Hello";
	String b="Mudit";
	String c=new String("Mudit");
	System.out.println(a.equals(b));
	System.out.println(b.equals(c));
	System.out.println(a==b);
	System.out.println(b==c);		//c is refers to the instance created in non-pool
	System.out.println(a.compareTo(b));
	System.out.println(b.compareTo(c));
	}

}
