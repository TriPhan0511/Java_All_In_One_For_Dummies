
public class StringBuilderMethods 
{
	public static void main(String[] args) 
	{
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println(builder.toString());
//		builder.append(" Have a nice day.");
//		System.out.println(builder.toString());
//		System.out.println(builder.length());
//		System.out.println(builder.capacity());
//		builder.append("abcd");
//		System.out.println(builder.toString());
//		System.out.println(builder.length());
//		System.out.println(builder.capacity());
//		System.out.println(builder.length());
//		System.out.println(builder.capacity());
//		builder.append(56);
//		System.out.println(builder.toString());
		
//		StringBuilder builder2 = new StringBuilder(" Good day.");
//		builder.append(builder2);
//		System.out.println(builder.toString());
		
//		StringBuffer buffer = new StringBuffer(" Good morning");
//		System.out.println(buffer.toString());
//		builder.append(buffer);
//		System.out.println(builder.toString());
		
//		----------------------------------------------------------------------------
		
		/* char charAt(int) */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println(builder.charAt(builder.length() - 1)); // -> !
		
		/*
		 * delete(int, int)
		 * 
		 * Deletes characters starting with the first int and ending with 
		 * the character before the second
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println(builder.toString());
//		builder.delete(3, 7);
//		System.out.println(builder.toString()); // -> "Tods the day!"
		
		/*
		 * deleteCharAt(int)
		 * 
		 * Deletes the character at the specified position.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		builder.deleteCharAt(builder.length() - 1);
//		System.out.println(builder.toString()); // -> Today is the day
		
		/*
		 * ensureCapacity(int)
		 * 
		 * Ensures that the capacity of StringBuilder is at least equal to
		 * the int value; increases the capacity if necessary.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println(builder.length()); // 17
//		System.out.println(builder.capacity()); // 33
//		builder.ensureCapacity(100);
//		System.out.println(builder.capacity()); // 100
		
		/*
		 * int indexOf(String)
		 * 
		 * Returns the index of of the first occurrence of the specified string.
		 * If the string doesn't appear, returns -1;
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println(builder.indexOf("tomorrow")); // -1
//		System.out.println(builder.indexOf("day")); // 2
		
		/*
		 * int indexOf(String, int)
		 * 
		 * Returns the index of the first occurence of the specified string,
		 * starting the search at the specified index position. If the string
		 * doesn't appear, returns -1.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println(builder.indexOf("day", 3)); // 13
		
		/*
		 * int lastIndexOf(String)
		 * 
		 * Returns the index of the last occurence of the specified string.
		 * If the string doesn't appear, returns -1.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println(builder.lastIndexOf("day"));  // 13
		
		/*
		 * int lastIndexOf(String, int)
		 * 
		 * Returns the index of that last occurrence of the specified string,
		 * starting the search at the specified index position. If the string
		 * doesn't appear, returns -1.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println(builder.lastIndexOf("day", 14)); // -1
		
		/*
		 * insert(int, Object)
		 * 
		 * Calls the toString method of the Object parameter and then inserts
		 * the resulting string at the point specified by the int argument.
		 */
		
		/*
		 * insert(int, CharSequence)
		 * 
		 * Inserts the string at the specified by the int argument. The second
		 * parameter can be a String, StringBuilder, or StringBuffer.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		builder.insert(5, ", 2021-11-24,");
//		System.out.println(builder.toString());
////		-> Today, 2021-11-24, is the day!
		
		/*
		 * replace(int, int, String)
		 * 
		 * Replaces the substring indicated by the first two parameters with the
		 * string provided by the third parameter.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		builder.replace(9, builder.length(), "2021-11-24.");
//		System.out.println(builder.toString());
////		-> Today is 2021-11-24.
		
		/*
		 * reverse()
		 * 
		 * Reverses the order of characters.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		builder.reverse();
//		System.out.println(builder.toString());
////		-> !yad eht si yadoT
		
		/*
		 * setCharAt(int, char)
		 * 
		 * Sets the character at the specified position to the specified character.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		builder.setCharAt(builder.length() - 1, '.');
//		System.out.println(builder.toString());
////		-> Today is the day.
		
		/*
		 * setLength(int)
		 * 
		 * Sets the length of the string. If that length is less than the current
		 * length, the string is truncated; if it's greater than the current length,
		 * new characters - hexadecimal zeros - are added.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		System.out.println("Current length: " + builder.length());
//		builder.setLength(10);
//		System.out.println(builder.toString());
////		-> Today is t
		
		/*
		 * String substring(int)
		 * 
		 * Extracts a substring, beginning at the position indicated by the
		 * int paramter and continuing to the end of the string.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		String s = builder.substring(6);
//		System.out.println(s); // -> is the day!
		
		/*
		 * String substring(int, int)
		 * 
		 * Extracts a substring, beginning at the position indicated by the first
		 * parameter and ending at the position one character before the value of
		 * the second paramter.
		 */
		
//		StringBuilder builder = new StringBuilder("Today is the day!");
//		String s = builder.substring(0, 5);
//		System.out.println(s); // -> Today
		
		/*
		 * trimToSize()
		 * 
		 * Reduces the capacity of the StringBuilder to match the size of the string.
		 */
		
		StringBuilder builder = new StringBuilder("Today is the day!");
		System.out.println(builder.capacity()); // 33
		builder.trimToSize();
		System.out.println(builder.capacity()); // 17
				
	}
	
	
}

































