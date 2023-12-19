package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class HelloController {
    private KorisniciModel model;
    //private ObservableList<Korisnik> listaKorisnika=FXCollections.observableArrayList();
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

    public void onDodajButtonClick(ActionEvent actionEvent) {
        Korisnik novi=new Korisnik();
        model.napuni(novi);
        lista.getSelectionModel().select(novi);
    }

    public void onKrajButtonClick(ActionEvent actionEvent) {
        Stage stage=(Stage) krajDugme.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void initialize() {
        lista.setItems(model.getKorisnici());
        lista.getSelectionModel().selectedItemProperty().addListener(((observableValue, oldUser, newUser) -> {
            if (oldUser != null) {
                /*imePolje.textProperty().unbindBidirectional(oldUser.imeProperty());
                prezimePolje.textProperty().unbindBidirectional(oldUser.prezimeProperty());
                eMailPolje.textProperty().unbindBidirectional(oldUser.eMailProperty());
                usernamePolje.textProperty().unbindBidirectional(oldUser.usernameProperty());
                lozinkaPolje.textProperty().unbindBidirectional(oldUser.lozinkaProperty());*/
                imePolje.textProperty().unbindBidirectional(model.getTrenutniKorisnik().imeProperty());
                prezimePolje.textProperty().unbindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
                eMailPolje.textProperty().unbindBidirectional(model.getTrenutniKorisnik().eMailProperty());
                usernamePolje.textProperty().unbindBidirectional(model.getTrenutniKorisnik().usernameProperty());
                lozinkaPolje.textProperty().unbindBidirectional(model.getTrenutniKorisnik().imeProperty());
            }
            model.setTrenutniKorisnik(newUser);

            if (newUser == null) {
                imePolje.setText("");
                prezimePolje.setText("");
                eMailPolje.setText("");
                usernamePolje.setText("");
                lozinkaPolje.setText("");
            } else {
                /*imePolje.textProperty().bindBidirectional(newUser.imeProperty());
                prezimePolje.textProperty().bindBidirectional(newUser.imeProperty());
                eMailPolje.textProperty().bindBidirectional(newUser.imeProperty());
                usernamePolje.textProperty().bindBidirectional(newUser.imeProperty());
                lozinkaPolje.textProperty().bindBidirectional(newUser.imeProperty());*/
                imePolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
                prezimePolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
                eMailPolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().eMailProperty());
                usernamePolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
                lozinkaPolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
            }
            lista.refresh();
        }));
    }


    private void prikaziDetaljeOKorisniku(Korisnik korisnik) {
        imePolje.textProperty().bindBidirectional(korisnik.imeProperty());
        prezimePolje.textProperty().bindBidirectional(korisnik.prezimeProperty());
        eMailPolje.textProperty().bindBidirectional(korisnik.eMailProperty());
        usernamePolje.textProperty().bindBidirectional(korisnik.usernameProperty());
        lozinkaPolje.textProperty().bindBidirectional(korisnik.lozinkaProperty());
    }

    public void dodajKorisnika(){
        if(model.getTrenutniKorisnik()!=null && model.getTrenutniKorisnik().getUsername().equals("NEW.USER"))
            return;
        model.getKorisnici().add(new Korisnik());
        model.setTrenutniKorisnik(model.getKorisnici().getLast());

        lista.refresh();
    }
}