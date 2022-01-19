package com.lowewriter.UsingCheckBoxes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsingCheckBoxesSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields
  CheckBox chkPepperoni;
  CheckBox chkMushrooms;
  CheckBox chkAnchovies;

  @Override
  public void start(Stage primaryStage)
  {
//    Create Ask pane
    Label lblAsk = new Label("What kind of topping would you like?");
    HBox paneAsk = new HBox(10, lblAsk);
    paneAsk.setPadding(new Insets(10));
    paneAsk.setAlignment(Pos.CENTER);

//    Create Toppings pane
    chkPepperoni = new CheckBox("Pepperoni");
    chkMushrooms = new CheckBox("Mushrooms");
    chkAnchovies = new CheckBox("Anchovies");
//    chkAnchovies.setOnAction(e -> chkAnchovies_Click());
    HBox paneToppings = new HBox(20, chkPepperoni, chkMushrooms, chkAnchovies);
    paneToppings.setPadding(new Insets(10));

//    Create Button pane
    Button btnOK = new Button("OK");
    btnOK.setMinWidth(75);
    btnOK.setOnAction(e -> btnOK_Click());
    HBox paneButton = new HBox(10, btnOK);
    paneButton.setPadding(new Insets(10));
    paneButton.setAlignment(Pos.CENTER);

//    Add three panes to a VBox pane
    VBox pane = new VBox(10, paneAsk, paneToppings, paneButton);
    pane.setPadding(new Insets(10));


//    Set the stage
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Toppings");
    primaryStage.show();
  }

  private void btnOK_Click()
  {
    String msg = "";
    if (chkPepperoni.isSelected())
    {
      msg += "\nPepperoni";
    }
    if (chkMushrooms.isSelected())
    {
      msg += "\nMushrooms";
    }
    if (chkAnchovies.isSelected())
    {
      msg += "\nAnchovies";
    }
    if (msg.equals(""))
    {
      msg = "You didn't order any toppings.";
    }
    else
    {
      msg = "You ordered these toppings\n" + msg;
    }
    Alert a = new Alert(Alert.AlertType.INFORMATION, msg);
    a.setTitle("You Order");
    a.show();

//    Clear all check boxes
    chkPepperoni.setSelected(false);
    chkMushrooms.setSelected(false);
    chkAnchovies.setSelected(false);
  }

//  private void chkAnchovies_Click()
//  {
//    Alert a = new Alert(Alert.AlertType.INFORMATION, "We don't do anchovies here.");
//    a.setTitle("Yuck");
//    a.show();
//    chkAnchovies.setSelected(false);
//  }
}

































