import java.util.*;
public class AreaTraingle {

	public static void main(String[] args) 
	{
	double w,h,a;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the width of Traingle:: ");
	w=in.nextDouble();
	System.out.print("Enter the height of Traingle:: ");
	h=in.nextDouble();
	a=(w*h)/2;
	System.out.print("Area of Traingle is "+a);
	}

}
