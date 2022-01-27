package com.lowewriter.movieApp_CRUD_Database;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.sql.*;
import java.util.Optional;

public class MovieInventory_CRUD_Database_2 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields
  Stage stage;
  TableView<Movie> table;
  TextField titleTextField;
  TextField yearTextField;
  TextField priceTextField;

  DatabaseHandler dbHandler = new DatabaseHandler();

  @Override
  public void start(Stage primaryStage)
  {
//    Set the reference for the class field named stage
    stage = primaryStage;

//    Create a heading label
    Label headingLabel = new Label("Movie Inventory (CRUD and Database)");
    headingLabel.setFont(Font.font("Arial", 20));

//    Create a quit button
    Button quitButton = new Button("Save & Quit");
    quitButton.setMinWidth(60);
    quitButton.setOnAction(e -> quitButton_Click());

//    Create the spacer
    Region spacer = new Region();
    HBox.setHgrow(spacer, Priority.ALWAYS);

//    Add the headingLabel, the spacer, and the quitButton to a HBox pane
    HBox headingPane = new HBox(10, headingLabel, spacer, quitButton);
    headingPane.setPadding(new Insets(10));
    HBox.setMargin(quitButton, new Insets(0, 0, 0, 100));

//    Create a Title column
    TableColumn<Movie, String> titleColumn = new TableColumn<>("Title");
    titleColumn.setMinWidth(300);
    titleColumn.setCellValueFactory(
        new PropertyValueFactory<Movie, String>("title"));
    titleColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    titleColumn.setOnEditCommit(e -> titleColumn_OnEditCommit(e));

//    Create a Year column
    TableColumn<Movie, Integer> yearColumn = new TableColumn<>("Year");
    yearColumn.setMinWidth(100);
    yearColumn.setCellValueFactory(new PropertyValueFactory<Movie, Integer>("year"));
    yearColumn.setCellFactory(TextFieldTableCell.forTableColumn(
        new IntegerStringConverter()));
    yearColumn.setOnEditCommit(e -> yearColumn_OnEditCommit(e));

//    Create a Price Column
    TableColumn<Movie, Double> priceColumn = new TableColumn<>("Price");
    priceColumn.setMinWidth(100);
    priceColumn.setCellValueFactory(new PropertyValueFactory<Movie, Double>("price"));
    priceColumn.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
    priceColumn.setOnEditCommit(e -> priceColumn_OnEditCommit(e));
    
//    Create a TableView
    table = new TableView<>();
    table.setItems(loadData());
    table.getColumns().addAll(titleColumn, yearColumn, priceColumn);
    table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    table.setEditable(true);

//    Create text fields and button pane
    titleTextField = new TextField();
    titleTextField.setPromptText("Title");
    titleTextField.setMinWidth(100);

    yearTextField = new TextField();
    yearTextField.setPromptText("Year");
    yearTextField.setMaxWidth(100);

    priceTextField = new TextField();
    priceTextField.setPromptText("Price");
    priceTextField.setMaxWidth(100);

    Button addButton = new Button("Add");
    addButton.setMinWidth(60);
    addButton.setOnAction(e -> addButton_Click());

    Button deleteButton = new Button("Delete");
    deleteButton.setMinWidth(60);
    deleteButton.setOnAction(e -> deleteButton_Click());

    HBox hBox = new HBox(10, titleTextField, yearTextField,
        priceTextField, addButton, deleteButton);
    hBox.setPadding(new Insets(10));

//    Add the heading pane, the table and the hBox pane to a VBox pane
    VBox pane = new VBox(10, headingPane, table, hBox);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Movie Inventory (version 2)");
    primaryStage.setOnCloseRequest(e -> {
      e.consume();
      quitButton_Click();
    });
    primaryStage.show();
  }

  public void addMovie

  private void saveData()
  {
    String query;
    try (Connection conn = dbHandler.getConnection())
    {
      query = "DELETE FROM Movie";
      try (Statement stat = conn.createStatement())
      {
        stat.executeUpdate(query);
      }
      query = "INSERT INTO Movie (Title, Year, Price) " +
          "VALUES(?,?,?)";
      for (Movie item : table.getItems())
      {
        try (PreparedStatement stat = conn.prepareStatement(query))
        {
          stat.setString(1, item.getTitle().trim());
          stat.setInt(2, item.getYear());
          stat.setDouble(3, item.getPrice());
          stat.execute();
        }
      }
    }
    catch (SQLException e)
    {
      for (Throwable t : e)
      {
        t.printStackTrace();
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  //  Way 1: Delete all records from the table in the database.
//  Then, iterate over the item collection list of the table, get data,
//  and insert into the table in the database
private void quitButton_Click()
{
  Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to save the data?",
      ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
  Optional<ButtonType> r = a.showAndWait();
  if (r.get() == ButtonType.YES)
  {
    saveData();
    stage.close();
  }
  if (r.get() == ButtonType.NO)
  {
    stage.close();
  }
}

  private void priceColumn_OnEditCommit(TableColumn.CellEditEvent<Movie, Double> e)
  {
    Movie tempMovie = e.getRowValue();
    tempMovie.setPrice(e.getNewValue());
  }

  private void yearColumn_OnEditCommit(TableColumn.CellEditEvent<Movie, Integer> e)
  {
    Movie tempMovie = e.getRowValue();
    tempMovie.setYear(e.getNewValue());
  }

  private void titleColumn_OnEditCommit(TableColumn.CellEditEvent<Movie, String> e)
  {
    Movie tempMovie = e.getRowValue();
    tempMovie.setTitle(e.getNewValue());
  }

  private void addButton_Click()
  {
    Movie tempMovie = new Movie();
    tempMovie.setTitle(titleTextField.getText().trim());
    tempMovie.setYear(Integer.parseInt(yearTextField.getText().trim()));
    tempMovie.setPrice(Double.parseDouble(priceTextField.getText().trim()));
    table.getItems().add(tempMovie);
    titleTextField.clear();
    yearTextField.clear();
    priceTextField.clear();
  }

  private void deleteButton_Click()
  {
    ObservableList<Movie> selectedItems = table.getSelectionModel().getSelectedItems();
    if (selectedItems.size() == 0)
    {
      Alert a = new Alert(Alert.AlertType.INFORMATION, "Please choose one or some items will be deleted.");
      a.showAndWait();
    }
    else
    {
      String message = selectedItems.size() > 1 ?
          "Are you sure you want to delete these items?" :
          "Are you sure you want to delete this item?";
      Alert a = new Alert(Alert.AlertType.CONFIRMATION, message, ButtonType.YES, ButtonType.NO);
      Optional<ButtonType> r = a.showAndWait();
      if (r.isPresent() && r.get() == ButtonType.YES)
      {
        table.getItems().removeAll(selectedItems);
      }
    }
  }

  private  ObservableList<Movie> loadData()
  {
    ObservableList<Movie> data = FXCollections.observableArrayList();
    Movie tempMovie;

    try (Connection conn = dbHandler.getConnection())
    {
      String query = "SELECT Title, Year, Price FROM Movie";

      try (Statement stat = conn.createStatement();
           ResultSet result = stat.executeQuery(query))
      {
        while (result.next())
        {
          tempMovie = new Movie();
          tempMovie.setTitle(result.getString("title").trim());
          tempMovie.setYear(result.getInt("year"));
          tempMovie.setPrice(result.getDouble("price"));
          data.add(tempMovie);
        }
      }
    } catch (SQLException e)
    {
      for (Throwable t : e)
      {
        t.printStackTrace();
      }
    } catch (IOException e)
    {
      e.printStackTrace();
    }
    return data;
  }
}




































