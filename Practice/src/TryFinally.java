class An
{
	public static int B()
	{
		try
	{
		return 10;
	}
	finally
	{
		return 20;
	}
	}
}
public class TryFinally {

	public static void main(String[] args) 
	{
	System.out.println(An.B());
	}

}
