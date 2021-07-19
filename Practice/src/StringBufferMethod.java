public class StringBufferMethod
{
	public static void main(String args[]) 
	{
	StringBuffer sb=new StringBuffer("Supernova");
	StringBuffer sb1=new StringBuffer("Supernova");
	StringBuffer sb2=new StringBuffer("Supernova");
	StringBuffer sb3=new StringBuffer("Supernova");
	StringBuffer sb4=new StringBuffer("Supernova");
	sb.append(" Jarvis");
	sb1.delete(1,3);
	sb2.reverse();
	sb3.insert(0, "Jarvis ");
	sb4.replace(0, 5, "Jarvis");
	System.out.println(sb);
	System.out.println(sb1);
	System.out.println(sb2);
	System.out.println(sb3);
	System.out.println(sb4);
	}
}
