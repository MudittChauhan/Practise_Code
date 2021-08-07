import java.util.Scanner;
class Calculator
{
	static int usrch;
	int choice;
	float r;
	static float num1, num2;
	
	void add(float num1, float num2)
	{
				r = num1+num2;
		System.out.println("\n----> Result of Addition is "+r);
	}
	
	void sub(float num1, float num2)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("\nWhich number do you want to Substract with another one? \n 1- First number to Second number \n 2- Second number to First number");
		System.out.print("Choice: ");
		choice=s1.nextInt();
		if ( choice ==1 | choice == 2)
		{
			switch(choice)
			{
				case 1:
					r = num1 - num2;
					System.out.println("\n----> Result of Substraction is "+r);
					break;
				case 2:
					r = num2 - num1;
					System.out.println("\n----> Result of Substraction is "+r);
					break;
			}
		}else{
			System.out.println("\nYou entered a invalid choie for Substraction.");
		}
	}
	
	void mul(float num1, float num2)
	{
		r = num1 * num2;
		System.out.println("\n----> Result of Multiplication is "+r);
	}
	
	void div(float num1, float num2)
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("\nWhich number do you want to Divide with another one? \n 1- First number to Second number \n 2- Second number to First number");
		System.out.print("Choice: ");
		choice=s2.nextInt();
		if ( choice ==1 | choice == 2)
		{
			switch (choice)
			{
				case 1:
					r = num1 / num2;
					System.out.println("\n----> Result of Division is "+r);
					break;
				case 2:
					r = num2 / num1;
					System.out.println("\n----> Result of Division is "+r);
					break;
			}
		}else{
			System.out.println("\nYou entered a invalid chocie for Division.");
		}
	}
	
	void mod(float num1, float num2)
	{
		r = num1 % num2;
		System.out.println("\n----> Result of Modulus is "+r);
	}	
	
	public static void main(String args[])
	{
		try{
			String con = null;
			Calculator c=new Calculator();
			Scanner s=new Scanner(System.in);
			do 
			{
				System.out.print("\nEnter First Number: ");
				num1= s.nextFloat();
				System.out.print("Enter Second Number: ");
				num2= s.nextFloat();
				System.out.println("\n1- Addition \n2- Substraction \n3- Multiplication \n4- Division \n5- Modulus");
				System.out.print("\nEnter your choice: ");
				usrch=s.nextInt();
				switch (usrch)
				{
					case 1:
						c.add(num1, num2);
						break;
					case 2:
						c.sub(num1, num2);
						break;
					case 3:
						c.mul(num1, num2);
						break;
					case 4:
						c.div(num1, num2);
						break;
					case 5:
						c.mod(num1, num2);
						break;
					default:
						System.out.println("\nYou entered a wrong choice.");
						break;
				}
				Scanner st=new Scanner(System.in);
				System.out.println("\nDo you want to continue (Y/N): ");
				con=st.nextLine();
			}
			while (con.equals("y") || con.equals("Y"));
			
			System.out.println( "\n*********** End of Program ***********");
		}
		catch (Exception e)
		{
			//System.out.print(e);
		}
	}
}