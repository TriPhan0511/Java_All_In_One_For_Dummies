/* Using a break statement in a for loop */

public class ForDodecaphobia 
{
	public static void main(String[] args)
	{
		for (int i = 2; i <= 20; i += 2)
		{
			if (i == 12)
			{
				break;
			}
			System.out.printf("%d ", i);
		}
	}
}
