package com.lowewriter.UsingListViews.EmployeeCRUDSample;

public class Employee
{
  private String firstName;
  private String lastName;
  private int age;
  private double annualSalary;

  public Employee()
  {
    age = 18;
    annualSalary = 0.0;
  }

  public Employee(String fullName)
  {
    this();
    int spacePos = fullName.indexOf(" ");
    if (spacePos != -1)
    {
      String firstName = fullName.substring(0, spacePos);
      String lastName = fullName.substring(spacePos + 1);
      this.firstName = firstName;
      this.lastName = lastName;
    }
    else
    {
      this.firstName = fullName;
      this.lastName = "";
    }
  }

  public String getFullName()
  {
    return firstName + " " + lastName;
  }

  public void setFullName(String fullName)
  {
    int spacePos = fullName.indexOf(" ");
    if (spacePos != -1)
    {
      String firstName = fullName.substring(0, spacePos);
      String lastName = fullName.substring(spacePos + 1);
      this.firstName = firstName;
      this.lastName = lastName;
    }
    else
    {
      this.firstName = fullName;
      this.lastName = "";
    }
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public double getAnnualSalary()
  {
    return annualSalary;
  }

  public void setAnnualSalary(double annualSalary)
  {
    this.annualSalary = annualSalary;
  }

  @Override
  public String toString()
  {
    return getFullName();
  }
}



















