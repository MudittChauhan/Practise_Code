public class WrapperUnboxing 
{
	public static void main(String[] args) 
	{
	Integer i=new Integer(5);
	int a=i.intValue();
	System.out.println(i+" "+a);
	
	Character c=new Character('M');
	char c1=c.charValue();
	System.out.println("\n"+c1);
	}

}
