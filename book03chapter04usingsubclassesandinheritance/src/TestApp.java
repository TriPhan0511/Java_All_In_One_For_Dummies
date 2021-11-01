import java.util.Scanner;
import java.util.InputMismatchException;

/* This sample demonstrates how to catch an Exception. */

public class TestApp 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		int number = getInteger("Enter an integer: ");
		int number = getInteger2("Enter an integer: ");
//		int number = getInteger3("Enter an integer: ");
		System.out.printf("\nThe number you entered was %d.", number);
	}
	
//	getInteger method: Use a try...catch statement
	private static int getInteger(String msg)
	{
		while (true)
		{
			try
			{
				System.out.print(msg);
				return sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid integer. Try again!");
			}
		}
	}
	
//	getInteger2 method: Does not use the try...catch statement
	private static int getInteger2(String msg)
	{
		System.out.print(msg);
		while (!sc.hasNextInt())
		{
			sc.nextLine();
			System.out.printf("Invalid integer. Try again!\n%s", msg);
		}
		return sc.nextInt();
	}
	
//	getInteger3 method: Does not use try...catch
	private static int getInteger3(String msg) 
	{
		while (true)
		{
			System.out.print(msg);
			if (sc.hasNextInt())
			{
				return sc.nextInt();
			}
			else
			{
				sc.nextLine();
				System.out.println("Invalid integer. Try again!");
			}
		}
		
	}
	

}
