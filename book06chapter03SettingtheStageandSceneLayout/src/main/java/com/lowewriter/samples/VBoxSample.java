package com.lowewriter.samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxSample extends Application
{
  public static void main(String[] args)
  {
    launch();
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create three buttons
    Button btn1 = new Button("Button One");
    Button btn2 = new Button("Button Two");
    Button btn3 = new Button("Button Three");

//    Add the buttons to a VBox pane
    VBox pane = new VBox(10);
    pane.getChildren().addAll(btn1, btn2, btn3);

//    Add the pane to a scene
    Scene scene = new Scene(pane);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("VBox");
    primaryStage.show();
  }
}


































