package com.lowewriter.clickcounter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Button button;
  Label label;
  int counter = 0;

  @Override
  public void start(Stage primaryStage)
  {
//    Create the button
    button = new Button("Click me please!");
    button.setOnAction(e -> countClick());

//    Create the label
    label = new Label("You have not clicked the button.");

//    Add the label and the button to a layout pane
    BorderPane pane = new BorderPane();
    pane.setTop(label);
    pane.setCenter(button);

//    Add the layout pane to a scene
    Scene scene = new Scene(pane, 350, 250);

//    Add the scene to the stage, set the title
//    and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Click Counter");
    primaryStage.show();
  }

  private void countClick()
  {
    counter++;
    if (counter == 1)
    {
      label.setText("You have clicked once.");
    }
    else
    {
      label.setText("You have clicked " + counter +  " times.");
    }
  }
}






































