package com.lowewriter.UsingChoiceBoxes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class UsingChoiceBoxesSample_2 extends Application
{
  public static void main(String[] args)
  {
    launch();
  }

  //  Class fields
  Label favoriteLabel;

  @Override
  public void start(Stage primaryStage)
  {
//    Create an Astronaut array list
    ArrayList<Astronaut> astronautList = new ArrayList<>();
    astronautList.add(new Astronaut("Neil", "Amstrong"));
    astronautList.add(new Astronaut("Kevin", "Phillips"));
    astronautList.add(new Astronaut("David", "Cooperfield"));
    astronautList.add(new Astronaut("Hillary", "Clinton"));
    astronautList.add(new Astronaut("Abraham", "Lincohn"));

//    Create an Astronaut pane
    Label askLabel = new Label("Choose your favorite astronaut");
    ChoiceBox<Astronaut> astronautChoiceBox = new ChoiceBox<>();
    astronautChoiceBox.getItems().addAll(astronautList);
    astronautChoiceBox.setValue(astronautList.get(0));
    astronautChoiceBox.getSelectionModel().selectedItemProperty()
        .addListener((v, oldValue, newValue) -> favoriteLabel.setText(newValue.toString()));

    HBox astronautPane = new HBox(10, askLabel, astronautChoiceBox);
    astronautPane.setPadding(new Insets(10));

//    Create a display pane
    Label displayLabel = new Label("Your choice: ");
    favoriteLabel = new Label(astronautList.get(0).toString());
    HBox displayPane = new HBox(10, displayLabel, favoriteLabel);
    displayPane.setPadding(new Insets(10));

//    Add the two panes to a VBox pane
    VBox pane = new VBox(10, astronautPane, displayPane);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("A favorite astronaut");
    primaryStage.show();
  }
}





























