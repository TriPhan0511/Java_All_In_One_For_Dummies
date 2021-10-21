
public class IfElseSample 
{
	public static void main(String[] args) 
	{
//		double commissionRate = 0.05;
////		double salesTotal = 11000.0;
//		double salesTotal = 10000.0;
//		
//		if (salesTotal <= 10000) 
//		{
//			commissionRate = 0.02;
//		}
//		
//		double commission = salesTotal * commissionRate;
//		
//		System.out.println(commissionRate);
//		System.out.println(commission);
		
//		--------------------------------------------------------------------------
		
		/* Nested if statements */
		
//		int salesClass = 1;
//		double salesTotal = 10000;
//		double commissionRate;
//		
//		if (salesClass == 1) 
//		{
//			if (salesTotal < 10000) 
//			{
//				commissionRate = 0.02;
//			}
//			else
//			{
//				commissionRate = 0.4;
//			}
//		}
//		else
//		{
//			if (salesTotal < 10000) {
//				commissionRate = 0.025;
//			}
//			else
//			{
//				commissionRate = 0.05;
//			}
//		}
//		
//		double commission = salesTotal * commissionRate;
//		System.out.println(commission);
		
//		--------------------------------------------------------------------------
		
		/* else-if statements */
		
//		double salesTotal = 10000.0;
//		double salesTotal = 0.0;
//		double salesTotal = 999.99;
//		double salesTotal = 1000.0;
//		double salesTotal = 4999.99;
		double salesTotal = 5000.0;
		
		double commissionRate = 0.0;
		
		if (salesTotal >= 10000) 
		{
			commissionRate = 0.05;
		}
		else if (salesTotal >= 5000) 
		{
			commissionRate = 0.035;
		}
		else if (salesTotal >= 1000) 
		{
			commissionRate = 0.02;
		}
		
		double commission = salesTotal * commissionRate;
		System.out.println(commission);
	}

}






























