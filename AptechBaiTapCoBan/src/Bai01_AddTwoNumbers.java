import java.util.Scanner;

/* Exercise 01: Adding two integer numbers */

public class Bai01_AddTwoNumbers 
{
	public static void testAddTwoNumbers(Scanner sc)
	{
		System.out.println("***** Adding Two Integer Numbers *****\n");
		System.out.print("Enter the first number: ");
		int first = Utilities.getInteger(sc);
		System.out.print("Enter the second number: ");
		int second = Utilities.getInteger(sc);
		System.out.printf("\nResult:\n\t%d + %d = %d", 
				first, 
				second, 
				addTwoNumbers(first, second));
	}
	
	public static int addTwoNumbers(int first, int second)
	{
		return first + second;
	}
}






















