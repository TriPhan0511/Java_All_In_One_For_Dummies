package com.lowewriter.hboxlayoutsample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AligningNodes extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create buttons
    Button btn1 = new Button("Number One");
    Button btn2 = new Button("Two");
    Button btn3 = new Button("The Third Button");
//    Create a VBox pane
    VBox pane = new VBox();
//    Add the buttons to the pane
    pane.getChildren().addAll(btn1, btn2, btn3);
//    Set the padding for the pane
    pane.setPadding(new Insets(10));
//    Set the spacing between the nodes
    pane.setSpacing(10);

//    Align the nodes in the pane
    pane.setAlignment(Pos.CENTER);
//      pane.setAlignment(Pos.TOP_LEFT); // default
//    pane.setAlignment(Pos.TOP_CENTER);
//    pane.setAlignment(Pos.TOP_RIGHT);
//    pane.setAlignment(Pos.CENTER_RIGHT);
//    pane.setAlignment(Pos.BOTTOM_RIGHT);
//    pane.setAlignment(Pos.BASELINE_CENTER);

//    Add the pane to a scene
    Scene scene = new Scene(pane, 350, 250);
//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Aligning Nodes");
    primaryStage.show();
  }
}






































