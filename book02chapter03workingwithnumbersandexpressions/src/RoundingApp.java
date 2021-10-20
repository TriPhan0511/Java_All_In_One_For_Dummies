/*
 * Rounding functions
 * 
 * The Math class has four methods that round or truncate float or double values.
 * 
 * Note that even though all four of these methods round a floating-point number
 * to an integer value, only the round method actually returns an integer type
 * (int or long, depending on whether the argument is a float or a double). The
 * other methods return doubles that happen to be integer values.
 * 
 * 
 * */

/*
 * 1. round(argument)
 * 
 * Returns the integer that is closest to the argument. If the argument is a double,
 * it returns a long. If the argument is a float, it returns an int.
 * 
 * */

/*
 * 2. ceil(argument)
 * 
 * Returns the smallest double value that is an integer and is greater than or equal to
 * the value of the argument.
 * 
 * */

/*
 * 3. floor(argument)
 * 
 * Returns the largest double value that is an integer and is less than or equal to
 * the value of the argument.
 * 
 * */

/*
 * 4. rint(argument)
 * 
 * Returns the double value that is an integer and is closest to the value of the 
 * argument. If two integer values are equally close, it returns the one that is even.
 * If the argument is already an integer, it returns the argument value.
 * 
 * */


public class RoundingApp 
{
	public static void main(String[] args) 
	{
		double x = 29.4;
		double y = 93.5;
		double z = -19.3;
		
//		System.out.println("round(x) = " + Math.round(x)); // 29
//		System.out.println("round(y) = " + Math.round(y)); // 94
//		System.out.println("round(z) = " + Math.round(z)); // -19
		
//		System.out.println("ceil(x) = " + Math.ceil(x)); // 30.0
//		System.out.println("ceil(y) = " + Math.ceil(y)); // 94.0
//		System.out.println("ceil(z) = " + Math.ceil(z)); // -19.0 
		
//		System.out.println("floor(x) = " + Math.floor(x)); // 29.0
//		System.out.println("floor(y) = " + Math.floor(y)); // 93.0
//		System.out.println("floor(z) = " + Math.floor(z)); // -20.0
		
		System.out.println("rint(x) = " + Math.rint(x)); // 29.0 
		System.out.println("rint(y) = " + Math.rint(y)); // 94.0
		System.out.println("rint(z) = " + Math.rint(z)); // -19.0
	}

}


































