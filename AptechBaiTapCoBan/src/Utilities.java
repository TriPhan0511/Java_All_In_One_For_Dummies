import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities 
{
	public static int getInteger(Scanner sc)
	{
		while (true)
		{
			try
			{
				return sc.nextInt();
			}
			catch (InputMismatchException e)
			{
				sc.nextLine();
				System.out.print("That's not an integer. Try again: ");
			}
		}
	}
	
	public static double getDouble(Scanner sc)
	{
		while (true)
		{
			try
			{
				return sc.nextDouble();
			}
			catch (InputMismatchException e)
			{
				sc.nextLine();
				System.out.print("That's not an floating-point number. Try again: ");
			}
		}
	}
}
