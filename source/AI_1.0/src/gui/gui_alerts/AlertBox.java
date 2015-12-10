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

public class AlertBox{

    public static void display(String title, String message){

        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button cButton = new Button("Close");
        cButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, cButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        //Add Layout
        scene.getStylesheets().add("alert_box");
        window.setScene(scene);
        window.showAndWait();

    }
}
