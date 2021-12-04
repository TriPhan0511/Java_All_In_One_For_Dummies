import java.util.ArrayList;
import java.util.Iterator;

/**
 * Some utility methods.
 * @version 1.0 2021-11-21
 * @author Tri Phan
 */
public class Utilities 
{
	/**
	 * Get a random integer in range [low, high].
	 * @param low A largest integer
	 * @param high A smallest integer.
	 * @return A random integer.
	 */
	public static int getRandomInteger(int low, int high)
	{
		return (int) (Math.random() * (high - low + 1)) + low;
	}
	
	/**
	 * Creates an array of random integers.
	 * @param size Length of an integer array.
	 * @param low An integer indicates the largest value an element could be.
	 * @param high An integer indicates the smallest value an element could be.
	 * @return An integer array.
	 */
	public static int[] getRandomNumbers(int size, int low, int high)
	{
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = getRandomInteger(low, high);
		}
		return numbers;
	}
	
	/**
	 * Prints out an array of integers to the console.
	 * @param numbers An array of integers.
	 */
	public static void printIntegerArray(int[] numbers)
	{
		for (int num : numbers)
		{
			System.out.printf("%d ", num);
		}
		System.out.println();
	}
	
	/**
	 * Prints out an array list of Integers to the console. 
	 * @param list An array list which contains Integers.
	 */
	public static void printIntergerArrayList(ArrayList<Integer> list)
	{
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext())
		{
			System.out.printf("%d ", iterator.next());
		}
		System.out.println();
	}
	
	/**
	 * Gets an array of random characters
	 * @param size
	 * @param low
	 * @param high
	 * @return An array of characters
	 */
	public static char[] getRandomCharacters(int size, int low, int high)
	{
		char[] characters = new char[size];
		int[] numbers = getRandomNumbers(size, low, high);
		for (int i = 0; i < numbers.length; i++)
		{
			characters[i] = (char) numbers[i];
		}
		return characters;
	}
}












