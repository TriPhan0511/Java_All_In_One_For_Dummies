package com.triphan.exercise03;

/**
 * Represents a book.
 * This class is a subclass of Document.
 * @version 1.0 2021-11-16
 * @author Tri Phan
 *
 */
public class Book extends Document 
{
//	Private fields
	private String authorName;
	private int pageNumber;
	
	/**
	 * Default constructor 
	 */
	public Book()
	{
		super();
		this.authorName = "Not known";
		this.pageNumber = 0;
	}
	
	/**
	 * A pameterized constructor
	 * @param publisherName The book's publisher's name.
	 * @param issueNumber The book's issue number.
	 * @param authorName The book's author's name.
	 * @param pageNumber The book's total of pages.
	 */
	public Book(String publisherName, int issueNumber, 
			String authorName, int pageNumber)
	{
		super(publisherName, issueNumber);
		this.authorName = authorName;
		this.pageNumber = pageNumber;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("\nBook Details:\n");
		builder.append(super.toString());
		builder.append("\nAuthor name: ");
		builder.append(this.authorName);
		builder.append(", Page Number: ");
		builder.append(this.pageNumber);
		builder.append(".");
		return builder.toString();
	}
}
