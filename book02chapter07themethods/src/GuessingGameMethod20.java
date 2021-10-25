import java.util.Scanner;

public class GuessingGameMethod20 
{
	static Scanner sc = new Scanner(System.in);
	static boolean keepPlaying = true;
	
	public static void main(String[] args)
	{
		System.out.println("Let's a play a guessing game!");
		while (keepPlaying)
		{
			playARound();
		}
		System.out.println("\nThank you for playing!");
	}
	
	public static void playARound()
	{
//		Declares variable
		int number;
		int guess;
		
//		Gets a random number between 1 and 10
		number = getRandomNumber(1, 10);
		
//		Print the message ask user enter a guess
		System.out.printf("\nI'm thinking of a number (%d).\n", number);
		
//		Calls the getGuess method to take the guess from user
		guess = getGuess();
		
//		Check the guessing
		if (guess == number)
		{
			System.out.println("You're right!");
		}
		else
		{
			System.out.println("You're wrong! The number was " + number);
		}
		
//		Calls the askForAnotherRound to ask the user play another round
		keepPlaying = askForAnotherRound();
		
	}
	
	public static int getRandomNumber(int low, int high)
	{
//		Creates a random number between high and low.
		return (int)(Math.random() * (high - low + 1)) + low;
	}
	
	public static int getGuess()
	{
		int guess;
		System.out.print("Enter your guess: ");
		while (true)
		{
			guess = sc.nextInt();
			if (guess >= 1 && guess <= 10)
			{
				return guess;
			}
			else
			{
				System.out.print("I said, a number between 1 and 10. Try again: ");
			}
		}
	}
	
	public static boolean askForAnotherRound()
	{
		String anwser;
		while (true)
		{
			System.out.print("Play again? (Y or N) ");
			anwser = sc.next();
			if (anwser.equalsIgnoreCase("y"))
			{
				return true;
			}
			else if (anwser.equalsIgnoreCase("n")) 
			{
				return false;
			}
		}
	}
}

























