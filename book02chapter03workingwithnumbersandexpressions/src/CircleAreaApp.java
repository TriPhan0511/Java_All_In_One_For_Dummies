import java.util.Scanner;

/*
 * This program illustrates a typical use of the constant PI.
 * Here, the user is asked to enter the radius of a cirlce. 
 * Then the program calcialtes the area of the circle. 
 * 
 * */

public class CircleAreaApp 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the circle area calculator.");
		System.out.print("Enter the radius of your circle: ");
		double r = sc.nextDouble();
		double area = Math.PI * r * r;
		System.out.printf("The area is %.2f", area);
	}

}
