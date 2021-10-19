import java.util.Scanner;

/* This program demonstrates the Scanner class */

public class ScannerApp 
{
//	Create a Scanner object as a class variable
	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		System.out.print("Enter a integer: ");
//		int x = sc.nextInt();
//		System.out.printf("You entered %d.", x);
		
		int x = 0;
		System.out.println("Enter an integer: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}
		System.out.printf("You entered %d.", x);
	}

}
