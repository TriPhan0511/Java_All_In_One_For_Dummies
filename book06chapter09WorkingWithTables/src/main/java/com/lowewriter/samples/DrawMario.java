package com.lowewriter.samples;

public class DrawMario
{
  public static void main(String[] args)
  {
    String shape = "#";
    int height = 8;
    int spaceLength = height - 1;
    int shapeLength;
    for (int i = 0; i < height; i++)
    {
      shapeLength = height - spaceLength;
      for (int t = 0; t < spaceLength; t++)
      {
        System.out.print(" ");
      }
      for (int k = 0; k < shapeLength; k++)
      {
        System.out.print(shape);
      }
      System.out.print(" ");
      for (int r = 0; r < shapeLength; r++)
      {
        System.out.print(shape);
      }
      System.out.println();
      spaceLength--;
    }
  }
}
