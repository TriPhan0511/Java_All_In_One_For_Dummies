import java.util.Scanner;

/**
 * This sample uses substrings to replace all vowels in a string entered
 * by the user with asterisks.
 * @version 1.0 2021-11-23
 * @author Tri Phan
 */
public class MarkVowels 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		String originalString = s;
		
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (isVowel(c))
			{
				String front = s.substring(0, i);
				String back = s.substring(i + 1);
				s = front + "*" + back;
			}
		}
		
		System.out.println("\n" + originalString);
		System.out.println(s);
	}
	
	/**
	 * Check whether a char is a vowel or not
	 * @param c A char
	 * @return true indicates the char is a vowel,
	 * 		otherwise, returns false.
	 */
	private static boolean isVowel(char c) 
	{
		switch (c)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				return true;
			default:
				return false;
		}
	}
}
