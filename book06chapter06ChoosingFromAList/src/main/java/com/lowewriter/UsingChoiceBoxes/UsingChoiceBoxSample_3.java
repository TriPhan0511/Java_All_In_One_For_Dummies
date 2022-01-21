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

public class UsingChoiceBoxSample_3 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create an array list of astronauts
    ArrayList<Astronaut> astronauts = new ArrayList<>();
    astronauts.add(new Astronaut("Neil", "Armstrong"));
    astronauts.add(new Astronaut("Kevin", "Phillips"));
    astronauts.add(new Astronaut("Hillary", "Duff"));
    astronauts.add(new Astronaut("Rose", "Mary"));
    astronauts.add(new Astronaut("Alex", "Ferguson"));

//    Create the Answer pane
    Label displayLabel = new Label("Your favorite astronaut is ");
    Label answerLabel = new Label("...");
    HBox answerPane = new HBox(5, displayLabel, answerLabel);
    answerPane.setPadding(new Insets(10));

//    Create the Ask pane
    Label askLabel = new Label("Who's your favorite astronaut?");
    ChoiceBox<Astronaut> astronautChoiceBox = new ChoiceBox<>();
    astronautChoiceBox.getItems().addAll(astronauts);
    astronautChoiceBox.setValue(new Astronaut("Choose one",""));
    astronautChoiceBox.getSelectionModel().selectedItemProperty()
        .addListener((v, oleValue, newValue) -> answerLabel.setText(newValue.toString()));

    HBox astronautPane = new HBox(10, askLabel, astronautChoiceBox);
    astronautPane.setPadding(new Insets(10));

//    Add the two HBox panes to a VBox pane
    VBox pane = new VBox(10, astronautPane, answerPane);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("A favorite astronaut");
    primaryStage.show();
  }
}






























