package gui;/**
 * Created by Daniel on 30/11/2015.
 */

import gui.gui_content.MContent;
import gui.gui_list.MList;
import gui.gui_menu.MBar;
import gui.gui_welcome.WelcomeScreen;
import javafx.application.Application;
import javafx.beans.binding.StringBinding;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import sun.reflect.generics.tree.Tree;

import java.io.File;

public class Main extends Application {
    //----------------------------------------------- ATTRIBUTES
    private Stage window = new Stage();
    private static double HEIGHT = 900;
    private static double WIDTH  = 1800;


    //----------------------------------------------- MAIN
    public static void main(String[] args) {
        launch(args);
    }

    //----------------------------------------------- METHODS
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Master Page");
        window = primaryStage;
        initialisation();
    }

    public void initialisation(){
        //Create the main layout and set to scene
        //Load .css file
        Scene scene = new Scene(createMainLayout());
        File file = new File("src/css/main.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///"+file.getAbsolutePath().replace("\\","/"));
        //If send request to close
        Util.closeWindow(window);
        window.setTitle("AI Project");
        window.setScene(scene);
        window.show();
    }

    public BorderPane createMainLayout(){
        //Top Menu
        HBox topMenu = createTopMenu();
        //Side Menu
        VBox leftMenu = createLeftMenu();
        //Content
        AnchorPane anchorPane = createContent();

        //Layout
        BorderPane borderPane = new BorderPane();
        //borderPane.setBottom(footer);
        //borderPane.setCenter(content);
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        borderPane.setCenter(anchorPane);
        borderPane.setMinHeight(HEIGHT);
        borderPane.setMinWidth(WIDTH);

        return borderPane;
    }

    private HBox createTopMenu(){
        //------------------------ Top menu
        HBox topMenu = new HBox();
        MBar menu = new MBar(); // MenuBar object
        menu.setFullWidth(window);
        topMenu.getChildren().add(menu.create());

        return topMenu;
    }

    private VBox createLeftMenu(){
        VBox leftMenu = new VBox();
        //Creates list and adds to left menu
        MList list = new MList();
        list.setFullHeight(window);
        leftMenu.getChildren().add(list.create());

        return leftMenu;
    }

    private AnchorPane createContent(){
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setId("content-pane");
        MContent content = new MContent();

        WelcomeScreen welcomeScreen = new WelcomeScreen();
        Button button = new Button("Test");
        button.setOnAction(e -> {
            window.setScene(welcomeScreen.create());
        });


        anchorPane.getChildren().addAll(content.create(), button);
        content.setFullWidth(anchorPane);

        return anchorPane;
    }

}// end of class
