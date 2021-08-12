class ArrayMinMax
{  
	static void min(int m1[])
	{
		int min=m1[0];
		for (int i=1;i<m1.length;i++)
		{
			if( min>m1[i])
			{
				min=m1[i];
			}
		}
		System.out.println("Minimun value in array is "+ min);
	}
	
	static void max(int m2[])
	{
		int max=m2[0];
		for(int i=1;i<m2.length;i++)
		{
			if (max<m2[i])
			{
				max=m2[i];
			}
		}
		System.out.println("Minimun value in array is "+ max);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {33,25,44,12,60,4};
		min(arr);
		max(arr);		
	}
}  