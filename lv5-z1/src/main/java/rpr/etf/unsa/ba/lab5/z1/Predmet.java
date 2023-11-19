package rpr.etf.unsa.ba.lab5.z1;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
    private String naziv, opis;
    private List<Ocjena> ocjene=new ArrayList<>();
    Predmet(){}

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String predstavi(){
        return "Naziv predmeta: "+getNaziv()+", opis: "+getOpis();
    }

    public void dodajOcjenu(Ocjena o){
        ocjene.add(o);
    }
}
