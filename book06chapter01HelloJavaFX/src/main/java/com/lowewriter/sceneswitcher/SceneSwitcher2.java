package com.lowewriter.sceneswitcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneSwitcher2 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields for Click-Counter scene
  Label lblClickCounterDisplay;
  Button btnClickCounter;
  Button btnSwitchToScene2;
  int iClickCounter;
  VBox pane1;
  Scene scene1;

  //  Class fields for Add-Subtract scene
  Label lblAddSubtractDisplay;
  Button btnAdd;
  Button btnSubtract;
  Button btnSwitchToScene1;
  int iCounter;
  HBox pane2;
  Scene scene2;

  //  Class field for stage
  Stage stage;

  @Override
  public void start(Stage primaryStage)
  {
//    Set reference for the stage variable to the primary stage
    stage = primaryStage;

//    Build the Click-Counter scene
    lblClickCounterDisplay = new Label("You have not clicked.");
    btnClickCounter = new Button("Click me please!");
    btnClickCounter.setOnAction(e -> btnClickCounter_Click());
    btnSwitchToScene2 = new Button("Switch");
    btnSwitchToScene2.setOnAction(e -> btnSwitchToScene2_Click());
    pane1 = new VBox(10);
    pane1.getChildren().addAll(lblClickCounterDisplay, btnClickCounter, btnSwitchToScene2);
    scene1 = new Scene(pane1, 300, 100);

//    Build the Add-Subtract scene
    lblAddSubtractDisplay = new Label(Integer.toString(iCounter));
    btnAdd = new Button("Add");
    btnAdd.setOnAction(e -> btnAdd_Click());
    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(e -> btnSubtract_Click());
    btnSwitchToScene1 = new Button("Switch");
    btnSwitchToScene1.setOnAction(e -> btnSwitchToScene1_Click());
    pane2 = new HBox(10);
    pane2.getChildren().addAll(lblAddSubtractDisplay, btnAdd, btnSubtract, btnSwitchToScene1);
    scene2 = new Scene(pane2, 300, 100);

//    Set the primary stage with scene 1 and show the primary stage
    primaryStage.setScene(scene1);
    primaryStage.setTitle("Scene Switcher");
    primaryStage.show();
  }

  private void btnClickCounter_Click()
  {
    iClickCounter++;
    if (iClickCounter == 1)
    {
      lblClickCounterDisplay.setText("You have clicked once.");
    }
    else
    {
      lblClickCounterDisplay.setText("You have " + iClickCounter + " times.");
    }
  }

  private void btnSwitchToScene2_Click()
  {
    stage.setScene(scene2);
  }

  private void btnAdd_Click()
  {
    iCounter++;
    lblAddSubtractDisplay.setText(Integer.toString(iCounter));
  }

  private void btnSubtract_Click()
  {
    iCounter--;
    lblAddSubtractDisplay.setText(Integer.toString(iCounter));
  }

  private void btnSwitchToScene1_Click()
  {
    stage.setScene(scene1);
  }
}


































