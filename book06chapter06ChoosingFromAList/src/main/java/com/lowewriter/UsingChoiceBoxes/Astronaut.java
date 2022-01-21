package com.lowewriter.UsingChoiceBoxes;

public class Astronaut
{
  private String firstName;
  private String lastName;

  public Astronaut(String firstNameIn, String lastNameIn)
  {
    firstName = firstNameIn;
    lastName = lastNameIn;
  }

  @Override
  public String toString()
  {
    return firstName + " " + lastName;
  }
}
