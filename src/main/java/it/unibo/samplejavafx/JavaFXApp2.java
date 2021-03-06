package it.unibo.samplejavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXApp2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label message = new Label("Hello again JavaFX!"); 
        message.setFont(new Font(100));
        primaryStage.setScene(new Scene(message));
        primaryStage.setTitle("JavaFXApp2");
        primaryStage.show();
    }

    public static void main(String... args) {
        launch();
    }
}
