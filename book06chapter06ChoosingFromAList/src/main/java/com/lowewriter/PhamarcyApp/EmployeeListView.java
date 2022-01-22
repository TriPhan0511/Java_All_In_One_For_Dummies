package com.lowewriter.PhamarcyApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class EmployeeListView extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields
  ListView<Employee> employeeListView;
  Store store = getStore();
  ObservableList<Employee> employeeObservableList
      = FXCollections.observableArrayList(store.getEmployeeList());


  @Override
  public void start(Stage primaryStage)
  {
//    Create the employeeListView and set data source for it
    employeeListView = new ListView<>();
    employeeListView.setItems(employeeObservableList);
    employeeListView.setMinWidth(400);

//    Add the employeeListView to a HBox pane
    HBox employeePane = new HBox(10, employeeListView);
    employeePane.setPadding(new Insets(20));

//    Finish
    Scene scene = new Scene(employeePane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Employees belong " + store.getStoreName());
    primaryStage.show();
  }

//  A dummy store
//  (This store should be fetched from the database)
  private Store getStore()
  {
//    Create some Employee instances
    Employee employee01 = new Employee("employee01", "Alex", "Ferguson");
    Employee employee02 = new Employee("employee02", "Brad", "Pitt");
    employee02.setSupervisor(employee01);
    Employee employee03 = new Employee("employee03", "Rose", "Marry");
    employee03.setSupervisor(employee01);
    Employee employee04 = new Employee("employee04", "Hillary", "Duff");
    employee04.setSupervisor(employee01);
    Employee employee05 = new Employee("employee05", "Peter", "Pan");
    employee05.setSupervisor(employee01);

//    Create a Store instance and add the Employee objects to this Store object
    Store store =  new Store("store01", "The Better Life Pharmacy");
    store.getEmployeeList().add(employee01);
    store.getEmployeeList().add(employee02);
    store.getEmployeeList().add(employee03);
    store.getEmployeeList().add(employee04);
    store.getEmployeeList().add(employee05);
    return store;
  }
}










































