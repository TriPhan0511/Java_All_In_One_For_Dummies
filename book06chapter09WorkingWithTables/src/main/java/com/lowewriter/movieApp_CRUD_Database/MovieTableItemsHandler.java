package com.lowewriter.movieApp_CRUD_Database;

import javafx.collections.ObservableList;

public class MovieTableItemsHandler
{
  public int search(ObservableList<Movie> list, String title)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getTitle().equals(title))
      {
        return i;
      }
    }
    return -999;
  }

  public Movie getItem(ObservableList<Movie> list, String title)
  {
    int index = search(list, title);
    if (index == -999)
    {
      return null;
    }
    return list.get(index);
  }

  public boolean addItem(ObservableList<Movie> list, Movie movie)
  {
    int index = search(list, movie.getTitle());
    if (index != -999)
    {
      return false;
    }
    list.add(movie);
    return true;
  }

  public boolean removeItem(ObservableList<Movie> list, Movie movie)
  {
    int index = search(list, movie.getTitle());
    if (index == -999)
    {
      return false;
    }
    list.remove(index);
    return true;
  }
}





























