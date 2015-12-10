package gui.gui_content;/**
 * Created by Daniel on 01/12/2015.
 */

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MContent {
    TabPane tabPane = new TabPane();

    public TabPane create() {

        Tab tab = new Tab();
        tab.setText("Tab 1");
        tab.setContent(new Rectangle(200,200, Color.valueOf("#282828")));
        tabPane.getTabs().add(tab);

        return tabPane;
    }

    private void setContent(){
        Button analyse = new Button("Analyse");
        analyse.setOnAction(e ->{

        });
    }


    public void setFullWidth(AnchorPane anchorPane) {
        tabPane.prefWidthProperty().bind(anchorPane.widthProperty());
    }
}
