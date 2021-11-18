package com.triphan.exercise03;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Represents a newspaper.
 * This class is a subclass of Document.
 * @version 1.0 2021-11-16
 * @author Tri Phan
 *
 */
public class Newspaper extends Document 
{
//	A private field
	private LocalDate dateOfIssue;
	
	/**
	 * Default constructor.
	 */
	public Newspaper()
	{
		super();
		this.dateOfIssue = LocalDate.now();
	}
	
	/**
	 * A parameterized constructor.
	 * @param publisherName The newspaper's publisher's name.
	 * @param issueNumber The newspaper's issue number.
	 * @param dateOfIssue The date when the newspaper issue.
	 */
	public Newspaper(String publisherName, int issueNumber, LocalDate dateOfIssue)
	{
		super(publisherName, issueNumber);
		this.dateOfIssue = dateOfIssue;
	}
	
	/**
	 * Get the date when the newspaper issue.
	 * @return The date when the newspaper issue.
	 */
	public LocalDate getDateOfIssue()
	{
		return this.dateOfIssue;
	}
	
	@Override
	public String toString()
	{
		DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM d, YYYY");
		StringBuilder builder = new StringBuilder();
		builder.append("\nNewspaper Details:\n");
		builder.append(super.toString());
		builder.append("\nDate of issue: ");
		builder.append(this.dateOfIssue.format(fullFormat));
		builder.append(".");
		return builder.toString();
	}
}



































