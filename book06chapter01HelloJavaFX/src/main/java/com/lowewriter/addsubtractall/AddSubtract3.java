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
    lbl = new Label(Integer.toString(iCounter));
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
        }
    );
    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(
        new EventHandler<ActionEvent>()
        {
          @Override
          public void handle(ActionEvent event)
          {
            iCounter--;
            lbl.setText(Integer.toString(iCounter));
          }
        }
    );

    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

    Scene scene = new Scene(pane, 500, 75);
    stage.setScene(scene);
    stage.setTitle("Add/Subtract 3: Handling event using an anonymous class.");
    stage.show();
  }
}






































