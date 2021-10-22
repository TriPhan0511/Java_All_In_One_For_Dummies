import java.util.Scanner;

/*
 * Let the user decide in another way
 * 
 * Another way to write a loop that a user can opt out is to test the input string
 * in the while condition. The only trick here is that you must first initialize
 * the input string to the value that continues the loop. Otherwise, the loop doesn't
 * execute at all!
 * 
 * 
 * */
public class NumberPhobia2 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int number = 2;
		String input = "Y";
		
		while (input.equalsIgnoreCase("y"))
		{
			System.out.println(number);
			System.out.print("Do you want to keep counting ( Y or N ) ? ");
			input = sc.next();
			number += 2;
		}
		System.out.println("\nPhew! That was close.");
	}

}
