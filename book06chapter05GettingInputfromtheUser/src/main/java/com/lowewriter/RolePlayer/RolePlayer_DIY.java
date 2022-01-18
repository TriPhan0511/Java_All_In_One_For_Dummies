package com.lowewriter.RolePlayer;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RolePlayer_DIY extends Application
{
  public static void main(String[] args)
  {
    launch();
  }

  TextField txtCharacterName;
  TextField txtActorName;

  @Override
  public void start(Stage primaryStage)
  {
//    Create the Character label and text field
    Label lblCharacterName = new Label("Character's Name:");
    txtCharacterName = new TextField();
    txtCharacterName.setPromptText("Enter the character's name here.");
    txtCharacterName.setMinWidth(100);
    txtCharacterName.setPrefWidth(200);
    txtCharacterName.setMaxWidth(300);

//    Create the ActorName label and text field
    Label lblActorName = new Label("Actor's Name:");
    txtActorName = new TextField();
    txtActorName.setPromptText("Enter the actor's name here.");
    txtActorName.setMinWidth(100);
    txtActorName.setPrefWidth(200);
    txtActorName.setMaxWidth(300);

//    Create the button
    Button btnOK = new Button("OK");
    btnOK.setOnAction(e -> btnOK_Click());
    btnOK.setPrefWidth(80);

//    Create a GridPane layout
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10));
    grid.setHgap(20);
    grid.setVgap(20);
    grid.setMinWidth(350);
    grid.setPrefWidth(350);
    grid.setMaxWidth(500);

//    Add the components to the grid
    grid.addRow(0, lblCharacterName, txtCharacterName);
    grid.addRow(1, lblActorName, txtActorName);
    grid.add(btnOK, 1, 2);

//    Set alignment for the button
    GridPane.setHalignment(btnOK, HPos.RIGHT);

//    Add the grid to a scene and show the stage
    Scene scene = new Scene(grid);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Role Player - DIY");
    primaryStage.show();
  }

  private void btnOK_Click()
  {
    String characterName = txtCharacterName.getText();
    String actorName = txtActorName.getText();
    if (characterName.equals("") && actorName.equals(""))
    {
      Alert a = new Alert(Alert.AlertType.WARNING,
          "Character and Actor are required fields.",
          ButtonType.OK);
      a.setTitle("Missing Data");
      a.showAndWait();
    }
    else if (characterName.equals(""))
    {
      Alert a = new Alert(Alert.AlertType.WARNING,
          "Character is a required field.",
          ButtonType.OK);
      a.setTitle("Missing Data");
      a.showAndWait();
    }
    else if (actorName.equals(""))
    {
      Alert a = new Alert(Alert.AlertType.WARNING,
          "Actor is a required field",
          ButtonType.OK);
      a.setTitle("Missing Data");
      a.showAndWait();
    }
    else
    {
      Alert a = new Alert(Alert.AlertType.INFORMATION,
          "The role of " + characterName + " will be played by " + actorName,
          ButtonType.OK);
      a.setTitle("Cast");
      a.showAndWait();
    }
  }
}






























