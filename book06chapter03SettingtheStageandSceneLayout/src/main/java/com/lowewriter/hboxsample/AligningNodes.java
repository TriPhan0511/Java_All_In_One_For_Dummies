package com.lowewriter.hboxsample;

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
    Button btn3 = new Button("The third button");

//    Add the buttons to a VBox pane
    VBox pane = new VBox(10, btn1, btn2, btn3);

//    Set the padding for the pane
    pane.setPadding(new Insets(10));

//    Set alignment
//    pane.setAlignment(Pos.CENTER);
//      pane.setAlignment(Pos.TOP_RIGHT);
      pane.setAlignment(Pos.BOTTOM_RIGHT);

//    Add the pane to a scene
    Scene scene = new Scene(pane, 350, 250);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Aligning Nodes in a Layout Pane");
    primaryStage.show();
  }
}

































