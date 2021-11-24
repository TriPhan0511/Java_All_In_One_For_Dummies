import java.util.Scanner;

/**
 * This sample uses the charAt method in the String class to
 * count the nunber of vowels in a string entered by the user.
 * @version 1.0 2021-11-23
 * @author Tri Phan
 */
public class CountVowels 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		int vowelCount = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (isVowel(c))
			{
				vowelCount++;
			}
		}
		
		System.out.println("That string contains " 
		+ vowelCount + " vowels.");
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



















