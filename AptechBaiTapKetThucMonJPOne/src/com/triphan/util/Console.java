package com.triphan.util;

import java.util.Scanner;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.time.*;

public class Console 
{
//	Get an integer from user input
	public static int getInteger(Scanner sc, String prompt)
	{
		while (true)
		{
			System.out.print(prompt);
			try
			{
				return Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid integer. Try again.");
			}
		}
	}
	
//	Get a string from user input
	public static String getString(Scanner sc, String prompt)
	{
		while (true)
		{
			System.out.print(prompt);
			String input = sc.nextLine();
			if (input == null || input.length() == 0)
			{
				System.out.println("You should not enter an empty string.");
				continue;
			}
			return input;
		}
	}
	
//	Get a Month (java.time.Month)
	public static Month getMonth(Scanner sc, String prompt)
	{
		while (true)
		{
			int input = getInteger(sc, prompt);
			switch (input)
			{
				case 1:
				{
					return Month.JANUARY;
				}
				case 2:
				{
					return Month.FEBRUARY;
				}
				case 3:
				{
					return Month.MARCH;
				}
				case 4:
				{
					return Month.APRIL;
				}
				case 5:
				{
					return Month.MAY;
				}
				case 6:
				{
					return Month.JUNE;
				}
				case 7:
				{
					return Month.JULY;
				}
				case 8:
				{
					return Month.AUGUST;
				}
				case 9:
				{
					return Month.SEPTEMBER;
				}
				case 10:
				{
					return Month.OCTOBER;
				}
				case 11:
				{
					return Month.NOVEMBER;
				}
				case 12:
				{
					return Month.DECEMBER;
				}
				default:
				{
					System.out.println("Invalid month. Try again.");
					break;
				}
			}
		}
	}

// Get a LocalDate
	public static LocalDate getDate(Scanner sc, String prompt)
	{
		LocalDate date;
		while (true)
		{
			String input = getString(sc, prompt);
			try
			{
				date = LocalDate.parse(input);
				if (date.isAfter(LocalDate.now()))
				{
					System.out.println("The date you entered can not be after the current date."
							+ "\nTry again.");
					continue;
				}
				return date;
			}
			catch(DateTimeParseException e)
			{
				System.out.println("Sorry, that is not a valid date. "
						+ "\nTry again.");
			}
		}
	}
}


































