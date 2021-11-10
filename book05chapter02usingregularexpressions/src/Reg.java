import java.util.regex.*;
import java.util.Scanner;

/*
 * Creating a Program for Experimenting 
 * with Regular Expression
 */

/*
 * This program lets you enter a regular expression. Next, you can enter a string,
 * and the program tests it against the regular expression and lets you know whether
 * the string matches the regex. Then the program prompts you for another string to
 * compare. You can keep entering strings to compare with the regex you've already
 * entered. When you're done, just press the Enter key without entering a string.
 * The program asks whether you want to enter another regular expression. If you
 * answer yes (y), the whole process repeats. If you answer no (n), the program ends.
 */

/*
 * Here's a sample run of this program. It should match any three-letter word that
 * begins with f; ends with r; and has a, i, or o in the middle.
 */

/*
		Welcome to the Regex Tester


		Enter regex: f[aio]r
		Enter string: for
		Match.
		Enter string: fir
		Match.
		Enter string: fur
		Does not match.
		Enter string: fod
		Does not match.
		Enter string: 
		Another? (Y or N) n
 */

public final class Reg
{
	static String r, s;
	static Pattern pattern;
	static Matcher matcher;
	static boolean match, validRegex, doneMatching;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Regex Tester\n");
		do
		{
			do
			{
				System.out.print("\nEnter regex: ");
				r = sc.nextLine();
				validRegex = true;
				try
				{
					pattern = Pattern.compile(r);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					validRegex = false;
				}
			} while (!validRegex);
			doneMatching = false;
			while (!doneMatching)
			{
				System.out.print("Enter string: ");
				s = sc.nextLine();
				if (s.length() == 0)
				{
					doneMatching = true;
				}
				else
				{
					matcher = pattern.matcher(s);
					if (matcher.matches())
					{
						System.out.println("Match.");
					}
					else
					{
						System.out.println("Does not match.");
					}
				}
			}
		} while (askAgain());
		System.out.println("Goodbye!");
	}
	
	private static boolean askAgain()
	{
		System.out.print("Another? (Y or N) ");
		String reply = sc.nextLine();
		if (reply.equalsIgnoreCase("Y"))
		{
			return true;
		}
		return false;
	}
	
}






























