package com.lowewriter.movieApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Optional;

public class MovieInventory_2 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Class fields for the primary scene
  Stage stage;
  Scene primaryScene, addMovieScene;
  TableView<Movie> movieTableView;

//  Class fields for the addMovieScene
  TextField titleTextField, yearTextField, priceTextField;
  Label titleErrorMessageLabel, yearErrorMessageLabel, priceErrorMessageLabel;

  @Override
  public void start(Stage primaryStage)
  {
    stage = primaryStage;

//    Create a heading label
    Label headingLabel = new Label("Movie Inventory");
    headingLabel.setFont(Font.font("Arial", 20));

//    Create a Title column
    TableColumn<Movie, String> titleColumn = new TableColumn<>("Title");
    titleColumn.setMinWidth(300);
    titleColumn.setCellValueFactory(
        new PropertyValueFactory<Movie, String>("title"));

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
    movieTableView = new TableView<>();
    movieTableView.setItems(loadData());
    movieTableView.getColumns().addAll(titleColumn, yearColumn, priceColumn);
    movieTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

//    Create a buttons pane
    Button addButton = new Button("Add a new employee");
    addButton.setMinWidth(65);
    addButton.setOnAction(e -> addButton_Click());

    Button deleteButton = new Button("Delete");
    deleteButton.setMinWidth(65);
    deleteButton.setOnAction(e -> deleteButton_Click());

    HBox buttonPane = new HBox(10, addButton, deleteButton);
    buttonPane.setPadding(new Insets(10));
    buttonPane.setAlignment(Pos.BOTTOM_RIGHT);

//    Add the heading label, the table the hBoxPane to a VBox pane
    VBox pane = new VBox(10, headingLabel, movieTableView, buttonPane);
    pane.setPadding(new Insets(10));

//    Finish
    primaryScene = new Scene(pane);
    primaryStage.setScene(primaryScene);
    primaryStage.setTitle("Movie Inventory Editor");
    primaryStage.show();
  }

  //  Click event handler for the deleteButton
  private void deleteButton_Click()
  {
    ObservableList<Movie> selectedItems =
        movieTableView.getSelectionModel().getSelectedItems();
    if (selectedItems.size() > 0)
    {
      String message = selectedItems.size() > 1 ?
          "Are you sure you want to delete these items?" :
          "Are you sure you want to delete this item?";
      Alert a = new Alert(Alert.AlertType.CONFIRMATION, message, ButtonType.YES, ButtonType.NO);
      Optional<ButtonType> r = a.showAndWait();
      if (r.isPresent() && r.get() == ButtonType.YES)
      {
        movieTableView.getItems().removeAll(selectedItems);
      }
    }
    else
    {
      Alert a = new Alert(Alert.AlertType.WARNING,
          "Please choose one or some items will be deleted.", ButtonType.OK);
      a.showAndWait();
    }
  }

  //  Click event handler for the addButton
  private void addButton_Click()
  {
//    Create some controls, some panes and a new scene.
//    Then set that scene to the stage

//    Create the error message labels
    titleErrorMessageLabel = new Label();
    titleErrorMessageLabel.setTextFill(Color.RED);
    yearErrorMessageLabel = new Label();
    yearErrorMessageLabel.setTextFill(Color.RED);
    priceErrorMessageLabel = new Label();
    priceErrorMessageLabel.setTextFill(Color.RED);

//    Create the title label and text field
    Label titleLabel = new Label("Title:");
    titleTextField = new TextField();
    titleTextField.setMinWidth(100);
    titleTextField.setPrefWidth(400);
    titleTextField.setMaxWidth(500);
    titleTextField.setPromptText("Enter the movie title here");

//    Create the year label and text field
    Label yearLabel = new Label("Year:");
    yearTextField = new TextField();
    yearTextField.setMinWidth(50);
    yearTextField.setPrefWidth(100);
    yearTextField.setMaxWidth(150);
    yearTextField.setPromptText("Enter the year here");

//    Create the price label and text field
    Label priceLabel = new Label("Price");
    priceTextField = new TextField();
    priceTextField.setMinWidth(50);
    priceTextField.setPrefWidth(100);
    priceTextField.setMaxWidth(150);
    priceTextField.setPromptText("Enter the price here");

//    Create the button pane
    Button saveButton = new Button("Save");
    saveButton.setPrefWidth(80);
    saveButton.setOnAction(e -> saveButton_Click());

    HBox buttonPane = new HBox(10, saveButton);
    buttonPane.setAlignment(Pos.BOTTOM_RIGHT);

//    Create the GridPane layout
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10));
    grid.setHgap(10);
    grid.setVgap(10);

//    Add nodes to the pane
    grid.add(titleErrorMessageLabel, 1, 0);
    grid.addRow(1, titleLabel, titleTextField);
    grid.add(yearErrorMessageLabel, 1, 2);
    grid.addRow(3, yearLabel, yearTextField);
    grid.add(priceErrorMessageLabel, 1, 4);
    grid.addRow(5, priceLabel, priceTextField);
    grid.add(buttonPane, 1, 6);

//    Set alignments
    GridPane.setHalignment(titleLabel, HPos.RIGHT);
    GridPane.setHalignment(yearLabel, HPos.RIGHT);
    GridPane.setHalignment(priceLabel, HPos.RIGHT);

//    Set column widths
    ColumnConstraints col1 = new ColumnConstraints();
    col1.setPercentWidth(20);
    ColumnConstraints col2 = new ColumnConstraints();
    col2.setPercentWidth(80);
    grid.getColumnConstraints().addAll(col1, col2);

//    Create the addMovieScene
    addMovieScene = new Scene(grid);

//    Finish
    stage.setScene(addMovieScene);
    stage.setTitle("Adding A New Movie");
    stage.show();
  }

  private void saveButton_Click()
  {
    titleErrorMessageLabel.setText("");
    yearErrorMessageLabel.setText("");
    priceErrorMessageLabel.setText("");
    boolean valid = true;
    if (titleTextField.getText().trim().equals(""))
    {
      titleErrorMessageLabel.setText("Invalid title.");
      titleTextField.clear();
      valid = false;
    }
    try
    {
      Integer.parseInt(yearTextField.getText());
    }
    catch (NumberFormatException e)
    {
      yearErrorMessageLabel.setText("Invalid year.");
      yearTextField.clear();
      valid = false;
    }
    try
    {
      Double.parseDouble(priceTextField.getText());
    }
    catch (NumberFormatException e)
    {
      priceErrorMessageLabel.setText("Invalid price.");
      priceTextField.clear();
      valid = false;
    }
    if (valid)
    {
      Movie tempMovie = new Movie();
      tempMovie.setTitle(titleTextField.getText());
      tempMovie.setYear(Integer.parseInt(yearTextField.getText()));
      tempMovie.setPrice(Double.parseDouble(priceTextField.getText()));
      movieTableView.getItems().add(tempMovie);
      stage.setScene(primaryScene);
    }
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
































