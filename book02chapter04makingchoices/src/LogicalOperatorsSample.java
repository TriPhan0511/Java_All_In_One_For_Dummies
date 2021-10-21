
public class LogicalOperatorsSample 
{
	public static void main(String[] args) 
	{
//		boolean b = false;
//		if (!b) {
//			System.out.println("hello");
//		}
		
////		int x = 1;
//		int x = -1;
//		int y = 2;
//		
////		if (x > 0 & y > 0) {
//		if (x > 0 | y > 0) {
//			System.out.println("Hello.");
//		}
		
//		int x = 1;
//		int y = 2;
//		
//		if ((x > 0) & (y > 0)) {
//			System.out.println("Hello");
//		}
		
//		int x = 1;
//		int y = 2;
//		
//		if ((x > 0) && (y > 0)) {
//			System.out.println("Hello");
//		}
		
//		----------------------------------------------------------------------------------
		
		/* Using the Conditional Operator ( ternary operator ) */
		
////		boolean male = true;
//		boolean male = false;
//		String gender = male ? "Gentleman" : "Lady";
//		System.out.println(gender);
		
////		double salesTotal = 7000.0;
//		double salesTotal = 10000.0;
//		int salesTier = (salesTotal < 10000.0) ? 0 : 1;
//		System.out.println(salesTier);
		
		int appleCount = 1;
//		int appleCount = 2;
		
		String message = "You have " + appleCount + " apple" + ((appleCount > 1) ? "s." : ".");  
		System.out.println(message);
	}

}






























