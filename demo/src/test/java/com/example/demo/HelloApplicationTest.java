package com.example.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.Test;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.TextInputControlMatchers.hasText;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(ApplicationExtension.class)
class HelloApplicationTest {
    @Start
    public void start(Stage stage) throws IOException {
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setController(new HelloController(model));
        Scene scene = new Scene(fxmlLoader.load(), 398, 288);
        stage.setTitle("Login forma");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.toFront();
    }

    @Test
    void testDodajButtonAction(FxRobot robot) {
        /*HelloController controller = FxToolkit.controller(HelloController.class);
        controller.onDodajButtonClick("#dodajDugme");

        // Provjerava da li su polja za unos prazna nakon klika na Dodaj
        verifyThat("#imePolje", hasText(""));
        verifyThat("#prezimePolje", hasText(""));
        verifyThat("#eMailPolje", hasText(""));
        verifyThat("#usernamePolje", hasText(""));
        verifyThat("#lozinkaPolje", hasText(""));*/
        TextField fldKorisnickoIme = robot.lookup("#usernamePolje").queryAs(TextField.class);
        robot.clickOn("#usernamePolje");
        robot.write("anonymous");
        robot.clickOn("#dodajDugme");
        assertEquals("", fldKorisnickoIme.getText());
    }

}
