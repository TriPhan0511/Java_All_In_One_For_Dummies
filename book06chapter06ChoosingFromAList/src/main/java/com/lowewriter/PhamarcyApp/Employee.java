package com.lowewriter.PhamarcyApp;

public class Employee
{
  private String employeeID;
  private String firstName;
  private String lastName;
  private String gender;
  private String phoneNumber;
  private String email;
  private String address;
  private Employee supervisor;
  private Store store;

  public Employee(){}

  public Employee(String employeeID, String firstName, String lastName)
  {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Employee(String employeeID, String firstName, String lastName, String gender, String phoneNumber, String email, String address)
  {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.address = address;
  }

  public String getEmployeeID()
  {
    return employeeID;
  }

  public void setEmployeeID(String employeeID)
  {
    this.employeeID = employeeID;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getGender()
  {
    return gender;
  }

  public void setGender(String gender)
  {
    this.gender = gender;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public Employee getSupervisor()
  {
    return supervisor;
  }

  public void setSupervisor(Employee supervisor)
  {
    this.supervisor = supervisor;
  }

  public Store getStore()
  {
    return store;
  }

  public void setStore(Store store)
  {
    this.store = store;
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append(employeeID);
    builder.append(" - ");
    builder.append(firstName);
    builder.append(" ");
    builder.append(lastName);
    builder.append(" - Position: ");
    if (supervisor == null)
    {
      builder.append("Supervisor");
    } else
    {
      builder.append("Staff, managed by ");
      builder.append(supervisor.getFirstName());
      builder.append(" ");
      builder.append(supervisor.getLastName());
    }
    return builder.toString();
  }


//  @Override
//  public String toString()
//  {
//    StringBuilder builder = new StringBuilder();
//    builder.append("ID: ");
//    builder.append(employeeID);
//    builder.append(" - Full name: ");
//    builder.append(firstName);
//    builder.append(" ");
//    builder.append(lastName);
//    return builder.toString();
//  }
}






















