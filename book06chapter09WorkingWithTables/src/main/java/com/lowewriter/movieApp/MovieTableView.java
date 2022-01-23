package com.lowewriter.movieApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MovieTableView extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  //  Declare a variable of ObservableList<Movie> type
  ObservableList<Movie> movieObservableList;

  @Override
  public void start(Stage primaryStage)
  {
//    Create a title column
    TableColumn<Movie, String> titleColumn = new TableColumn<>("Title");
    titleColumn.setMinWidth(300);
    titleColumn.setCellValueFactory(
        new PropertyValueFactory<Movie, String>("Title"));

//    Create a year column
    TableColumn<Movie, Integer> yearColumn = new TableColumn<>("Year");
    yearColumn.setMinWidth(100);
    yearColumn.setCellValueFactory(
        new PropertyValueFactory<Movie, Integer>("Year"));

//    Create a price column
    TableColumn<Movie, Double> priceColumn = new TableColumn<>("Price");
    priceColumn.setMinWidth(100);
    priceColumn.setCellValueFactory(
        new PropertyValueFactory<Movie, Double>("Price"));

//    Create a table and set table's items list

//    TableView<Movie> table = new TableView<>();
//    table.setItems(loadData());
//    TableView<Movie> table = new TableView<>(loadData());

    movieObservableList = loadData();
    TableView<Movie> table = new TableView<>(movieObservableList);
    table.getColumns().addAll(titleColumn, yearColumn, priceColumn);

//    Add the table to a HBox pane
    HBox pane = new HBox(table);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Movie TableView ");
    primaryStage.show();
  }

  //  Helper method: create dummy data
  private ObservableList<Movie> loadData()
  {
//    Create an object of type ObservableList<Movie>
    ObservableList<Movie> data = FXCollections.observableArrayList();
//    Create some Movie instances
    Movie m1 = new Movie("Eternals", 2021, 50.99);
    Movie m2 = new Movie("The Dark Knight", 2008, 20.89);
    Movie m3 = new Movie("The King's Speech", 2010, 19.95);
    Movie m4 = new Movie("The Lord of the Rings: The Return of the King", 2003, 19.95);
    Movie m5 = new Movie("The Good, the Bad and the Ugly", 1996, 30.65);
//    Add the movies to the data and return
    data.addAll(m1, m2, m3, m4, m5);
    return data;
  }


//  private void loadData_2(ObservableList<Movie> movieObservableList)
//  {
////    Create some Movie instances
//    Movie m1 = new Movie("Eternals", 2021, 50.99);
//    Movie m2 = new Movie("The Dark Knight", 2008, 20.89);
//    Movie m3 = new Movie("The King's Speech", 2010, 19.95);
//    Movie m4 = new Movie("The Lord of the Rings: The Return of the King", 2003, 19.95);
//    Movie m5 = new Movie("The Good, the Bad and the Ugly", 1996, 30.65);
//
////    Add those Movie instances to the movieObservableList
//    movieObservableList.addAll(m1, m2, m3, m4, m5);
//  }
}































