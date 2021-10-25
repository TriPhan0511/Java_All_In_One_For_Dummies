
public class RandomNumber2 
{
	public static void main(String[] args)
	{
		int min = 5;
		int max = 20;
		System.out.printf("The random number between %d and %d is %d", 
				min, 
				max, 
				getRandomNumber(min, max));
	}
	
	public static int getRandomNumber(int min, int max)
	{
		return (int)(Math.random() * (max - min + 1)) + min;
	}
}
