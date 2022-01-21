package com.lowewriter.UsingComboBoxes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsingComboBoxesSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields
  ComboBox<String> favoriteComboBox;
  Label answerLabel;

  @Override
  public void start(Stage primaryStage)
  {
//    Create the Answer pane
    Label displayLabel = new Label("Your favorite is");
    answerLabel = new Label("...");
    HBox answerPane = new HBox(5, displayLabel, answerLabel);
    answerPane.setPadding(new Insets(10));

//    Create the Favorite pane
    Label favoriteLabel = new Label("Which is your favorite?");
    favoriteComboBox = new ComboBox<>();
    favoriteComboBox.getItems().addAll("Bashful", "Doc",
        "Dopey", "Grumpy", "Happy", "Sleepy",
        "Sneezy");
    favoriteComboBox.setEditable(true);
//    favoriteComboBox.setPromptText("Make a choice");
    favoriteComboBox.setVisibleRowCount(3);
//    favoriteComboBox.setOnAction(
//        e -> answerLabel.setText(favoriteComboBox.getValue()));
    favoriteComboBox.setOnAction(e -> favoriteComboBox_Changed());

    HBox favoritePane = new HBox(10, favoriteLabel, favoriteComboBox);
    favoritePane.setPadding(new Insets(10));

//    Create the Button pane
    Button okButton = new Button("OK");
    okButton.setMinWidth(75);
    okButton.setOnAction(e -> okButton_Click());
    HBox buttonPane = new HBox(10, okButton);
    buttonPane.setPadding(new Insets(0, 10, 10, 10));
    buttonPane.setAlignment(Pos.BOTTOM_RIGHT);

//    Add the components to a VBox pane
    VBox pane = new VBox(10, favoritePane, answerPane, buttonPane);

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Your Favorite");
    primaryStage.show();
  }

  private void okButton_Click()
  {
    String msg = favoriteComboBox.getValue();
    if (!favoriteComboBox.getItems().contains(msg))
    {
      if (msg.length() == 0)
      {
        msg = "You don't choose any thing.";
      }
      else
      {
        msg = "You chose outside the box.\n"
            + "Your choice: " + favoriteComboBox.getValue();
      }

    }
    else
    {
      msg = "Your choice: " + favoriteComboBox.getValue();
    }
    Alert a = new Alert(Alert.AlertType.INFORMATION, msg);
    a.setTitle("Your Choice");
    a.showAndWait();
  }

  private void favoriteComboBox_Changed()
  {
    answerLabel.setText(favoriteComboBox.getValue());
  }
}































