package book04chapter02usingarrays;

import java.util.Arrays;

public class ArraysClassSample 
{
	public static void main(String[] args)
	{
		/* Filling an array */
		
////		Creates an array of integers and initializes each element to 100.
//		int[] numbers = new int[10];
//		System.out.println("\nBefore filling");
//		printIntegerArray(numbers);
//		
//		Arrays.fill(numbers, 100);
//		System.out.println("\nAfter filling");
//		printIntegerArray(numbers);
		
//		Create an array of 10 random integers.
		int[] numbers = new int[10];
		Arrays.setAll(numbers, e -> ((int) (Math.random() * 100)) + 1);
		printIntegerArray(numbers);
	}
	
//	Prints out an array of integers to console.
	private static void printIntegerArray(int[] numbers)
	{
		for (int num : numbers)
		{
			System.out.printf("%d ", num);
		}
	}
}





























