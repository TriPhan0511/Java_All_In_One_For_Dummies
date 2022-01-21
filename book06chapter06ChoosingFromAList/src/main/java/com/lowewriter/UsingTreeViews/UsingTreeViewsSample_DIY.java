package com.lowewriter.UsingTreeViews;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UsingTreeViewsSample_DIY extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Create a TreeView pane
    TreeItem<String> root = new TreeItem<>("Spin Offs");

    TreeItem<String> theAndyGriffithShow = new TreeItem<>("The Andy Griffith Show");
    TreeItem<String> gomer = new TreeItem<>("Gomer Pyle, U.S.M.C");
    TreeItem<String> mayberry = new TreeItem<>("Mayberry R.F.D");
    theAndyGriffithShow.getChildren().addAll(gomer, mayberry);

    TreeItem<String> allInTheFamily = new TreeItem<>("All in the Family");
    TreeItem<String> theJeffersons = new TreeItem<>("The Jeffersons");
    theJeffersons.getChildren().add(new TreeItem<>("Checking In"));
    TreeItem<String> maude = new TreeItem<>("Maude");
    maude.getChildren().add(new TreeItem<>("Good Times"));
    allInTheFamily.getChildren().addAll(theJeffersons,
        maude,
        new TreeItem<>("Gloria"),
        new TreeItem<>("Archie Bunker's Place"));

    TreeItem<String> happyDays = new TreeItem<>("Happy Days");
    happyDays.getChildren().addAll(new TreeItem<>("Mork and Mindy"),
        new TreeItem<>("Laverne and Shirley"),
        new TreeItem<>("Joanie Loves Chachi"));

    root.getChildren().addAll(theAndyGriffithShow,
        allInTheFamily,
        happyDays);

    TreeView<String> treeView = new TreeView<>(root);
    HBox pane = new HBox(10, treeView);
    pane.setPadding(new Insets(20, 20, 40, 20));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("TreeView Sample");
    primaryStage.show();
  }
}
































