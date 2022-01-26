package com.lowewriter.movieApp_DatabaseConnection;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MovieInventory_DIY extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create a heading label
    Label headingLabel = new Label("Movie Inventory");
    headingLabel.setFont(new Font("Arial", 20));

//    Create a title column
    TableColumn<Movie, String> titleColumn = new TableColumn<>("Title");
    titleColumn.setMinWidth(300);
    titleColumn.setCellValueFactory(new PropertyValueFactory<Movie, String>("title"));

//    Create a year column
    TableColumn<Movie, Integer> yearColumn = new TableColumn<>("Year");
    yearColumn.setMinWidth(100);
    yearColumn.setCellValueFactory(new PropertyValueFactory<Movie, Integer>("year"));

//    Create a price column
    TableColumn<Movie, Double> priceColumn = new TableColumn<>("Price");
    priceColumn.setMinWidth(100);
    priceColumn.setCellValueFactory(new PropertyValueFactory<Movie, Double>("price"));

//    Create a table
    TableView<Movie> movieTableView = new TableView<>();
    movieTableView.setItems(loadData());
    movieTableView.getColumns().addAll(titleColumn, yearColumn, priceColumn);

//    Add the headingLabel and the movieTableView to a VBox pane
    VBox pane = new VBox(10, headingLabel, movieTableView);
    pane.setPadding(new Insets(10));


//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Movie Inventory - DIY");
    primaryStage.show();
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































