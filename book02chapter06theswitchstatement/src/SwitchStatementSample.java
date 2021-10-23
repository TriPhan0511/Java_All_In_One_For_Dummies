import java.util.Scanner;

/* This sample demonstrates how to use an integer in the switch statement*/

public class SwitchStatementSample 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter sales class: ");
		int salesClass = sc.nextInt();
		System.out.print("Enter total sales: ");
		double totalSales = sc.nextDouble();
		
//		Calls the getCommission method
		System.out.println("Commission Rate: " + getCommissionRate(salesClass, totalSales)
		);
	}
	
	/* Method: get commission rate based on sales class and total sales. */
	public static double getCommissionRate(int salesClass, double totalSales)
	{
		double commissionRate;
		switch (salesClass)
		{
			case 1:
				if (totalSales < 10000)
				{
					commissionRate = 0.01;
				}
				else 
				{
					commissionRate = 0.02;
				}
				break;
			case 2:
				if (totalSales < 10000)
				{
					commissionRate = 0.025;
				}
				else 
				{
					commissionRate = 0.035;
				}
				break;
			case 3:
				if (totalSales < 10000)
				{
					commissionRate = 0.04;
				}
				else 
				{
					commissionRate = 0.05;
				}
				break;
				
			default:
				commissionRate = 0.0;
				break;
		}
		
		return commissionRate;
	}
}











































