package com.example.demo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class LoginController {
    public LoginController(KorisniciModel model) {
        this.model = model;
        this.model.setTrenutniKorisnik(this.model.getKorisnici().getFirst());
    }
    private KorisniciModel model;
    //private ObservableList<Korisnik> listaKorisnika=FXCollections.observableArrayList();
    public Button krajDugme;
    public Button dodajDugme;
    public PasswordField lozinkaPolje;
    public TextField imePolje;
    public TextField prezimePolje;
    public TextField eMailPolje;
    public TextField usernamePolje;
    public ListView<Korisnik> lista;
    @FXML
    private Label welcomeText;

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
                lozinkaPolje.textProperty().unbindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());
            }


            model.setTrenutniKorisnik(newUser);


            if (newUser == null) {
                imePolje.setText("");
                prezimePolje.setText("");
                eMailPolje.setText("");
                usernamePolje.setText("");
                lozinkaPolje.setText("");
            } else {
                imePolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
                prezimePolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
                eMailPolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().eMailProperty());
                usernamePolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
                lozinkaPolje.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());
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