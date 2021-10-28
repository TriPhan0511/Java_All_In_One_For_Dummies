import java.util.Scanner;

public class Runner 
{
	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int low = 1;
		int high = 20;
		System.out.println("Let's test my exercises.\n");
		while (true)
		{
			testOneExercise(low, high);
			if (!askForKeepTesting("Continue testing?"))
			{
				break;
			}
		}
		System.out.println("\nThank you for testing my exercises!");
	}
	
	public static void testOneExercise(int low, int high)
	{
		System.out.print("\nEnter the exercise you want to test (enter an integer): ");

		int choice = getExerciseNumber(low, high);
		switch (choice)
		{
			case 1:
				System.out.println("\nExercise 01 is loading...");
				Bai01_AddTwoNumbers.testAddTwoNumbers(sc);
				break;
				
			case 2:
				System.out.println("\nExercise 02 is loading...");
				Bai02_CheckEven.testIsEven(sc);
				break;
				
			case 18:
				System.out.println("\nExercise 18 is loading...");
				Bai18_DisplayingFloatingPointNumber.displayFloatingPointNumber(sc);
				break;
			
			case 19:
				System.out.println("\nExercise 19 is loading...");
				Bai19_MinNumberFinding.testFindMin(sc);
				break;
				
			default:
//				System.out.println("Wrong choice. Try again!");
				System.out.printf("Wrong choice!\n"
						+ "You should enter a number between %d and %d.", 
						low, 
						high);
				break;
		}
	}
	
	public static int getExerciseNumber(int low, int high)
	{
		int number;
		while (true)
		{
			number = Utilities.getInteger(sc);
			if ((number < low) || (number > high))
			{
				System.out.printf("You should enter a number between %d and %d. Try again: ", 
						low, 
						high);
			}
			else
			{
				return number;
			}
		}
	}

	public static boolean askForKeepTesting(String prompt)
	{
		while (true)
		{
			System.out.printf("\n\n%s (Y or N) ", prompt);
			String answer = sc.next();
			if (answer.equalsIgnoreCase("y")) {
				return true;
			}
			else if (answer.equalsIgnoreCase("n"))
			{
				return false;
			}
		}
	}
}





































