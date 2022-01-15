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

public class ClickCounterExit_DIY extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Stage stage;
  int iClickCounter;

  @Override
  public void start(Stage primaryStage)
  {
    stage = primaryStage;

//    Create the Click button
    Button btnClick = new Button("Click me please!");
    btnClick.setOnAction(e -> btnClick_Click());

//    Create the Close button
    Button btnClose = new Button("Close");
    btnClose.setOnAction(e -> btnClose_Click());

//    Add the buttons to a layout pane
    VBox pane = new VBox(10);
    pane.getChildren().addAll(btnClick, btnClose);
    pane.setAlignment(Pos.CENTER);

//    Add the layout pane to a scene
    Scene scene = new Scene(pane, 250, 150);

//    Finish and show the stage
    primaryStage.setOnCloseRequest(e ->
    {
      e.consume();
      btnClose_Click();
    });
    primaryStage.setScene(scene);
    primaryStage.setTitle("Click Counter Exit - DIY");
    primaryStage.show();
  }

  private void btnClick_Click()
  {
    Alert a = new Alert(Alert.AlertType.INFORMATION);
    iClickCounter++;
    if (iClickCounter == 1)
    {
      a.setContentText("You have clicked once");
    }
    else
    {
      a.setContentText("You have clicked " + iClickCounter + " times.");
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
      System.out.println("Testing: Close something, such as database connection...");
      stage.close();
    }
  }
}






























