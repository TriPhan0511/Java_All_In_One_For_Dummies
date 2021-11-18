package com.triphan.exercise03;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Newspaper extends Document 
{
//	A private field
	private LocalDate dateOfIssue;
	
//	Default constructor
	public Newspaper()
	{
		super();
		this.dateOfIssue = LocalDate.now();
	}
	
//	Another constructor
	public Newspaper(String publisherName, int issueNumber, LocalDate dateOfIssue)
	{
		super(publisherName, issueNumber);
		this.dateOfIssue = dateOfIssue;
	}
	
//	Getter 
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



































