
/*
 * This sample illustrates some of interesting things you can do with
 * the methods in the String class.
 */
public class StringSample 
{
	public static void main(String[] args) 
	{
		/* 1. Finding the lenth of a string */
		
//		String s = "A wonderful day for a neighbor.";
//		int len = s.length();
//		System.out.println(len); // -> 31
		
		/* 2. Making simple string modifications */
		
//		Several of the methods of the String class return modified versions
//		of the original string.
		
////		Converts a string to all-lowercase letters:
//		String s1 = "Oompa Loompa";
//		String s2 = s1.toLowerCase();
//		System.out.println(s2); // -> oompa loompa
		
////		The toUpperCase method works the same way but converts strings to 
////		all-uppcase letters:
//		String s1 = "Oompa Loompa";
//		String s2 = s1.toUpperCase();
//		System.out.println(s2); // -> OOMPA LOOMPA
		
////		The trim method removes white-space characters (spaces, tabs, newlines, 
////		and so on) from the start and end of a word.
//		String s1 = "	Oompa Loompa	";
//		String s2 = s1.trim();
//		System.out.println("s1's length: " + s1.length()); // 14
//		System.out.println("s2's length: " + s2.length()); // 12
		
		/* 3. Extracting characters from a string */
		
////		You can use the charAt method to extract a character from a specific position
////		in a string.
//		
//		String s = "Hello, world";
//		char lastCharacter = s.charAt(s.length() - 1);
//		System.out.println(lastCharacter); // -> d
		
		/* 4. Extracting substrings from a string */
		
//		The substring method lets you extract a portion of a string. This method has
//		two forms. The first version accepts a single parameter. It returns the 
//		substring that starts at the position indicated by this parameter and extends
//		to the rest of string.
		
//		String s = "baseball";
//		String b = s.substring(4); // "ball"
//		System.out.println(b);
		
//		The second version of the substring method accepts two parameters to indicate
//		the start and end of the substring you want to extract. Note that the substring
//		actually ends at the character immediately before the position indicated by the
//		second parameter. So, to extract the characters at position 2 through 5, specify
//		2 as the start position and 6 as the ending position.
		
//		String s = "baseball";
//		String b = s.substring(2, 6); // "seba"
//		System.out.println(b);
		
		/* 5. Splitting a string */
		
//		The split method is especially useful for splitting a string into separate strings
//		based on a delimiter character. 
		
//		Example: Suppose you have an a string with the parts of an address separated by
//		colons, like this:
//		1500 N. Third Street:Fresno:CA:93722
//		With the split method, you can easily separate this string into four strings.
//		In the process, the colons are discared.
		
//		String s = "1500 N. Third Street:Fresno:CA:93722";
//		String[] parts = s.split(":");
//		for (String p : parts)
//		{
//			System.out.println(p);
//		}
		
		/* 6. Replacing parts of a string */
		
//		You can use the replaceFirst or replaceAll method to replace a part of a string
//		that matches a pattern you supply with some other text.
		
		String s = "I love cats.";
		String originalString = s;
		s = s.replaceAll("cat", "dog");
		
		System.out.println(originalString);
		System.out.println(s);
//		I love cats.
//		I love dogs.
		
	}
}












































