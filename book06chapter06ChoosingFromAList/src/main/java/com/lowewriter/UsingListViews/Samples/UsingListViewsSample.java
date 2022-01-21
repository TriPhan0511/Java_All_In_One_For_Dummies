package com.lowewriter.UsingListViews.Samples;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsingListViewsSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class field
  ListView<String> list;

  @Override
  public void start(Stage primaryStage)
  {
//    Create the Pizza pane
    Label configureLabel = new Label("Configure your pizza:");
    list = new ListView<>();
    list.getItems().addAll("Sausage", "Pepperoni"
        , "Linguica", "Salame", "Olives", "Mushrooms"
        , "Onions", "Peppers", "Pineapple", "Spinach"
        , "Canadian Bacon", "Tomatoes", "Kiwi"
        , "Anchovies", "Gummy Bears");
//    Allow multiple selections
    list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//    Arrange the list view horizontally
//    list.setOrientation(Orientation.HORIZONTAL);

    HBox pizzaPane = new HBox(10, configureLabel, list);
    pizzaPane.setPadding(new Insets(10));
    pizzaPane.setMaxHeight(200);

//    Create the button pane
    Button displayButton = new Button("Show the toppings you choose");
    displayButton.setOnAction(e -> displayButton_Click());
    Button displayLastItemButton = new Button("Show the last chose topping");
    displayLastItemButton.setOnAction(e -> displayLastItemButton_Click());
    HBox buttonPane = new HBox(10, displayLastItemButton, displayButton);
    buttonPane.setPadding(new Insets(10));
    buttonPane.setAlignment(Pos.BOTTOM_RIGHT);

//    Add the components to a VBox pane
    VBox pane = new VBox(10, pizzaPane, buttonPane);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Configure Your Pizza");
    primaryStage.show();
  }

//  Use getSelectionModel().getSelectedItem()
  private void displayLastItemButton_Click()
  {
    String last = list.getSelectionModel().getSelectedItem();
    Alert a = new Alert(Alert.AlertType.INFORMATION, last);
    a.setTitle("Last Selected Item");
    a.showAndWait();
  }

//  Use getSelectionModel().getSelectedItems()
  private void displayButton_Click()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("Your chosen toppings:");
    ObservableList<String> toppings;
    toppings = list.getSelectionModel().getSelectedItems();
    if (toppings.size() == 0)
    {
      builder.append("\nNo toppings?");
    }
    else
    {
      for (String item : toppings)
      {
        builder.append("\n");
        builder.append(item);
      }
    }
    Alert a = new Alert(Alert.AlertType.INFORMATION, builder.toString());
    a.setTitle("Toppings");
    a.showAndWait();
  }
}




































