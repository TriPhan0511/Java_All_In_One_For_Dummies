import java.time.*;

/* Using the parse Method to Create a Date-Time Object */

public class TimeTester2 
{
	public static void main(String[] args)
	{
//		Create a LocalDate object representing December 15, 2014:
		LocalDate d = LocalDate.parse("2014-12-15");
		System.out.println(d.toString());
	}
}
