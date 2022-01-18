package com.lowewriter.samples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Making_Nodes_The_Same_Width extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    Button btn1 = new Button("Number One");
    Button btn2 = new Button("Two");
    Button btn3 = new Button("The Third Button");

//    Way 1:
//    btn1.setMaxWidth(Double.MAX_VALUE);
//    btn2.setMaxWidth(Double.MAX_VALUE);
//    btn3.setMaxWidth(Double.MAX_VALUE);

    VBox pane = new VBox();
    pane.setSpacing(10);
    pane.setPadding(new Insets(10));
    pane.setAlignment(Pos.CENTER);
    pane.setPrefWidth(120);

//    Way 2:
    btn1.setMinWidth(pane.getPrefWidth());
    btn2.setMinWidth(pane.getPrefWidth());
    btn3.setMinWidth(pane.getPrefWidth());

    pane.getChildren().addAll(btn1, btn2, btn3);

//    Finish and show the stage
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Making Nodes the Same Width");
    primaryStage.show();
  }
}























