package book04chapter02usingarrays;

import java.util.Arrays;

/**
 * This sample demonstrates how to use Arrays class's copyOf and copyOfRange methods
 * to copy a bunch of elements from an existing array into a brand-new array.
 * @author Tri Phan
 *
 */

public class CopyDemo 
{
	public static void main(String[] args)
	{
//		int[] arrayOriginal = { 42, 55, 21 };
		
//		int[] arrayNew = Arrays.copyOf(arrayOriginal, 3);
//		System.out.println("Original array:");
//		printIntArray(arrayOriginal);
//		System.out.println("New array");
//		printIntArray(arrayNew);
		
////		Change value of the first element in the original array
//		arrayOriginal[0] = 100;
//		System.out.println("After changing, Original array:");
//		printIntArray(arrayOriginal);
//		System.out.println("After changing, New array");
//		printIntArray(arrayNew);
		
////		Change value of the last element in the new array
//		arrayNew[arrayNew.length - 1] = 200;
//		System.out.println("After changing, Original array:");
//		printIntArray(arrayOriginal);
//		System.out.println("After changing, New array");
//		printIntArray(arrayNew);
		
//		int[] arrayNew2 = Arrays.copyOf(arrayOriginal, 2);
//		printIntArray(arrayNew2);
////		-> 42 55 
//		int[] arrayNew3 = Arrays.copyOf(arrayOriginal, 8);
//		printIntArray(arrayNew3);
////		-> 42 55 21 0 0 0 0 0 
		
//		------------------------------------------------------------------
		
//		Using the copyOfRange method
		int[] arrayOriginal = { 45, 55, 21, 16, 100, 88 };
		
		int[] arrayNew = Arrays.copyOfRange(arrayOriginal, 2, 5);
		printIntArray(arrayNew);
//		-> 21 16 100
		
		printIntArray(Arrays.copyOfRange(arrayOriginal, 0, 10));
//		-> 45 55 21 16 100 88 0 0 0 0 
	}
	
	private static void printIntArray(int[] array)
	{
		for (int i : array)
		{
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
}





















