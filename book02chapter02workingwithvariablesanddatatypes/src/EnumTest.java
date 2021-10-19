/* This program demonstrates how to use enum to create your own data types */

/*
 * Here's a complete program that defines an enum, creates a variable of the enum's type,
 * assigns a value, and prints the result.  
 * 
 * */

public class EnumTest 
{
//	Define an enum
	public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}
	
	public static void main(String[] args) 
	{
//		Create a variable of the CardSuit
		CardSuit suit = CardSuit.HEARTS;
		
//		Display
		System.out.println("The suit is " + suit); // -> The suit is HEARTS
	}
}
