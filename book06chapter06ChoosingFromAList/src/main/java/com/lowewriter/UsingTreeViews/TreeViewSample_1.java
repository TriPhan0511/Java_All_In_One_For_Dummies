package com.lowewriter.UsingTreeViews;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TreeViewSample_1 extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
//    Declare nodes which aren't leaf nodes
    TreeItem<String> root;
    TreeItem<String> branch_1, branch_1_1, branch_1_1_1,
                      branch_2, branch_2_1;

//    Create the root node
    root = new TreeItem<>("root");
    root.setExpanded(true);

// Create the branch_1
    branch_1 = makeShow("branch_1", root);
    branch_1_1 = makeShow("branch_1_1_1", branch_1);
    branch_1_1_1 = makeShow("branch_1_1_1", branch_1_1);
    makeShow("branch_1_1_1_1", branch_1_1_1);

//    Create the branch_2
    branch_2 = makeShow("branch_2", root);
    branch_2_1 = makeShow("branch_2_1", branch_2);
    makeShow("branch_2_1_1", branch_2_1);
    makeShow("branch_2_1_1_2", branch_2_1);

//    Create the branch_3
    makeShow("branch_3", root);

//    Create the branch_4
    makeShow("branch_4", root);

//    Create a tree
    TreeView<String> tree = new TreeView<>(root);

//    Add the tree to a pane
    HBox pane = new HBox(tree);
    pane.setPadding(new Insets(20));

//    Finish
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("TreeView Sample 1");
    primaryStage.show();
  }

  //  Helper method
  private TreeItem<String> makeShow(String title, TreeItem<String> parent)
  {
    TreeItem<String> show = new TreeItem<>(title);
    show.setExpanded(true);
    parent.getChildren().add(show);
    return show;
  }
}



































