import java.util.Scanner;

public class GetABet3 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		/* 1. Use a do loop */
//		int bank = 1000; 	// assume the user has $1,000
//		int bet; 			// the bet entered by the user
//		boolean validBet; 	// indicates if bet is valid 
//		
//		System.out.println("You can bet between 1 and " + bank);
//		do
//		{
//			System.out.print("Enter you bet: ");
//			bet = sc.nextInt();
//			validBet = true;
//			if ((bet <= 0) || (bet > bank))
//			{
//				validBet = false;
//				System.out.println("What, are you crazy?");
//			}
//		} while (!validBet);
//		System.out.println("You money's good here.");
		
		/* 2. Use a while loop */
		int bank  = 1000; 			// assume the user has $1,000
		int bet; 					// the bet entered by the user
		boolean validBet = false; 	// indicates if bet is valid
		
		System.out.println("You can bet between 1 and " + bank);
		while (!validBet)
		{
			System.out.print("Enter your bet: ");
			bet = sc.nextInt();
			if ((bet <= 0) || (bet > bank))
			{
				System.out.println("What, are you crazy?");
			}
			else {
				validBet = true;
			}
		}
		System.out.println("Your money's good here.");
		
	}

}































