package book04chapter02usingarrays;

import java.util.Random;
import java.text.NumberFormat;

public class TwoDimensionalArraySample 
{
	public static void main(String[] args)
	{
//		double[][] sales = 
//			{
//					{ 609635.72, 224857.59, 452079.14, 986638.06 },
//					{ 648781.53, 390322.98, 972374.95, 627197.89 },
//					{ 846886.45, 977773.96, 146655.11, 772454.62 },
//					{ 286885.38, 859171.84, 26479.10, 797956.83 },
//					{ 606542.51, 529338.07, 837563.55, 711269.07 },
//			};
//		printSales(sales);
		
//		--------------------------------------------------------------------
		
//		Using jagged arrays
		String[][] teams =
			{
					{ "Henry Blake", "Johnny Mulcahy" },
					{ "Benjamin Pierce", "John McIntyre", "Johnathan Tuttle" },
					{ "Magaret Houlihan", "Frank Burns" },
					{ "Max Klinger", "Radar O'Reily", "Igor Straminsky" },
			};
		
//		char c = 'A';
//		System.out.printf("%s\t\t%s\n", "Team", "Members");
//		for (int i = 0; i < teams.length; i++)
//		{	
//			System.out.printf("%s\t\t", c);
//			for (int j = 0; j < teams[i].length; j++)
//			{
//				System.out.printf("%s, ", teams[i][j]);
//			}
//			c++;
//			System.out.println();
//		}
		
//		char c = 'A';
//		System.out.printf("%s\t\t%s\n", "Team", "Members");
//		for (String[] team : teams)
//		{
//			System.out.printf("%s\t\t", c);
//			for (String name : team)
//			{
//				System.out.printf("%s, ", name);
//			}
//			c++;
//			System.out.println();
//		}
		
//		--------------------------------------------------------------------
		
		for (String[] team : teams)
		{
			for (String player : team)
			{
				System.out.println(player);
			}
			System.out.println();
		}
	}
	
//	Prints sales
	private static void printSales(double[][] sales)
	{
		int year = 2016;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("\tNorth\t\tSouth\t\tEast\t\tWest");
		for (int y = 0; y < 5; y++)
		{
			System.out.printf("%d\t", year);
			for (int region = 0; region < 4; region++)
			{
				System.out.printf("%s\t", cf.format(sales[y][region]));
			}
			year++;
			System.out.println();
		}
	}
	
//	Gets a two-dimensional array of double
	private static double[][] getArray()
	{
		int row = 5;
		int col = 4;
		double[][] array = new double[row][col];
		for (int i = 0; i < row; i++)
		{
			for (int j= 0; j < col; j++)
			{
				array[i][j] = getRandomDouble(1.0, 1000000.0);
			}
		}
		return array;
	}
	
//	Get a random double
	public static double getRandomDouble(double low, double high)
	{
		return new Random().nextDouble() * (high - low) + low;
	}
}







































