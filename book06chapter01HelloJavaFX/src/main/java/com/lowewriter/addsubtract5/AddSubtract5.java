package com.lowewriter.addsubtract5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubtract5 extends Application
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
    btnAdd.setOnAction(e -> btnAdd_Click());
    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(e -> btnSubtract_Click());
    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
    Scene scene = new Scene(pane, 500, 75);
    stage.setScene(scene);
    stage.setTitle("Add/Subtract 5");
    stage.show();
  }

  private void btnAdd_Click()
  {
    iCounter++;
    lbl.setText(Integer.toString(iCounter));
  }

  private void btnSubtract_Click()
  {
    iCounter--;
    lbl.setText(Integer.toString(iCounter));
  }
}















































