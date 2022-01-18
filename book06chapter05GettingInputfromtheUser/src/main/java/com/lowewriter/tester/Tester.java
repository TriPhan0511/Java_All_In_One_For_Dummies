package com.lowewriter.tester;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Tester extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  TextField txtUsername;
  TextField txtPassword;

  @Override
  public void start(Stage primaryStage)
  {
//    Create Username label and text field
    Label lblUsername = new Label("Username:");
    txtUsername = new TextField();
    txtUsername.setMinWidth(100);
    txtUsername.setPrefWidth(200);
    txtUsername.setMaxWidth(300);

//    Create Password label and text field
    Label lblPassword = new Label("Password:");
    txtPassword = new TextField();
    txtPassword.setMinWidth(100);
    txtPassword.setPrefWidth(200);
    txtPassword.setMaxWidth(300);

//    Create buttons pane
    Button btnLogin = new Button("Login");
    btnLogin.setPrefWidth(80);
    Button btnReset = new Button("Reset");
    btnReset.setPrefWidth(80);
    HBox paneButtons = new HBox(btnLogin, btnReset);
    paneButtons.setSpacing(10);
    paneButtons.setAlignment(Pos.CENTER_RIGHT);

//    Create the GridPane layout
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10));
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setMinWidth(200);
    grid.setPrefWidth(250);
    grid.setMaxWidth(450);

//    Create the column widths
    ColumnConstraints col1 = new ColumnConstraints();
    col1.setPercentWidth(30);
    ColumnConstraints col2 = new ColumnConstraints();
    col2.setPercentWidth(70);
    grid.getColumnConstraints().addAll(col1, col2);

//    Add the components to the grid
    grid.addRow(0, lblUsername, txtUsername);
    grid.addRow(1, lblPassword, txtPassword);
    grid.add(paneButtons, 1, 2);

//    Add the pane to a scene and show the stage
    Scene scene = new Scene(grid);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Login Form");
    primaryStage.setMinWidth(250);
    primaryStage.setMaxWidth(500);
    primaryStage.show();
  }
}





























