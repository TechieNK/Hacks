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
	}
}