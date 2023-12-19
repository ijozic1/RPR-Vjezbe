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
        //test 1
        KorisniciModel korisniciModel = new KorisniciModel();
        korisniciModel.napuni();
        assertNull(korisniciModel.getTrenutniKorisnik());

        korisniciModel.napuni(new Korisnik("Ivona", "Jozic", "ijozic1@etf.unsa.ba","ijozic1","1234"));
        korisniciModel.getTrenutniKorisnik();
        assertEquals("Ivona", korisniciModel.getTrenutniKorisnik().getIme());
        assertEquals("Jozic", korisniciModel.getTrenutniKorisnik().getPrezime());
        assertEquals("ijozic1@etf.unsa.ba", korisniciModel.getTrenutniKorisnik().getEmail());
        assertEquals("ijozic1", korisniciModel.getTrenutniKorisnik().getUsername());
        assertEquals("1234", korisniciModel.getTrenutniKorisnik().getLozinka());
    }

    @Test
    void testNapuni1() {
        KorisniciModel korisniciModel = new KorisniciModel();
        korisniciModel.napuni();
        korisniciModel.getTrenutniKorisnik();

        assertNull(korisniciModel.getTrenutniKorisnik());

        korisniciModel.napuni();
        korisniciModel.getTrenutniKorisnik();
        assertNotNull(korisniciModel.getTrenutniKorisnik());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getIme());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getPrezime());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getEmail());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getUsername());
        assertEquals("", korisniciModel.getTrenutniKorisnik().getLozinka());
    }
}