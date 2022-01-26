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

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieInventory_Database extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create an ObservableArrayList instance
    ObservableList<Movie> movieObservableList =
        FXCollections.observableArrayList(loadData());

//    Create a heading label
    Label headingLabel = new Label("Movie Inventory (Fetch data from the database)");
    headingLabel.setFont(Font.font("Arial", 20));

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
    movieTableView.setItems(movieObservableList);
    movieTableView.getColumns().addAll(titleColumn, yearColumn, priceColumn);

//    Add the headingLabel and the movieTableView to a VBox pane
    VBox pane = new VBox(10, headingLabel, movieTableView);
    pane.setPadding(new Insets(10));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Movie Inventory (Fetch data from the database)");
    primaryStage.show();
  }

//  Helper method
  private ObservableList<Movie> loadData()
  {
    DatabaseHandler dbHandler = new DatabaseHandler();
    ArrayList<Movie> movieArrayList = new ArrayList<>();
    try
    {
      dbHandler.fetchMovieList(movieArrayList);
    } catch (SQLException e)
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
    return FXCollections.observableList(movieArrayList);
  }
}
