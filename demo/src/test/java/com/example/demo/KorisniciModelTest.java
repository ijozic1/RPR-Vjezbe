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
        //test 1 - konkretni podaci
        KorisniciModel korisniciModel = new KorisniciModel();
        korisniciModel.napuni();
        assertNull(korisniciModel.getTrenutniKorisnik());

        korisniciModel.setTrenutniKorisnik(new Korisnik("Ivona", "Jozic", "ijozic1@etf.unsa.ba","ijozic1","1234"));

        assertNotNull(korisniciModel.getTrenutniKorisnik());
        assertEquals("Ivona", korisniciModel.getTrenutniKorisnik().getIme());
        assertEquals("Jozic", korisniciModel.getTrenutniKorisnik().getPrezime());
        assertEquals("ijozic1@etf.unsa.ba", korisniciModel.getTrenutniKorisnik().getEmail());
        assertEquals("ijozic1", korisniciModel.getTrenutniKorisnik().getUsername());
        assertEquals("1234", korisniciModel.getTrenutniKorisnik().getLozinka());
    }

    @Test
    void testNapuni1() {
        //test2 - ubacivanje nullptr
        KorisniciModel korisniciModel = new KorisniciModel();
        korisniciModel.napuni();
        //assertEquals(korisniciModel.brojKorisnika(),1);

        assertNull(korisniciModel.getTrenutniKorisnik());
    }

    @Test
    void testNapuni2() {
        //test3 - prazni stringovi
        KorisniciModel korisniciModel = new KorisniciModel();

        korisniciModel.setTrenutniKorisnik(new Korisnik("","","","",""));
        Korisnik temp=korisniciModel.getTrenutniKorisnik();

        assertNotNull(temp);

        assertEquals("", temp.getIme());
        assertEquals("", temp.getPrezime());
        assertEquals("", temp.getEmail());
        assertEquals("", temp.getUsername());
        assertEquals("", temp.getLozinka());
    }

    @Test
    void brojKorisnikaTest() {
        //test4 - broj korisnika u KorisniciModel
        KorisniciModel korisniciModel = new KorisniciModel();
        korisniciModel.napuni(new Korisnik("Ivona", "Jozic", "ijozic1@etf.unsa.ba","ijozic1","1234"));
        assertEquals(korisniciModel.brojKorisnika(),1);
    }
}