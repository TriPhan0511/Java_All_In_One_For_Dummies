import java.util.Scanner;

/**
 * This sample gets a line of text from the user and then replaces
 * all occurrences of the string cat with dog.
 * @version 1.0 2021-11-23
 * @author OS
 *
 */
public class ReplaceCatWithDog 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		String originalString = s;
		s = s.replaceAll("cat", "dog");
		
		System.out.println("\n" + originalString);
		System.out.println(s);
	}
}
