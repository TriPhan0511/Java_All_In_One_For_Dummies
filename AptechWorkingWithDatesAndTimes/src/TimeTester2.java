import java.time.*;
import java.time.format.DateTimeParseException;

/*
 * Using the static parse Method to Create a Date-Time Object
 * 
 * Another way to create a Date-Time object is to use the static parse method,
 * which creates a Date-Time object from a string that represents a specific date or time.
 * 
 * */
public class TimeTester2 
{
	public static void main(String[] args)
	{
////		Create a LocalDate object representing December 15, 2014:
//		LocalDate d = LocalDate.parse("2014-12-15");
		
////		Create a LocalDateTime object that represents a specific time on a specific date
////		Note that the letter T separates the date from the time, and the time is expressed
////		in 24-hour clock format.
//		LocalDateTime dt; 
//		dt = LocalDateTime.parse("2014-12-15T15:45");
////		If you need to be more precise, you can also specify seconds
////		Here the time is set to 13.5 seconds after 2:45 p.m.
//		dt = LocalDateTime.parse("2014-12-15T15:45:13.5");
		
//		If the string is not in the correct format, the parse method throws a 
//		DateTimeParseException. Whenever you use the parse method, you should
//		enclose it in a try block and catch this exception, as in this example:
		LocalDateTime dt;
		try
		{
			dt = LocalDateTime.parse("2014-12-15T03:45PM");
		}
		catch(DateTimeParseException e)
		{
			System.out.println(e.toString());
		}
	}
}

































