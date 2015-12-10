package gui.gui_alerts;/**
 * Created by Daniel on 30/11/2015.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;

public class ConfirmBox{

    private static boolean ANSWER;
    private static Stage window = new Stage();

    public static boolean display(String title, String message){

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button yButton = new Button("YES");
        yButton.setOnAction(e ->{
            ANSWER = true;
            window.close();
        });
        Button nButton = new Button("NO");
        nButton.setOnAction(e ->{
            ANSWER = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yButton, nButton);
        layout.setAlignment(Pos.CENTER);
        layout.setId("confirm-box");

        Scene scene = new Scene(layout);
        File file = new File("src/css/alerts/confirm_box.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///"+file.getAbsolutePath().replace("\\","/"));
        window.setScene(scene);
        window.showAndWait();

        return ANSWER;
    }

    public static void closeWindow(){
        window.close();
    }

    private void initialise(){

    }
}
