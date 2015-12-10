package gui.gui_welcome;/**
 * Created by Daniel on 04/12/2015.
 */

import gui.Util;
import gui.file_chooser.FChooser;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WelcomeScreen {
    Stage window = new Stage();
    BorderPane borderPane = new BorderPane();
    Scene scene = new Scene(borderPane, 650, 350);

    private Desktop desktop = Desktop.getDesktop();

    public Scene create(){
        borderPane.setId("pane");

        Util.setStyle(scene, "src/css/main_screen.css");

        borderPane.setTop(createTop());
        borderPane.setCenter(setContent());

        return scene;
    }

    private HBox setContent(){
        Button add = new Button();
        add.setId("tool-butt");
        add.setId("tool-add");
        Button open = new Button("open");
        open.setId("tool-butt");

        ToolBar toolBar = new ToolBar(
                add,
                open
        );

        final FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );

        add.setOnAction(e->{
            //open up file selector
            //window.setScene(scene);
            File file = fileChooser.showOpenDialog(window);
            if (file != null) openFile(file);
        });

        HBox hBox = new HBox(toolBar);
        setFullWidth(borderPane, toolBar);
        toolBar.setId("content-bar");

        return hBox;
    }

    private void chooser(){

    }

    private GridPane createTop(){
        GridPane header = new GridPane();

        Label label = new Label("Welcome to...");
        label.setId("welcome-label");

        Label ai = new Label("Artificial Intelligence |");
        ai.setId("welcome-label-ai");

        Label module = new Label("CM0671");
        module.setId("welcome-label-module");

        header.add(label, 0,1); //column, row
        header.add(ai,0, 2 );
        header.add(module, 1, 2);

        return header;
    }

    private void setTheStyle(Scene scene){
        //Add Stylesheet
        File file = new File("src/css/main_screen.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///"+file.getAbsolutePath().replace("\\","/"));
    }

    public void setFullWidth(BorderPane borderPane, ToolBar toolBar) {
        toolBar.prefWidthProperty().bind(borderPane.widthProperty());
        toolBar.prefHeightProperty().bind(borderPane.heightProperty());
    }


    private void openFile(File file){
        try{
            desktop.open(file);
        } catch (IOException ex){
            Logger.getLogger(
                    FChooser.class.getName()).log(
                    Level.SEVERE, null, ex
            );
        }
    }
}
