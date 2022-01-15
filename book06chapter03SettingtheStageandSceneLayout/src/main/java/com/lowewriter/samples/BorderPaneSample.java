package com.lowewriter.samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create five buttons and five panes
    Button btnTop = new Button("Top1");
    HBox topPane = new HBox();
    topPane.getChildren().addAll(btnTop);

    Button btnRight = new Button("Right");
    VBox rightPane = new VBox();
    rightPane.getChildren().addAll(btnRight);

    Button btnBottom = new Button("Bottom");
    HBox bottomPane = new HBox();
    bottomPane.getChildren().addAll(btnBottom);

    Button btnLeft = new Button("Left");
    VBox leftPane = new VBox();
    leftPane.getChildren().addAll(btnLeft);

    Button btnCenter = new Button("Center");
    VBox centerPane = new VBox();
    centerPane.getChildren().addAll(btnCenter);

//    Create a BorderPane instance
    BorderPane pane = new BorderPane();
    pane.setTop(topPane);
    pane.setRight(rightPane);
    pane.setBottom(bottomPane);
    pane.setLeft(leftPane);
    pane.setCenter(centerPane);

//    Add the pane to a scene
    Scene scene = new Scene(pane);
//    Scene scene = new Scene(pane, 250, 150);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Border Pane");
    primaryStage.show();
  }
}






























