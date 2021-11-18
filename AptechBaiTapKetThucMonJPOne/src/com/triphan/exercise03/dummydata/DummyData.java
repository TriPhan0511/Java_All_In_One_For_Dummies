package com.triphan.exercise03.dummydata;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import com.triphan.exercise03.*;

public class DummyData 
{
	public static void addDocuments(ArrayList<Document> list)
	{
		addBooks(list);
		addMagazines(list);
		addNespapers(list);
	}
	
	public static void addBooks(ArrayList<Document> list)
	{
		list.add(new Book("Publisher 01", 11, "Author 01", 100));
		list.add(new Book("Publisher 02", 22, "Author 02", 200));
		list.add(new Book("Publisher 03", 33, "Author 03", 300));
		list.add(new Book("Publisher 04", 44, "Author 04", 400));
		list.add(new Book("Publisher 05", 55, "Author 05", 500));
	}
	
	public static void addMagazines(ArrayList<Document> list)
	{
		list.add(new Magazine("Publisher 06", 66, Month.JANUARY));
		list.add(new Magazine("Publisher 07", 77, Month.FEBRUARY));
		list.add(new Magazine("Publisher 08", 88, Month.MARCH));
		list.add(new Magazine("Publisher 09", 99, Month.OCTOBER));
		list.add(new Magazine("Publisher 10", 100, Month.DECEMBER));
	}
	public static void addNespapers(ArrayList<Document> list)
	{
		list.add(new Newspaper("Publisher 11", 101, LocalDate.parse("1984-11-05")));
		list.add(new Newspaper("Publisher 12", 102, LocalDate.parse("2000-12-24")));
		list.add(new Newspaper("Publisher 13", 103, LocalDate.of(2021, 05, 20)));
		list.add(new Newspaper("Publisher 14", 104, LocalDate.now()));
		list.add(new Newspaper("Publisher 15", 105, LocalDate.now()));
	}
}
