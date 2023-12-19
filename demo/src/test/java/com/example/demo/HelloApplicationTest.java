package com.example.demo;

import org.junit.jupiter.api.Test;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.TextInputControlMatchers.hasText;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {
    @Override
    public void start(Stage stage) {
        // Pokreće JavaFX aplikaciju prije nego što počnu TestFX testovi
        new HelloApplication().start(stage);
    }

    @Test
    void testDodajButtonAction() {
        // Prikazuje scenu u kojoj se odvija test
        HelloController controller = FxToolkit.controller(HelloController.class);
        controller.onDodajButtonClick("#dodajDugme");

        // Provjerava da li su polja za unos prazna nakon klika na Dodaj
        verifyThat("#imePolje", hasText(""));
        verifyThat("#prezimePolje", hasText(""));
        verifyThat("#eMailPolje", hasText(""));
        verifyThat("#usernamePolje", hasText(""));
        verifyThat("#lozinkaPolje", hasText(""));
    }
}