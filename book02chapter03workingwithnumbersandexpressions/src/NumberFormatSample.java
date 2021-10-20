import java.text.NumberFormat;

/*
 * Methods of the NumberFormat class:
 * 
 * 1. getCurrencyInstance(): A static method that returns a NumberFormat object that formats currency values.
 * 
 * 2. getPercentInstance(): A static method that returns a NumberFormat object that formats percentages.
 * 
 * 3. getNumberInstance(): A static method that returns a NumberFormat object that formats basic numbers.
 * 
 * 4. format(number): Returns a string that contains the formatted number.
 * 
 * 5. setMinimumFractionDigits(int): Sets the minimum number of digits to display to the right of the decimal point.
 * 
 * 6. setMaximumFractionDigits(int): Sets the maximum number of digits to display to the right of the decimal point.
 * 
 * */

/*
 * The procedure for using the NumberFormat class to format numbers takes a little getting used to. 
 * 
 * First, you must call one of the static getXXXInstance methods to create a NumberFormat object that
 * can format numbers in a particular way.
 * 
 * Then, if you want, you can call the setMinimumFractionDigits or setMaximumFractionDigits method to
 * set the number of decimal digits to be displayed.
 * 
 * Finally, you call that object's format method to actually format a number.
 * 
 * */

/*
 * Note that the NumberFormat class is in the java.text package, so you must include the following 
 * import statement at the beginning of any class that uses NumberFormat:
 * 
 * 		import java.text.NumberFormat;
 * 
 * */

/* This example demonstrates how to use the java.text.NumberFormat class. */

public class NumberFormatSample 
{
	public static void main(String[] args) 
	{
////		Example 1: Formats a double value as currency
//		double salesTax = 2.425;
//		NumberFormat cf = NumberFormat.getCurrencyInstance();
//		System.out.println(cf.format(salesTax));
////		-> $2.42
		
////		Example 2: Formats a number by using general number format, with exactly three decimal places.
//		double x = 19923.3288;
//		NumberFormat nf = NumberFormat.getNumberInstance();
//		nf.setMaximumFractionDigits(3);
//		nf.setMinimumFractionDigits(3);
//		System.out.println(nf.format(x));
////		-> 19,923.329 
		
//		Example 3: Uses the percentage format
		double grade = .92;
		NumberFormat pf = NumberFormat.getPercentInstance();
		System.out.println(pf.format(grade));
//		-> 92%
		
	}

}


























