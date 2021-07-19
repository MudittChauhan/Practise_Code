class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}
class CustomException
{
	public static void legal(int age) throws MyException
	{
		if(age<18)
		{
			throw new MyException("Not allowed to vote");
		}
		else
		{
			System.out.println("Welcome voter");
		}
	}
	public static void main(String args[])
	{
		try
		{
			legal(16);
		}catch(Exception e)
		{
			System.out.println("Exception Occurs : "+e);
		}
	}
}