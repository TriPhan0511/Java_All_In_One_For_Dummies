package com.lowewriter.RolePlayer;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RolePlayer_0 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  TextField txtCharacterName;
  TextField txtActorName;

  @Override
  public void start(Stage primaryStage)
  {
//    Create CharacterName label and text field
    Label lblCharacterName = new Label("Character's Name:");
    txtCharacterName = new TextField();
    txtCharacterName.setPromptText("Enter the name of the character here");
    txtCharacterName.setMinWidth(100);
    txtCharacterName.setPrefWidth(200);
    HBox paneCharacterName = new HBox(lblCharacterName, txtCharacterName);

//    Create ActorName label and text field
    Label lblActorName = new Label("Actor's Name:");
    txtActorName = new TextField();
    txtActorName.setPromptText("Enter the name of the actor name");
    txtActorName.setMinWidth(100);
    txtActorName.setPrefWidth(200);
    HBox paneActorName = new HBox(lblActorName, txtActorName);

//    Create the OK button
    Button btnOK = new Button("OK");
    btnOK.setPrefWidth(80);
    btnOK.setOnAction(e -> btnOK_Click());

//    Create a GridPane layout
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10));
    grid.setHgap(20);
    grid.setVgap(20);

//    Set the column widths
    ColumnConstraints col1 = new ColumnConstraints();
    col1.setPercentWidth(40);
    ColumnConstraints col2 = new ColumnConstraints();
    col2.setPercentWidth(60);
    grid.getColumnConstraints().addAll(col1, col2);

//    Add the components to the grid
    grid.addRow(0, lblCharacterName, txtCharacterName);
    grid.addRow(1, lblActorName, txtActorName);
    grid.add(btnOK, 1, 2);

//    Set the alignments
    GridPane.setHalignment(lblCharacterName, HPos.RIGHT);
    GridPane.setHalignment(lblActorName, HPos.RIGHT);
    GridPane.setHalignment(btnOK, HPos.RIGHT);

//    Finish and show the stage
    Scene scene = new Scene(grid);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Role Player_0");
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




























