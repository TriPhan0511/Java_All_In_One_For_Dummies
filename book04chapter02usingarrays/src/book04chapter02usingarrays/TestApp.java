package book04chapter02usingarrays;

import java.util.Scanner;

public class TestApp 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		String[] days = { "Sunday", "Monday", "Tuesday",
//							"Wednesday", "Thursday", 
//							"Friday", "Saturday" };
//		System.out.println(days.length);
		
//		---------------------------------------------------------------------------
		
////		Creates an array of 20 random numbers,
////		with values ranging from 1 to 20.
//		int[] numbers = new int[20];
//		for (int i = 0; i < numbers.length; i++)
//		{
//			numbers[i] = (int)(Math.random() * 20) + 1;
//		}
//		
////		Iterate the array
//		int count = 0;
//		for (int num : numbers)
//		{
//			System.out.printf("%d ", num);
//			count++;
//			if (count % 5 == 0)
//			{
//				System.out.println();
//			}
//		}
		
//		---------------------------------------------------------------------------
		
////		Fills an array of player names with strings entered by the user:
//		int count;
//		while (true)
//		{
//			try
//			{
//				System.out.print("Enter a number of players: ");
//				count = Integer.parseInt(sc.nextLine());
//				break;
//			}
//			catch (NumberFormatException e)
//			{
//				System.out.println("Invalid integer. Try again.");
//			}
//		}
//		String[] names = new String[count];
//		for (int i = 0; i < names.length; i++)
//		{
//			
//			while (true)
//			{
//				System.out.printf("Player %d's name: ", i + 1);
//				String input = sc.nextLine();
//				if (input == null || input.length() == 0)
//				{
//					continue;
//				}
//				names[i] = input;
//				break;
//			}
//		}
//		
////		Iterate the array
//		for (String name : names)
//		{
//			System.out.println(name);
//		}
		
//		---------------------------------------------------------------------------
		
//		int[] numbers = { 1, 2, 3, 4, 5, };
//		for (int num : numbers)
//		{
//			num = 100;
//		}
//		for (int num : numbers)
//		{
//			System.out.println(num);
//		}
		
//		---------------------------------------------------------------------------
		
////		Prints out all of days of a week
//		printStringArray(getDaysOfWeek());
		
//		---------------------------------------------------------------------------
		
//		Using Varargs
		/*
		 * Varargs provides a convenient way to create a method that accepts a variable
		 * number of arguments. When you use varargs, the last argument in the method 
		 * signature uses ellipses to indicate that the caller can provide one or more
		 * arguments of the given type.
		 * 
		 * Here's an example:
		 */
		printSomeWords();
		printSomeWords("I");
//		-> I
		printSomeWords("Am", "Not");
//		-> Am
//		-> Not
		printSomeWords("Throwing", "Away", "My", "Shot");
//		-> Throwing
//		-> Away
//		-> My
//		-> Shot
	}
	
	private static void printSomeWords(String ...words)
	{
		for (String w : words)
		{
			System.out.println(w);
		}
	}
	
	private static String[] getDaysOfWeek()
	{
		String[] days = { "Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday",
				"Friday", "Saturday" };
		return days;
	}
	
	private static void printStringArray(String[] array)
	{
		for (String item : array)
		{
			System.out.println(item);
		}
	}
}
































