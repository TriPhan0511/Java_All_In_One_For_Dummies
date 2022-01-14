package com.lowewriter.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Tester extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    Button btnGoToScene2 = new Button("Go to scene 2");
    
    HBox pane1 = new HBox();
    pane1.getChildren().addAll(btnGoToScene2);
    Scene scene1 = new Scene(pane1, 200, 75);

    Button btnGoToScene1 = new Button("Go to scene 1");
    HBox pane2 = new HBox();
    pane2.getChildren().addAll(btnGoToScene1);
    Scene scene2 = new Scene(pane2, 350, 125);

    btnGoToScene2.setOnAction(e -> primaryStage.setScene(scene2));
    btnGoToScene1.setOnAction(e -> primaryStage.setScene(scene1));

    primaryStage.setScene(scene1);
    primaryStage.setTitle("Tester");
    primaryStage.show();
  }
}












































