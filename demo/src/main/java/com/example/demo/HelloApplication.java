package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setController(new HelloController(model));
        Scene scene = new Scene(fxmlLoader.load(), 398, 288);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false); //ako hocu da se ne moze resize-ati prozor
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}