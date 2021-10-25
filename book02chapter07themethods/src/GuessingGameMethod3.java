import java.util.Scanner;

/*
 * Another version of guessing-game program
 * This version uses the following methods in addition to main:
 * 
 * 		playARound: This method plays one round of the guessing game. It doesn't
 * 			return a value, but it accepts two arguments, min and max, that indicate
 * 			the minimum and maximum values for the number to be guessed.
 * 
 *  	getRandomNumber: This method returns a random number between min and max
 *  		values passed as parameters.
 *  
 *  	getGuess: This method also accepts two parameters, min and max, to limit
 *  		the range within which the use must guess.
 * 
 * 		askForAnotherRound: This method asks the user to play another round and returns
 * 			a boolean value to indicate whether the user wants to continue playing. It
 * 			accepts a String value as a parameter; this string is displayed on the 
 * 			console to prompt the user for a reply.
 * 
 * */

public class GuessingGameMethod3 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		System.out.println("Let's play a guessing game!");
//		do
//		{
//			playARound(1, getRandomNumber(7, 12));
//		} while (askForAnotherRound("Try again?"));
//		System.out.println("\nThank you for playing!");
		
//		By myself:
		System.out.println("Let's play a guessing game!");
		while (true)
		{
			playARound(1, getRandomNumber(7, 12));
			if (askForAnotherRound("Try again?"))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.println("\nThank you for playing!");
	}
	
	public static void playARound(int min, int max)
	{
//		Pick a random number
		int number = getRandomNumber(min, max);
		
//		Get the guess
		System.out.printf("\nI'm thinking of a number between %d and %d. (%d)", min, max, number);
		System.out.print("\nWhat do you think it is? ");
		int guess = getGuess(min, max);
		
//		Check the guess
		if (guess == number)
		{
			System.out.println("You're right!");
		}
		else
		{
			System.out.printf("You're wrong! The number was %d", number);
		}
	}
	
	public static int getRandomNumber(int min, int max)
	{
		return (int)(Math.random() * (max - min + 1)) + min;
	}
	
	public static int getGuess(int min, int max)
	{
		while (true)
		{
			int guess = sc.nextInt();
			if ((guess < min) || (guess > max))
			{
				System.out.printf("I said, between %d and %d. Try again: ", min, max);
			}
			else
			{
				return guess;
			}
		}
	}
	
	public static boolean askForAnotherRound(String promt)
	{
		
		while (true)
		{
			System.out.printf("\n%s (Y or N) ", promt);
			String answer = sc.next();
			if (answer.equalsIgnoreCase("y"))
			{
				return true;
			}
			else if (answer.equalsIgnoreCase("n"))
			{
				return false;
			}
		}
	}
}






































