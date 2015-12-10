package gui.file_chooser;/**
 * Created by Daniel on 04/12/2015.
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FChooser {
    Stage stage = new Stage();
    private Desktop desktop = Desktop.getDesktop();

    public void test(Stage stage){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Data Set");
        fileChooser.showOpenDialog(stage);
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

}//End class
