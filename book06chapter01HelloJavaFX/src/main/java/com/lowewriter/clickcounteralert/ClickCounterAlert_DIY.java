package com.lowewriter.clickcounteralert;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ClickCounterAlert_DIY extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Alert alert;
  Button btnClick;
  int iCounter;

  @Override
  public void start(Stage primaryStage)
  {
    alert = new Alert(Alert.AlertType.INFORMATION, "You have not clicked.");
    btnClick = new Button("Please click me!");
    btnClick.setOnAction(e -> btnClick_Click());
    HBox pane = new HBox();
    pane.getChildren().addAll(btnClick);
//    Scene scene = new Scene(pane, 200, 50);
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Click Counter");
    primaryStage.show();
    alert.showAndWait();
  }

  private void btnClick_Click()
  {
    iCounter++;
    if (iCounter == 1)
    {
      alert.setContentText("You have clicked once");
    }
    else
    {
      alert.setContentText("You have clicked " + iCounter + " times.");
    }
    alert.showAndWait();
  }
}




















