import java.util.Scanner;

/* Letting the user decide when to quit. */

public class NumberPhobia {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int number = 2;
		String input;
		
		while (true)
		{
			System.out.println(number + " ");
			System.out.print("Dou you want to keep counting?"
					+ " (Y or N) ");
			input = sc.next();
			if (input.equalsIgnoreCase("n"))
			{
				break;
			}
			number += 2;
		}
		System.out.println("\nPhew! That was close.");
	}

}









































