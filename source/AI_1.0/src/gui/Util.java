package gui;/**
 * Created by Daniel on 30/11/2015.
 */

import gui.gui_alerts.ConfirmBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.text.html.StyleSheet;
import java.io.File;

public class Util {

    /**
     * isInt()
     * Validates Ints
     * @param input
     * @param message
     * @return
     */
    public static boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(message);
            System.out.println("User is: " + age);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Error" + message + " is not a number.");
            return false;
        }
    }

    public static void setStyle(Scene scene, String location){
        //Add Stylesheet
        File file = new File(location);
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///"+file.getAbsolutePath().replace("\\","/"));
    }

    /**
     * programClose()
     * Closes the window.
     * @param window
     */
    public static void programClose(Stage window){
        boolean answer = ConfirmBox.display("Confirm", "Are you sure you want to exit?");
        if (answer) window.close();
    }

    public static void closeWindow(Stage window){
        window.setOnCloseRequest(e ->{
            e.consume();
            Util.programClose(window);
        });
    }

    /**
     * Closes program. Enables exit without stage.
     */
    public static void exit(){

        System.exit(0);

    }

    /**
     * Closes program. Enables proper exit with stage.
     * @param window
     */
    public static void exit(Stage window){
        window.close();
    }

    /*public void close(){
        Button button = new Button("Close");
        button.setOnAction(e -> Util.programClose(window));

        //Close request on 'X'
        window.setOnCloseRequest(e ->{
            e.consume();
            Util.programClose(window);
        });
    }*/

    /*public static StyleSheet getCssClass(String fileLocation, Scene scene ){
        File file = new File(fileLocation);
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///"+file.getAbsolutePath().replace("\\","/"));

        return StyleSheet;
    }*/

}// end of class
