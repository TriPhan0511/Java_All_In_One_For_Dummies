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
 * Handling Events with Inner Classes.
 */
public class AddSubtract2 extends Application
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
//    Create an instance of ClickHandler
    ClickHandler ch = new ClickHandler();

//    Create GUI components
    lbl = new Label(Integer.toString(iCounter));
    btnAdd = new Button("Add");
    btnSubtract = new Button("Subtract");

//    Add the event listener to the two buttons
    btnAdd.setOnAction(ch);
    btnSubtract.setOnAction(ch);

//    Add the label and the buttons to a layout pane
    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

//    Add the layout pane to a scene
    Scene scene = new Scene(pane, 500, 75);

//    Add the scene to the stage, set the title
//    and show the stage
    stage.setScene(scene);
    stage.setTitle("Add/Subtract 2: Handling event using an inner class");
    stage.show();
  }

  //  Declare an inner class
  private class ClickHandler implements EventHandler<ActionEvent>
  {
    @Override
    public void handle(ActionEvent e)
    {
      if (e.getSource() == btnAdd)
      {
        iCounter++;
      }
      if (e.getSource() == btnSubtract)
      {
        iCounter--;
      }
      lbl.setText(Integer.toString(iCounter));
    }
  }
}


























