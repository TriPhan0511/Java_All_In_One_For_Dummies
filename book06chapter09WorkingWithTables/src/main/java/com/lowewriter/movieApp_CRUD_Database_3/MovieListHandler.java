package com.lowewriter.movieApp_CRUD_Database_3;

import java.util.List;

public class MovieListHandler
{
  public static int search(List<Movie> list, String title)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getTitle().equalsIgnoreCase(title))
      {
        return i;
      }
    }
    return -999;
  }

  public static Movie getItem(List<Movie> list, String title)
  {
    int index = search(list, title);
    if (index == -999)
    {
      return null;
    }
    return list.get(index);
  }

  public static boolean addItem(List<Movie> list, Movie movie)
  {
    int index = search(list, movie.getTitle());
    if (index != -999)
    {
      return false;
    }
    list.add(movie);
    return true;
  }

  public static boolean removeItem(List<Movie> list, Movie movie)
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





























