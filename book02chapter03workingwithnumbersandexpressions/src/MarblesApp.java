import java.util.Scanner;

/* Dividing Integers */

/*
 * When you divide one integer into another, the result is always another integer.
 * Any remainder is simply discarded, and the answer is not rounded up.
 * 5 /4 gives the result 1, for example, and 3 / 4 gives the result 0.
 *  
 * If you want to know that 5 / 4 is actually 1.25 or that 3 / 4 is actually 0.75,  
 * you need to use floats or double instead of integers.
 * 
 * */

/*
 * If you need to lnow what the remainder is when you divide two integers, 
 * use the remainder operetor (%).
 * 
 * Suppose that you have a certain number of marbles to give away and a certain
 * number of children to give them to. The following program lets you enter the
 * number of marbles and the number of children. Then it calculates the number
 * of marbles to give to each child and the number of marbles you have left over. 	
 * 
 * 
 * */

public class MarblesApp 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
//		Get the input data
		System.out.print("Number of marbles: ");
		int numberOfMarbles = sc.nextInt();
		System.out.print("Number of children: ");
		int numberOfChildren = sc.nextInt();
		
//		Calculates the result
		int marblesPerChild = numberOfMarbles / numberOfChildren;
		int marblesLeftOver = numberOfMarbles % numberOfChildren;

//		Print the results
		System.out.printf("Give each child %d marbles.", marblesPerChild);
		System.out.printf("\nYou will have %d marbles left over.", marblesLeftOver);
	}
}


























