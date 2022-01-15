package com.lowewriter.clickcounteralert;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounterAlert extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Button btn;
  Label lbl;
  int iClickCount = 0;

  @Override
  public void start(Stage primaryStage)
  {
//    Create the button
    btn = new Button("Click me please!");
    btn.setOnAction(e -> btn_Click());

//    Add the button to a layout pane
    BorderPane pane = new BorderPane();
    pane.setCenter(btn);

//    Add the layout pane to a scene
    Scene scene = new Scene(pane, 250, 150);

//    Add the scene to the stage, set the title
//    and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Click Counter");
    primaryStage.show();
  }

  private void btn_Click()
  {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    iClickCount++;
    if (iClickCount == 1)
    {
      alert.setContentText("You have clicked once.");
    }
    else
    {
      alert.setContentText("You have clicked " + iClickCount + " times.");
    }
//    alert.show();
    alert.showAndWait();
  }
}






















