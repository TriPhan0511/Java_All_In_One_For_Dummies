package com.lowewriter.UsingListViews.ListViewCRUDSamples;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ListViewCRUDSample extends Application
{
  //  Data Object
  public static class Teacher
  {
    private final SimpleStringProperty name;

    private Teacher(String name)
    {
      this.name = new SimpleStringProperty(name);
    }

    public String getName()
    {
      return name.get();
    }

    public void setName(String mName)
    {
      name.set(mName);
    }

    @Override
    public String toString()
    {
      return getName();
    }
  }

  //  Data Source
  private final ObservableList<Teacher> teacherList =
      FXCollections.observableArrayList(
          new Teacher("Alex Ferguson"),
          new Teacher("Brad Pitt"),
          new Teacher("Rose Marry")
      );
  private int selectedIndex = -1;

  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields
  TextField nameTextField;
  ListView<Teacher> teacherListView;

  @Override
  public void start(Stage primaryStage)
  {
//    Create a label to display the string "Teachers"
    Label nameLabel = new Label("Teachers");
    nameLabel.setFont(Font.font("Arial", 20));

//    Create a ListView
    teacherListView = new ListView<>();
    teacherListView.setItems(teacherList);
    teacherListView.setOnMouseClicked(e -> teacherListView_Click());

//    Create buttons: Add, Update, Delete, and Clear
    Button addButton = new Button("Add");
    addButton.setOnAction(e -> addButton_Click());

    Button updateButton = new Button("Update");
    updateButton.setOnAction(e -> updateButton_Click());

    Button deleteButton = new Button("Delete");
    deleteButton.setOnAction(e -> deleteButton_Click());

    Button clearButton = new Button("Clear");
    clearButton.setOnAction(e -> clearButton_Click());

//    More: Create button PrintList
    Button printListButton = new Button("Print Observable Array List");
    printListButton.setOnAction(e -> printListButton_Click());

//    Create a Text Field named nameTextField
    nameTextField = new TextField();
    nameTextField.setPromptText("Name");

//    Add nameTextField, addButton, updateButton, deleteButton, clearButton
//    to a HBox pane
    HBox hBoxPane = new HBox(10, nameTextField, addButton, updateButton, deleteButton, clearButton);
    hBoxPane.setPadding(new Insets(10));

//    More: Add printListButton to the HBox pane
    hBoxPane.getChildren().add(printListButton);

//    Add nameLabel, teacherListView, hBoxPane to a VBox pane
    VBox vBoxPane = new VBox(10, nameLabel, teacherListView, hBoxPane);
    vBoxPane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(vBoxPane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("ListView - CRUD - Sample");
    primaryStage.show();
  }

//  More
  private void printListButton_Click()
  {
    StringBuilder builder = new StringBuilder();
    for (Teacher item : teacherList)
    {
      builder.append("\n");
      builder.append(item.toString());
    }
    Alert a = new Alert(Alert.AlertType.INFORMATION, builder.toString());
    a.setTitle("Teachers Information");
    a.showAndWait();
  }

  private void clearButton_Click()
  {
    teacherList.clear();
  }

  private void deleteButton_Click()
  {
    Teacher selectedItem = teacherListView.getSelectionModel().getSelectedItem();
    teacherList.remove(selectedItem);
  }

  private void updateButton_Click()
  {
    selectedIndex = teacherListView.getSelectionModel().getSelectedIndex();
    teacherList.remove(selectedIndex);
    teacherList.add(selectedIndex, new Teacher(nameTextField.getText()));
    nameTextField.clear();
  }

  private void addButton_Click()
  {
    if (nameTextField.getText().trim().length() != 0)
    {
      teacherList.add(new Teacher(nameTextField.getText()));
      nameTextField.clear();
    }
  }

  private void teacherListView_Click()
  {
    String selectedItem =
        teacherListView.getSelectionModel().getSelectedItem().toString();
    selectedIndex = teacherListView.getSelectionModel().getSelectedIndex();
    nameTextField.setText(selectedItem);
  }
}

































