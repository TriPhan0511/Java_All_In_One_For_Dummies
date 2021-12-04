import java.util.Scanner;

/**
 * Some utility methods which are used to 
 * 	get user input from the console.
 * @version 1.0 2021-11-21
 * @author Tri Phan
 *
 */
public class Console 
{
	/**
	 * Gets an integer from user input 
	 * @param sc A Scanner object is used to 
	 * 			get user input from the console.
	 * @param prompt A message which is used ask user enter data. 
	 * @return An integer.
	 */
	public static int getInteger(Scanner sc, String prompt)
	{
		while (true)
		{
			System.out.print(prompt);
			try
			{
				return Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid integer. Try again.");
			}
		}
	}
	
	/**
	 * Gets a string from user input
	 * @param sc A Scanner object is used to 
	 * 			get user input from the console.
	 * @param prompt A message which is used ask user enter data. 
	 * @return A String.
	 */
	public static String getString(Scanner sc, String prompt)
	{
		while (true)
		{
			System.out.print(prompt);
			String input = sc.nextLine();
			if (input == null || input.length() == 0)
			{
				System.out.println("You should not enter an empty string.");
				continue;
			}
			return input;
		}
	}
	
//	public static int[] getAnArrayOfIntegers(Scanner sc, String prompt)
	public static int[] getAnArrayOfIntegers(Scanner sc)
	{
		int size = getInteger(sc, "Enter size of an array: ");
		int[] numbers = new int[size];
		System.out.println("\nEnter content of array");
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = getInteger(sc, "Element " + (i + 1) + ": ");
		}
		return numbers;
	}
	
	/**
	 * Asks the user keep doing something or not.
	 * @param sc
	 * @param prompt A string which used to ask user enter his/her choice.
	 * @return true indicates keep doing, false indicates stop doing.
	 */
	public static boolean askForKeepDoing(Scanner sc, String prompt)
	{
		prompt = "\n\n" + prompt + " (Y or N): ";
		while (true)
		{
			String input = getString(sc, prompt);
			if (input.equalsIgnoreCase("y"))
			{
				return true;
			}
			if (input.equalsIgnoreCase("n"))
			{
				return false;
			}
			System.out.println("Please enter Y or N.");
		}
	}
}





















