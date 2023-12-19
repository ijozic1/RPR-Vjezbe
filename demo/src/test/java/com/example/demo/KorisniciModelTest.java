package com.example.demo;

import org.junit.jupiter.api.Test;
import javafx.beans.property.ObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class KorisniciModelTest {

    @Test
    void testNapuni() {
        KorisniciModel korisniciModel = new KorisniciModel();
        korisniciModel.napuni(); // Dodaj nekoliko korisnika u model

        // Trenutni korisnik treba biti null prije dodavanja novog korisnika
        assertNull(korisniciModel.getTrenutniKorisnik());

        // Dodaj novog korisnika
        korisniciModel.napuni();

        // Provjeri da li je dodan novi korisnik
        assertNotNull(korisniciModel.getTrenutniKorisnik());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getIme());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getPrezime());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getEmail());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getUsername();
        assertEquals("", korisniciModel.getTrenutniKorisnik().getLozinka());
    }
}