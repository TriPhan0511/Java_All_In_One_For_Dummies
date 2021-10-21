
public class StringsComparingSample 
{
	public static void main(String[] args) 
	{
		/*
		 * Comparing strings in Java take a little extra care, because the == operator really doesn't
		 * work the way it should. Suppose that you want to know whether a String variable named answer
		 * contains the value "Yes". You may be tempted to code an if statement like this:
		 * 
		 * 		if (answer == "Yes")
		 * 		{
		 * 			System.out.println("The answer is Yes.");
		 * 		}
		 * 
		 * */
		
		/*
		 * Unfortunately, that's not correct. The problem is that:
		 * In Java, strings are reference types, not primitive types; when you use the == operator
		 * with reference types, Java compares the references to the objects, not the object themselves.
		 * As a result, the expression answer == "Yes" doesn't test whether the value of the string
		 * referenced by the answer variable is "Yes". Instead, it tests whether the answer string
		 * and the string "Yes" point to the same string object in the memory. In many cases, 
		 * they do - but sometimes they don't, and the results are difficult to predict.
		 * 
		 * */
		
		/*
		 * The correct way to test a string for a given value is to use the equals method of the
		 * String class:
		 *
		  		String answer = "Yes";
				if (answer.equals("Yes")) 
				{
					System.out.println("The answer is Yes.");
				}
		 * 
		 * This method actually compares the value of the string object referenced by the variable
		 * with the string you pass as a parameter and returns a Boolean result to indicate whether
		 * the strings have the same value.
		 * 
		 * */
		
		/*
		 * The String class has another method, equalsIgnoreCase, that's also useful for comparing
		 * strings. It compares strings but ignores cases, which is especially useful when you're 
		 * testing string values entered by users.
		 * 
		 * */
		
		String input = "EnD";
		if (input.equalsIgnoreCase("end")) {
			System.out.println("The program will be terminated");
		}
	}

}


























