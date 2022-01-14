package com.lowewriter.addsubtract1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Implementing the EventHandler Interface.
 */
public class AddSubtract extends Application
  implements EventHandler<ActionEvent>
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Button btnAdd;
  Button btnSubtract;
  Label lbl;
  int iCounter = 0;

  @Override
  public void start(Stage stage)
  {
//    Create the Add button
    btnAdd = new Button("Add");
    btnAdd.setOnAction(this);

//    Create the Subtract button
    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(this);

//    Create the label
    lbl = new Label();
    lbl.setText(Integer.toString(iCounter));

//    Add the buttons and label to an HBox pane
    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

//    Add the layout pane to the scene
    Scene scene = new Scene(pane, 200, 75);

//    Add the scene to the stage, set the title
//    and show the stage
    stage.setScene(scene);
    stage.setTitle("Add/Sub");
    stage.show();
  }

  @Override
  public void handle(ActionEvent e)
  {
    if (e.getSource() == btnAdd)
    {
      iCounter++;
    } else if (e.getSource() == btnSubtract)
    {
      iCounter--;
    }
    lbl.setText(Integer.toString(iCounter));
  }

}




























