
public class UsingRanges 
{
	public static void main(String[] args)
	{
		/*
		 * 4. Using Ranges
		 * 
		 * Custom character classes can also specify ranges of letters or numbers, like this:
		 * 
		 		Enter regex: [a-z][0-5]
				Enter string: r2
				Match.
				Enter string: b9
				Does not match. 
		 * 
		 * Here the string can be two characters long. The first must be a character from
		 * a-z, and the second must be 0-5.
		 */
		
		/*
		 * You can also use more than one range in a class, like this:
		 * 
		 		Enter regex: [a-zA-Z][0-5]
				Enter string: b4
				Match.
				Enter string: B4
				Match.
		 * 
		 * Here the first character can be lowercase a-z or uppercase A-Z.
		 */
		
		/*
		 * You can use ranges to build a class that accepts only characters that appear in 
		 * real words (as opposed to the \w class, which allows underscore).
		 * 
		 		Enter regex: [a-zA-Z0-9]
				Enter string: a
				Match.
				Enter string: Z
				Match.
				Enter string: 9
				Match.
				Enter string: _
				Does not match.
		 * 
		 */
		
		Utilities.checkRegex();
	}
}






























