import java.util.Scanner;

public class GuessingGameByMyself 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		playGame();
	}
	
	public static void playGame()
	{
		System.out.println("Let's play a guessing game!");
		while (true)
		{
			playARound();
			if (askForAnotherRound())
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
	
	public static void playARound()
	{
//		Pick a random number
		int number = getRandomNumber();
		
//		Get guest from user
		System.out.printf("\nI'm thinking of a number. "
				+ "What do you think it is? (%d) ", number);
		int guess =  getGuess();
		
//		Check the guess
		if (guess == number)
		{
			System.out.println("You're right.");
		}
		else
		{
			System.out.println("You're wrong! "
					+ "The number was " + number);
		}
	}
	
	public static int getRandomNumber()
	{
		return (int)(Math.random() * 10) + 1;
	}
	
	public static int getGuess()
	{
		while (true)
		{
			int guess = sc.nextInt();
			if ((guess < 1) || (guess > 10))
			{
				System.out.print("I said, between 1 and 10. Try again: ");
			}
			else
			{
				return guess;
			}
		}
	}
	
	public static boolean askForAnotherRound()
	{
		while (true)
		{
			System.out.print("Play again? (Y or N) ");
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


























