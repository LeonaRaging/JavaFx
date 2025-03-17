package com.beginsecure.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Region createContent() {
        return new Label("Hello World");
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Scene scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}