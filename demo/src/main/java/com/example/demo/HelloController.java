package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public Button krajDugme;
    public Button dodajDugme;
    public PasswordField lozinkaPolje;
    public TextField imePolje;
    public TextField prezimePolje;
    public TextField eMailPolje;
    public TextField usernamePolje;
    @FXML
    private Label welcomeText;

    @FXML
    /*protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    public void onDodajButtonClick(ActionEvent actionEvent) {
    }

    public void onKrajButtonClick(ActionEvent actionEvent) {
    }
}