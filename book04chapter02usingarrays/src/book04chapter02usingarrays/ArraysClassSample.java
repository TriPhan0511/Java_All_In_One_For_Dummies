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
		
////		Example: Create an array of 10 random integers.
//		int[] numbers = new int[10];
//		Arrays.setAll(numbers, e -> ((int) (Math.random() * 100)) + 1);
//		printIntegerArray(numbers);
		
//		---------------------------------------------------------------------------
		
		/* Sorting an array */
		
////		Uses the sort method is a quick way to sort an array in sequence
//		int[] lotto = new int[6];
//		for (int i = 0; i < lotto.length; i++)
//		{
//			lotto[i] = ((int)(Math.random() * 100)) + 1;
//		}
//		System.out.println("Before sorting:");
//		printIntegerArray(lotto);
////		Sort the lotto array
//		Arrays.sort(lotto);
//		System.out.println("After sorting:");
//		printIntegerArray(lotto);
		
//		---------------------------------------------------------------------------
		
		/* Searching an array */
		
////		The bibarySearch method is efficient way to locate an item in an array
////		by its value.
//		int[] lotto = new int[6];
//		for (int i = 0; i < lotto.length; i++)
//		{
//			lotto[i] = ((int) (Math.random() * 100)) + 1;
//		}
//		printIntegerArray(lotto);
//		
////		If the array is sorted in sequence, the binarySearch method can 
////		find an specified element more efficiently.
//		int lucky = 13;
//		Arrays.sort(lotto); // Sort the lotto array.
//		System.out.println("After sorting:");
//		printIntegerArray(lotto);
//		int foundAt = Arrays.binarySearch(lotto, lucky);
//		if (foundAt > -1)
//		{
//			System.out.println("My number came up!");
//		}
//		else
//		{
//			System.out.println("I'm not lucky today.");
//		}
		
//		---------------------------------------------------------------------------
		
		/* Comparing arrays */
		
		/*
		 * If you use the equality operator (==) to compare array variables, the array variables
		 * are considered to be equal only if both variables point to exactly the same array instance.
		 * To compare two arrays element by element, you should use Arrays.equals method instead.
		 * 
		 *  If both arrays have the same number of elements, and all elements have the same value,
		 *  the equals method returns true. If the element are not equal, or if one array has more
		 *  elements than the other, the equals method returns false.
		 */
		
		/*
		 * If the array has more than one dimension, you can use the deepEquals method instead.
		 * It compares any two subarrays, element by element, to determine whether they're identical.
		 */
		
//		int[] array1 = { 1, 2, 3, 5, 4 };
		
//		int[] array2 = { 1, 2, 3, 5, 4 };
//		if (Arrays.equals(array1, array2))
//		{
//			System.out.println("Equal.");
//		}
//		else
//		{
//			System.out.println("Not equal.");
//		}
////		-> Equal.
		
//		int[] array2 = { 1, 2,  };
//		if (Arrays.equals(array1, array2))
//		{
//			System.out.println("Equal.");
//		}
//		else
//		{
//			System.out.println("Not equal.");
//		}
////		-> Not equal.
		
//		int[] array2 = { 5, 4, 3, 2, 1  };
//		if (Arrays.equals(array1, array2))
//		{
//			System.out.println("Equal.");
//		}
//		else
//		{
//			System.out.println("Not equal.");
//		}
////		-> Not equal.
		
//		---------------------------------------------------------------------------
		
//		int[][] array1 = 
//			{
//					{ 1, 2, 3, },
//					{ 4, 5, 6, },
//			};
//		
////		int[][] array2 = 
////			{
////					{ 1, 2, 3, },
////					{ 4, 5, 6, },
////			};
////		if (Arrays.deepEquals(array1, array2))
////		{
////			System.out.println("Equal");
////		}
////		else
////		{
////			System.out.println("Not equal");
////		}
//////		-> Equal
//		
//		int[][] array2 = 
//			{
//					{ 6, 2, 3, },
//					{ 4, 5, 1, },
//			};
//		if (Arrays.deepEquals(array1, array2))
//		{
//			System.out.println("Equal");
//		}
//		else
//		{
//			System.out.println("Not equal");
//		}
////		-> Not equal
		
//		---------------------------------------------------------------------------
		
		/* Converting arrays to stings */
//		The toString method of the Arrays class is handy if you want to quickly dump the
//		contents of an array to the console to see what it contains.
		
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++)
		{
			lotto[i] = ((int) (Math.random() * 100)) + 1;
		}
		
		System.out.println(Arrays.toString(lotto));
//		-> [65, 75, 14, 88, 24, 36]
	}
	
//	Prints out an array of integers to console.
	private static void printIntegerArray(int[] numbers)
	{
		for (int num : numbers)
		{
			System.out.printf("%d ", num);
		}
		System.out.println();
	}
}






























