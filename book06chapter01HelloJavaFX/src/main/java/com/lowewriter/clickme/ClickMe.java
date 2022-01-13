package com.lowewriter.clickme;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickMe extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Button btn;

  @Override
  public void start(Stage stage) throws Exception
  {
//    Create the button
    btn = new Button();
    btn.setText("Click me please!");
    btn.setOnAction(e -> buttonClick());

//    Add the button to the layout pane
    BorderPane pane = new BorderPane();
    pane.setCenter(btn);

//    Add the layout pane to a scene
    Scene scene = new Scene(pane, 300, 250);

//    Finalize and show the stage
    stage.setScene(scene);
    stage.setTitle("The Click Me App");
    stage.show();
  }

  private void buttonClick()
  {
    if (btn.getText().equals("Click me please!"))
    {
      btn.setText("You clicked me!");
    }
    else
    {
      btn.setText("Click me please!");
    }
  }
}







































