
public class UsingCustomCharacterClasses 
{
	public static void main(String[] args)
	{
		/*
		 * 3. Using custom character classes
		 * 
		 * To create a custom character class, you simply list all the characters that you want 
		 * to include in the class within a set of brackets. Here's an example:
		 * 
		 		Enter regex: b[aeiou]t
				Enter string: bat
				Match.
				Enter string: bet
				Match.
				Enter string: bit
				Match.
				Enter string: bot
				Match.
				Enter string: but
				Match.
				Enter string: bmt
				Does not match.
		 * 
		 * Here the pattern specifies that the string must start with the letter b, followed by
		 * a class that can include a, e, i, o, or u, followed by t. In other words, it accepts
		 * three-letter words that begin with b, end with t, and have a vowel in the middle.
		 */
		
		/*
		 * If you want to let the pattern include uppercase letters as well as lowercase letters,
		 * you have to list them both:
		 * 
		 		Enter regex: b[aAeEiIoOuU]t
				Enter string: bat
				Match.
				Enter string: bAt
				Match.
				Enter string: BAT
				Does not match. 
		 */
		
		/*
		 * You can use as many custom groups on a line as you want. Here's an example that 
		 * defines classes for the first and last characters so that they too can be uppercase
		 * or lowercase:
		 * 
		 		Enter regex: [bB][aAeEiIoOuU][tT]
				Enter string: bat
				Match.
				Enter string: BAT
				Match. 
		 *
		 * This pattern specifies three character classes. The first can be b or B, the second
		 * can be any uppercase or lowercase vowel, and the third can be t or T.
		 */
		
		Utilities.checkRegex();
		
	}
}






























