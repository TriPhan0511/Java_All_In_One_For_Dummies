import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * A valid roll number has a pattern: abbbbdebbbb
 * 	
 * 	_ a can be C, T, or N.
 * 	_ b can be between 0 and 9.
 * 	_ d can be G, H, I, K, L, M.
 * 	_ e can be V or not.
 */

public class RollNumberSample 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		String regex = "[CTN]\\d{4}[G-M]V?\\d{4}";
//		System.out.print("Enter the roll number: ");
//		String rollNumber = sc.nextLine();
//		if(checkRollNumber(regex, rollNumber))
//		{
//			System.out.println("Valid.");
//		}
//		else
//		{
//			System.out.println("Invalid.");
//		}
		
//		Testing 1
		String regex = "[CTN]\\d{4}[G-M]V?\\d{4}";
		String[] rollNumbers = new String[] 
				{"C1009H0001", "T0812KV0002", "TT0812KV0002", "C1009H00012", "C10030003", "C1103T004"};

//		String regex = "[cCtTnN]\\d{4}[g-mG-M][vV]?\\d{4}";
//		String[] rollNumbers = new String[] 
//				{"C1009H0001", "c1009h0001", "T0812KV0002", "t0812kv0002", "TT0812KV0002", "C1009H00012", "C10030003", "C1103T004"};
		
		for (String s : rollNumbers)
		{
			if (checkRollNumber(regex, s))
			{
				System.out.printf("%s: %s\n", s, "Valid");
			}
			else
			{
				System.out.printf("%s: %s\n", s, "Invalid");
			}
		}
		
////		Testing 2
//		Utilities.checkRegex();
	}
	
	private static boolean checkRollNumber( String regex, String rollNumber) 
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(rollNumber);
		return matcher.matches();
	}
}






















