import java.util.ArrayList;

public class Sample01 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(2);
		numbers.add(15);
		numbers.add(20);
		numbers.add(1);
		
//		Use a lambda expression in the ArrayList's forEach method
//		to print every item in the list		
		numbers.forEach( (num) -> { System.out.println(num); } );
	}
	

	
}
