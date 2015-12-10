package gui.gui_list;/**
 * Created by Daniel on 01/12/2015.
 */

import javafx.application.Application;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

public class MList {
    TreeView<String> tree = new TreeView<>();

    public TreeView<String> create() {
        TreeItem<String> root = new TreeItem<>();
        root.setExpanded(true);

        //First branch
        TreeItem<String> item1;
        item1 = makeBranch("Data set 1", root);
        makeBranch("Branch 1", item1);
        makeBranch("Branch 2", item1);
        makeBranch("Branch 3", item1);

        //Second branch
        TreeItem<String> item2;
        //item2.getGraphic();
        item2 = makeBranch("Data set 2", root);
        makeBranch("Branch 1", item2);
        makeBranch("BRanch 2", item2);
        makeBranch("Branch 3", item2);
        makeBranch("Branch 4", item2);

        //Create tree

        tree.setRoot(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedIndexProperty()
                .addListener((v, oldValue, newValue) -> {
                    //if(newValue != null) System.out.println(newValue.getValue());
                });

        return tree;
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);

        return item;
    }

    public void setFullHeight(Stage stage){
        tree.prefHeightProperty().bind(stage.widthProperty());
    }
}// end of class
