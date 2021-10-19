/*
 * A final variable is a variable whose value you can't change after it's been initialized.
 * To declare a final variable, you add the final keyword to the variable declaration, like this:
 * 
 * 		final int WEEKDAYS = 5;
 * 
 * */

/*
 * A variable is both final and static is called a constant. Constants are often used for values
 * that are universally the same, such as the number of days in June or the atomic weight of iridium.
 * To create a constant, add static final (not final static) to the declaration as follow:
 * 
 * 		static final int DAYS_IN_JUNE = 31;
 * 
 * */

public class ConstantsSample 
{
//	Create an constant
	static final int DAYS_IN_JUNE = 31;
	
	public static void main(String[] args) {
//		Create a final variable
		final int WEEKDAYS = 5;
		
//		The final variable cannot be reassigned a new value
//		WEEKDAYS = 100; // Error
		
//		Print the constant DAYS_IN_JUNE
		System.out.println(DAYS_IN_JUNE); // -> 31
	}
	
}





























