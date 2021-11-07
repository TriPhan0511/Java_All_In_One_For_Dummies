import java.time.*;

public class ComparingDates 
{
	public static void main(String[] args) 
	{
		/*
		 * You can't compare Date-Time objects using Java's standard comparison operator.
		 * Consider the floowing example:
		 * 
		 * */
		
		if (LocalDate.now() == LocalDate.now())
		{
			System.out.println("All is right in the ubiverse.");
		}
		else
		{
			System.out.println("There must be a disturbance "
					+ "in the space-tim cotinuum!");
		}
		
		/*
		 * If you run this code, There must be a disturbance in the space-tim cotinuum! will be 
		 * printed. That's because when used on objects, the equality operator tests whether 
		 * two expressions refer to the same object, not to objects with the same value.
		 * 
		 * */
		
		/*
		 * To test the equality of two dates, you must use the isEqual method, as in this example:
		 * 
		 * */
		if (LocalDate.now().isEqual(LocalDate.now()))
		{
			System.out.println("All is right in the universe.");
		}
		
		/*
		 * Similarly, you must use either the isBefore or the isAfter method to determine 
		 * whether one date falls before or after another date. 
		 * 
		 * */
		
		/*
		 * Note that you can use built-in operators with methods that return integers results.
		 * Thus, the following code will work just as you expect:
		 * 
		 * */
		
		if (LocalDate.now().getDayOfMonth() < 15)
		{
			System.out.println("It is not yet the 15th.");
		}
	}
}



























