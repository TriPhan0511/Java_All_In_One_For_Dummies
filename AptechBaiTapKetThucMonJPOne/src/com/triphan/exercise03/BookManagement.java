package com.triphan.exercise03;

import java.util.ArrayList;
import java.time.*;
import java.util.Scanner;
import com.triphan.util.Console;

import com.triphan.exercise03.dummydata.*;

public class BookManagement 
{
//	A BookManagement instance
	private static BookManagement bm = new BookManagement();
//	An array list which is used to contain Book, Magazine, Newspaper instances
	private static ArrayList<Document> bookShelf = new ArrayList<>();
//	A Scanner instance
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
////		Add some kinds of document into the book shelf.
//		bm.addADocument(bookShelf, sc);
		
//		Dummy data
		DummyData.addBooks(bookShelf);
//		DummyData.addDocuments(bookShelf);
		
//		Show all of the documents which are contained in the shelf.
//		bm.showAllDocuments();
		bm.showAllDocuments(bookShelf);
		
////		Delete a document based on its id
//		bm.deleteADocument(bookShelf, sc);
//		
//		System.out.println("\n\n=== After deleting ===");
//		bm.showAllDocuments();
		
//		Search documents by type: Book, magazine, and newspapaer.
		bm.showDocumentsBasedOnType(bookShelf, sc);
	}
	
	public boolean showDocumentsBasedOnType(ArrayList<Document> list, Scanner sc)
	{
		while (true)
		{
			String type = Console.getString(sc, "\nEnter a document type you want to search"
					+ "\n(b for book, m for magazine, n for newspaper)? ");
			if (type.equalsIgnoreCase("b") 
					|| type.equalsIgnoreCase("m") 
					|| type.equalsIgnoreCase("n"))
			{
				return showDocumentsBasedOnType(list, type);
			}
			else
			{
				System.out.println("Invalid type. Try again.");
			}
		}
	}
	
	/**
	 * Shows the documents whose specified type in the list.
	 * @param list An array list contains documents.
	 * @param type A type of document.
	 * @return true indicates that there are documents whose specified type
	 * 				in the list, otherwise, return false.
	 */
	public boolean showDocumentsBasedOnType(ArrayList<Document> list, String type)
	{
		System.out.println("\n===== Result of searching based on type =====");
		ArrayList<Document> documents = new ArrayList<>();
		if (type.equalsIgnoreCase("b"))
		{
			for (Document document : list)
			{
				if(document instanceof Book)
				{
					documents.add(document);
				}
			}
			type = "book";
		}
		else if (type.equalsIgnoreCase("m"))
		{
			for (Document document :  list)
			{
				if (document instanceof Magazine)
				{
					documents.add(document);
				}
			}
			type = "magazine";
		}
		else if (type.equalsIgnoreCase("n"))
		{
			for (Document document : list)
			{
				if (document instanceof Newspaper)
				{
					documents.add(document);
				}
			}
			type = "newspaper";
		}
		int size = documents.size();
		if (size != 0)
		{
			System.out.printf("\nFound %d %s(s). Details:\n", size, type);
			showAllDocuments(documents);
			return true;
		}
		else
		{
			System.out.printf("\nCan not find any %s.", type);
			return false;
		}
	}
	
//	Method: add a document into the shelf
	private void addADocument(ArrayList<Document> bookShelf, Scanner sc)
	{
		while (true)
		{
			System.out.print("\nWhat kind of document"
					+ "\ndo you want to add to book shelf "
					+ "\n(b for book, m for magazine,\nn for newspaper, q for quiting) ? ");
			String kind = sc.nextLine().toLowerCase();
			if (kind.equals("b") || kind.equals("m") || kind.equals("n"))
			{
				System.out.println("\nEnter the details: ");
				Document document = getDocument(sc, kind);
				bookShelf.add(document);
				System.out.println("A " + document.getClass().getSimpleName() + " added.");
			}
			else if (kind.equals("q"))
			{
				break;
			}
			else
			{
				System.out.println("Wrong choice. Try again.");
			}
		}
	}
	
//	Method: get one of Document's subclass instances
	private Document getDocument(Scanner sc, String type)
	{
		String publisherName = Console.getString(sc, "Publisher name? ");
		int issueNumber = Console.getInteger(sc, "Issue Number? ");
		if (type.equalsIgnoreCase("b"))
		{
			String authorName = Console.getString(sc, "Author name? ");
			int pageNumber = Console.getInteger(sc, "page number? ");
			return new Book(publisherName, issueNumber, authorName, pageNumber);
		}
		else if (type.equalsIgnoreCase("m"))
		{
			Month month = Console.getMonth(sc, "Issue month (1-12)? ");
			return new Magazine(publisherName, issueNumber, month);
		}
		else if (type.equalsIgnoreCase("n"))
		{
			LocalDate dateOfIssue = Console.getDate(sc, "Date of issue (yyyy-mm-dd)? ");
			return new Newspaper(publisherName, issueNumber, dateOfIssue);
		}
		else
		{
			return null;
		}
	}
	
//	Method: Shows all documents which are contained in the shelf
//	private void showAllDocuments()
	private void showAllDocuments(ArrayList<Document> bookShelf)
	{
		System.out.println("\n===== The information about all of documents =====");
		for (Document document : bookShelf)
		{
			System.out.println(document);
		}
	}
	
	/**
	 * Deletes a document based on its document id
	 * @param list The array list contains documents
	 * @param id The document's id.
	 * @return true indicates the document was deleted,
	 * 			false indicates a document whose id is not exist.
	 */
	public boolean deleteADocument(ArrayList<Document> list, int id)
	{
		for (Document document : list)
		{
			if (document.getDocumentID() == id)
			{
				list.remove(list.indexOf(document));
				System.out.printf("\n*** The document which has id is %d was deleted.", id);
				return true;
			}
		}
		System.out.printf("\n*** Can not find the document which id is %d in the list.", id);
		return false;
	}

	/**
	 * 
	 * Deletes a documenet based on an id which is enetered by user.
	 * @param list The array list contains documents.
	 * @param sc A Scanner used to get id from user input.
	 * @return true indicates the document was deleted,
	 * 			false indicates a document whose entered id is not exist.
	 */
	public boolean deleteADocument(ArrayList<Document> list, Scanner sc)
	{
		int id = Console.getInteger(sc, "\nEnter document's id you want to delete: ");
		return deleteADocument(list, id);
	}
}




















