import java.util.Scanner;

/*
 * This sample demonsatrate how intentionally leaving out a break statement 
 * in a switch statement.
 * 
 * */

public class CarWashApp0 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Choose a package: ");
		String s = sc.next();
		char c = s.charAt(0);
		
//		String details = "";
		String details = "Wash, vacum, and hand-dry.";
		switch (c)
		{
			case 'e':
			case 'E':
				details = appendLast(details, "new-car scent");
			case 'd':
			case 'D':
				details = appendMiddle(details, "tire treatment");
			case 'c':
			case 'C':
				details = appendMiddle(details, "leather/vinyl treatment");
			case 'b':
			case 'B':
//				details = buildPackage(details, "wax");
//				details = buildPackage2(details, "wax");
		}
		System.out.println("Services: " + details);
		
	}
	
//	------------------------------------------------------------------------------
	
	/* Method: append */
	public static String appendLast(String details, String newService)
	{
//		details = "Wash, vacum, and hand-dry.";
//		newService = "new-car scent";
		
		int position = details.indexOf("and ");
		StringBuilder builder = new StringBuilder();
		builder.append(details.substring(0, position));
		builder.append(details.substring(position + 4, details.length() - 1));
		builder.append(", and ");
		builder.append(newService);
		builder.append(".");
		
		return builder.toString();
	}
	
	/* Method: */
	public static String appendMiddle(String details, String newService)
	{
//		details = "Wash, vacum, hand-dry, and new-car scent.";
//		newService = "tire treatment";
		
		int position = details.indexOf("and ");
		StringBuilder builder = new StringBuilder();
		builder.append(details.substring(0, position));
		builder.append(newService);
		builder.append(",");
		builder.append(details.substring(position + 3));
		
		return builder.toString();
	}
	
//	/* Method: buildPackage */
//	public static String buildPackage(String details, String newService)
//	{
//		int posistion = details.indexOf("and ");
//		StringBuilder builder = new StringBuilder();
//		builder.append(details.substring(0, posistion));
//		builder.append(details.substring(posistion + 4, details.length() - 1));
//		builder.append(", and ");
//		builder.append(newService);
//		builder.append(".");
//		
//		return builder.toString();
//	}
//	
//	/* Method: */
//	public static String buildPackage2(String details, String newService)
//	{
//		int posistion = details.indexOf("and ");
//		StringBuilder builder = new StringBuilder();
//		builder.append(details.substring(0, posistion));
//		builder.append(newService);
//		builder.append(details.substring(posistion - 2));
//		
//		return builder.toString();
//	}
}




























