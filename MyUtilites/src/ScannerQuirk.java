import java.util.Scanner;

public class ScannerQuirk 
{
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
////		Solution 1
//		System.out.print("Enter an integer: ");
//		int i = sc.nextInt();
//		sc.nextLine(); // Consume newline left-over
//		System.out.print("Enter a string: ");
//		String s = sc.nextLine();
//		
//		System.out.println("The integer you entered: " + i);
//		System.out.println("The string you entered: " + s);
		
////		Solution 2
//		int i = Utilities.getInteger("Enter an integer: ", sc);
//		String s = Utilities.getString("Enter a string: ", sc);
//		
//		System.out.println("The integer you entered: " + i);
//		System.out.println("The string you entered: " + s);		
		
//		Test the getDouble method
		double d = Utilities.getDouble("Enter a double: ", sc);
		System.out.println("The double you entered: " + d);
	}
}





























