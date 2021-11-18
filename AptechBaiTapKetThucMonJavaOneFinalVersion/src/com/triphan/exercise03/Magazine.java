package com.triphan.exercise03;

import java.time.*;

/**
 * Represents a magazine.
 * This class is a subclass of Document.
 * @version 1.0 2021-11-16
 * @author Tri Phan
 */
public class Magazine extends Document 
{
//	A private field
	private Month issueMonth;
	
	/**
	 * Default constructor.
	 */
	public Magazine()
	{
		super();
		this.issueMonth = LocalDate.now().getMonth();
	}
	
	/**
	 * A parameterized constructor.
	 * @param publisherName The magazine's publisher's name.
	 * @param issueNumber The magazine's issue number.
	 * @param issueMonth The month on which the magazine issue.
	 */
	public Magazine(String publisherName, int issueNumber, Month issueMonth)
	{
		super(publisherName, issueNumber);
		this.issueMonth = issueMonth;
	}
	
	/**
	 * Gets the month on which the magazine issue.
	 * @return The month on which the magazine issue.
	 */
	public Month getIssueMonth()
	{
		return this.issueMonth;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("\nMagazine Details:\n");
		builder.append(super.toString());
		builder.append("\nIssue Month: ");
		builder.append(this.issueMonth);
		builder.append(".");
		return builder.toString();
	}
}
