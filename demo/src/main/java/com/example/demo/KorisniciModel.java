package com.example.demo;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici;
    private ObjectProperty<Korisnik> trenutniKorisnik;

    public KorisniciModel(){
        korisnici=FXCollections.observableArrayList();
        trenutniKorisnik=new SimpleObjectProperty<>();
    }

    public ObservableList<Korisnik> getKorisnici(){
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici){
        this.korisnici=korisnici;

        if(korisnici.isEmpty()) setTrenutniKorisnik(null);
        else setTrenutniKorisnik(this.korisnici.get(0));
    }

    public Korisnik getTrenutniKorisnik(){
        return trenutniKorisnik.get();
    }

    public ObjectProperty<Korisnik> trenutniKorisnikProperty(){
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trKorisnik){
        this.trenutniKorisnik.set(trKorisnik);
    }

    public void napuni(){
        korisnici.add(new Korisnik("Ivona", "Jozic", "ijozic1@etf.unsa.ba", "ijozic1", "12345"));
    }
}
