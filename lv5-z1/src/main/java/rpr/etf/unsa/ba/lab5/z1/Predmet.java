package rpr.etf.unsa.ba.lab5.z1;

import java.util.ArrayList;
import java.util.List;

public class Predmet implements MozeOcijeniti {
    private String naziv, opis;
    private List<Ocjena> ocjene;
    Predmet(){
        this.ocjene=new ArrayList<>();
    }

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
    public List<Ocjena> getOcjene(){
        return ocjene;
    }
    @Override
    public Ocjena ocijeni(int ocjena) {
        Ocjena novaOcjena = new Ocjena(null, ocjena);
        ocjene.add(novaOcjena);
        return novaOcjena;
    }
}
