
public class ConstructorEx 
{
	private int var;
	
	public ConstructorEx()
	{
		var=10;
	}
	
	public ConstructorEx(int num)
	{
		var=num;
	}
	public int getValue()
	{
		return var;
	}
	
	public static void main(String[] args) 
	{
	ConstructorEx c1=new ConstructorEx();
	ConstructorEx c2=new ConstructorEx(77);
	System.out.println("Default constructor value is " + c1.getValue());		//Default constructor value is 10
	System.out.println("Parameterized constructor value is " + c2.getValue());	//Parameterized constructor value is 77
		
	}

}
