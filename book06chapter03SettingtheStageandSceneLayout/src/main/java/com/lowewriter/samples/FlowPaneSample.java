package com.lowewriter.samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create five buttons
    Button btn1 = new Button("Button One");
    Button btn2 = new Button("Button Two");
    Button btn3 = new Button("Button Three");
    Button btn4 = new Button("Button Four");
    Button btn5 = new Button("Button Five");

//    Create a FlowPane instance
    FlowPane pane = new FlowPane();
    pane.setHgap(10);
    pane.setVgap(10);
    pane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

//    Create a Scene
    Scene scene = new Scene(pane, 300, 100);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("FlowPane");
    primaryStage.show();
  }
}
































