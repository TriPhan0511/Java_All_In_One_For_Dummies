package com.lowewriter.clickcounterexit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Optional;

public class ClickCounterExit extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

//  Class field
  Stage stage;

  @Override
  public void start(Stage primaryStage)
  {
    stage = primaryStage;
    Button btnClose = new Button("Close");
//    btnClose.setOnAction(e -> primaryStage.close());
    btnClose.setOnAction(e -> btnClose_Clicked());
    BorderPane pane = new BorderPane();
    pane.setRight(btnClose);
    Scene scene = new Scene(pane, 300, 200);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Click Counter Exit");
    primaryStage.show();
  }


  private void btnClose_Clicked()
  {
    Alert a = new Alert(Alert.AlertType.CONFIRMATION,
        "Are you sure you want to quit?",
        ButtonType.YES, ButtonType.NO);

    Optional<ButtonType> confirm = a.showAndWait();
    if (confirm.isPresent() &&confirm.get() == ButtonType.YES)
    {
      stage.close();
    }
  }
}



























