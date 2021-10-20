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
		
//		System.out.println(1 / 0); // Error
		System.out.println(1.0 / 0); // Infinity
		
		/*
		 * What happens if you do attempt to divide a number by zero in a Java program?
		 * The answer depends on whether you're dividing integers or floating-point numbers.
		 * 
		 * If you're dividing integers, the statement that attempts the division by zero
		 * 
		 * */
		
	}

}






























