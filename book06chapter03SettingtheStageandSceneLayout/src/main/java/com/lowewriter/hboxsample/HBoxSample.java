package com.lowewriter.hboxsample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxSample extends Application
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

////    Create a HBox pane
//    HBox hbox = new HBox();
//    hbox.getChildren().addAll(btn1, btn2, btn3);

////    Use the setSpacing method
//    hbox.setSpacing(10);

////    Use the setPadding method
////    pane.setPadding(new Insets(10));
//    hbox.setPadding(new Insets(30, 10, 10, 20));

////    Call the setMargin method
////    for each node you want to add a margin to
////    HBox.setMargin(btn1, new Insets(10));
//    HBox.setMargin(btn1, new Insets(10, 30, 20, 10));

//    ---------------------------------------------------------

//    Note that margins, spacing, and padding can work together
    HBox hbox = new HBox();
    hbox.getChildren().addAll(btn1, btn2);
    hbox.setSpacing(10);
    hbox.setPadding(new Insets(10));
    HBox.setMargin(btn1, new Insets(5));
    HBox.setMargin(btn2, new Insets(5));


//    Add the pane to a scene
    Scene scene = new Scene(hbox, 300, 100);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("HBox pane");
    primaryStage.show();
  }
}




























