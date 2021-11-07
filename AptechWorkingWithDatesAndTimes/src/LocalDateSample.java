import java.time.*;
import java.time.format.DateTimeParseException;

public class LocalDateSample 
{
	public static void main(String[] args)
	{
		/* Methods that create a LocalDate object */
		
//		LocalDate dt = LocalDate.now();
//		System.out.println(dt.toString()); // -> 2021-11-05
//		
//		LocalDate myBirthDay;
//		try
//		{
//			myBirthDay = LocalDate.parse("1984-11-05");
//		}
//		catch(DateTimeParseException e)
//		{
//			myBirthDay = LocalDate.now();
//		}
//		System.out.println(myBirthDay.toString()); // -> 1984-11-05
//		
//		LocalDate myBirthDay2;
//		try
//		{
//			myBirthDay2 = LocalDate.of(1984, Month.NOVEMBER, 5);
//		}
//		catch(DateTimeException e)
//		{
//			myBirthDay2 = LocalDate.now();
//		}
//		System.out.println(myBirthDay2.toString()); // -> 1984-11-05
		
//		--------------------------------------------------------------------------------
		
		/* Methods that extract information about a date */
		
//		LocalDate myBirthDay = LocalDate.parse("1984-11-05");
//		System.out.println("My birthday: " + myBirthDay.toString()); // -> My birthday: 1984-11-05
//		
//		int year = myBirthDay.getYear();
//		System.out.println("Year: " + year); // -> Year: 1984
//		
//		Month month = myBirthDay.getMonth();
//		System.out.println("Month: " + month.toString()); // -> Month: NOVEMBER
//		
//		int monthValue = myBirthDay.getMonthValue();
//		System.out.println("Month value: " + monthValue); // -> Month value: 11
//		
//		int dayOfMonth = myBirthDay.getDayOfMonth();
//		System.out.println("Day of month: " + dayOfMonth); // -> Day of month: 5
//		
//		DayOfWeek dayOfWeek = myBirthDay.getDayOfWeek();
//		System.out.println("Day of week: " + dayOfWeek.toString()); // -> Day of week: MONDAY
//		System.out.println("Day of week (value): " + dayOfWeek.getValue()); // -> Day of week (value): 1
//		
//		int dayOfYear = myBirthDay.getDayOfYear(); 
//		System.out.println("Day of year: " + dayOfYear); // -> Day of year: 310
//		
//		int lengthOfMonth = myBirthDay.lengthOfMonth();
//		System.out.println(lengthOfMonth); // -> 30
//		
//		int lengthOfYear = myBirthDay.lengthOfYear();
//		System.out.println(lengthOfYear); // -> 366

//		--------------------------------------------------------------------------------
		
		/* Methods that compare dates */
		
//		LocalDate d1 = LocalDate.parse("2021-11-05");
//		LocalDate d2 = LocalDate.parse("2021-11-06");
//		
//		if (d1.isAfter(d2)) 
//		{
//			System.out.printf("%s comes after %s", d1.toString(), d2.toString());
//		}
//		else
//		{
//			System.out.printf("%s comes before %s", d1.toString(), d2.toString());
//		}
//		
//		if (d1.isBefore(d2))
//		{
//			System.out.printf("\n%s comes before %s", d1.toString(), d2.toString());
//		}
//		else
//		{
//			System.out.printf("\n%s comes after %s", d1.toString(), d2.toString());
//		}
//		
//		if (d2.equals(LocalDate.now()))
//		{
//			System.out.printf("\nToday is %s", d2.toString());
//		}
//		else
//		{
//			System.out.printf("\nToday is not %s", d2.toString());
//		}
		
//		--------------------------------------------------------------------------------
		
		/* Methods that perform date calculations */
		
//		LocalDate firstDateOfYear = myBirthDay.plusDays(myBirthDay.lengthOfYear() - myBirthDay.getDayOfYear() + 1);
//		System.out.println(firstDateOfYear.toString()); // -> 1985-01-01
		
//		LocalDate d = LocalDate.parse("2021-12-31").plusWeeks(1);
//		System.out.println(d); // -> 2022-01-07		
		
//		LocalDate d = LocalDate.parse("2021-01-31").plusMonths(1);
//		System.out.println(d.toString()); // -> 2021-01-28
//		System.out.println(d.plusMonths(1).toString()); // -> 2021-03-28
		
//		LocalDate d = LocalDate.parse("2021-11-06").plusYears(1);
//		System.out.println(d.toString());  // -> 2022-11-06
		
//		LocalDate d = LocalDate.parse("2021-03-08").minusDays(10);
//		System.out.println(d.toString()); // -> 2021-02-26
		
//		LocalDate d = LocalDate.parse("2022-01-07").minusWeeks(1);
//		System.out.println(d.toString()); // -> 2021-12-31
		
//		LocalDate d = LocalDate.parse("2021-12-31").minusMonths(1);
//		System.out.println(d.toString()); // -> 2021-11-30
		
//		LocalDate d = LocalDate.parse("2021-11-06").minusYears(1);
//		System.out.println(d.toString()); // -> 2020-11-06
		
//		LocalDate d = LocalDate.parse("2021-11-05");
//		long until = d.until(LocalDate.parse("1984-11-05"), null);
//		System.out.println(until); // ???
	}
}



























