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

public class PizzaOrder extends Application
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
  CheckBox chkMushRooms;
  CheckBox chkAnchovies;

  @Override
  public void start(Stage primaryStage)
  {
    stage = primaryStage;

//    Create the name label and text field
    Label lblName = new Label("Name");
    txtName = new TextField();
    txtName.setMinWidth(100);
    txtName.setPrefWidth(200);
    txtName.setMaxWidth(300);
    txtName.setPromptText("Enter the name here");

//    Create the phone label and text field
    Label lblPhone = new Label("Phone:");
    txtPhone = new TextField();
    txtPhone.setMinWidth(60);
    txtPhone.setPrefWidth(120);
    txtPhone.setMaxWidth(180);
    txtPhone.setPromptText("Enter the phone number here");

//    Create the address label and text field
    Label lblAddress = new Label("Address:");
    txtAddress = new TextField();
    txtAddress.setMinWidth(200);
    txtAddress.setPrefWidth(200);
    txtAddress.setMaxWidth(300);
    txtAddress.setPromptText("Enter the address here");

//    Create the size pane
    Label lblSize = new Label("Size");
    rdoSmall = new RadioButton("Small");
    rdoMedium = new RadioButton("Medium");
    rdoLarge = new RadioButton("Large");
    rdoMedium.setSelected(true);
    ToggleGroup groupSize = new ToggleGroup();
    rdoSmall.setToggleGroup(groupSize);
    rdoMedium.setToggleGroup(groupSize);
    rdoLarge.setToggleGroup(groupSize);

    VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);
    paneSize.setSpacing(10);

//    Create the crust pane
    Label lblCrust = new Label("Crust");
    rdoThin = new RadioButton("Thin");
    rdoThick = new RadioButton("Thick");
    rdoThin.setSelected(true);
    ToggleGroup groupCrust = new ToggleGroup();
    rdoThin.setToggleGroup(groupCrust);
    rdoThick.setToggleGroup(groupCrust);

    VBox paneCrust = new VBox(lblCrust, rdoThin, rdoThick);
    paneCrust.setSpacing(10);

//    Create the toppings pane
    Label lblToppings = new Label("Toppings");
    chkPepperoni = new CheckBox("Pepperoni");
    chkMushRooms = new CheckBox("Mushrooms");
    chkAnchovies = new CheckBox("Anchovies");

    VBox paneToppings = new VBox(lblToppings, chkPepperoni, chkMushRooms, chkAnchovies);
    paneToppings.setSpacing(10);

//    Create the buttons
    Button btnOK = new Button("OK");
    btnOK.setPrefWidth(80);
//    btnOK.setOnAction(e -> btnOK_Click());
    btnOK.setOnAction(e -> btnOK_Click_2());

    Button btnCancel = new Button("Cancel");
    btnCancel.setPrefWidth(80);
    btnCancel.setOnAction(e -> btnCancel_Click());

    HBox paneButtons = new HBox(10, btnOK, btnCancel);
//    paneButtons.setAlignment(Pos.CENTER_RIGHT);

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
    grid.add(paneButtons, 2, 4);

//    Set alignments and spanning
    GridPane.setHalignment(lblName, HPos.RIGHT);
    GridPane.setHalignment(lblPhone, HPos.RIGHT);
    GridPane.setHalignment(lblAddress, HPos.RIGHT);
    GridPane.setColumnSpan(txtName, 2);
    GridPane.setColumnSpan(txtPhone, 2);
    GridPane.setColumnSpan(txtAddress, 2);

//    Set column width
    ColumnConstraints col1 = new ColumnConstraints();
    col1.setPercentWidth(33);
    ColumnConstraints col2 = new ColumnConstraints();
    col2.setPercentWidth(33);
    ColumnConstraints col3 = new ColumnConstraints();
    col3.setPercentWidth(33);
    grid.getColumnConstraints().addAll(col1, col2, col3);

//    Create the scene and the stage
    Scene scene = new Scene(grid);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Pizza Order");
    primaryStage.setMinWidth(500);
    primaryStage.setMaxWidth(900);
    primaryStage.show();
  }

  private void btnOK_Click_2()
  {
//    Get the customer information
    StringBuilder builder = new StringBuilder();
    builder.append("Customer:\n\n");
    builder.append("\t");
    builder.append(txtName.getText());
    builder.append("\n");
    builder.append("\t");
    builder.append(txtPhone.getText());
    builder.append("\n");
    builder.append("\t");
    builder.append(txtAddress.getText());

//    Get the pizza size
    builder.append("\nYou have ordered a ");
    if (rdoSmall.isSelected())
    {
      builder.append(rdoSmall.getText().toLowerCase());
      builder.append(" ");
    }
    if (rdoMedium.isSelected())
    {
      builder.append(rdoMedium.getText().toLowerCase());
      builder.append(" ");
    }
    if (rdoLarge.isSelected())
    {
      builder.append(rdoLarge.getText().toLowerCase());
      builder.append(" ");
    }

//    Get the crust style
    if (rdoThin.isSelected())
    {
      builder.append(rdoThin.getText().toLowerCase());
      builder.append(" crust pizza with ");
    }
    if (rdoThick.isSelected())
    {
      builder.append(rdoThick.getText().toLowerCase());
      builder.append(" crust pizza with ");
    }

//    Get the toppings
    String toppings = "";
    toppings = buildToppings(chkPepperoni, toppings);
    toppings = buildToppings(chkMushRooms, toppings);
    toppings = buildToppings(chkAnchovies, toppings);
    if (toppings.equals(""))
    {
      builder.append("no toppings.");
    }
    else
    {
      builder.append("the following toppings:\n");
      builder.append(toppings);
    }

//    Display the message
    Alert a = new Alert(Alert.AlertType.INFORMATION, builder.toString());
    a.setTitle("Order Details");
    a.showAndWait();
  }

  private void btnOK_Click()
  {
//    Create a message string with the customer information
    String msg = "Customer:\n\n";
    msg += "\t" + txtName.getText() + "\n";
    msg += "\t" + txtPhone.getText() + "\n";
    msg += "\t" + txtAddress.getText() + "\n";
    msg += "You have ordered a ";

//    Add the pizza size
    if (rdoSmall.isSelected())
    {
//      msg += "small ";
      msg += rdoSmall.getText().toLowerCase() + " ";
    }
    if (rdoMedium.isSelected())
    {
//      msg += "medium ";
      msg += rdoMedium.getText().toLowerCase() + " ";
    }
    if (rdoLarge.isSelected())
    {
//      msg += "large ";
      msg += rdoLarge.getText().toLowerCase() + " ";
    }

//    Add the crust style
    if (rdoThin.isSelected())
    {
      msg += "thin crust pizza with ";
    }
    if (rdoThick.isSelected())
    {
      msg += "thick crust pizza with ";
    }

//    Add the toppings
    String toppings = "";
    toppings = buildToppings(chkPepperoni, toppings);
    toppings = buildToppings(chkMushRooms, toppings);
    toppings = buildToppings(chkAnchovies, toppings);
    if (toppings.equals(""))
    {
      msg += "no toppings.";
    }
    else
    {
      msg += "the following toppings:\n"
          + toppings;
    }

//    Display the message
    Alert a = new Alert(Alert.AlertType.INFORMATION, msg);
    a.setTitle("Order Details");
    a.showAndWait();
  }

//  Helper method for displaying the list of topping
  private String buildToppings(CheckBox chk, String msg)
  {
    if (chk.isSelected())
    {
      if (!msg.equals(""))
      {
        msg += ", ";
      }
      msg += chk.getText();
    }
    return msg;
  }

  private void btnCancel_Click()
  {
    stage.close();
  }
}
















