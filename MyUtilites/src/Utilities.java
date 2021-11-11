import java.text.NumberFormat;
import java.util.*;

public class Utilities 
{
//	Get a string from user input (use Scanner class)
	public static String getString(String msg, Scanner sc)
	{
		System.out.print(msg);
		return sc.nextLine();
	}
	
//	Get an integer from user input (use Scanner class)
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
	
//	Get a double from user input (use Scanner class)
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
	
//	Get a random double
	public static double getRandomDouble(double low, double high)
	{
		return new Random().nextDouble() * (high - low) + low;
	}
	
	
//	Get a random integer
	public static int getRandomInteger(int low, int high)
	{
		return (int) (Math.random() * (high - low + 1)) + low;
	}
	
//	Format a double (return a String)
	public static String formatDouble(double d)
	{
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(1);
		nf.setMaximumFractionDigits(2);
		return nf.format(d);
	}	
}

























