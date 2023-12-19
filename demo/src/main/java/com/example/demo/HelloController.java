package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {
    public Button krajDugme;
    public Button dodajDugme;
    public PasswordField lozinkaPolje;
    public TextField imePolje;
    public TextField prezimePolje;
    public TextField eMailPolje;
    public TextField usernamePolje;
    public ListView lista;
    @FXML
    private Label welcomeText;

    @FXML
    /*protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    public void onDodajButtonClick(ActionEvent actionEvent) {
    }

    public void onKrajButtonClick(ActionEvent actionEvent) {
        Stage stage=(Stage) krajDugme.getScene().getWindow();
        stage.close();
    }
}