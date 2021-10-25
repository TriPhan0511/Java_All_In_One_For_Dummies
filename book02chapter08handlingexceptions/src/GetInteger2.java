import java.util.*;

public class GetInteger2 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		int number = getInteger();
		System.out.println("You entered " + number);
	}
	
	public static int getInteger()
	{
		while (!sc.hasNextInt())
		{
			sc.nextLine();
			System.out.print("That's not an integer! Try again: ");
		}
		return sc.nextInt();
	}
}
