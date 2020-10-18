import java.util.*;
public class q2 
{
	int input1,input2;
	class Calculate
	{
		void getvalues()
		{
			Scanner ip = new Scanner(System.in);
			System.out.print("Input1 = ");
			try
			{
				String a, b ;
				a = ip.next();
				System.out.print("Input2 = ");
				b = ip.next();
				input1 = Integer.parseInt(a);
				input2 = Integer.parseInt(b);
				display();
			}
			catch(Exception e)
			{
				System.out.println("Output : Invalid Argument Exception");
			}
		}
		void display()
		{
			int sum = input1+input2;
			System.out.println("Sum = "+sum);
			int diff = input1-input2; 
			System.out.println("Difference = "+diff);
			int mul = input1*input2;
			System.out.println("Product = "+mul);
			try
			{
				int quo = input1/input2;
				System.out.println("Quotient = "+quo);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Quotient: Division by Zero not possible");
			}
			try
			{
				int rem = input1%input2;
				System.out.println("Remainder = "+rem);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Remainder: Division by Zero not possible");
			}
		}
	}
	public static void main(String[] args)
	{
		Calculate c = new q2().new Calculate();
		c.getvalues();
	}
}