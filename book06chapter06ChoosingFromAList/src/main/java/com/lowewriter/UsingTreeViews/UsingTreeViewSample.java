package com.lowewriter.UsingTreeViews;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsingTreeViewSample extends Application
{
  public static void main(String[] args)
  {
    launch();
  }

  //  Class fields
  TreeView<String> treeView;
  Label showNameLabel;

  @Override
  public void start(Stage primaryStage)
  {
//    Building a tree
//    Declare TreeItem variables for nodes that aren't leaf nodes
    TreeItem<String> root, andy, archie,
        happy, george, maude;

//    Create the root node and set its expanded status to true
    root = new TreeItem<>("Spin Offs");
    root.setExpanded(true);

//    Create another nodes
    andy = makeShow("The Anddy Griffith Show", root);
    makeShow("Gomer Pyle, U.S.M.C", andy);
    makeShow("Mayberry R.F.D", andy);

    archie = makeShow("All in the Family", root);
    george = makeShow("The Jeffersons", archie);
    makeShow("Checking In", george);
    maude = makeShow("Maude", archie);
    makeShow("Good Times", maude);
    makeShow("Gloria", archie);
    makeShow("Archie Bunker's Place", archie);

    happy = makeShow("Happy Days", root);
    makeShow("Mork and Mindy", happy);
    makeShow("Laverne and Shirley", happy);
    makeShow("Joanie Loves Chachi", happy);

//    Creating a TreeView control
    treeView = new TreeView<>(root);
//    Allow the user to select multiple nodes
    treeView.getSelectionModel().setSelectionMode(
        SelectionMode.MULTIPLE);
//    Hide the root not (if you want)
    treeView.setShowRoot(false);

//    Get the selected nodes
    treeView.getSelectionModel().selectedItemProperty()
        .addListener((v, oldValue, newValue) -> treeView_SelectionChanged(newValue));

//    Create the showNameLabel
    showNameLabel = new Label();

//    Add the treeView, showNameLabel to a VBox pane
    VBox pane = new VBox(10, treeView, showNameLabel);
    pane.setPadding(new Insets(20));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("My Favorite Spin Offs");
    primaryStage.show();
  }

  private void treeView_SelectionChanged(TreeItem<String> item)
  {
    if (item != null)
    {
      showNameLabel.setText(item.getValue());
    }
  }

  //  Helper method
  private TreeItem<String> makeShow(String title,
                        TreeItem<String> parent)
  {
    TreeItem<String> show = new TreeItem<>(title);
    show.setExpanded(true);
    parent.getChildren().add(show);
    return show;
  }
}





























