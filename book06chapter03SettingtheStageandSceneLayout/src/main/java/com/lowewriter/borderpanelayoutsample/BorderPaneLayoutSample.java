package com.lowewriter.borderpanelayoutsample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneLayoutSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create three buttons
    Button btn1 = new Button("Button One");
    Button btn2 = new Button("Button Two");
    Button btn3 = new Button("Button Three");
//    Add the buttons to a VBox pane
    VBox vBox = new VBox(10, btn1, btn2, btn3);
    vBox.setAlignment(Pos.CENTER);

//    Create a BorderPane
    BorderPane pane = new BorderPane();
    pane.setCenter(vBox);

//    Add the pane to a scene
    Scene scene = new Scene(pane, 350, 250);
//    Scene scene = new Scene(pane);
//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("BorderPane layout");
    primaryStage.show();
  }
}


























