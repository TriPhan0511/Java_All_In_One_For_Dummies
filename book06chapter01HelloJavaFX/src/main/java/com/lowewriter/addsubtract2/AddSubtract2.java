package com.lowewriter.addsubtract2;

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
  int iCounter = 0;

  @Override
  public void start(Stage stage) throws Exception
  {
//    Create a ClickHandler instance
    ClickHandler ch = new ClickHandler();

//    Create the label
    lbl = new Label(Integer.toString(iCounter));

//    Create the add button
    btnAdd = new Button("Add");
    btnAdd.setOnAction(ch);

//    Create the subtract button
    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(ch);

//    Create an HBox pane
    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

//    Add the layout pane to the scene
    Scene scene = new Scene(pane, 300, 75);

//    Add the scene to the stage, set the title
//    and show the stage
    stage.setScene(scene);
    stage.setTitle("Add/Subtract 2");
    stage.show();
  }

  private class ClickHandler implements EventHandler<ActionEvent>
  {
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
}



































