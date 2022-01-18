package com.lowewriter.gridpanelayoutsample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PizzaOrder_DIY extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields
  Stage stage;
  TextField txtName;
  TextField txtPhone;
  TextField txtAddress;
  RadioButton rdoSmall;
  RadioButton rdoMedium;
  RadioButton rdoLarge;
  RadioButton rdoThin;
  RadioButton rdoThick;
  CheckBox chkPepperoni;
  CheckBox chkMushrooms;
  CheckBox chkAnchovies;

  @Override
  public void start(Stage primaryStage)
  {
//    Create the Name label and text field
    Label lblName = new Label("Name:");
    txtName = new TextField();
    txtName.setPromptText("Enter the name here");
    txtName.setMinWidth(100);
    txtName.setPrefWidth(200);
    txtName.setMaxWidth(300);


//    Create the Phone Number label and text field
    Label lblPhone = new Label("Phone number:");
    txtPhone = new TextField();
    txtPhone.setPromptText("Enter the phone number here");
    txtPhone.setMinWidth(60);
    txtPhone.setPrefWidth(120);
    txtPhone.setMaxWidth(180);

//    Create the Address label and text field
    Label lblAddress = new Label("Address:");
    txtAddress = new TextField();
    txtAddress.setPromptText("Enter the address here");
    txtAddress.setMinWidth(100);
    txtAddress.setPrefWidth(200);
    txtAddress.setMaxWidth(300);

//    Create the Size pane
    Label lblSize = new Label("Size");
    rdoSmall = new RadioButton("Small");
    rdoMedium = new RadioButton("Medium");
    rdoLarge = new RadioButton("large");
    rdoMedium.setSelected(true);
    ToggleGroup groupSize = new ToggleGroup();
    rdoSmall.setToggleGroup(groupSize);
    rdoMedium.setToggleGroup(groupSize);
    rdoLarge.setToggleGroup(groupSize);

    VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);
    paneSize.setSpacing(10);

//    Create the Crust pane
    Label lblCrust = new Label("Crust");
    rdoThin = new RadioButton("Thin");
    rdoThick = new RadioButton("Thick");
    rdoThin.setSelected(true);
    ToggleGroup groupCrust = new ToggleGroup();
    rdoThin.setToggleGroup(groupCrust);
    rdoThick.setToggleGroup(groupCrust);

    VBox paneCrust = new VBox(lblCrust, rdoThin, rdoThick);
    paneCrust.setSpacing(10);

//    Create the Toppings pane
    Label lblToppings = new Label("Toppings");
    chkPepperoni = new CheckBox("Pepperoni");
    chkMushrooms = new CheckBox("Mushrooms");
    chkAnchovies = new CheckBox("Anchovies");

    VBox paneToppings = new VBox(lblToppings, chkPepperoni, chkMushrooms, chkAnchovies);
    paneToppings.setSpacing(10);

//    Create the buttons pane
    Button btnOK = new Button("OK");
    btnOK.setPrefWidth(80);
//    btnOK.setOnAction(e -> btnOK_Click());
    Button btnCancel = new Button("Cancel");
    btnCancel.setPrefWidth(80);
//    btnCancel.setOnAction(e -> btnCancel_Click());

    HBox paneButtons = new HBox(btnOK, btnCancel);
    paneButtons.setSpacing(10);

//    Create the GridPane layout
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10));
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setMinWidth(500);
    grid.setPrefWidth(500);
    grid.setMaxWidth(800);

    grid.addRow(0, lblName, txtName);
    grid.addRow(1, lblPhone, txtPhone);
    grid.addRow(2, lblAddress, txtAddress);
    grid.addRow(3, paneSize, paneCrust, paneToppings);
    grid.add(paneButtons,2,4);

//    Set alignments and spans
    GridPane.setHalignment(lblName, HPos.RIGHT);
    GridPane.setHalignment(lblPhone, HPos.RIGHT);
    GridPane.setHalignment(lblAddress, HPos.RIGHT);

    GridPane.setColumnSpan(txtName, 2);
    GridPane.setColumnSpan(txtPhone, 2);
    GridPane.setColumnSpan(txtAddress, 2);

//    Set column widths for the grid
    ColumnConstraints col1 = new ColumnConstraints();
    col1.setPercentWidth(33);
    ColumnConstraints col2 = new ColumnConstraints();
    col2.setPercentWidth(33);
    ColumnConstraints col3 = new ColumnConstraints();
    col3.setPercentWidth(33);
    grid.getColumnConstraints().addAll(col1, col2, col3);

//    Create a scene and show the stage
    Scene scene = new Scene(grid);
    primaryStage.setScene(scene);
    primaryStage.setMinWidth(500);
    primaryStage.setMaxWidth(900);
    primaryStage.setTitle("Pizza Order - DIY");
    primaryStage.show();
  }
}






















