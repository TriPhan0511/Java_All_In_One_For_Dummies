
public class UsingPredefinedCharacterClasses 
{
	public static void main(String[] args)
	{
		/*
		 * 2. Using predefined character classes
		 * 
		 * A character class represents a particular type of character than a specific character.
		 * A regex pattern lets you use two types of character classes: predefined classes and
		 * custom classes.
		 */
		
		/*
		 * The Predefined Character Classes
		 * 
		 * 	Regex	Matches
		 * 
		 * 	.		Any character
		 * 	\d		Any	digit (0-9)
		 * 	\D		Any nondigit (anything other than 0-9)
		 * 	\s		Any white-space character (space, tab, new line, return, or backsapce)
		 * 	\S		Any character other than a white-space character
		 * 	\w		Any word character (a-z, A-Z, 0-9, or an underscore)
		 * 	\W		Any character other than a word character
		 */
		
		/*
		 * 2.1. The period is like a wildcard that matches any character, as in this example:
		 * 
		 * Enter regex: c.t
		 * Enter string: cat
		 * Match.
		 * Enter string: cot
		 * Match.
		 * Enter string: cart
		 * Does not match.
		 * 
		 */
		
//		Utilities.checkRegex();
		
//		------------------------------------------------------------------------------------------
		
		/*
		 * 2.2 The \d class represents a digit and is often used in regex patterns to validate
		 * 		input data. 
		 * 
		 * Here's a simple regex pattern that validates a U.S. Social Security number, which 
		 * must be entered in the form: xxx-xx-xxxx:
		 * 
		 * Enter regex: \d\d\d-\d\d-\d\d\d\d
		 * Enter string: 779-54-3994
		 * Enter string: 550-403-004
		 * Does not match.
		 * 
		 * Here the regect pattern specifies that the string must contain three digits, a hyphen,
		 * two digits, another hyphen, and four digits.
		 * 
		 */
		
//		Utilities.checkRegex();
		
//		------------------------------------------------------------------------------------------
		
		/*
		 * 2.3 Note that the \d class has a conuterpart: \D. The \D class matches any character
		 * 		that is not a digit. Here's a first attempt at a regex for validating droid names:
		 * 
		 * Enter regex: \D\d-\D\d
		 * Enter string: R2-D2
		 * Match.
		 * Enter string: C3-P0
		 * Match.
		 * Enter string: C-3PO
		 * Does not match.
		 * 
		 * Here the pattern matches strings that begin with a character that isn;t a digit,
		 * followed by a character that is a digit, followed by a hyphen, followed by another
		 * nondigit character, and ending with a digit. Thus, R2-D2 and C3-P0 match.
		 */
		
//		Utilities.checkRegex();
		
//		------------------------------------------------------------------------------------------
		
		/*
		 * 2.4 - 2.5 The \s class matches white-space characters including spaces, tabs, newlines, 
		 * 		returns, and backspaces. This class ise useful when you want to allow user to
		 * 		separate parts of a string in various ways, as in this example. (Note that in
		 * 		the fourth line, I use the Tab key to separate abc from def).
		 * 
		 *  Enter regex: ...\s...
		 *  Enter string: abc def
		 *  Match.
		 *  Enter string: abc	def
		 *  Match.
		 *  
		 *  Here the pattern specifies that the string can be two groups of any three characters
		 *  separated by one white-space character. In the first string that's entered, the groups
		 *  are separated by a space; in the second group, they're separated by a a tab.
		 *  
		 *  The \s also has a counterpart: \S. It matches any character that isn't a white-space
		 *  character.
		 *  
		 */
		
		/*
		 * If you want to limit white-space characters to actual spaces, use a space in the regex, like this:
		 * 
		 		Enter regex: ... ...
				Enter string: abc def
				Match.
				Enter string: abc	def
				Does not match.
		 *
		 * Here the regex specifies two groups of any character separated by a space. The first input string
		 * matches this pattern, but the second does not because the groups are separated by a tab.
		 */
		
//		Utilities.checkRegex();
		
//		------------------------------------------------------------------------------------------
		
		/*
		 * 2.6 - 2.7 The last set of predefined classes is \w and \W. The \w class identifies any character
		 * 	that's normally used in words, including uppercase and lowecase letters, digits, and underscores.
		 * An example shows how all look that:
		 * 
			 	Enter regex: \w\w\w\W\w\w\w
				Enter string: abc def
				Match.
				Enter string: 123 456
				Match.
				Enter string: 123_456
				Does not match.
				
		 * Here the pattern calls for two groups of word characters separated  by a nonword character.
		 */
		
		Utilities.checkRegex();
	}
}
