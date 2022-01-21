package com.lowewriter.UsingListViews.StaffSample;

public class Staff
{
  private int staffID;
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private boolean active;
  private Store store;
  private Staff manager = null;

  public Staff(){}

  public Staff(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getStaffID()
  {
    return staffID;
  }

  public String getFullName()
  {
    return firstName + " " + lastName;
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

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public boolean isActive()
  {
    return active;
  }

  public void setActive(boolean active)
  {
    this.active = active;
  }

  public Store getStore()
  {
    return store;
  }

  public void setStore(Store store)
  {
    this.store = store;
  }

  public Staff getManager()
  {
    return manager;
  }

  public void setManager(Staff manager)
  {
    this.manager = manager;
  }

  public String showMe()
  {
    if (manager != null)
    {
      return getFullName() + " - Managed by: " + manager.getFullName();
    }
    else
    {
      return getFullName() + " - Position: Manager";
    }
  }

  @Override
  public String toString()
  {
    return getFullName();
  }
}















