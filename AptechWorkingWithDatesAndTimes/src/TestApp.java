import java.time.*;

public class TestApp 
{
	public static void main(String[] args)
	{
//		Use the now method to create a Date-Time object
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		OffsetTime ot = OffsetTime.now();
		System.out.println(ot);
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		MonthDay md = MonthDay.now();
		System.out.println(md);
		
		YearMonth ym = YearMonth.now();
		System.out.println(ym);
		
		Year y = Year.now();
		System.out.println(y);
		
		Instant i = Instant.now();
		System.out.println(i);
	}
}
