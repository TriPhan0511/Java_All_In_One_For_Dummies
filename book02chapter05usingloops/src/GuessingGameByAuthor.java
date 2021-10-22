import java.util.Scanner;

/*
 * This program implements a simple guessing game in which the computer picks a number
 * between 1 and 10, and you have to guess the number. After you guess, the computer 
 * tells you whether you're right or wrong and then asks whether you want to play again.
 * If you enter Y or y, the game starts over.
 * 
 * The nesting comes into play because the entire game is written in a while loop that
 * repeats as long as you say you want to play another game. Then - within that loop - 
 * each time the game asks for input from the user, it uses a do-while to validate the 
 * user's entry. Thus, when the game asks the user to guess a number between 1 and 10,
 * it keeps looping until the number entered by the user is in that range. And when the 
 * game asks the user whether he or she wants to play again, it loops until the user enter
 * Y, y, N, or n. 
 * 
 * */

/*
 * Here's a sample of the console output displayed by this program:
 * 
  		Let's play a guessing game!

		I'm thinking of a number between 1 and 10 
		What do you think it is? 8
		You're wrong! The number was 5
		
		Play again? (Y or N) y
		
		I'm thinking of a number between 1 and 10 
		What do you think it is? 5
		You're wrong! The number was 3
		
		Play again? (Y or N) maybe
		
		Play again? (Y or N) ok
		
		Play again? (Y or N) y
		
		I'm thinking of a number between 1 and 10 
		What do you think it is? 9
		You're right!
		
		Play again? (Y or N) n
		Thank you for playing!

 * 
 * */

public class GuessingGameByAuthor 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Let's play a guessing game!");
		boolean keepPlaying = true;
		while (keepPlaying)
		{
			boolean validInput;
			int number, guess;
			String answer;
			
//			Pick a random number
			number = (int)(Math.random() * 10) + 1;
			
//			Get the guess
			System.out.printf("\nI'm thinking of a number between 1 and 10 (%d)\n", number);
			System.out.print("What do you think it is? ");
			do
			{
				guess = sc.nextInt();
				validInput = true;
				if (guess < 1 || guess > 10)
				{
					System.out.println("I said, between 1 and 10. Try again: ");
					validInput = false;
				}
			} while (!validInput);
			
//			Check the guess
			if (guess == number)
			{
				System.out.println("You're right!");
			}
			else
			{
				System.out.println("You're wrong! The number was " + number);
			}
			
//			Play again?
			do
			{
				System.out.print("\nPlay again? (Y or N) ");
				answer = sc.next();
				if (answer.equalsIgnoreCase("n"))
				{
					keepPlaying = false;
					validInput = true;
				}
				else
				{
					if (answer.equalsIgnoreCase("y"))
					{
						validInput = true;
					}
					else
					{
						validInput = false;
					}
				}
			} while (!validInput);
		}
		System.out.println("Thank you for playing!");
	}

}
































