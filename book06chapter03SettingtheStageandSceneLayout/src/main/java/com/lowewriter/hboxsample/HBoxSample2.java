package com.lowewriter.hboxsample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 * This sample demonstrates adding space by growing nodes.
 */
public class HBoxSample2 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create buttons
    Button btn1 = new Button("Button One");
    Button btn2 = new Button("Button Two");
    Button btn3 = new Button("Button Three");

//    Create the spacer
    Region spacer = new Region();

//    Set the margin
    HBox.setMargin(btn1, new Insets(10));
    HBox.setMargin(btn2, new Insets(10));
    HBox.setMargin(btn3, new Insets(10));

//    Set the Hgrow for the spacer
    HBox.setHgrow(spacer, Priority.ALWAYS);

//    Create the HBox layout pane
    HBox hBox = new HBox(10, btn1, btn2, spacer, btn3);

//    Add the hBox pane to a scene
//    Scene scene = new Scene(hBox);
    Scene scene = new Scene(hBox, 500, 250);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Adding space by growing nodes");
    primaryStage.show();
  }
}





























