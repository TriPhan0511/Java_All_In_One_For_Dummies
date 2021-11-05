import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeParseException;

public class WithScannerSample 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		LocalDate d = getBirthDay("Enter your birthday (yyyy-mm-dd): ", sc);
		System.out.println("Your birthday: " + d.toString());
	}
	
	private static LocalDate getBirthDay(String msg, Scanner sc)
	{
		
		
		while (true)
		{
			System.out.print(msg);
			String input = sc.nextLine();
			try
			{
				return LocalDate.parse(input);
			}
			catch(DateTimeParseException e)
			{
				System.out.println("Invalid date. Try again.");
				
			}
		}
		
	}
}
