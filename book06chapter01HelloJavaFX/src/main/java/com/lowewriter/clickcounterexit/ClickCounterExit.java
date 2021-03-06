package com.lowewriter.clickcounterexit;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class ClickCounterExit extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Stage stage;
  int iClickCount = 0;

  @Override
  public void start(Stage primaryStage)
  {
    stage = primaryStage;

//    Create the Click Me button
    Button btnClickMe = new Button("Click me please!");
    btnClickMe.setOnAction(e -> btnClickMe_Click());

//    Create the Close button
    Button btnClose = new Button("Close");
    btnClose.setOnAction(e -> btnClose_Click());

//    Add the buttons to a layout pane
    VBox pane = new VBox(10);
    pane.getChildren().addAll(btnClickMe, btnClose);
    pane.setAlignment(Pos.CENTER);

//    Add the layout pane to the scene
    Scene scene = new Scene(pane, 250, 150);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Click Counter Exit");
    primaryStage.setOnCloseRequest(e ->
    {
      e.consume();
      btnClose_Click();
    });
    primaryStage.show();
  }

  private void btnClickMe_Click()
  {
    Alert a = new Alert(Alert.AlertType.INFORMATION);
    iClickCount++;
    if (iClickCount == 1)
    {
      a.setContentText("You have clicked once.");
    }
    else
    {
      a.setContentText("You have clicked " + iClickCount + " times.");
    }
    a.show();
  }

  private void btnClose_Click()
  {
    Alert a = new Alert(Alert.AlertType.CONFIRMATION,
        "Are you sure you want to quit?",
        ButtonType.YES, ButtonType.NO);
    Optional<ButtonType> confirm = a.showAndWait();
    if (confirm.isPresent() && confirm.get() == ButtonType.YES)
    {
      System.out.println("Testing: Close something...");
      stage.close();
    }
  }
}
























