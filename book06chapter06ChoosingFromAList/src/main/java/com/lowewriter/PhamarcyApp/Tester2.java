package com.lowewriter.PhamarcyApp;

public class Tester2
{
  public static void main(String[] args)
  {
    int count = 0;
    String manager = "";
    String prefix = "Manager";
    for (int i = 0; i < 5; i++)
    {
      count++;
      manager = prefix + String.valueOf(count);
      System.out.println(manager);
    }
  }
}
