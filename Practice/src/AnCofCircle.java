import java.util.*;
public class AnCofCircle {
	public static void main(String[] args) 
	{
	double r = 0,a,c;
	System.out.print("Enter the radius:: ");
	Scanner in=new Scanner(System.in);
	r=in.nextDouble();
	a=Math.PI*(r*r);
	c=Math.PI*(2*r);
	System.out.print("Area of Circle is "+a+" and Circumference of Circle is "+c);
	}

}
