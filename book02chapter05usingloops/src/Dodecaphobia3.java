/* Using the continue statement */

public class Dodecaphobia3 
{
	public static void main(String[] args) 
	{
		int number = 0;
		
		while(number < 20)
		{
			number += 2;
			if (number == 12)
			{
				continue;
			}
			System.out.print(number + " ");
			
		}
	}

}
