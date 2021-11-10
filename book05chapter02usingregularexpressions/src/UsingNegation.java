
public class UsingNegation 
{
	public static void main(String[] args)
	{
		/*
		 * 5. Using Negation
		 * 
		 * Regular expressions can include classes that match any character but the ones 
		 * listed for the class. To do that, you start the class with a caret, like this: 
		 * 
		 		Enter regex: [^cf]at
				Enter string: bat
				Match.
				Enter string: cat
				Does not match.
				Enter string: fat
				Does not match. 
		 * 
		 * Here the string must be a three-letter word that ends in at but isn't fat or cat.
		 */
		
		Utilities.checkRegex();
	}
}
