package com.triphan.exercise03;

import java.time.*;

public class Magazine extends Document 
{
//	Private fields
	private Month issueMonth;
	
//	Default constructor
	public Magazine()
	{
		super();
		this.issueMonth = LocalDate.now().getMonth();
	}
	
//	Another constructor
	public Magazine(String publisherName, int issueNumber, Month issueMonth)
	{
		super(publisherName, issueNumber);
		this.issueMonth = issueMonth;
	}
	
//	Getter
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
