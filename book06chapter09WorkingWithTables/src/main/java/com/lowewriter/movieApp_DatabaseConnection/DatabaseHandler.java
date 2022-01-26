package com.lowewriter.movieApp_DatabaseConnection;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class DatabaseHandler
{
  /**
   * Fetch all records from the Movie table in the database,
   * initialize instances of type Movie from those records,
   * then add those Movies instances to an array list.
   * @return An array list contains the instances of Movie type.
   * @throws SQLException
   * @throws IOException
   */
  public void fetchMovieList(ArrayList<Movie> movieArrayList)
      throws SQLException, IOException
  {
    String query = "SELECT Title, Year, Price FROM Movie";
    try ( Connection conn = getConnection();
          Statement stat = conn.createStatement();
          ResultSet result = stat.executeQuery(query) )
    {
      while (result.next())
      {
        String tempTitle = result.getString("Title").trim();
        int tempYear = result.getInt("Year");
        double tempPrice = result.getDouble("Price");
        Movie tempMovie = new Movie(tempTitle, tempYear, tempPrice);
        movieArrayList.add(tempMovie);
      }
    }
  }

//  public ArrayList<Movie> fetchMovieList(Connection conn)
//      throws SQLException
//  {
//    ArrayList<Movie> movieArrayList = new ArrayList<>();
//    String query = "SELECT Title, Year, Price FROM Movie";
//    try (Statement stat = conn.createStatement();
//          ResultSet result = stat.executeQuery(query))
//    {
//      while (result.next())
//      {
//        String tempTitle = result.getString("Title").trim();
//        int tempYear = result.getInt("Year");
//        double tempPrice = result.getDouble("Price");
//        Movie tempMovie = new Movie(tempTitle, tempYear, tempPrice);
//        movieArrayList.add(tempMovie);
//      }
//    }
//    return movieArrayList;
//  }

  /**
   * Gets a connection from the properties specified in the file database.properties.
   * @return The database connection.
   * @throws SQLException
   * @throws IOException
   */
  public Connection getConnection()
      throws SQLException, IOException
  {
    Properties props = new Properties();
    String drivers, url, user, password;
    try (InputStream in = Files.newInputStream(Paths.get("database.properties")))
    {
      props.load(in);
    }
    drivers = props.getProperty("jdbc.drivers");
    if (drivers != null)
    {
      System.setProperty("jdbc.drivers", drivers);
    }
    url = props.getProperty("jdbc.url");
    user = props.getProperty("jdbc.user");
    password = props.getProperty("jdbc.password");
    return DriverManager.getConnection(url, user, password);
  }
}























