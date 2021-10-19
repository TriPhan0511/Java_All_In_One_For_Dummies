
public class ThinkingInsideTheBox 
{

	public static void main(String[] args) 
	{
//		int x = 14;
//		Integer y = x;
//		System.out.println(y);
		
//		Integer a = 56;
//		int b = a;
//		System.out.println(a);
		
		/*
		 * You may thinking that you would have to explicitly cast values from a primitive type to
		 * the corresponding wrapper type, like this:
		 * 
		 * 		int x = 100;
		 * 		Integer y = (int) x;
		 * 
		 * Because of a feature called boxing, you don't have to do that. Boxing occurs when Java
		 * automatically converts a primitive value to its corresponding wrapped object, and unboxing
		 * occurs when Java goes the other way (convert from a wrapped object to the corresponding
		 * primitive value). You don't have to expplicitly cast the primitive value to its wrapper class,
		 * or vice versa.
		 * 
		 * */
		
		Integer wrap = 10;
		System.out.println(wrap); // -> 10
		int prim = wrap;
		System.out.println(prim); // -> 10
		
		/*
		 * Think of boxing and unboxing as nicknames for wrapping and unwrapping. The bottom line is, 
		 * Java can wrap and unwrap values automatically.
		 * 
		 * */
	}

}
























