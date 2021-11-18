package com.triphan.exercise03;

public class Book extends Document 
{
//	Private fields
	private String authorName;
	private int pageNumber;
	
//	Default constructor
	public Book()
	{
		super();
		this.authorName = "Not known";
		this.pageNumber = 0;
	}
	
//	Another constructor
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
