/* Nested loop is simply a loop that is completely contained inside another loop */

/* Output:
	  
			 1-1 1-2 1-3 1-4 ... 1-9
			 2-1 2-2 2-3 2-4 ... 2-9
			 ...
			 9-1 9-2 9-3 9-4 ... 9-9

*/

public class NestedLoop 
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 10; i++)
		{
			for (int k = 1; k < 10; k++)
			{
				System.out.printf("%d-%d ", i, k);
			}
			System.out.println();
		}
	}
	
	
}

