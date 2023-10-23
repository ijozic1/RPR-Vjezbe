package rpr.lab2.z2;

import rpr.lab2.z2.Osoba;
import rpr.lab2.z2.Racun;
public class Korisnik extends Osoba{
    private Racun racun;
    Korisnik(String ime, String prezime){
        setIme(ime);
        setPrezime(prezime);
    }
    public void dodajRacun(Racun r){
        this.racun=r;
    }
}
