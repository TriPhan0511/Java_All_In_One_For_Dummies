import java.util.Scanner;

public class OmitExpressionsSample 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Where should I start? ");
		int i = sc.nextInt();
		for (; i >= 0; i--)
		{
			System.out.println(i);
		}
	}

}
