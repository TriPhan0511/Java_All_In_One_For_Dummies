
public class PrimitiveTypesSample 
{
	public static void main(String[] args) 
	{
		/* 1. Integer types */
		
		
////		Java allows you to promote an integer type to a larger integer type
//		int xInt;
//		long yLong;
//		xInt = 32;
//		yLong = xInt;
		
////		But Java does not allow the converse
//		int xInt;
//		long yLong;
//		yLong = 32;
////		xInt = yLong; // Error
////		Because this assigment may result in a loss of data, Java doesn't allow it.
////		If you need to assign a long to an int variable, you must use explicit casting.
		
////		You can include underscores to make longer numbers easier to read
//		long xLong1 = 58473882;
//		long xLong2 = 58_473_882;
//		
//		System.out.println(xLong1); // -> 58473882
//		System.out.println(xLong2); // -> 58473882
//		
//		System.out.printf("%,d\n", xLong1); // -> 58,473,882
//		System.out.printf("%,d", xLong2); // -> 58,473,882
		
//		------------------------------------------------------------------------------------------------
		
		/* 2. Floating-point types */
		
////		When you use a floating-point literal, I suggest you include a decimal point.
////		That avoids the confusion of assigning what looks like an integer to a floating-point variable.
//		double period = 99.0;
		
////		Geting scientific with floats and doubles: Use scientific notation
//		double e = 5.10e+6; // is equivalent to double e = 5100000D;
//		System.out.println(e); // -> 5100000.0
		
////		The sign is optional if the exponent is positive, so you can also write:
//		double e = 5.10e6;
//		System.out.println(e); // -> 5100000.0
		
////		Note that the exponent can be a negative to indicates values smaller than 1
//		double impulse = 23e-7; // is equivalent to double impulse = 0.0000023;
//		System.out.println(impulse); // -> 2.3E-6
		
//		------------------------------------------------------------------------------------------------
		
		/* 3. The char type */
		
////		The char type represents a single character from the Unicode character set.
//		char code = 'X';
		
////		You can also assign an integer value from 0 to 255 to a char variable
////		Here, the decimal value 13, which represents a carriage return, is assigned
////		to the variable named cr:
//		char cr = 013;
		
////		Escape sequences
//		char c = '\'';
//		System.out.println(c);
		
//		------------------------------------------------------------------------------------------------
		
		/* 4. The Boolean type */
		
//		boolean enrolled = true;
//		boolean credited = false;
//		
//		if (enrolled) 
//		{
//			System.out.println("Yes, enrolled!");
//		}
////		-> Yes, enrolled!
//		
//		if (credited) 
//		{
//			System.out.println("Yes");
//		} else 
//		{
//			System.out.println("No");
//		}
////		-> No
		
//		------------------------------------------------------------------------------------------------
		
		/* Using wrapper classes */
		
		/*
		 * Every primitive type has a corresponding class defined in the Java API class library.
		 * This class is sometimes called a wrapper class because it wraps a primitive value with
		 * the object-oriented equivalent of pretty wrapping paper and a bow to make the primitive 
		 * type look and behave like an object.
		 * 
		 * You can use these wrapper classes to convert primitive values to strings, and vice versa.
		 * 
		 * */
		
//		int x = 10;
//		String str = Integer.toString(x);
//		
		
		
	}

}











































