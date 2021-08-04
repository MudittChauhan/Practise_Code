class SumArray_1
{
	public static void main(String[] args)
	{
		int temp=0;
		int[] a= {10,20,30,40,50};
		for(int i:a)
		{
			temp=i+temp;
		}
		System.out.println("Sum of array is "+temp);
	}
}