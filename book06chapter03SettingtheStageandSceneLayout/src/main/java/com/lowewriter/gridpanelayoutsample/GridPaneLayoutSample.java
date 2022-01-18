package com.lowewriter.gridpanelayoutsample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneLayoutSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    GridPane pane = new GridPane();
    pane.setPadding(new Insets(10));
    pane.setHgap(10);
    pane.setVgap(10);

    Label lblName = new Label("Name:");
    pane.add(lblName, 0, 0);
    TextField txtName = new TextField();
    pane.add(txtName,1,0);
//    pane.setColumnSpan(txtName, 2);
    GridPane.setColumnSpan(txtName, 2);

    Label lblPhone = new Label("Phone:");
    pane.add(lblPhone, 0,1);
    TextField txtPhone = new TextField();
    pane.add(txtPhone, 1, 1);
    GridPane.setColumnSpan(txtPhone,2);

    Label lblAddress = new Label("Address:");
    pane.add(lblAddress, 0, 2);
    TextField txtAddress = new TextField();
    pane.add(txtAddress, 1,2);
    GridPane.setColumnSpan(txtAddress,2);


//    Add the pane to a scene
    Scene scene = new Scene(pane);

//    Finish and show the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("GridPane Layout Sample");
    primaryStage.show();
  }
}

































