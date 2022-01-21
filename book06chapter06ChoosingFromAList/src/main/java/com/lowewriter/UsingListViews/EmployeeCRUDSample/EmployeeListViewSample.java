package com.lowewriter.UsingListViews.EmployeeCRUDSample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EmployeeListViewSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields
  private ListView<Employee> employeeListView;
  private TextField fullNameTextField;
//  Create an ObservableList type object,
//  which will be use as a data source of the employeeListView
  private final ObservableList<Employee> employeeItems =
      FXCollections.observableArrayList(getEmployeeArrayList());

  @Override
  public void start(Stage primaryStage)
  {
//    Create a label pane
    Label employeeLabel = new Label("Employees");
    employeeLabel.setFont(Font.font("Arial", 20));
    HBox labelPane = new HBox(10, employeeLabel);
    labelPane.setPadding(new Insets(10));

//    Create a Employee pane
    employeeListView = new ListView<>();
    employeeListView.setMinWidth(500);
    employeeListView.setItems(employeeItems);
    employeeListView.setOnMouseClicked(e -> employeeListView_Click());

    HBox employeePane = new HBox(10, employeeListView);
    employeePane.setPadding(new Insets(10));
    employeePane.setAlignment(Pos.CENTER);

//    Create the text field and buttons pane
    fullNameTextField = new TextField();
    fullNameTextField.setPromptText("Employee's full name");
    Button addButton = new Button("Add");
    addButton.setOnAction(e -> addButton_Click());
    Button updateButton = new Button("Update");
    updateButton.setOnAction(e -> updateButton_Click());
    Button deleteButton = new Button("Delete");
    deleteButton.setOnAction(e -> deleteButton_Click());
    Button clearButton = new Button("Clear");
    clearButton.setOnAction(e -> clearButton_Click());
    Button displayEmployeeItemsButton = new Button("Display The Employee Items");
    displayEmployeeItemsButton.setOnAction(e -> displayEmployeeItems_Click());
    HBox crudPane =
        new HBox(10, fullNameTextField, addButton,
            updateButton, deleteButton,
            clearButton, displayEmployeeItemsButton);
    crudPane.setPadding(new Insets(10));

//    Add the three panes to VBox pane
    VBox pane = new VBox(10, labelPane, employeePane, crudPane);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Employee List View Sample");
    primaryStage.show();
  }

  private void displayEmployeeItems_Click()
  {
    StringBuilder builder = new StringBuilder();
    if (employeeItems.size() == 0)
    {
      builder.append("\nNothing to show");
    }
    else
    {
      for (Employee item : employeeItems)
      {
        builder.append("\n");
        builder.append(item.toString());
      }
    }

    Alert a = new Alert(Alert.AlertType.INFORMATION, builder.toString());
    a.setTitle("The content of employeeItems");
    a.showAndWait();
  }

  private void clearButton_Click()
  {
    employeeItems.clear();
  }

  private void deleteButton_Click()
  {
    Employee selectedItem =
        employeeListView.getSelectionModel().getSelectedItem();
    employeeItems.remove(selectedItem);
  }

  private void updateButton_Click()
  {
    int selectedIndex = employeeListView.getSelectionModel().getSelectedIndex();
    employeeItems.remove(selectedIndex);
    employeeItems.add(selectedIndex, new Employee(fullNameTextField.getText()));
    fullNameTextField.setText("");
  }

  private void addButton_Click()
  {
    String fullName = fullNameTextField.getText().trim();
    if (fullName.length() != 0)
    {
      Employee employee = new Employee(fullName);
      employeeItems.add(employee);
    }
    fullNameTextField.setText("");
  }

  private void employeeListView_Click()
  {
    Employee employee =
        employeeListView.getSelectionModel().getSelectedItem();
    fullNameTextField.setText(employee.toString());
  }

//  Dummy data
  private ArrayList<Employee> getEmployeeArrayList()
  {
    ArrayList<Employee> list = new ArrayList<>();
    list.add(new Employee("Alex Ferguson"));
    list.add(new Employee("Brad Pitt"));
    list.add(new Employee("Hillary Duff"));
    list.add(new Employee("Michael Owen"));
    list.add(new Employee("Rose Mary Dickens"));
    return list;
  }
}


























