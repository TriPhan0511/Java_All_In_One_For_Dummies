import java.util.Scanner;

public class BallTest 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Ball b =  getBall(sc, "Enter a type: ");
		if (b instanceof Ball)
		{
			b.hit(0);
		}
		else
		{
			System.out.println("b is not an instance of Ball class.");
		}
	}
	
	private static Ball getBall(Scanner sc, String msg)
	{
		System.out.print(msg);
		BallType type = parseStringToBallType(sc.nextLine());
		return BallFactory.getBallInstance(type);
	}
	
	private static BallType parseStringToBallType(String s)
	{
		switch (s.toLowerCase())
		{
		case "baseball":
			return BallType.BASEBALL;
		case "softball":
			return BallType.SOFTBALL;
		default:
			return BallType.STRANGE;
		}
	}
}






















