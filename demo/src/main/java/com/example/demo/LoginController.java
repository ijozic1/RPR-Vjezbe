package com.example.demo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;


public class LoginController {
    private KorisniciModel model;
    //private ObservableList<Korisnik> listaKorisnika=FXCollections.observableArrayList();
    public Button krajDugme, dodajDugme;
    public PasswordField lozinkaPolje;
    public TextField imePolje, prezimePolje, eMailPolje, usernamePolje;
    public ListView<Korisnik> lista;

    public LoginController(KorisniciModel model) {
        this.model = model;
        lista=new ListView<>();
        this.model.setTrenutniKorisnik(this.model.getKorisnici().getFirst());
    }
    public void onDodajButtonClick(ActionEvent actionEvent) {
        Korisnik novi=new Korisnik();
        model.napuni(novi);
        lista.getSelectionModel().select(novi);
    }

    public void onKrajButtonClick(ActionEvent actionEvent) {
       /* Stage stage=(Stage) krajDugme.getScene().getWindow();
        stage.close();*/
        System.exit(0);
    }
    @FXML
    public void initialize() {
        if (model.getTrenutniKorisnik() == null) {
            imePolje.setText("");
            prezimePolje.setText("");
            eMailPolje.setText("");
            usernamePolje.setText("");
            lozinkaPolje.setText("");
        }
        else {
            imePolje.setText(model.getTrenutniKorisnik().getIme());
            prezimePolje.setText(model.getTrenutniKorisnik().getPrezime());
            eMailPolje.setText(model.getTrenutniKorisnik().getEmail());
            usernamePolje.setText(model.getTrenutniKorisnik().getUsername());
            lozinkaPolje.setText(model.getTrenutniKorisnik().getLozinka());
        }

        lista.setItems(model.getKorisnici());

        lista.getSelectionModel().selectedItemProperty().addListener(((observableValue, oldUser, newUser) -> {
            if (oldUser != null) {
                imePolje.textProperty().unbindBidirectional(oldUser.imeProperty());
                //imePolje.textProperty().unbindBidirectional(model.getTrenutniKorisnik().imeProperty()); //moglo i ovako
                prezimePolje.textProperty().unbindBidirectional(oldUser.prezimeProperty());
                eMailPolje.textProperty().unbindBidirectional(oldUser.eMailProperty());
                usernamePolje.textProperty().unbindBidirectional(oldUser.usernameProperty());
                lozinkaPolje.textProperty().unbindBidirectional(oldUser.lozinkaProperty());
            }

            model.setTrenutniKorisnik(newUser);

            if (newUser == null) {
                imePolje.setText("");
                prezimePolje.setText("");
                eMailPolje.setText("");
                usernamePolje.setText("");
                lozinkaPolje.setText("");
            }
            else {
                imePolje.textProperty().bindBidirectional(newUser.imeProperty());
                //imePolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
                prezimePolje.textProperty().bindBidirectional(newUser.prezimeProperty());
                eMailPolje.textProperty().bindBidirectional(newUser.eMailProperty());
                usernamePolje.textProperty().bindBidirectional(newUser.usernameProperty());
                lozinkaPolje.textProperty().bindBidirectional(newUser.lozinkaProperty());
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

    private void refreshajListu(TextField naziv) {
        naziv.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                lista.refresh();
            }
        });
    }
}