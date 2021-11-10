
public class MatchingMultipleCharacters 
{
	public static void main(String[] args)
	{
		/*
		 * 6. Matching Multiple Characters
		 * 
		 * The regex patterns described so far in this chapter require that each position
		 * in the input string match a specific character class. The pattern \d\W[a-z], for
		 * example, requires a digit in the first position, a white-space character in the
		 * second position, and one of the letters a-z in the third position. These requirements
		 * are pretty rigid.
		 */
		
		/*
		 * To create more flexible patterns, you can use any of the quantifiers in the following
		 * list. Quantifiers let you create patterns that match a variable number of characters
		 * at a certain position in the string.
		 */
		
		/*
		 * 		Quantifiers
		 * 
		 * 	Regex		Matches the Preceding Element
		 * 
		 * 	?			Zero times or one time
		 * 	*			Zero or more times
		 * 	+			One or more times
		 * 	{n}			Exactly n times
		 * 	{n,}		At least n times
		 * 	{n,m}		At least n times but no more than m times
		 * 
		 */
		
		/*
		 * To use a quantifier, you code it immediately after the element you want it to apply
		 * to. Here's a version of the Social Security number pattern that uses quantifiers:
		 * 
		 		Enter regex: \d{3}-\d{2}-\d{4}
				Enter string: 779-48-9955
				Match.
				Enter string: 483-488-9944
				Does not match. 
		 * 
		 * The pattern matches three digits, followed by a hyphen, followed by two digits, 
		 * followed by another hyphen, followed by four digits.
		 */
		
		/*
		 * Simply duplicating elements rather than using a quantifier is just as easy, if not
		 * easier. \d\d is just as easy as \d{2}.
		 */
		
		/*
		 * The ? quantifier lets you create an optional element that may or may not be present
		 * in the string. Suppose you want to allow the user to enter Social Security numbers
		 * without the hyphens. You could use this pattern:
		 * 
		 		Enter regex: \d{3}-?\d{2}-?\d{4}
				Enter string: 779-48-9955
				Match.
				Enter string: 779489955
				Match.
				Enter string: 779-489955
				Match.
				Enter string: 77948995
				Does not match.
		 * 
		 * The question marks indicate that the hyphens are optional. Notice that this pattern
		 * lets you include or omit either hyphen. The last string entered doesn't match because
		 * it has only eight digits, and the pattern requires nine.
		 */
		
		Utilities.checkRegex();
	}
	
}


























