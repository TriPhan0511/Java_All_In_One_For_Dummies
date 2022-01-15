package com.lowewriter.sceneswitcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneSwitcher extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields for Click-Counter scene
  int iClickCount = 0;
  Label lblClicks;
  Button btnClickMe;
  Button btnSwitchToScene2;
  Scene scene1;

  //  Class fields for Add-Subtract scene
  int iCounter = 0;
  Label lblCounter;
  Button btnAdd;
  Button btnSubtract;
  Button btnSwitchToScene1;
  Scene scene2;

  //  Class field for stage
  Stage stage;

  @Override
  public void start(Stage primaryStage)
  {
    stage = primaryStage;

//    Build the Click-Counter scene
    lblClicks = new Label("You have not clicked the button.");
    btnClickMe = new Button("Click me please!");
    btnClickMe.setOnAction(e -> btnClickMe_Click());
    btnSwitchToScene2 = new Button("Switch!");
    btnSwitchToScene2.setOnAction(e -> btnSwitchToScene2_Click());
    VBox pane1 = new VBox(10);
    pane1.getChildren().addAll(lblClicks, btnClickMe, btnSwitchToScene2);
    scene1 = new Scene(pane1, 250, 150);

//    Build the Add-Subtract scene
    lblCounter = new Label(Integer.toString(iCounter));
    btnAdd = new Button("Add");
    btnAdd.setOnAction(e -> btnAdd_Click());
    btnSubtract = new Button("Subtract");
    btnSubtract.setOnAction(e -> btnSubtract_Click());
    btnSwitchToScene1 = new Button("Switch!");
    btnSwitchToScene1.setOnAction(e -> btnSwitchToScene1_Click());
    HBox pane2 = new HBox(10);
    pane2.getChildren().addAll(lblCounter, btnAdd, btnSubtract, btnSwitchToScene1);
    scene2 = new Scene(pane2, 300, 75);

//    Set the stage with scene1 and show the stage
    primaryStage.setScene(scene1);
    primaryStage.setTitle("Scene Switcher");
    primaryStage.show();
  }

//  Event handlers for scene 1
  private void btnClickMe_Click()
  {
    iClickCount++;
    if (iClickCount == 1)
    {
      lblClicks.setText("You have clicked once.");
    }
    else
    {
      lblClicks.setText("You have clicked " + iClickCount + " times.");
    }
  }

  private void btnSwitchToScene2_Click()
  {
    stage.setScene(scene2);
  }

//  Event handlers for scene 2
  private void btnAdd_Click()
  {
    iCounter++;
    lblCounter.setText(Integer.toString(iCounter));
  }

  private void btnSubtract_Click()
  {
    iCounter--;
    lblCounter.setText(Integer.toString(iCounter));
  }

  private void btnSwitchToScene1_Click()
  {
    stage.setScene(scene1);
  }
}








































