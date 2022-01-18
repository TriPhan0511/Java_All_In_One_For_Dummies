package com.lowewriter.hboxlayoutsample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class HBoxSample_DIY extends Application
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

//    Create a HBox pane
    HBox pane = new HBox();

////    Add the buttons to the pane
//    pane.getChildren().addAll(btn1, btn2, btn3);

////    Set spacing between nodes
//    pane.setSpacing(20);

////    Set padding of the pane
////    pane.setPadding(new Insets(20));
//    pane.setPadding(new Insets(20, 20, 20, 50));

////    Set margin for each node
//    HBox.setMargin(btn1, new Insets(20));
//    HBox.setMargin(btn2, new Insets(20));
//    HBox.setMargin(btn3, new Insets(50, 20, 20, 20));

//    Use a spacer node
    Region spacer = new Region();
    HBox.setHgrow(spacer, Priority.ALWAYS);

//    Add the buttons and the spacer node to the pane
    pane.getChildren().addAll(btn1, btn2, spacer, btn3);
    HBox.setMargin(btn1, new Insets(10, 30, 10, 10));
    HBox.setMargin(btn2, new Insets(10));
    HBox.setMargin(btn3, new Insets(10, 30, 10, 10));
//    Add the pane to a scene
    Scene scene = new Scene(pane, 350, 250);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("HBox Sample - DIY");
    primaryStage.show();
  }
}






























