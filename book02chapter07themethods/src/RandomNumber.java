
public class RandomNumber 
{
	public static void main(String[] args)
	{
		int number = getRandomNumber();
		System.out.println("The random number is " + number);
	}
	
//	public static int getRandomNumber()
//	{
//		return (int) (Math.random() * 10) + 1;
//	}
	
	public static int getRandomNumber()
	{
		int number;
		while (true)
		{
			number = (int)(Math.random() * 20) + 1;
			if (number != 12)
			{
				return number;
			}
		}
	}
}

























