/* This sample demonstrates how to pass arguments by value */

/*
 * When arguments are passed by value it is known as call-by-value and it means that:
 * 
 * 		_ A copy of the argument is passed from the calling method to the called method.
 * 
 * 		_ Changes made to the argument in the called method will not modify the value
 * 			in the calling method.
 * 
 * 		_ Variables of primitive data types such as int and float are passed by value.
 * 
 * */


public class AptechCallByValueSample 
{

	public static void main(String[] args) 
	{
//		Create a variable
		int number = 100;
		
//		Calls the changeValue method
		changeValue(number);
		
//		Print the number
		System.out.println("In main method: number = " + number);
	}
	
	/* Method: changeValue */
	static void changeValue(int number) 
	{
		number = number + 1;
		System.out.println("In changeValue method: number = " + number);
	}

}
