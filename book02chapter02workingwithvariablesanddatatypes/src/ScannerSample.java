import java.util.Scanner;

public class ScannerSample {

//	Create a Scanner object as a class variable 
	static Scanner sc;
	
	public static void main(String[] args) 
	{
		while (true) {
			try {
				sc = new Scanner(System.in);
				System.out.print("Enter a integer: ");
				int x = sc.nextInt();
				System.out.printf("You entered %d.", x);
				break;
			} catch (Exception e) {
				System.out.println("You should enter an integer!");
			}
		}
	}


}
