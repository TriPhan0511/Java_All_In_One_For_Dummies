import java.util.Scanner;

/*
 * Exercise: Finding the minimum number among three numbers
 * This program demonstrates how to use the ternary operator (also called conditional operator)
 * 
 * */

public class Bai19_MinNumberFinding 
{
	public static void testFindMin(Scanner sc)
	{
		System.out.println("***** Finding the minimum number among three numbers *****\n");
		System.out.print("Enter first number: ");
		int first = Utilities.getInteger(sc);
		System.out.print("Enter second number: ");
		int second = Utilities.getInteger(sc);
		System.out.print("Enter third number: ");
		int third = Utilities.getInteger(sc);
		
		System.out.printf("The minimum number among %d, %d, and %d is %d.",
							first, second, third, findMin(first, second, third));
	}
	
	public static int findMin(int first, int second, int third)
	{
		int min = first < second ? 
					first < third ? 
							first : third
							: second < third ? 
									second : third;
		return min;
	}
}
