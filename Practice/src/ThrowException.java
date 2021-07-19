public class ThrowException 
{
	static void vote(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not allowed to vote");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String[] args) 
	{
	vote(13);
	}

}
