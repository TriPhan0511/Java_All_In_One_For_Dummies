/* Using a continue statement in a for loop */

public class ForDodecaphobia2 
{
	public static void main(String[] args)
	{
		for (int i = 2; i <= 20; i += 2)
		{
			if (i == 12)
			{
				continue;
			}
			System.out.printf("%d ", i);
		}
	}
}
