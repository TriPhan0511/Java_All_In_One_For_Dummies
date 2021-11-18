package com.triphan.exercise03;


/** Represents a document.
 * This is the superclass of Books, Magazines, Newspaper classes.
 * @version 1.0 2021-11-16
 * @author Tri Phan
 *
 */
public class Document 
{
//	A private static field
//	This field will be increment by one 
//	whenever an instance of Document is created.
	private static int id = 0;
	
//	Private instance fields
	private int documentID;
	private String publisherName;
	private int issueNumber;
	
	/**
	 * Default constructor
	 */
	public Document()
	{
		id++;
		this.documentID = id;
		this.publisherName = "Not known";
		this.issueNumber = 0;
	}
	
	/**
	 * A parameterized constructor.
	 * @param publisherName The document's publisher's name.
	 * @param issueNumber The document's issue number.
	 */
	public Document(String publisherName, int issueNumber)
	{
		id++;
		this.documentID = id;
		this.publisherName = publisherName;
		this.issueNumber = issueNumber;
	}
	
	/**
	 * Gets documnent's id.
	 * @return The document's id.
	 */
	public int getDocumentID()
	{
		return this.documentID;
	}

	/**
	 * Gets the document's publisher's name.
	 * @return The document's publisher's name.
	 */
	public String getPublisherName()
	{
		return this.publisherName;
	}
	
	/**
	 * Gets the document's issue number.
	 * @return The document's issue number.
	 */
	public int getIssueNumber()
	{
		return this.issueNumber;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("ID: ");
		builder.append(this.documentID);
		builder.append(", Publisher Name: ");
		builder.append(this.publisherName);
		builder.append(", Issue Number: ");
		builder.append(this.issueNumber);
		builder.append(".");
		return builder.toString();
	}
}











































