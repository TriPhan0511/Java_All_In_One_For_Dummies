import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormattingDates 
{
	
	
	public static void main(String[] args)
	{
		/**
		 * If you use the toString() method to convert a LocalDate to a string, you get
		 * a string such as 2014-10-31. What if you want to display the date in a different
		 * format, such as 10-31-2014 or October 31, 2014? To accomplish that, you can use
		 * the format method of the LocalDate along with a custom formatter you create using
		 * the DateTimeFormatter class. To specify the format you want use, you pass the
		 * DateTimeFormatter class a pattern string, using the formatting symbols listed in
		 * the following: 
		 */
		
		/**
		 * Formatting Characters for the DateTimeFormatter Class
		 * 
		 * 		Y		Year (two or for digits)
		 * 		M		Month (one or two digits or three or more letters)
		 * 		d		Days of month (such as 1, 28)
		 * 		H		Hour
		 * 		m		Minute
		 * 		s		Second (1 to 59)
		 * 		h		Clock hour (1 to 12)
		 * 		a		AM or PM
		 * 		V		Time zone ID (such as Asia/Saison, America/Los_Angeles)
		 * 		z		Time zone name (such as Pacific Daylight Time)
		 */
		
		/**
		 * The easiest way to create a DateTimeFormatter object is to use the static ofPattern
		 * method along with a pattern string. For example:
		 */
		
//		DateTimeFormatter formatter;
//		formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");
//		
//		LocalDate date = LocalDate.now();
//		String formattedDate = date.format(formatter);
//		System.out.println(formattedDate);
////		-> 08 Nov 2021
		
		/* Here's a simple program that prints the current date in serveral different format: */
		
		LocalDateTime now = LocalDateTime.now();
		printDate(now, "YYYY-MM-dd");
		printDate(now, "MM-dd-YYYY");
		printDate(now, "dd MMM YYYY");
		printDate(now, "MMMM d, YYYY");
		printDate(now, "HH:mm");
		printDate(now, "HH:mm a");
		
		/**
		 * Results:
		 * 
		 * 		YYYY-MM-dd     2021-11-08
		 * 		MM-dd-YYYY     11-08-2021
		 * 		dd MMM YYYY    08 Nov 2021
		 * 		MMMM d, YYYY   November 8, 2021
		 * 		HH:mm          08:24
		 * 		HH:mm a        08:26 AM
		 * 		
		 */
		
		/* Another example */
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt.format(DateTimeFormatter.ofPattern("HH:mm VV")));
//		-> 08:29 Asia/Saigon
		System.out.println(zdt.format(DateTimeFormatter.ofPattern("HH:mm z")));
//		-> 08:30 ICT
		
	}
	
	private static void printDate(LocalDateTime date, String pattern)
	{
		try
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
			pattern = (pattern + "              ").substring(0, 14);
			System.out.println(pattern + " " + date.format(formatter));
		}
		catch(Exception e)
		{
			System.out.println("Invalid date time format.");
		}
	}
}







































