package com.lowewriter.addsubtract3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Handling Events with Anonymous Inner Classes
 */
public class AddSubtract3 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Label lbl;
  Button btnAdd;
  Button btnSubtract;
  int iCounter = 0;

  @Override
  public void start(Stage stage)
  {
//    Create the label
    lbl = new Label(Integer.toString(iCounter));

//    Create the add button
    btnAdd = new Button("Add");
    btnAdd.setOnAction(
        new EventHandler<ActionEvent>()
        {
          @Override
          public void handle(ActionEvent e)
          {
            iCounter++;
            lbl.setText(Integer.toString(iCounter));
          }
        });

//    Create the subtract button
    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(
        new EventHandler<ActionEvent>()
        {
          @Override
          public void handle(ActionEvent e)
          {
            iCounter--;
            lbl.setText(Integer.toString(iCounter));
          }
        });

//    Add the label and the buttons to a layout pane
    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

//    Add the layout pane to a scene
    Scene scene = new Scene(pane, 250, 75);

//    Add the scene to the stage, set the title
//    and show the stage
    stage.setScene(scene);
    stage.setTitle("Add/Subtract 3");
    stage.show();
  }
}






























