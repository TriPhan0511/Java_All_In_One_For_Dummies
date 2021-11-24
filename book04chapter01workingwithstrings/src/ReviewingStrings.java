
public class ReviewingStrings 
{
	public static void main(String[] args) 
	{
//		String line1 = "Oh what a beautiful morning.";
//		String line2 = line1 + "\nOh what a beautiful day.";
//		line2 += "\nI've got a beautiful felling.";
//		System.out.println(line2);
		
//		int empCount = 50;
//		String msg = "Number of employees: " + empCount;
//		System.out.println(msg);
		
//		String s = "50";
//		int i = Integer.parseInt(s);
//		System.out.println(i + 1);

//		String lastName = "Lowe";
//		if (lastName.equalsIgnoreCase("lowe"))
//		{
//			System.out.println("This is me!");
//		}
		
//		String name = new String("Alex");
//		System.out.println(name);
		
//		-------------------------------------------------------------------
		
		/* int compareTo(String) and int compareToIgnoreCase(String) methods */
		
////		int compare = "a".compareTo("b"); // -1
////		int compare = "b".compareTo("b"); // 0
////		int compare = "c".compareTo("b"); // 1
////		int compare = "d".compareTo("b"); // 2
////		int compare = "D".compareTo("d"); // -32
//		
//		int compare = "d".compareToIgnoreCase("D"); // 0
//		
//		System.out.println(compare);
		
//		-------------------------------------------------------------------
		
		/* 
		 * boolean contains(CharSequence)
		 * 
		 *  Returns true is this string contains parameter value.
		 *  The parameter can be a String, StringBuilder, or StringBuffer.
		 */
		
////		if ("Hello".contains("h"))
//		if ("Hello".contains("H"))
//		{
//			System.out.println("Found it.");
//		}
//		else
//		{
//			System.out.println("Not found it.");
//		}
		
//		StringBuilder builder = new StringBuilder("o");
//		if ("hello".contains(builder))
//		{
//			System.out.println("Found it.");
//		}
//		else
//		{
//			System.out.println("Not found it.");
//		}
		
//		-------------------------------------------------------------------
		
		/* boolean endsWith(String) */
		
//		if ("hello".endsWith("llo"))
//		{
//			System.out.println("Yes.");
//		}
//		else
//		{
//			System.out.println("No.");
//		}
		
//		-------------------------------------------------------------------
		
		/*
		 * String indent(int)
		 */
		
//		String s = "Hello\nworld";
//		System.out.println(s);
//		
//		String s2 = s.indent(10);
//		System.out.println(s2);
		
//		-------------------------------------------------------------------
		
		/*
		 * int indexOf(char)
		 * 
		 *  Returns the index of the first occurence of the char parameter in
		 *  this string. Returns -1 if the character isn't in the string.
		 */
		
//		String s = "hello";
////		char c = 'l'; // 2
//		char c = 'z'; // -1
//		System.out.println(s.indexOf(c));
		
//		-------------------------------------------------------------------
		
		/*
		 * int indexOf(String)
		 *  Returns the index of the first occurence of the String parameter in
		 *  this string. Returns -1 if the string isn't in the string. 
		 */
		
//		System.out.println("hello".indexOf("h")); // 0
//		System.out.println("hello".indexOf("a")); // -1
		
//		-------------------------------------------------------------------
		
		/*
		 * boolean isBlank()
		 * 
		 * Returns true if the string is empty or contains only blanks.
		 * (Introduced in Java 11.)
		 */
		
//		if ("".isBlank())
//		{
//			System.out.println("yes, blank!");
//		}
		
//		if ("\t\n	".isBlank())
//		{
//			System.out.println("yes, blank!");
//		}
		
//		-------------------------------------------------------------------
		
		/*
		 * String repeat(int)
		 * 
		 * Returns a string that repeats the original string the indicated
		 * number of times.
		 * (Introduced in Java 11.)
		 */
		
//		String s = "aloha ";
//		String s2 = s.repeat(3);
//		System.out.println(s2); // aloha aloha aloha 
		
//		-------------------------------------------------------------------
		
		/*
		 * String replace(char, char)
		 * 
		 * Returns a new string that based on the original string, but with
		 * every occurrence of the first parameter replaced by the second parameter.
		 */
		
//		System.out.println("hello".replace('l', 'j')); // hejjo
		
//		-------------------------------------------------------------------
		
		/*
		 * String replaceAll(String old, String new)
		 * 
		 * Returns a new string that' based on the original string, but with
		 * every occurence of the first string replaced by the second parameter.
		 * Note that thet first parameter can be a regular expression.
		 */
		
//		System.out.println("hello".replaceAll("lo", "b")); // helb
//		System.out.println("hello".replaceAll("l", "j")); // hejjo
		
//		-------------------------------------------------------------------
		
		/*
		 * String replaceFirst(String old, String new)
		 * 
		 * Returns a new string that' based on the original string, but with
		 * the first occurence of the first string replaced by the second parameter.
		 * Note that thet first parameter can be a regular expression.
		 */
		
//		System.out.println("hello".replaceFirst("l", "j")); // hejlo
		
//		-------------------------------------------------------------------
		
		/*
		 * String[] split(String)
		 * 
		 * Splits the string into an array of strings, using the string paramter
		 * as a pattern to determine where to split the strings. The string 
		 * paramter must be a valid regex expression.
		 */
		
//		String s = "hello, world!";
//		String[] words = s.split(", ");
//		for (String word : words)
//		{
//			System.out.println(word);
//		}
////		-> hello
////		-> word!
		
//		-------------------------------------------------------------------
		
		/*
		 * boolean startsWith(String, int)
		 * 
		 * Returns true if this string contains the parameter string at the
		 * position indicated by the in parameter.
		 */
		
//		if ("hello, world!".startsWith("h", 1))
//		{
//			System.out.println("Yes");
//		}
//		else
//		{
//			System.out.println("No");
//		}
////		-> No
		
//		-------------------------------------------------------------------
		
		/*
		 * String strip()
		 * 
		 * Returns a copy of the string with all leading and trailing white
		 * spaces removed.
		 * (Introduced in Java 11.)
		 */
		
//		String s = "\tHello\t";
//		System.out.println(s);
////		->		Hello
//		System.out.println(s.strip());
////		->Hello
		
//		-------------------------------------------------------------------
		
		/*
		 * String stripLeading()
		 * 
		 * Returns a copy of the string with all leading white spaces removed.
		 * (Introduced in Java 11.)
		 */
		
//		-------------------------------------------------------------------
		
		/*
		 * String stripTrailing()
		 * 
		 * Returns a copy of the string with all trailing white spaces removed.
		 * (Introduced in Java 11.)
		 */
		
//		-------------------------------------------------------------------
		
		/*
		 * String substring(int)
		 * 
		 * Extracts a substring from this string, beginning at the position indicated
		 * by the int parameter and continuing to the end of the string.
		 */
		
//		String s = "My name's Alex.";
//		String s2 = s.substring(4);
//		System.out.println(s2); // -> ame's Alex.
		
//		-------------------------------------------------------------------
		
		/*
		 * String substring(int, int)
		 * 
		 * Extracts a substring from this string, beginning at the posistion
		 * indicated by the first parameter and ending at the position one
		 * character before the value of the second parameter.
		 */
		
//		String s = "My name's Alex.";
//		String s2 = s.substring(4, 8);
//		System.out.println(s2); // -> ame'
		
//		-------------------------------------------------------------------
		
		/*
		 * String valueOf(primitiveType)
		 * 
		 * A static method that returns a string representation of any
		 * primitive type.
		 */
		
		String s = String.valueOf(3.14);
		System.out.println(s + 1); // -> 3.141
	}
}








































