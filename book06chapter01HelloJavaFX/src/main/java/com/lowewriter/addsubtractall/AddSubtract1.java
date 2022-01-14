package com.lowewriter.addsubtractall;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Implementing the EventHandler interface
 */
public class AddSubtract1 extends Application
  implements EventHandler<ActionEvent>
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Label lbl;
  Button btnAdd;
  Button btnSubtract;
  int iCounter;

  @Override
  public void start(Stage stage)
  {
//    Create GUI components: one label and two buttons
    lbl = new Label(Integer.toString(iCounter));
    btnAdd = new Button("Add");
    btnSubtract = new Button("Subtract");

//    Add event handlers to the two buttons
    btnAdd.setOnAction(this);
    btnSubtract.setOnAction(this);

//    Add the labels and the buttons to a layout pane
    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

//    Add the pane to the scene
    Scene scene = new Scene(pane, 500, 75);

//    Add the scene to the stage, set the title
//    and show the stage
    stage.setScene(scene);
    stage.setTitle("Add/Subtract 1: Implementing the EventHandler interface");
    stage.show();
  }

  @Override
  public void handle(ActionEvent e)
  {
    if (e.getSource() == btnAdd)
    {
      iCounter++;
      lbl.setText(Integer.toString(iCounter));
    }
    if (e.getSource() == btnSubtract)
    {
      iCounter--;
      lbl.setText(Integer.toString(iCounter));
    }
  }
}
























