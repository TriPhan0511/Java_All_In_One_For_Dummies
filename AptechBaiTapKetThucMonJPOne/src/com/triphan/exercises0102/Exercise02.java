package com.triphan.exercises0102;

import java.util.*;

/**
 * Exercise 02: Create an array of 10 integers.
 * @author Tri Phan
 *
 */
public class Exercise02 
{
	public static void main(String[] args)
	{
		Exercise02 e = new Exercise02();

//		Creates an array which contains ten integers.
		int[] numbers = e.getRandomNumbers(10);
		
////		Dummy data
//		int[] numbers = {7, 5, 5, 6, 4, 8, 9, 10, 7};
		
//		Show the content of the array
		System.out.println("\nThe array of integers:");
		e.showNumbers(numbers);
		
//		Show all of prime numbers which ar contained in the array
		
		System.out.println("\n\nPrime numbers which are contained in the array:");
		e.showPrimeNumbers(numbers);
		
//		Show the content of an array in reverse direction
		System.out.println("\n\nThe array of integers in reverse diretion:");
		e.showReversedNumbers(numbers);
		
//		Sort the array
		e.sort(numbers);
//		Show the array after sorting
		System.out.println("\n\nThe array after sorting:");
		e.showNumbers(numbers);
	}
	
	/**
	 * Implements the selection sort algorithm.
	 * @param numbers An array of integers.
	 */
	public void sort(int[] numbers) 
	{
//		Get the length of the array.
		int size = numbers.length;
		
//		One by one move boundary of unsorted subarray.
		for (int i = 0; i < size - 1; i++) 
		{
//			Find the index of the minimum element in unsorted array.
			int min_index = i;
			for (int j = i + 1; j < size; j++) 
			{
				if (numbers[j] < numbers[min_index]) 
				{
					min_index = j;
				}
			}
//			Swap two numbers if the ith number is not the minimum element. 
			if (min_index != i) 
			{
				int temp =  numbers[i];
				numbers[i] = numbers[min_index];
				numbers[min_index] = temp;
			}
		}
	}
	
	/**
	 * Show an array of integers in reverse direction.
	 * @param numbers An array of integers
	 */
	public void showReversedNumbers(int[] numbers)
	{
		for (int i = numbers.length - 1; i >= 0; i--)
		{
			System.out.printf("%d ", numbers[i]);
		}
	}
	
	/**
	 * Show prime numbers contained in an array of integers.
	 * @param numbers An array of integers
	 */
	public void showPrimeNumbers(int[] numbers)
	{
//		Convert from an array of int to an array of Integer
		int size = numbers.length;
		Integer[] numbers2 = new Integer[size];
		for (int i = 0; i < size; i++)
		{
			numbers2[i] = numbers[i];
		}
		
//		Convert from an array of Integer to a set of Integer
//		to prevent the duplicate numbers.
		Set<Integer> numbers3 = new HashSet<>(Arrays.asList(numbers2));
		for (Integer i :  numbers3)
		{
			if (isPrimeNumber(i))
			{
				System.out.printf("%d ", i);
			}
		}
	}
	
	/**
	 * Checks whether a number is a prime number or not.
	 * @param number An integer.
	 * @return A boolean value.
	 */
	public boolean isPrimeNumber(int number)
	{
		if (number <= 1)
		{
			return false;
		}
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Show the content of an array of integers
	 * @param numbers An array of integers
	 */
	public void showNumbers(int[] numbers)
	{
		for (int num : numbers)
		{
			System.out.printf("%d ", num);
		}
	}
	
	/**
	 * Gets an array of ten integers.
	 * @return An array of ten integers.
	 */
	public int[] getRandomNumbers(int size)
	{
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = getRandomInteger(1, 20);
		}
		return numbers;
	}
	
	/**
	 * Creates a radom integet between a range: [low, high].
	 * @return A random integer.
	 */
	public int getRandomInteger(int low, int high)
	{
		return (int) (Math.random() * (high - low + 1)) + low;
	}
}



















