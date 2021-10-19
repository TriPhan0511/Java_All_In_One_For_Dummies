
public class FirstSample 
{
	public static void main(String[] args) 
	{
////		Example 1: How the arithmetic opertors work for int type
//		int a = 32;
//		int b = 5;
//		
//		int c = a + b;
//		System.out.println(c); // 37
//		
//		int d = a - b;
//		System.out.println(d); // 27
//		
//		int e = a * b;
//		System.out.println(e); // 160
//		
//		int f = a / b;
//		System.out.println(f); // 6
//		
//		a++; // a is now 33
//		b--; // b is now 4
		
		/* Notice that for division, the result is truncated. Thus 32 / 5 return 6, not 6.4 */
		
//		-----------------------------------------------------------------------------------------
		
////		Example 2: How the arithmetic opertors work for double type
//		double x = 5.5;
//		double y = 2.0;
//		
//		double m = x + y;
//		System.out.println(m); // 7.5
//		
//		double n = x - y;
//		System.out.println(n); // 3.5
//		
//		double o = x * y;
//		System.out.println(o); // 11.0
//		
//		double p = x / y;
//		System.out.println(p); // 2.75
//		
//		double q = x % y;
//		System.out.println(q); // 1.5
//		
//		x++; // x is now 6.6
//		
//		y--; // y is now 1.0
		
//		-----------------------------------------------------------------------------------------
		
		/*
		 * Warning:
		 * When you divide two int values, the result is an integer value, even if you assign it
		 * to a double variable. For example,
		 * 
		 * */
		
//		int a = 21;
//		int b = 6;
//		double c = a / b;
//		System.out.println(c); // 3.0
		
		
		/*
		 * If that's not you want, you can cast one of the operands to a double before
		 * performing the division. Here's how: 
		 * 
		 * */
		
		int a = 21;
		int b = 6;
		double c = (double) a / b;
		System.out.println(c); // 3.5
		
	}

}




































