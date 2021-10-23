import java.util.Scanner;

/* A version of Car Wash Program That Uses Java 13 Switch Statement Features */

public class CarWashApp4 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("The car wash application!\n\n");
		System.out.print("Enter the package code: ");
		String s = sc.next();
		char p = s.charAt(0);
		
		String details = switch(p)
				{
					case 'E', 'e' -> packageE() + packageD() + packageC() 
					+ packageB() + packageA();
					
					case 'D', 'd' -> packageD() + packageC() + packageB()
					+ packageA();
					
					case 'C', 'c' -> packageC() + packageB() + packageA();
					
					case 'B', 'b' -> packageB() + packageA();
					
					case 'A', 'a' -> packageA();
					
					default -> "\tThat's not a package code.";
					};
				System.out.println(details);
	}
	
	public static String packageA()
	{
		return "\tWash, vacuum, and hand dry.\n";
	}
	
	public static String packageB()
	{
		return "\tWax, plus...\n";
	}
	
	public static String packageC()
	{
		return "\tLeather/Vinyl Treatment, plus...\n";
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
































