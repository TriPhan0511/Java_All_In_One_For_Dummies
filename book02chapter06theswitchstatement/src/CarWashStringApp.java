import java.util.Scanner;

public class CarWashStringApp 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("The Car Wash Application\n\n");
		System.out.print("Enter the package code (Presidential / Elite / Deluxe / Super / Standard): ");
		String choice = sc.next().toUpperCase();
		String details = "";
		
		switch(choice)
		{
		case "PRESIDENTIAL":
			details += "\tNew Car Scent, plus...\n";
			
		case "ELITE":
			details += "\tTire treatment, plus...\n";
			
		case "DELUXE":
			details += "\tLeather/Vinyl Treatment, plus...\n";
			
		case "SUPER":
			details += "\tWax, plus...\n";
			
		case "STANDARD":
			details += "\tWash, vacuum, and hand dry.";
			break;
			
		default:
			details = "\tThat's not a package code.";
			break;
		}
		System.out.println("\nThat package includes:\n");
		System.out.println(details);
		
	}
}
