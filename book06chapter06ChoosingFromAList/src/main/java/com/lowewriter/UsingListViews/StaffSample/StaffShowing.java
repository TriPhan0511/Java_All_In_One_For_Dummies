package com.lowewriter.UsingListViews.StaffSample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class StaffShowing extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class field
  ListView<Staff> staffListView;

  @Override
  public void start(Stage primaryStage)
  {
//    Create the Staff pane
    Label staffLabel = new Label("Choose some staffs");
    staffListView = new ListView<>();
    staffListView.getItems().addAll(getStaffList());
    staffListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    HBox staffPane = new HBox(10, staffLabel, staffListView);
    staffPane.setPadding(new Insets(10));
    staffPane.setMaxHeight(210);

//    Create the button pane
    Button showButton = new Button("Show the information");
    showButton.setOnAction(e -> showButton_Click());

    Button changeListButton = new Button("Change to a new list of staffs");
    changeListButton.setOnAction(e -> changeListButton_Click());

    HBox buttonPane = new HBox(10, changeListButton, showButton);
    buttonPane.setPadding(new Insets(10));
    buttonPane.setAlignment(Pos.BOTTOM_RIGHT);

//    Add the panes to a VBox pane
    VBox pane = new VBox(10, staffPane, buttonPane);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Staff");
    primaryStage.show();
  }

  private void changeListButton_Click()
  {
//    Get the reference to the ObservableList of items of the staffListView
    ObservableList<Staff> list = staffListView.getItems();
//    Clear the content
    list.clear();
//    Add new items
    list.addAll(getStaffList_2());
  }

  private void showButton_Click()
  {
    ObservableList<Staff> list =
        staffListView.getSelectionModel().getSelectedItems();
    StringBuilder builder = new StringBuilder();
    if (list.size() == 0)
    {
      builder.append("You should choose some staffs to see their information.");
    }
    else
    {
      for (Staff item : list)
      {
        builder.append("\n");
        builder.append(item.showMe());
      }
    }
    Alert a = new Alert(Alert.AlertType.INFORMATION, builder.toString());
    a.setTitle("The Information of the Staffs");
    a.showAndWait();
  }

//  Create an array list of Staff instances 2
  private ArrayList<Staff> getStaffList_2()
  {
    ArrayList<Staff> list = new ArrayList<>();
    Staff betty = new Staff("Betty", "Vote");
    Staff staff1 = new Staff("Kelly", "Johnson");
    staff1.setManager(betty);
    Staff staff2 = new Staff("Jenifer", "Lopez");
    staff2.setManager(betty);
    Staff staff3 = new Staff("Linda", "Houston");
    staff3.setManager(betty);
    Staff staff4 = new Staff("Vitoria", "Beck");
    staff4.setManager(betty);
    Staff staff5 = new Staff("Diana", "Princess");
    staff5.setManager(betty);
    list.add(staff1);
    list.add(staff2);
    list.add(staff3);
    list.add(staff4);
    list.add(staff5);

    return list;
  }

//  Create an array list of Staff instances
  private ArrayList<Staff> getStaffList()
  {
//    Dummy data
//    Create an array list to contain all Staff instances
    ArrayList<Staff> list = new ArrayList<>();

//    Create two managers
    Staff alex = new Staff("Alex", "Ferguson");
    Staff wenger = new Staff("Mr.", "Wenger");

//    Create some "normal" staffs
    Staff staff1 = new Staff("Brad", "Pitt");
    staff1.setManager(alex);

    Staff staff2 = new Staff("Hillary", "Duff");
    staff2.setManager(alex);
    Staff staff3 = new Staff("Rose", "Mary");
    staff3.setManager(alex);
    Staff staff4 = new Staff("Peter", "Pan");
    staff4.setManager(alex);
    Staff staff5 = new Staff("Chris", "Wolf");
    staff5.setManager(alex);
    Staff staff6 = new Staff("Hillary", "Clinton");
    staff6.setManager(wenger);
    Staff staff7 = new Staff("David", "Beckham");
    staff7.setManager(wenger);
    Staff staff8 = new Staff("Michael", "Owen");
    staff8.setManager(wenger);
    Staff staff9 = new Staff("Ryan", "Giggs");
    staff9.setManager(wenger);
    Staff staff10 = new Staff("Dwight", "Yorke");
    staff10.setManager(wenger);


//    Add all Staff instances to the array list
    list.add(alex);
    list.add(wenger);
    list.add(staff1);
    list.add(staff2);
    list.add(staff3);
    list.add(staff4);
    list.add(staff5);
    list.add(staff6);
    list.add(staff7);
    list.add(staff8);
    list.add(staff9);
    list.add(staff10);

    return list;
  }
}





























