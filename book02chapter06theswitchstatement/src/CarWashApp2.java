import java.util.Scanner;

public class CarWashApp2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Car Wash Application");
		System.out.print("Enter the package code: ");
		String s = sc.next();
		char p = s.charAt(0);
		
		String details;
		
		switch (p)
		{
			case 'E':
			case 'e':
				details = packageE() + packageD() + packageC() + packageB() + packageA();
				break;
				
			case 'D':
			case 'd':
				details = packageD() + packageC() + packageB() + packageA();
				break;
				
			case 'C':
			case 'c':
				details = packageC() + packageB() + packageA();
				break;
				
			case 'B':
			case 'b':
				details = packageB() + packageA();
				break;
				
			case 'A':
			case 'a':
				details = packageA();
				break;
				
			default:
				details = "\tThat's not one of the code.";
				break;
		}
		System.out.println("\nThe package includes:\n");
		System.out.println(details);
	}
	
	public static String packageA()
	{
		return "\tWash, vacuum, and hand dry.";
	}
	
	public static String packageB()
	{
		return "\tWax, plus...\n";
	}
	
	public static String packageC()
	{
		return "\tLeather/Vinyl Treatmen, plus...\n";
	}
	
	public static String packageD()
	{
		return "\tTire Treatment, plus...\n";
	}
	
	public static String packageE()
	{
		return "\tNew Car Scent, plus...\n";
	}
}

























