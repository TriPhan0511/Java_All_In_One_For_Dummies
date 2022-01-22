package com.lowewriter.PhamarcyApp;

import java.util.ArrayList;

public class Tester
{
  public static void main(String[] args)
  {
    Store store = getStore();
    for (Employee item : store.getEmployeeList())
    {
      System.out.println(item);
    }
  }

//  A dummy store
//  (This store should be fetched from the database)
  private static Store getStore()
  {
    Store store =  new Store("store01", "The Better Life Pharmacy");
    Employee employee01 = new Employee("employee01", "Alex", "Ferguson");
    Employee employee02 = new Employee("employee02", "Brad", "Pitt");
    Employee employee03 = new Employee("employee03", "Rose", "Marry");
    Employee employee04 = new Employee("employee04", "Hillary", "Duff");
    Employee employee05 = new Employee("employee05", "Peter", "Pan");
    store.getEmployeeList().add(employee01);
    store.getEmployeeList().add(employee02);
    store.getEmployeeList().add(employee03);
    store.getEmployeeList().add(employee04);
    store.getEmployeeList().add(employee05);
    return store;
  }
}



















