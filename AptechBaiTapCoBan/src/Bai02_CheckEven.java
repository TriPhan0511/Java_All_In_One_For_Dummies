import java.util.Scanner;

/* Exercise 02: Checking whether a number is an even or odd. */

public class Bai02_CheckEven 
{
	public static void testIsEven(Scanner sc)
	{
		System.out.println("***** Check Whether A Number Is An Even Number Or Odd Number *****\n");
		System.out.print("Enter a number: ");
		int number = Utilities.getInteger(sc);
		if (isEven(number))
		{
			System.out.printf("\nNumber %d is an even number.", number);
		}
		else
		{
			System.out.printf("\nNumber %d is an odd number.", number);
		}
	}
	
	public static boolean isEven(int number)
	{
		if (number % 2 == 0)
		{
			return true;
		}
		return false;
	}
}
