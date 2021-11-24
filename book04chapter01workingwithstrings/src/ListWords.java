import java.util.Scanner;

/**
 * This sample accepts a string from the user,
 * uses the split method of the String class
 * to break the entered string into separate
 * words, and then displays the words on 
 * separate lines.
 * 
 * @version 1.0 2021-11-23
 * @author Tri Phan
 */
public class ListWords 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		String[] words = s.split("\\s+");
		for (String w : words)
		{
			System.out.println(w);
		}
	}
}
