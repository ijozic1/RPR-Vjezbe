package com.example.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.Test;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.TextInputControlMatchers.hasText;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(ApplicationExtension.class)
class LoginApplicationTest {
    @Start
    public void start(Stage stage) throws IOException {
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setController(new LoginController(model));
        Scene scene = new Scene(fxmlLoader.load(), 398, 288);
        stage.setTitle("Login forma");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.toFront();
    }

    @Test
    void testDodajButtonAction(FxRobot robot) {
        //Test 1
        TextField fldKorisnickoIme = robot.lookup("#usernamePolje").queryAs(TextField.class);
        robot.clickOn("#usernamePolje");
        robot.write("anonymous");
        robot.clickOn("#dodajDugme");
        assertEquals("", fldKorisnickoIme.getText());
    }

    @Test
    void testDodajButtonAction1(FxRobot robot) {
        //Test 2
        TextField fldIme= robot.lookup("#imePolje").queryAs(TextField.class);
        TextField fldPrezime= robot.lookup("#prezimePolje").queryAs(TextField.class);
        TextField fldEmail= robot.lookup("#eMailPolje").queryAs(TextField.class);
        TextField fldKorisnickoIme = robot.lookup("#usernamePolje").queryAs(TextField.class);
        TextField fldLozinka= robot.lookup("#lozinkaPolje").queryAs(TextField.class);
        robot.clickOn("#dodajDugme");

        assertEquals("", fldIme.getText());
        assertEquals("", fldPrezime.getText());
        assertEquals("", fldEmail.getText());
        assertEquals("", fldKorisnickoIme.getText());
        assertEquals("", fldLozinka.getText());

    }
}
