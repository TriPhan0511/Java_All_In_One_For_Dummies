package com.lowewriter.vboxsample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
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
//    Create buttons
    Button btn1 = new Button("Button One");
    Button btn2 = new Button("Button Two");
    Button btn3 = new Button("Button Three");

////    Create a VBox
//    VBox pane = new VBox();

////    Add the buttons to the pane
//    pane.getChildren().addAll(btn1, btn2, btn3);

////    Set spacing between the nodes
//    pane.setSpacing(20);

////    Set padding of the pane
//    pane.setPadding(new Insets(20));

////    Set margin for each node
//    VBox.setMargin(btn1, new Insets(20));
//    VBox.setMargin(btn2, new Insets(20, 20, 20, 50));
//    VBox.setMargin(btn3, new Insets(20, 20, 20, -20));
//    ------------------------------------------------------

//    Create a VBox
    VBox pane = new VBox();

//    Use a spacer node
    Region spacer = new Region();
    VBox.setVgrow(spacer, Priority.ALWAYS);

////    Set margin for each button
//    VBox.setMargin(btn1, new Insets(10));
//    VBox.setMargin(btn2, new Insets(10));
//    VBox.setMargin(btn3, new Insets(10));

//    Add the buttons and the spacer to the pane
    pane.getChildren().addAll(btn1, spacer, btn2, btn3);

//    Set the padding of the pane
    pane.setPadding(new Insets(10));

//    Set the spacing between the nodes
    pane.setSpacing(10);

//    Add the pane to a scene
    Scene scene = new Scene(pane, 350, 250);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("VBox Sample");
    primaryStage.show();
  }
}




































