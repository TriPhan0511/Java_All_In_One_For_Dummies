import java.util.ArrayList;
import java.util.List;

/* The program demonstrates Autoboxing and Autounboxing */

//public class AutoBoxingAndAutoUnBoxingSample 
//{
//	public static void main(String[] args) 
//	{
////		Example 1: Illustratre autoboxing
////		Here, we are creating a list of elements of Integer type.
////		Adding the int primitives type values by converting them into Integer wrapper objects
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < 0; i++) {
//			list.add(Integer.valueOf(i));
//		}
//	}
//
//}


//Example 2: Illustrate find sum of odd numbers using autoboxing and unboxing

/*
 * This program demonstrates autoboxing and unboxing to find sum of odd numbers in a list.
 * The important point in the program is that the remainder operator (%) and the unary plus
 * operator (+=) do not apply to the Integer objects. But the code is still compiled successfully
 * because the unboxing of Integer objects to primitive int values is taking place by invoking the
 * intValue() method at runtime.
 * 
 * */

public class AutoBoxingAndAutoUnBoxingSample
{
	public static void main(String[] args) 
	{
//		Create a list of Integer objects and add the int values to the list
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
		{
			list.add(i); // autoboxing
		}
		
//		Get sum of odd numbers in the list
		int sum = sumOfOddNumbers(list);
		System.out.println(sum);
		
	}
	
//	Method: sum of odd numbers (auto unboxing)
	public static int sumOfOddNumbers(List<Integer> list)
	{
		int sum = 0;
		for (Integer i : list) 
		{
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}
}

































