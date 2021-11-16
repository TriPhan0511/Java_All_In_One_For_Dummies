package com.triphan.exercise03;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeSample 
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date); // -> 2021-11-15
		
		Month month = date.getMonth();
		System.out.println(month);
		
		System.out.println();
		System.out.println(date.getMonthValue());
	}
}
