package com.lowewriter.UsingRadioButtons;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsingRadioButtonsSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Clas fields
  RadioButton rdoSmall;
  RadioButton rdoMedium;
  RadioButton rdoLarge;

  @Override
  public void start(Stage primaryStage)
  {
//    Create the Ask pane
    Label lblAsk = new Label("What kind of topping would you like?");
    HBox paneAsk = new HBox(10, lblAsk);
    paneAsk.setPadding(new Insets(10));
    paneAsk.setAlignment(Pos.CENTER);

//    Create the Options pane
    rdoSmall = new RadioButton("Small");
    rdoMedium = new RadioButton("Medium");
    rdoLarge = new RadioButton("Large");
    rdoLarge.setSelected(true);
    ToggleGroup groupOptions = new ToggleGroup();
    rdoSmall.setToggleGroup(groupOptions);
    rdoMedium.setToggleGroup(groupOptions);
    rdoLarge.setToggleGroup(groupOptions);
    HBox paneOption = new HBox(20, rdoSmall, rdoMedium, rdoLarge);
    paneOption.setPadding(new Insets(10));


//    Create the Button pane
    Button btnOK = new Button("OK");
    btnOK.setMinWidth(75);
    btnOK.setOnAction((e -> btnOK_Click()));
    HBox paneButton = new HBox(10, btnOK);
    paneButton.setPadding(new Insets(10));
    paneButton.setAlignment(Pos.CENTER);

//    Add the three panes to a VBox
    VBox pane = new VBox(10, paneAsk, paneOption, paneButton);
    pane.setPadding(new Insets(10));

//    Set the stage and show
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Size");
    primaryStage.show();
  }

  private void btnOK_Click()
  {
    String msg = "";
    if (rdoSmall.isSelected())
    {
      msg += "You chose the size " + rdoSmall.getText().toLowerCase();
    }
    if (rdoMedium.isSelected())
    {
      msg += "You chose the size " + rdoMedium.getText().toLowerCase();
    }
    if (rdoLarge.isSelected())
    {
      msg += "You chose the size " + rdoLarge.getText().toLowerCase();
    }

    Alert a = new Alert(Alert.AlertType.INFORMATION);
    a.setTitle("Your Choice");
    if (msg.equals(""))
    {
      a.setContentText("You don't choose any options.");
    }
    else
    {
      a.setContentText(msg);
    }
    a.show();
  }
}


































