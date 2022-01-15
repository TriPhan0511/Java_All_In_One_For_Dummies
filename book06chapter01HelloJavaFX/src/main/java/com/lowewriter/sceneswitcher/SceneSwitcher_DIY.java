package com.lowewriter.sceneswitcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneSwitcher_DIY extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  Label display1;
  Label display2;
  Button btnIncrease;
  Button btnSwitch1;
  Button btnSwitch2;
  Button btnAdd;
  Button btnSubtract;
  int iCounter1 = 0;
  int iCounter2 = 0;

  @Override
  public void start(Stage primaryStage)
  {
//    Scene 1
    display1 = new Label("You have not clicked the button.");
    btnIncrease = new Button("Click me please!");
    btnSwitch1 = new Button("Switch!");
    VBox pane1 = new VBox(10);
    pane1.getChildren().addAll(display1, btnIncrease, btnSwitch1);
    Scene scene1 = new Scene(pane1, 500, 150);

//    Scene 2
    display2 = new Label(Integer.toString(iCounter2));
    btnAdd = new Button("Add");
    btnSubtract = new Button("Subtract");
    btnSwitch2 = new Button("Switch!");
    HBox pane2 = new HBox(10);
    pane2.getChildren().addAll(display2, btnAdd, btnSubtract, btnSwitch2);
    Scene scene2 = new Scene(pane2, 500, 75);

//    Add event listeners to the buttons
//    btnSwitch1.setOnAction(e -> primaryStage.setScene(scene2));
//    btnSwitch2.setOnAction(e -> primaryStage.setScene(scene1));

    btnSwitch1.setOnAction(e ->
    {
      primaryStage.setScene(scene2);
      iCounter2 = 0;
      display2.setText(Integer.toString(iCounter2));
    });
    btnSwitch2.setOnAction(e ->
    {
      primaryStage.setScene(scene1);
      iCounter1 = 0;
      display1.setText("You have not clicked the button.");
    });

    btnIncrease.setOnAction(e -> btnIncrease_Click());
    btnAdd.setOnAction((e -> btnAdd_Click()));
    btnSubtract.setOnAction(e -> btnSubtract_Click());

    primaryStage.setScene(scene1);
    primaryStage.setTitle("Scene Switcher");
    primaryStage.show();
  }

  private void btnIncrease_Click()
  {
    iCounter1++;
    if (iCounter1 == 1)
    {
      display1.setText("You clicked once.");
    }
    else
    {
      display1.setText("You clicked " + iCounter1 + " times.");
    }
  }

  private void btnAdd_Click()
  {
    iCounter2++;
    display2.setText(Integer.toString(iCounter2));
  }

  private void btnSubtract_Click()
  {
    iCounter2--;
    display2.setText(Integer.toString(iCounter2));
  }

//  Button btnSwitch;
//  @Override
//  public void start(Stage primaryStage)
//  {
////    Scene 1
//    display1 = new Label("You have not clicked the button.");
//    btnIncrease = new Button("Click me please!");
//    btnSwitch = new Button("Switch!");
//    VBox pane1 = new VBox(10);
//    pane1.getChildren().addAll(display1, btnIncrease, btnSwitch);
//    Scene scene1 = new Scene(pane1, 500, 150);
//
////    Scene 2
//    display2 = new Label(Integer.toString(iCounter2));
//    btnAdd = new Button("Add");
//    btnSubtract = new Button("Subtract");
//    HBox pane2 = new HBox(10);
//    pane2.getChildren().addAll(display2, btnAdd, btnSubtract, btnSwitch);
//    Scene scene2 = new Scene(pane2, 500, 75);
//
////    Add event listeners to the buttons
//    btnSwitch.setOnAction(e ->
//    {
//      if (primaryStage.getScene() == scene1)
//      {
//        primaryStage.setScene(scene2);
//      }
//      else
//      {
//        primaryStage.setScene(scene1);
//      }
//    });
//
//    primaryStage.setScene(scene1);
//    primaryStage.setTitle("Scene Switcher");
//    primaryStage.show();
//  }
//
//  private void btnSwitch_Click()
//  {
//
//  }
}







































