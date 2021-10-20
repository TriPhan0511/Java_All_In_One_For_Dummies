
// WRONG 

public class SwapTwoNumbersSample 
{
	public static void main(String[] args) 
	{
//		Creates two integer variables
		int first = 1;
		int second = 2;
		
//		Calls the swapTwoNumbers method
		swapTwoNumbers(first, second);
		
//		Prints two numbers
		System.out.printf("After calling the swapTwoNumbers method:\n first = %d, second = %d", first, second);
		
//		Calls the swapTwoNumbers2 method
//		swapTwoNumbers2(first, second);
		
//		Prints two numbers
		System.out.printf("\nAfter calling the swapTwoNumbers2 method:\n first = %d, second = %d", first, second);		
		
		
	}
	
	/* Method: swapTwoNumbers (pass-by-value) */
	static void swapTwoNumbers(int firstNumber, int seconNumber)
	{
		int temp = firstNumber;
		firstNumber = seconNumber;
		seconNumber = temp;
	}
	
	/* Method: swapTwoNumbers2 (pass-by-reference) */
	static void swapTwoNumbers(Integer firstNumber, Integer secondNumber)
	{
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
	}

}






















