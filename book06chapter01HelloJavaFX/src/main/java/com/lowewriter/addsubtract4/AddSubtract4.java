package com.lowewriter.addsubtract4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Using Lambda Expressions to Handle Events
 */
public class AddSubtract4 extends Application
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
    btnAdd.setOnAction(e ->
    {
      iCounter++;
      lbl.setText(Integer.toString(iCounter));
    });

    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(e ->
    {
      iCounter--;
      lbl.setText(Integer.toString(iCounter));
    });

    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
    Scene scene = new Scene(pane, 500, 75);
    stage.setScene(scene);
    stage.setTitle("Add/Subtract 3: Using Lambda Expressions to Handle Events");
    stage.show();
  }
}












































