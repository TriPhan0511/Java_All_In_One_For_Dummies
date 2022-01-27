package com.lowewriter.movieApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Optional;

public class MovieInventory_0 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields
  TableView<Movie> movieTableView;
  TextField titleTextField, yearTextField, priceTextField;

  @Override
  public void start(Stage primaryStage)
  {
//    Create a heading label
    Label headingLabel = new Label("Movie Inventory (0)");
    headingLabel.setFont(Font.font("Arial", 20));

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
    yearColumn.setCellValueFactory(
        new PropertyValueFactory<Movie, Integer>("year"));

//    Create a Price column
    TableColumn<Movie, Double> priceColumn = new TableColumn<>("Price");
    priceColumn.setMinWidth(100);
    priceColumn.setCellValueFactory(
        new PropertyValueFactory<Movie, Double>("price"));

//    Create a table
//    movieTableView = new TableView<>(loadData());
    movieTableView = new TableView<>();
    movieTableView.setItems(loadData());
    movieTableView.getColumns().addAll(titleColumn, yearColumn, priceColumn);
    movieTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    movieTableView.setEditable(true);

//    Create a text fields and buttons pane
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
    addButton.setMinWidth(70);
    addButton.setOnAction(e -> addButton_Click());

    Button deleteButton = new Button("Delete");
    deleteButton.setMinWidth(60);
    deleteButton.setOnAction(e -> deleteButton_Click());

    HBox hBoxPane = new HBox(10, titleTextField,
                        yearTextField, priceTextField,
                        addButton, deleteButton);
    hBoxPane.setPadding(new Insets(10));

//    Add the heading label, the table the hBoxPane to a VBox pane
    VBox pane = new VBox(10, headingLabel, movieTableView, hBoxPane);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Movie Inventory Editor");
    primaryStage.show();
  }

  private void titleColumn_OnEditCommit(TableColumn.CellEditEvent<Movie, String> e)
  {
    Movie tempMovie = e.getRowValue();
    tempMovie.setTitle(e.getNewValue());
  }

  //  Click event handler for the deleteButton
  private void deleteButton_Click()
  {
    ObservableList<Movie> items, selectedItems;
    items = movieTableView.getItems();
    selectedItems = movieTableView.getSelectionModel().getSelectedItems();
    String message = selectedItems.size() > 1 ?
        "Are you sure you want to delete these items?" :
        "Are you sure you want to delete this item?";
    Alert a = new Alert(Alert.AlertType.CONFIRMATION, message, ButtonType.YES, ButtonType.NO);
    Optional<ButtonType> r = a.showAndWait();
    if (r.isPresent() && r.get() == ButtonType.YES)
    {
      items.removeAll(selectedItems);
    }
  }

  //  Click event handler for the addButton
  private void addButton_Click()
  {
    Movie tempMovie = new Movie();
    tempMovie.setTitle(titleTextField.getText());
    tempMovie.setYear(Integer.parseInt(yearTextField.getText()));
    tempMovie.setPrice(Double.parseDouble(priceTextField.getText()));
    movieTableView.getItems().add(tempMovie);
    titleTextField.clear();
    yearTextField.clear();
    priceTextField.clear();
  }

  //  Dummy data : ObservableList
  private ObservableList<Movie> loadData()
  {
    ObservableList<Movie> movieObservableList =
               FXCollections.observableArrayList();
    movieObservableList.add(new Movie("The Shawshank Redemtion", 1994, 19.2));
    movieObservableList.add(new Movie("Schinder's List", 1993, 18.9));
    movieObservableList.add(new Movie("The Godfather", 1972, 19.1));
    movieObservableList.add(new Movie("The Godfather: Part II", 1974, 19.0));
    movieObservableList.add(new Movie("The Good, the Bad and the Ugly", 1966, 18.8));
    movieObservableList.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", 2001, 18.8));
    movieObservableList.add(new Movie("The Dark Knight", 2008, 19.0));
    movieObservableList.add(new Movie("12 Angry Men", 1957, 18.9));
    movieObservableList.add(new Movie("The Lord of the Rings: The return of the King", 2003, 18.9));
    movieObservableList.add(new Movie("Pulp Fiction", 1994, 18.8));
    return movieObservableList;
  }
}
































