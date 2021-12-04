import java.util.Scanner;

/**
 * This sample illustrates how the StringBuilder class works,
 * Here's a StringBuilder version of the MarkVowels program.
 * @version 1.0 2021-11-24
 * @author OS
 *
 */
public class StringBuilderApp 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
//		String s = "abcdefghijklmnopqrstuvwxyz";
//		StringBuilder sb = new StringBuilder(s);
		
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++)
		{
			if (isVowel(sb.charAt(i)))
			{
				sb.setCharAt(i, '*');
			}
		}
		System.out.println(s);
		System.out.println(sb.toString());
	}
	
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


