
public class ArrayCopy 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[5];
		System.arraycopy(a,1,b,0,5);
		for(int i=0;i<b.length;i++)
			{
			System.out.print(b[i]);
			}

	}

}
