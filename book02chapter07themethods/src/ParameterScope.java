
public class ParameterScope 
{
	public static void main(String[] args)
	{
		int min = 1;
		int max = 10;
		int number = getRandomNumber(min, max);
		System.out.println(number);
	}
	
	public static int getRandomNumber(int min, int max)
	{
		return (int)(Math.random() * (max - min + 1)) + min;
	}
}
