package com.lowewriter.clickcounteralert;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class AlertSample1 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Wanna go out?");
    Optional<ButtonType> r = alert.showAndWait();
    if (r.isPresent() && r.get() == ButtonType.OK)
    {
      Alert accept = new Alert(Alert.AlertType.WARNING, "Let's go!");
      accept.show();
    }
    else
    {
      Alert deny = new Alert(Alert.AlertType.ERROR, "Sorry for hearing that.");
      deny.show();
    }
  }
}

























