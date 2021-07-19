public class StringMethods 
{
	public static void main(String[] args) 
	{
	String a="Hello";
	String b=" World";
	String c="Hello World";
	String d="";
	System.out.println(a.concat(b));
	System.out.println(a.substring(0,4));
	System.out.println(a.equals(b));
	System.out.println(a.compareTo(b));
	System.out.println(a.toUpperCase());
	System.out.println(b.toLowerCase());
	System.out.println(b.trim());
	System.out.println(a.startsWith("H"));
	System.out.println(b.endsWith("e"));
	System.out.println(c.charAt(8));
	System.out.println(c.length());
	String ch=a.replace("Hello", "Mudit");
	System.out.println(ch);
	System.out.println(d.isEmpty());
	System.out.println(c.replaceAll("\\s", ""));
	}

}
