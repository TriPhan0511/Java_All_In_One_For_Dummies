/* This program uses the break statement to break out the loop. */

public class Dodecaphobia {
	public static void main(String[] args) 
	{
		int number = 2;
		while (number <= 20)
		{
			if (number == 12)
			{
				break;
			}
			System.out.printf("%d ", number);
			number += 2;
		}
	}

}
