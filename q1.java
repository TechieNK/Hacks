import java.util.*;
public class q1 
{
	public static void main(String[] args)
	{
		Scanner ip = new Scanner(System.in);
		String s = ip.nextLine();
		String[] arr = s.split(" ");
		int len = arr.length;
		switch(len)
		{
			case 1: 
				try
				{
					if(arr[0].toUpperCase().equals("QUIT"))
					{					
						System.out.println("Quitting");
					}
					else
					{
						throw new IllegalInputException("Illegal Argument");
					}
				}
				catch(IllegalInputException e) {}
				finally
				{
					System.out.println("task Completed");
					System.exit(1);
				}
				break;
		}
	}
}