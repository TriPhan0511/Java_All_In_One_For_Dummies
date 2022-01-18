package com.lowewriter.flowpanelayoutsample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneLayoutSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create five buttons
    Button btn1 = new Button("Button One");
    Button btn2 = new Button("Button Two");
    Button btn3 = new Button("Button Three");
    Button btn4 = new Button("Button Four");
    Button btn5 = new Button("Button Five");

////    Create a horizontal FlowPane
//    FlowPane pane = new FlowPane();
//    pane.setOrientation(Orientation.HORIZONTAL);
//    pane.setHgap(10);
//    pane.setVgap(10);
//    pane.setPrefWrapLength(300);
//    pane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

//    -----------------------------------------------------------------

//    Create a vertical FLowPane
    FlowPane pane = new FlowPane(Orientation.VERTICAL,
        10, 10,
        btn1, btn2, btn3, btn4, btn5);
    pane.setPrefWrapLength(100);

//    Add the pane to a scene
    Scene scene = new Scene(pane);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("FlowPane Layout Sample");
    primaryStage.show();
  }
}




































