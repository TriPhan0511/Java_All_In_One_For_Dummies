import java.time.*;

/* Using the now Method to Create a Date-Time Object */

public class TimeTester 
{
	public static void main(String[] args)
	{
		System.out.println("\nLocalDate: "
				+ LocalDate.now().toString());
		System.out.println("\nLocalTime: "
				+ LocalTime.now().toString());
		System.out.println("\nLocalDateTime: "
				+ LocalDateTime.now().toString());
		System.out.println("\nZonedDateTime: "
				+ ZonedDateTime.now().toString());
		System.out.println("\nOffsetTime: "
				+ OffsetTime.now().toString());
		System.out.println("\nOffsetDateTime: "
				+ OffsetDateTime.now().toString());
		System.out.println("\nMonthDay: "
				+ MonthDay.now().toString());
		System.out.println("\nYearMonth: "
				+ YearMonth.now().toString());
		System.out.println("\nYear: "
				+ Year.now().toString());
		System.out.println("\nInstant: "
				+ Instant.now().toString());
		
//		-> Result:
		/*
		 		LocalDate: 2021-11-03

				LocalTime: 19:47:49.533154
				
				LocalDateTime: 2021-11-03T19:47:49.533154
				
				ZonedDateTime: 2021-11-03T19:47:49.534157600+07:00[Asia/Saigon]
				
				OffsetTime: 19:47:49.536165700+07:00
				
				OffsetDateTime: 2021-11-03T19:47:49.536165700+07:00
				
				MonthDay: --11-03
				
				YearMonth: 2021-11
				
				Year: 2021
				
				Instant: 2021-11-03T12:47:49.556232700Z
		 * 
		 * */
	}
}
