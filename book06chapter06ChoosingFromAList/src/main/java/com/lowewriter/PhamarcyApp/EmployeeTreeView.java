package com.lowewriter.PhamarcyApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EmployeeTreeView extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }
  //    Fetch a store
  Store store = getStore();
  //  Get all employees work at the store
  ArrayList<Employee> employeeArrayList = store.getEmployeeList();

  @Override
  public void start(Stage primaryStage)
  {
//    Create a tree root
    TreeItem<Employee> root = new TreeItem<>(new Employee());
    root.setExpanded(true);

//    Add nodes
    Employee supervisor;
    for (int i = 0; i < employeeArrayList.size(); i++)
    {
      Employee tempEmployee = employeeArrayList.get(i);
//      Check whether an employee is a supervisor.
//      If true, create a supervisor node and add it to the root.
//      Next, find all employees supervised by the supervisor,
//      then create nodes from the employees and add them to the supervisor node.
      if (tempEmployee.getSupervisor() == null)
      {
        supervisor = tempEmployee;
        TreeItem<Employee> supervisorTreeItem = makeShow(employeeArrayList.get(i), root);
        addStaffTreeItems(employeeArrayList, supervisor, supervisorTreeItem);
      }
    }

//    Create a tree
    TreeView<Employee> tree = new TreeView<>(root);
    tree.setShowRoot(false);
    tree.setMinWidth(500);

//    Add the tree to a HBox pane
    HBox pane = new HBox(10, tree);
    pane.setPadding(new Insets(20));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("An Employee Tree View Sample");
    primaryStage.show();
  }

  private void addStaffTreeItems(ArrayList<Employee> employeeArrayList,
             Employee supervisor, TreeItem<Employee> supervisorTreeItem)
  {
    for (Employee item : employeeArrayList)
    {
      if (item.getSupervisor() == supervisor)
      {
        makeShow(item, supervisorTreeItem);
      }
    }
  }

  //  Helper method
  private TreeItem<Employee> makeShow(Employee employee, TreeItem<Employee> parent)
  {
    TreeItem<Employee> show = new TreeItem<>(employee);
    show.setExpanded(true);
    parent.getChildren().addAll(show);
    return show;
  }

//  A dummy store
//  (This store should be fetched from the database)
  private Store getStore()
  {
//    Create some Employee instances
    Employee employee01 = new Employee("employee01", "Alex", "Ferguson");
    Employee employee02 = new Employee("employee02", "David", "Beckham");
    employee02.setSupervisor(employee01);
    Employee employee03 = new Employee("employee03", "Ryan", "Giggs");
    employee03.setSupervisor(employee01);
    Employee employee04 = new Employee("employee04", "Gary", "Neville");
    employee04.setSupervisor(employee01);
    Employee employee05 = new Employee("employee05", "Roy", "Keane");
    employee05.setSupervisor(employee01);

    Employee employee06 = new Employee("employee06", "Arsene", "Wenger");
    Employee employee07 = new Employee("employee07", "Thiery", "Henry");
    employee07.setSupervisor(employee06);
    Employee employee08 = new Employee("employee08", "Tony", "Adams");
    employee08.setSupervisor(employee06);
    Employee employee09 = new Employee("employee09", "Dennis", "Beckamp");
    employee09.setSupervisor(employee06);
    Employee employee10 = new Employee("employee10", "David", "Seaman");
    employee10.setSupervisor(employee06);

    Employee employee11 = new Employee("employee11", "Jose", "Mourinho");


//    Create a Store instance and add the Employee objects to this Store object
    Store store =  new Store("store01", "The Better Life Pharmacy");
    store.getEmployeeList().add(employee01);
    store.getEmployeeList().add(employee02);
    store.getEmployeeList().add(employee03);
    store.getEmployeeList().add(employee04);
    store.getEmployeeList().add(employee05);
    store.getEmployeeList().add(employee06);
    store.getEmployeeList().add(employee07);
    store.getEmployeeList().add(employee08);
    store.getEmployeeList().add(employee09);
    store.getEmployeeList().add(employee10);
    store.getEmployeeList().add(employee11);
    return store;
  }
}
