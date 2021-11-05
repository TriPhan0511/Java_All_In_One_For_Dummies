import java.util.*;

public class Utilities 
{
	public static String getString(String msg, Scanner sc)
	{
		System.out.print(msg);
		return sc.nextLine();
	}
	
	public static int getInteger(String msg, Scanner sc)
	{
		while (true)
		{
			System.out.print(msg);
			String s;
			int i;
			try
			{
				s = sc.nextLine();
				i = Integer.parseInt(s);
				return i;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid integer. Try again.");
			}
		}
		
	}
	
	public static double getDouble(String msg, Scanner sc)
	{
		while (true)
		{
			System.out.print(msg);
			try
			{
				String s = sc.nextLine();
				double d = Double.parseDouble(s);
				return d;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid double. Try again.");
			}
		}
	}
}

























