package com.lowewriter.addsubtractall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Using the lambda expression to handle events
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
  public void start(Stage primaryStage)
  {
    lbl = new Label(Integer.toString(iCounter));
    btnAdd = new Button("Add");
    btnAdd.setOnAction(e -> btnAdd_Click());
    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(e -> btnSubtract_Click());

    HBox pane = new HBox(10);
    pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
    Scene scene = new Scene(pane, 500, 75);
//    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Add/Subtract 4: Using the lambda expression");
    primaryStage.show();
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









































