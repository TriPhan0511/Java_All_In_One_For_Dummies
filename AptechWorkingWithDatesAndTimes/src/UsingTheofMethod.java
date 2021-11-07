import java.time.*;

/*
 * Using the of Method to Create a Date-Time Object
 * 
 * The third way to create Date-Time objects is use to the static of method to create
 * a Date-Time object from its constituent parts. For example, you can create a LocalDate
 * object by supplying integers that represent the year, month, and day like this: 
 * 
 * */

public class UsingTheofMethod 
{
	public static void main(String[] args)
	{
//		LocalDate date = LocalDate.of(2014, 12, 15);
//
//		LocalTime time = LocalTime.of(05, 59);
//		System.out.println(time.toString());
		
//		--------------------------------------------------------------------------
		
		/* Using the Month enumeration */
		
//////		Month in an enumeration that represents the twelve months of the year
////		LocalDate d = LocalDate.of(2014, Month.DECEMBER, 15);
//		
//		System.out.println("December has " + Month.DECEMBER.length(false) + " days.");
////		-> December has 31 days.
		
//		--------------------------------------------------------------------------
		
		/* Using the ZoneId class */
		
//		ZonedDateTime zdt = ZonedDateTime.now();
//		System.out.println(zdt.toString());
		
////		List the standard names of the the time zone
//		for (String id: ZoneId.getAvailableZoneIds())
//		{
//			System.out.println(id);
//		}
		
////		Create a ZonedDateTime, you must first create a time zone object by using the
////		ZoneId class.
//		ZoneId z = ZoneId.of("Asia/Saigon");
//		ZonedDateTime zdate;
//		zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0, z);
//		System.out.println(zdate.toString()); // -> 2014-12-15T00:00+07:00[Asia/Saigon]
//		
//		
////		Or, if you prefer, you can create the ZoneId directly when you create a ZonedDateTime:
//		zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0, ZoneId.of("Asia/Saigon"));
//		System.out.println(zdate); // -> 2014-12-15T00:00+07:00[Asia/Saigon]
		
//		--------------------------------------------------------------------------
		
		/* Using the ZoneOffset class */
		
//		OffsetTime ot = OffsetTime.now();
//		System.out.println(ot.toString()); // -> 20:04:24.257692600+07:00
//		OffsetDateTime odt = OffsetDateTime.now();
//		System.out.println(odt.toString()); // -> 2021-11-05T20:04:24.258696200+07:00
		
		/*
		 * The of method OffsetTime and OffsetDateTime classes use an additional class
		 * named ZoneOffset to indicate the offset from UTC.
		 * 
		 * */
		
		ZoneOffset z = ZoneOffset.ofHours(+7);
		OffsetTime time = OffsetTime.of(10, 30, 0, 0, z);
		System.out.println(time); // -> 10:30+07:00
		
//		Or of you prefer, you can create the ZoneOffset directly in the call to the OffsetTime's
//		of method:
		time = OffsetTime.of(10, 30, 0, 0, ZoneOffset.ofHours(+7));
		System.out.println(time.toString()); // -> 10:30+07:00
	}
}



























