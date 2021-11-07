import java.time.*;

public class ExtractingInformationAboutaDate 
{
	public static void main(String[] args)
	{
////		Extract the current year, month, and day
//		LocalDate date = LocalDate.now(); // -> 2021-11-06
//		int year = date.getYear(); // -> 2021
//		int month = date.getMonthValue(); // -> 11
//		int day = date.getDayOfMonth(); // -> 6
		
////		If you need to know how many days into the year a particular date is, 
////		you can use this code:
//		LocalDate date = LocalDate.parse("2016-04-09");
//		System.out.println(date.getDayOfYear()); // -> 100
////		-> This example will print the number 100, as April 9 is the 100th day of 2016.
		
////		The getDayOfWeek method returns a value of type DayOfWeek, which is an enumeration
////		with the following values:
////		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//		LocalDate date = LocalDate.parse("2016-04-09");
//		System.out.println(date.getDayOfWeek());
////		-> This example, the string SATURDAY will be printed because in 2016, April 9 falls
////		on a Saturday.
		
//		The lengthOfMonth and lengthOfYear are useful if you want to know the number
//		of days in the month or year represented by a LocalDate. Bothe methods take into
//		account leap years.
		LocalDate date = LocalDate.parse("1984-11-05");
		System.out.println(date.lengthOfMonth()); // -> 30
		System.out.println(date.lengthOfYear()); // -> 366
		
	}
}







































