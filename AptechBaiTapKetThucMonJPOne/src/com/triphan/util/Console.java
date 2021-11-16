package com.triphan.util;

import java.util.Scanner;

public class Console 
{
	public static int getInteger(Scanner sc, String prompt)
	{
		while (true)
		{
			System.out.print(prompt);
			try
			{
				return Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid interger. Try again.");
			}
		}
	}
}
