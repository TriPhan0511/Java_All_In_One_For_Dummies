import java.util.Scanner;

/* This sample demonstrates how to use a char variable in the switch statement. */

public class SwitchStatementSample2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
//		Get user input and convert from String to char
		System.out.print("Enter a sales class: ");
		String s = sc.next();
		char c = s.charAt(0);
		
//		Set the value for commission rate
		double commissionRate;
		switch (c)
		{
			case 'a':
			case 'A':
				commissionRate = 0.02;
				break;
			case 'b':
			case 'B':
				commissionRate = 0.035;
				break;
			case 'c':
			case 'C':
				commissionRate = 0.05;
				break;
	
			default:
				commissionRate = 0.0;
				break;
		}
		System.out.println(commissionRate);
	}
}
























