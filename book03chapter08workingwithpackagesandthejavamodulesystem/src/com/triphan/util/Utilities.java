package com.triphan.util;

import java.util.Scanner;

public class Utilities 
{
	public static int getInteger(Scanner sc, String msg)
	{
		
		while (true)
		{
			System.out.print(msg);
			String s = sc.nextLine();
			try
			{
				return Integer.parseInt(s);
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid integer. Try again.");
			}
		}
	}
}
