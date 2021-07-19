public class CharArrayPattern 
{
	public static void main(String[] args) 
	{
	int i,j;
	char[] ch= {'M','U','D','I','T'};
	for(i=4;i>=0;i--)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print(ch[j]);
		}
		System.out.println(" ");
	}
	}

}
