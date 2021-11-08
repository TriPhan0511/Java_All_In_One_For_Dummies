import java.util.Scanner;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

/* From the author */

/**
 * This program prompts the user to enter his or her birthday and then prints a
 * variety if interesting information deduced from the date, including:
 * 		_ The day of week on which the user was born.
 * 		_ The user's age in years.
 * 		_ The date of the user's next birthday.
 * 		_ The number of days until the next birthday.
 * 		_ The user's half-birthday (six months from his or her birthday).
 */

/**
	Today is October 8, 2013
	
	Please enter your birthdate (yyy-mm-dd): 1984-11-05
	
	November 05, 1984 was a very good day!
	You were born on a MONDAY.
	You are 37 years young.
	Your next birthday is November 5, 2022.
	That's just 362 days from now!
	Your half-birth day is June 15.
	
	  Another? (Y or N) N
 */

public class BirthdayFunApp 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		do
		{
			LocalDate birthDate;
			
			DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM d, YYYY");
			DateTimeFormatter monthDayFormat = DateTimeFormatter.ofPattern("MMMM d");
			
			System.out.println("Today is "
					+ LocalDate.now().format(fullFormat) + ".");
			
			System.out.println();
			System.out.print("Please enter your birthdate "
					+ "(yyyy-mm-dd): ");
			String input = sc.nextLine();
			try
			{
				birthDate = LocalDate.parse(input);
				
				if (birthDate.isAfter(LocalDate.now()))
				{
					System.out.println("You havent't been born yet!");
					continue;
				}
				
				System.out.println();
				
				System.out.println(birthDate.format(fullFormat)
						+ " was a very good day!");
				
				DayOfWeek birthDayOfWeek = birthDate.getDayOfWeek();
				System.out.println("You were born a "
						+ birthDayOfWeek + ".");
				
				long years = birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
				System.out.println("You are " + years + " years young.");
				
				LocalDate nextBDay = birthDate.plusYears(years + 1);
				System.out.println("Your next birthday is "
						+ nextBDay.format(fullFormat) + ".");
				
				long wait = LocalDate.now().until(nextBDay, ChronoUnit.DAYS);
				System.out.println("That's just " + wait
						+ " days from now!");
				
				LocalDate halfBirthday = birthDate.plusMonths(6);
				System.out.println("Your half-birthday is "
						+ halfBirthday.format(monthDayFormat) + ".");
			}
			catch(DateTimeParseException e)
			{
				System.out.println("Sorry, that is not a valid date.");
			}
		} while (askAgain());
	}
	
	private static boolean askAgain()
	{
		System.out.println();
		System.out.print("Another? (Y or N) ");
		String reply = sc.nextLine();
		if (reply.equalsIgnoreCase("Y"))
		{
			return true;
		}
		return false;
	}
}
























