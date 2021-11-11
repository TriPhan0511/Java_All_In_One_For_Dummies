import java.util.Scanner;

public class TestApp 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		int high = 5;
//		int low = 1;
//		System.out.println(getRandomNumber(low, high));
		
		System.out.print("Enter an integer: ");
		int i = Integer.parseInt(sc.nextLine());
	}
	
	private static int getRandomNumber(int low, int high)
	{
		return (int) (Math.random() * (high - low + 1)) + low;
	}
}
