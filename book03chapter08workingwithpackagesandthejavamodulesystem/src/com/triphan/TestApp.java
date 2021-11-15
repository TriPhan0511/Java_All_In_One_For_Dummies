package com.triphan;

import java.util.Scanner;
import com.triphan.util.Utilities;

public class TestApp 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int number = Utilities.getInteger(sc, "Enter an integer: ");
		System.out.println("The number you entered " + number);
	}
}
