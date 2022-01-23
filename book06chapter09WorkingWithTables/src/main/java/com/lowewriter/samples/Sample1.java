package com.lowewriter.samples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Sample1 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    Label greetingLabel = new Label("Hello, world!");
    HBox pane = new HBox(10, greetingLabel);
    pane.setPadding(new Insets(20));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Sample 1");
    primaryStage.show();
  }
}
