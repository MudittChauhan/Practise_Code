//Reverse of a string by 3 ways (With and Without StringBuffer)

//   ** Muditt Chauhan  **
public class ReverseString {

	public static void main(String[] args) 
	{
		String a="Mudit";
		
		String r="";
		int l=a.length();
		for(int i=l-1;i>=0;i--)
		{
			r=r+a.charAt(i);
		}
		System.out.println("Reverse String is "+r);   //Reverse String is tiduM
		
		
		/*StringBuffer a1=new StringBuffer(a);
		a1.reverse();
		System.out.println(a1);
		*/
		
		/*String reverse=new StringBuffer(a).reverse().toString();
		System.out.printf("Old String is %s and its reverse is %s",a,reverse);
		 */
		}

}
