package com.triphan.exercise03;

import java.util.ArrayList;
import java.time.*;
import java.util.Scanner;
import com.triphan.util.Console;

/**
 * Exercise 03:
 * 	A book management application.
 * @version 1.0 2021-11-18
 * @author Tri Phan
 *
 */
public class BookManagement 
{
//	A BookManagement instance.
	private static BookManagement bm = new BookManagement();
//	An array list which is used to contain Book, Magazine, Newspaper instances.
	private static ArrayList<Document> bookShelf = new ArrayList<>();
//	A Scanner instance which is used to get user input from console.
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("\n===== Welcome to a book management application! =====");
		while (true)
		{
			System.out.println("\n            Main Menu            "
					+ "\n--------------------------------------------"
					+ "\nPress 1 to add new documnents."
					+ "\nPress 2 to delete a document by document code."
					+ "\nPress 3 to display about all of documents."
					+ "\nPress 4 to search documents by type."
					+ "\nPress any number key to exit program.");
			int choice = Console.getInteger(sc, "\nEnter your choice: ");
			switch (choice)
			{
			case 1:
			{
				bm.addADocument(bookShelf, sc);
				break;
			}
			case 2:
			{
				bm.deleteADocument(bookShelf, sc);
				break;
			}
			case 3:
			{
				bm.showAllDocuments(bookShelf);
				break;
			}
			case 4:
			{
				bm.searchDocumentsBasedOnType(bookShelf, sc);
				break;
			}
			default:
			{
				System.out.println("Goodbye. See you soon!");
				return;
			}
			}
		}
	}
	
	/**
	 * Adds a document to an array list.
	 * @param bookShelf An array list is used to contain documents.
	 * @param sc A Scanner is used to get user input.
	 */
	public void addADocument(ArrayList<Document> bookShelf, Scanner sc)
	{
		while (true)
		{
			System.out.print("\nWhat type of document"
					+ "\ndo you want to add to book shelf "
					+ "\n(b for book, m for magazine,\nn for newspaper, q for quiting) ? ");
			String type = sc.nextLine().toLowerCase();
			if (type.equals("b") || type.equals("m") || type.equals("n"))
			{
				System.out.println("\nEnter the details: ");
				Document document = getDocument(sc, type);
				bookShelf.add(document);
				System.out.println("A " + document.getClass().getSimpleName() + " added.");
			}
			else if (type.equals("q"))
			{
				break;
			}
			else
			{
				System.out.println("Wrong choice. Try again.");
			}
		}
	}
	
	/**
	 * Gets one of Document's subclass instances.
	 * @param sc A Scanner is used to get the details from user input.
	 * @param type A String represents one of Document's subclasses.
	 * @return An instance of Document's subclass.
	 */
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
	
	/**
	 * Shows all documents which are contained in an array list.
	 * @param bookShelf An array list which contains all of documents. 
	 */
	public void showAllDocuments(ArrayList<Document> bookShelf)
	{
		System.out.println("\n===== The information about all of documents =====");
		if (bookShelf.size() == 0)
		{
			System.out.println("\nNo document found!");
		}
		else
		{
			for (Document document : bookShelf)
			{
				System.out.println(document);
			}
		}
	}
	
	/**
	 * Searchs documents based on type.
	 * @param list The array list contains all of documents.
	 * @param sc A Scanner is used to get user input from console.
	 * @return true indicates found, otherwise, returns false.
	 */
	public boolean searchDocumentsBasedOnType(ArrayList<Document> list, Scanner sc)
	{
		while (true)
		{
			String type = Console.getString(sc, "\nEnter a document type you want to search"
					+ "\n(b for book, m for magazine, n for newspaper)? ");
			if (type.equalsIgnoreCase("b") 
					|| type.equalsIgnoreCase("m") 
					|| type.equalsIgnoreCase("n"))
			{
				return searchDocumentsBasedOnType(list, type);
			}
			else
			{
				System.out.println("Invalid type. Try again.");
			}
		}
	}
	
	/**
	 * Searchs documents based on type.
	 * @param list An array list contains documents.
	 * @param type A type of document.
	 * @return true indicates that there are documents whose specified type
	 * 				in the list, otherwise, returns false.
	 */
	public boolean searchDocumentsBasedOnType(ArrayList<Document> list, String type)
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
			System.out.printf("\n===== The information about all of %s(s) =====\n", type);
			for (Document document :  documents)
			{
				System.out.println(document);
			}
			return true;
		}
		else
		{
			System.out.printf("\nCan not find any %s.\n", type);
			return false;
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
				System.out.printf("\n*** The document which has id is %d was deleted.\n", id);
				return true;
			}
		}
		System.out.printf("\n*** Can not find the document whose id is %d in the list.\n", id);
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




















