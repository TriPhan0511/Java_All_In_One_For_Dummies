package com.lowewriter.PhamarcyApp;

import java.time.LocalDate;
import java.util.ArrayList;

public class Store
{
  private String storeID;
  private String storeName;
  private String phoneNumber;
  private String email;
  private String address;
  private String zipCode;
  private Employee manager;
  private LocalDate managerStartDate;
  private ArrayList<Employee> employeeList = new ArrayList<>();

//  Default constructor
  public Store(){}

  //  A parameterized constructor
  public Store(String storeID, String storeName)
  {
    this.storeID = storeID;
    this.storeName = storeName;
  }

//  A parameterized constructor
  public Store(String storeID, String storeName, String phoneNumber,
               String email, String address, String zipCode)
  {
    this.storeID = storeID;
    this.storeName = storeName;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.address = address;
    this.zipCode = zipCode;
  }

//  Getters / Setters
  public String getStoreID()
  {
    return storeID;
  }

  public void setStoreID(String storeID)
  {
    this.storeID = storeID;
  }

  public String getStoreName()
  {
    return storeName;
  }

  public void setStoreName(String storeName)
  {
    this.storeName = storeName;
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

  public String getZipCode()
  {
    return zipCode;
  }

  public void setZipCode(String zipCode)
  {
    this.zipCode = zipCode;
  }

  public Employee getManager()
  {
    return manager;
  }

  public void setManager(Employee manager)
  {
    this.manager = manager;
  }

  public LocalDate getManagerStartDate()
  {
    return managerStartDate;
  }

  public void setManagerStartDate(LocalDate managerStartDate)
  {
    this.managerStartDate = managerStartDate;
  }

  public ArrayList<Employee> getEmployeeList()
  {
    return employeeList;
  }

  public void setEmployeeList(ArrayList<Employee> employeeList)
  {
    this.employeeList = employeeList;
  }

  /**
   * Helper method to find the index of a specified employee
   * @param employeeID A string representing an employee's id.
   * @return If found, return the index of the employee in the list,
   * otherwise, return -999.
   */
  private int search(String employeeID)
  {
    for (int i = 0; i < employeeList.size(); i++)
    {
      Employee tempEmployee = employeeList.get(i);
      if (tempEmployee.getEmployeeID().equals(employeeID))
      {
        return i;
      }
    }
    return -999;
  }

  /**
   * Get an Employee object from the list based on an employee id.
   * @param employeeID A string representing an employee's id.
   * @return Return a particular Employee object or null.
   */
  public Employee getEmployee(String employeeID)
  {
    int index = search(employeeID);
    if (index == -999)
    {
      return null;
    }
    return employeeList.get(index);
  }

  /**
   * Add an Employee object to the list.
   * @param employee An Employee object will be added to the list.
   * @return Return false if that employee existed in the list,
   * otherwise, add that employee to the list and return true.
   */
  public boolean addEmployee(Employee employee)
  {
    int index = search(employee.getEmployeeID());
    if (index != -999)
    {
      return false;
    }
    employeeList.add(employee);
    return true;
  }

  /**
   * Remove an Employee object from the list.
   * @param employee An employee object will be removed
   * @return Return false if that employee does not exist in the list,
   * otherwise, remove that object from the list and return true.
   */
  public boolean removeEmployee(Employee employee)
  {
    int index = search(employee.getEmployeeID());
    if (index == -999)
    {
      return false;
    }
    employeeList.remove(index);
    return true;
  }

  /**
   * Get total of the employees in the list.
   * @return An integer representing the total of them employee in the list.
   */
  public int getTotal()
  {
    return employeeList.size();
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("Store ID: ");
    builder.append(storeID);
    builder.append(" - Store name: ");
    builder.append(storeName);
    return builder.toString();
  }
}














