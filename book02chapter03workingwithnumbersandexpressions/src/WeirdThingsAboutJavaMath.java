import java.text.NumberFormat;

public class WeirdThingsAboutJavaMath 
{
	public static void main(String[] args) 
	{
		/* 1. Integer overflow */
		
//		int a = 1000000000;
//		System.out.println(a);
//		a += 1000000000;
//		System.out.println(a);
//		a += 1000000000;
//		System.out.println(a);
//		a += 1000000000;
//		System.out.println(a);
//		
////		Output:
////		1000000000
////		2000000000
////		-1294967296
////		-294967296
		
//		-----------------------------------------------------------------------------
		
		/* 2. Floating-point weirdness */
		
//		float x = 0.1f;
//		NumberFormat nf = NumberFormat.getNumberInstance();
//		nf.setMinimumFractionDigits(10);
//		System.out.println(nf.format(x)); 
////		-> 0.1000000015
		
//		-----------------------------------------------------------------------------
		
		/* 3. Division by zero */
		
		/*
		 * What happens if you do attempt to divide a number by zero in a Java program?
		 * The answer depends on whether you're dividing integers or floating-point numbers.
		 * 
		 * If you're dividing integers, the statement that attempts the division by zero
		 * chokes up what is called exception, which is impolite way of crashing the program.
		 * 
		 * If you try to divide a floating-point type by zero, the results are not so abrupt.
		 * Instead, Java assigns to the floating-point result one special value:
		 * 
		 * 		_ If you divide a number by zero, and the sign of both numbers is the same,
		 * 			the result is positive infinity.
		 * 
		 * 		_ If you divide a number by zero, and the signs of the numbers are different,
		 * 			the result is a negative infinity.
		 * 
		 * 		_ If you divide zero by zero, the result is not a number (NaN), regardless of
		 * 			the signs.
		 * 
		 * */
		
//		Examples:
		
//		System.out.println(1 / 0); // Error
//		System.out.println(1.0 / 0); // Infinity
//		System.out.println(-1.0 / 0); // -Infinity
//		System.out.println(0.0 / 0.0); // NaN
	}

}






























