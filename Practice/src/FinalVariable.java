public class FinalVariable 
{
	static int i=0;
	public void abc()
	{
		i++;
	}
	public static void main(String[] args) 
	{
	FinalVariable f=new FinalVariable();
	FinalVariable f1=new FinalVariable();
	f.abc();
	f1.abc();
	System.out.println(f.i);
	//System.out.println(f1.i);
	}

}
