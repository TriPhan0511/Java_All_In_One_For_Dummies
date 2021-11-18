package com.triphan.exercise03;

import java.util.Scanner;
import com.triphan.util.Console;
import java.util.ArrayList;

import java.time.LocalDate;
import java.time.Month;

public class TestApp 
{
	private static Scanner sc = new Scanner(System.in);
	private static TestApp testApp = new TestApp();
	
	public static void main(String[] args)
	{
		
//		String choice = "y";
//		while (!choice.equalsIgnoreCase("n"))
//		{
//			String prompt = "Issue month (1-12)? ";
//			Month m = Console.getMonth(sc, prompt);
//			System.out.println("The month you entered " + m);
//			choice = Console.getString(sc, "again? ");
//		}
		
		
//		String choice = "y";
//		while (!choice.equalsIgnoreCase("n"))
//		{
//			String prompt = "Date of issue (yyyy-mm-dd)? ";
////			Month m = Console.getMonth(sc, prompt);
//			LocalDate date = Console.getDate(sc, prompt);
//			System.out.println("The date you entered " + date);
//			choice = Console.getString(sc, "again? ");
//		}
		
//		ArrayList<String> list = new ArrayList<>(); 
//		list.add("Hello");
//		list.add("Bonjour");
//		list.add("Aloha");
//		list.add("Xin Chao");
//		
//		displayStrings(list);
//		
////		list.remove(1);
////		System.out.println("================================");
////		displayList(list);
//		
////		String searched = "hello";
////		String searched = "Bonjour";
//		String searched = "bonjour";
//		
//		for (int i = 0; i < list.size(); i++)
//		{
//			String s = list.get(i);
//			if (s.equalsIgnoreCase(searched))
//			{
//				System.out.println("Found at " + i);
//				list.remove(i);
//				System.out.println("Deleted.");
//				break;
//			}
//		}
//		
//		displayStrings(list);
		
		ArrayList<Document> list = new ArrayList<>();
		list.add(new Book("Publisher 01", 11, "Author 01", 100));
		list.add(new Book("Publisher 02", 22, "Author 02", 200));
		list.add(new Book("Publisher 03", 33, "Author 03", 300));
		list.add(new Book("Publisher 04", 44, "Author 04", 400));
		list.add(new Book("Publisher 05", 55, "Author 05", 500));
		
		displayDocuments(list);
		
		int id = 3;
		testApp.deleteADocument(list, id);
//		for (Document doc : list)
//		{
//			if (doc.getDocumentID() == id)
//			{
//				list.remove(list.indexOf(doc));
//				break;
//			}
//		}
		
		System.out.println("\n\n==== After deleting ====");
		displayDocuments(list);
	}
	
	public void deleteADocument(ArrayList<Document> list, int id)
	{
		for (Document doc : list)
		{
			if (doc.getDocumentID() == id)
			{
				list.remove(list.indexOf(doc));
				System.out.printf("\n*** The document which has id is %d was deleted.", id);
				break;
			}
		}
	}
	
	private static void displayStrings(ArrayList<String> list)
	{
		for (String s :  list)
		{
			System.out.println(s);
		}
	}
	
	private static void displayDocuments(ArrayList<Document> list)
	{
		for (Document doc :  list)
		{
			System.out.println(doc);
		}
	}
}






























