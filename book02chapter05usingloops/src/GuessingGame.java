import java.util.Scanner;

public class GuessingGame 
{
	static Scanner sc = new Scanner(System.in);	
	
	/* Method: Create a random integer */
	public static int randomInt(int low, int high)
	{
		return (int)(Math.random() * (high - low +1)) + low;
	}
	
	/* main method */
	public static void main(String[] args)
	{
		System.out.println("Let's play a guessing game!");
		String input = "y";
		while (!input.equalsIgnoreCase("n"))
		{
			int number = randomInt(1, 10);
			System.out.println("I'm thinking of a number between 1 and 10." + "( " + number + ")");
			System.out.print("What do you think it is? ");
			int answer = sc.nextInt();
			
			while (answer < 1 || answer > 10)
			{
				System.out.print("I said, between 1 and 10. Try again: ");
				answer = sc.nextInt();
			}
			
			if (answer == number)
			{
				System.out.println("You're right!");
				System.out.print("Play again? (Y or N) ");
				input = sc.next();
			}
			else
			{
				System.out.println("You're wrong! The number was " + number);
				System.out.print("\nPlay again? (Y or N) ");
				input = sc.next();
				while (!input.equalsIgnoreCase("n") && !input.equalsIgnoreCase("y"))
				{
					System.out.print("\nPlay again? (Y or N) ");
					input = sc.next();
				}
			}
		}
		System.out.println("\nThank you for playing.");
	}
}






























