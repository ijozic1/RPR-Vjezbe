package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;

public class LoginApplication extends Application {
    private ObservableList<Korisnik> ucitajPodatke(){
        ObservableList<Korisnik> lista=FXCollections.observableArrayList();
        lista.add(new Korisnik("Ivona", "Jozic", "ijozic1@etf.unsa.ba","ijozic1","1234"));
        lista.add(new Korisnik("Ismar", "Muslic", "imuslic1@etf.unsa.ba", "imuslic1", "5678"));
        return lista;
    }
    @Override
    public void start(Stage stage) throws IOException {
        KorisniciModel model = new KorisniciModel();
        model.setKorisnici(ucitajPodatke());

        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setController(new LoginController(model));

        Scene scene = new Scene(fxmlLoader.load(), 398, 288);
        stage.setTitle("Login forma");
        stage.setScene(scene);
        stage.setResizable(false); //ako hocu da se ne moze resize-ati prozor
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}