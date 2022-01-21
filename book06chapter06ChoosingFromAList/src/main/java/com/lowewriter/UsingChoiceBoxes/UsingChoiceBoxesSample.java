package com.lowewriter.UsingChoiceBoxes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsingChoiceBoxesSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

//  Class field
  Label lblResult;

  @Override
  public void start(Stage primaryStage)
  {
//    Create Favorite label,  choice box, and pane
    Label lblFavorite = new Label("Which is your favorite?");
    ChoiceBox<String> favoriteChoiceBox = new ChoiceBox<>();
    favoriteChoiceBox.getItems().addAll("Bashful", "Doc", "Dopey",
        "Grumpy", "Happy", "Sleepy",
        "Sneezy");
    favoriteChoiceBox.setValue("Choose your favorite");
//    Listening for Selection Changes
    favoriteChoiceBox.getSelectionModel().selectedItemProperty()
        .addListener((v, oldValue, newValue) -> lblResult.setText(newValue));
    HBox paneFavorite = new HBox(10, lblFavorite, favoriteChoiceBox);
    paneFavorite.setPadding(new Insets(10));

//    Create the Display pane
    Label lblDisplay = new Label("Your choice:");
    lblResult = new Label("No choice.");
    HBox paneDisplay = new HBox(10, lblDisplay, lblResult);
    paneDisplay.setPadding(new Insets(10));

//    Add the components to a VBox
    VBox pane = new VBox(10, paneFavorite, paneDisplay);
    pane.setPadding(new Insets(10));

//    Set the stage and show it
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Your favorite");
    primaryStage.show();

//    Testing
    System.out.println(favoriteChoiceBox.getValue());

  }
}




























