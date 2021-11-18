package com.triphan.exercise01;

import java.util.Scanner;
import com.triphan.util.Console;

/** 
 * Exercise 01:
 *  Gets an integer from user input, 
 *  informs it is a perfect number or not.
 * @version 1.0 2021-11-16
 * @author Tri Phan
 */
public class Exercise01 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int number = Console.getInteger(sc, "Enter an integer: ");
		if (isPerfectNumber(number))
		{
			System.out.printf("%d is a prime number.", number);
		}
		else
		{
			System.out.printf("%d is not a prime number.", number);
		}
	}
	
	/**
	 * Checks whether a number is a perfect number or not.
	 * @param number An integer
	 * @return A boolean value, true if the number is a perfect number,
	 * 				otherwise, false.
	 */
	public static boolean isPerfectNumber(int number)
	{
		if (number <= 0)
		{
			return false;
		}
		
		int sum = 0;
		for (int i = 1; i < number; i++)
		{
			if (number % i == 0)
			{
				sum += i;
			}
		}
		if (number == sum)
		{
			return true;
		}
		return false;
	}
}


































