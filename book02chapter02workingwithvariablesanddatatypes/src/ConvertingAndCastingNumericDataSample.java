
public class ConvertingAndCastingNumericDataSample 
{
	public static void main(String[] args) 
	{
		/* 1. Automatic conversions */
		
		/*
		 * Java can automatically convert some primitive types to others and do so whenever necessary.
		 * 
		 * Whenever you perform a mathematical operation on two values that aren't of the same type,
		 * Java automatically converts one of them to the type of the other. Here are the rules Java
		 * follows when doing this conversion:
		 * 
		 *   	_ If one of the values is a double, the other value is converted to a double.
		 *   
		 *   	_ If neither is a double but one is a float, the other is converted to a float.
		 *   
		 *   	_ If neither is a double nor a float but one is long, the other is converted to a long.	
		 *   
		 *   	_ If all else fails, both values are converted to int.
		 * 
		 * */
		
//		System.out.println(3.12 + 4); // -> 7.12
		
//		---------------------------------------------------------------------------------------------------------
		
		/* 2. Type casting */
		
		/*
		 * Casting is similar to conversion but isn't done automatically. You use casting to perform
		 * a conversion that is not done automatically by Java. If you want to convert a double to int,
		 * for example, you must use casting. 
		 * 
		 * When you use casting, you run the risk of losing information. A double can hold larger numbers
		 * than an int, for example. In addition, an int can't hold the fractional part of a double. As a
		 * result, if you cast a double to an int, you run the risk of losing data or accuracy, so 3.14 
		 * becomes 3, for example.
		 * 
		 * To cast a primitive value from one type to another, you use a cast operator, which is simply the
		 * name of a primitive type in parentheses placed before the value you want to cast. For example,
		 * 
		 * */
		
//		double pi = 3.14;
//		int iPi = (int) pi;
//		System.out.println(iPi); // -> 3
		
		/*
		 * Note that the fractional part of a double is simply discarded when cast to an integer; 
		 * it isn't rounded. For exmaple:
		 * 
		 * */
		
		double price = 9.99;
		int iPrice = (int) price;
		System.out.println(iPrice); // -> 9
	}

}
































