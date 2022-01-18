package com.lowewriter.ValidatingNumericData;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ValidatingNumericDataSample extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  TextField txtAge; // get an integer
  TextField txtHeight; // get a double

  @Override
  public void start(Stage primaryStage)
  {
//    Create the Age label, text field, and pane
    Label lblAge = new Label("Age:");
    lblAge.setMinWidth(100);
    lblAge.setAlignment(Pos.BOTTOM_RIGHT);
    txtAge = new TextField();
    txtAge.setPromptText("Enter your age here.");
    txtAge.setMinWidth(200);
    txtAge.setMaxWidth(200);
    HBox paneAge = new HBox(20, lblAge, txtAge);
    paneAge.setPadding(new Insets(10));

//    Create the Height label, text field, and pane
    Label lblHeight = new Label("Height:");
    lblHeight.setMinWidth(100);
    lblHeight.setAlignment(Pos.BOTTOM_RIGHT);
    txtHeight = new TextField();
    txtHeight.setPromptText("Enter your height here.");
    txtHeight.setMinWidth(200);
    txtHeight.setMaxWidth(200);
    HBox paneHeight = new HBox(20, lblHeight, txtHeight);
    paneHeight.setPadding(new Insets(10));

//    Create the OK button and pane
    Button btnOK = new Button("OK");
    btnOK.setMinWidth(75);
    btnOK.setOnAction(e -> btnOK_Click());
    HBox paneButton = new HBox(20, btnOK);
    paneButton.setPadding(new Insets(10));
    paneButton.setAlignment(Pos.BOTTOM_RIGHT);

//    Add the components to a VBox
    VBox pane = new VBox(10, paneAge, paneHeight, paneButton);

//    Set the stage
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Validating Numeric Data");
    primaryStage.show();
  }

  private void btnOK_Click()
  {
    if (isInt(txtAge, "Your age should be an integer.")
        && isDouble(txtHeight, "Your height should be a double."))
    {
      String message = "Your age: " + txtAge.getText().trim()
          + "\nYour height: " + txtHeight.getText().trim();
      Alert a = new Alert(Alert.AlertType.INFORMATION, message);
      a.setTitle("Age and Height");
      a.show();
    }
  }

  private boolean isInt(TextField tf, String errorMessage)
  {
    String s = tf.getText().trim();
    try
    {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e)
    {
      Alert a = new Alert(Alert.AlertType.ERROR, errorMessage);
      a.setTitle("Invalid integer");
      a.show();
      tf.requestFocus();
      return false;
    }
  }

  private boolean isDouble(TextField tf, String errorMessage)
  {
    try
    {
      Double.parseDouble(tf.getText().trim());
      return true;
    } catch (NumberFormatException e)
    {
      Alert a = new Alert(Alert.AlertType.ERROR, errorMessage);
      a.setTitle("Invalid double");
      a.show();
      tf.requestFocus();
      return false;
    }
  }
}




























