package com.triphan.exercise03;


/** Represents a document
 * This is the superclass of Books, Magazines, Newspaper classes.
 * @version 1.0 2021-11-16
 * @author Tri Phan
 *
 */
public class Document 
{
//	A private static field
	private static int id = 0;
	
//	Private instance fields
	private int documentID;
	private String publisherName;
	private int issueNumber;
	
//	Default constructor
	public Document()
	{
		id++;
		this.documentID = id;
		this.publisherName = "Not known";
		this.issueNumber = 0;
	}
	
//	Another constructor
	public Document(String publisherName, int issueNumber)
	{
		id++;
		this.documentID = id;
		this.publisherName = publisherName;
		this.issueNumber = issueNumber;
	}
	
//	Getters
	public int getDocumentID()
	{
		return this.documentID;
	}
	
	public String getPublisherName()
	{
		return this.publisherName;
	}
	
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











































