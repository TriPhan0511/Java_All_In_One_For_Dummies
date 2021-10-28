import java.util.Scanner;

/* Exercise 18: Displaying a floating-point number */

public class Bai18_DisplayingFloatingPointNumber 
{
	public static void displayFloatingPointNumber(Scanner sc)
	{
		System.out.println("***** Displaying A Floating-Point Number *****\n");
		System.out.print("Enter a floating-point number: ");
		double d = Utilities.getDouble(sc);
		System.out.printf("You entered %,.3f", d);
	}
}
