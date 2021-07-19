public class CheckedException {

	public static void main(String[] args) 
	{
	int a=10,b=2,c;
	try
	{
		c=(a*b)/0;
	}
	catch(Exception e)
	{
		System.out.println("There is an Exception and it is " +e);
	}
	}

}
