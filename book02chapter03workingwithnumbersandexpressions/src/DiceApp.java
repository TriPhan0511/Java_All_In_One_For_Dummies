/*
 * The Math.random method returns a double whose value is greater than or equal to 0.0
 * but less than 1.0. Within this range, the value returned by the random method is
 * different every time you call it and is essentially random.
 * 
 * */

/*
 * The random method generates a random double value between 0.0 (inclusive, meaning that
 * it could be 0.0) and 1.0 (exlcusive, meaning that it can't be 1.0). Most computer applications
 * that need random values, however, need random integers between some arbitrary low value 
 * (usually 1, but not always) and some arbitrary high value. 
 * 
 * As a result, you need a Java expression that converts the double value returned by the random
 * method to an int value within the range your program calls for. The following code shows how
 * to do this, with the values set to 1 and 6:
 * 
 * 		int low = 1;
 * 		int high = 6;
 * 		int rnd = (int) (Math.random() * (high - low + 1)) + low;
 * 
 * This expression is a little complicated, so I show you how it's evaluated step by step:
 * 
 * 		1. The Math.random method is called to get a random double value. This value is
 * 			greater than or equal to 0.0 but less then 1.0.
 * 
 * 		2. The random value is multiplied by the high end minus the low end, plus 1. In this
 * 			example, the high end is 6 and the low end is 1, so you now have a random number
 * 			that's greater than or equal to 0.0 bur less than 6.0 (It could be 5.9999999999,
 * 			but it never is 6.0).
 * 	
 * 		3. This value is converted to an integer by the (int) cast. Now you have an integer
 * 			that's 0, 1, 2, 3, 4, or 5. (Remember that when you cast a double to an int, any
 * 			fractional part of the value is simply discarded. Because the number is less than
 * 			6.0, it never truncates to 6.0 when it is cast to an int.).
 * 
 * 		4. The low value in the range is added to the random number. Assuming that low is 1,
 * 			the random number is now 1, 2, 3, 4, 5, or 6. That's just what you want: a random
 * 			number between 1 and 6.
 * 
 * */

public class DiceApp 
{
	public static void main(String[] args) 
	{
		System.out.println("Here are 100 random rolls of the dice:");
		for (int i = 1; i <= 100; i++) 
		{
//			Calls the randomInt method
			System.out.printf("%d ", randomInt(1, 6));
			
//			Print nine numbers on one row
			if (i % 9 == 0) {
				System.out.println();
			}
		}
	}
	
	/* Method: Create a random number between low and high. */
	public static int randomInt(int low, int high)
	{
		return (int) (Math.random() * (high - low + 1)) + low;
	}

}
























