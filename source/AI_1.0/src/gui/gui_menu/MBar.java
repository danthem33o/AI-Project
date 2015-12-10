package gui.gui_menu;/**
 * Created by Daniel on 01/12/2015.
 */

import gui.gui_alerts.AlertBox;
import gui.gui_alerts.ConfirmBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.Stage;

import java.io.File;

public class MBar {
    MenuBar menuBar = new MenuBar();

    public MenuBar create() {
        Menu fileMenu = createFileMenu();

        //----------------------- EDIT sub items
        Menu editMenu = new Menu("_Edit");


        //Main menu bar

        menuBar.getMenus().addAll(fileMenu, editMenu);

        return menuBar;
    }


    //----------------------------------------------- FILE MENU
    private Menu createFileMenu(){
        //File Menu
        Menu fileMenu = new Menu("_File");

        //Add sub menu items
        MenuItem newFile = addSubOne();         //new file
        MenuItem addFile = addSubTwo();         //Add File
        SeparatorMenuItem smi = new SeparatorMenuItem();
        smi.setId("sdi");
            fileMenu.getItems().add(new SeparatorMenuItem()); //Line divide
        MenuItem settingsFile = addSubThree();  //Add settings
            fileMenu.getItems().add(new SeparatorMenuItem()); //Line divide
        MenuItem exitFile = addSubFour();       //Add exit

        //Add all
        fileMenu.getItems().addAll(newFile, addFile, settingsFile, exitFile);

        return fileMenu;

    }

    //----------------------------------------- FILE MENU - SUB ITEMS
    public MenuItem addSubOne(){
        MenuItem newFile = new MenuItem("New...");

        newFile.setOnAction(e -> {
            AlertBox.display("New Document",
                    "Are you sure you wish to open a new document?");
            System.out.println("Open up new dialog box");
        });

        return newFile;
    }

    public MenuItem addSubTwo(){
        MenuItem addFile = new MenuItem("Add data set...");

        addFile.setOnAction(e -> {
            System.out.println("This adds");
        });

        return addFile;
    }

    public MenuItem addSubThree(){
        MenuItem settingsFile = new Menu("Settings");

        settingsFile.setOnAction(e -> {
            System.out.println("Settings reached");
        });

        return settingsFile;
    }

    public MenuItem addSubFour(){
        MenuItem exitFile = new Menu("Exit");

        //On click event - ask to leave.
        exitFile.setOnAction(e -> {
            System.out.println("exit reached");
            Boolean answer = ConfirmBox.display("Exit",
                    "Are you sure you wish to exit?");
        });

        return exitFile;
    }

    public void setFullWidth(Stage stage){

        menuBar.prefWidthProperty().bind(stage.widthProperty());

    }


}//End class
