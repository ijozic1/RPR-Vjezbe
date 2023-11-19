package rpr.etf.unsa.ba.lab5.z1;

import java.util.ArrayList;
import java.util.List;

public class InformacijeONastavniku extends LicneInformacije{
    private String titula;
    private List<Ocjena> ocjene = new ArrayList<>();
    InformacijeONastavniku(){}
    InformacijeONastavniku(String ime, String prezime, String titula){
        this.setIme(ime);
        this.setPrezime(prezime);
        this.titula=titula;
    }
    public String getTitula() {
        return titula;
    }
    public void setTitula(String titula) {
        this.titula = titula;
    }
    @Override
    public String predstavi(){
        return "Nastavnik: "+getIme()+" "+getPrezime()+", titula: "+getTitula();
    }
    public void dodajOcjenu(Ocjena o){
        ocjene.add(o);
    }
}
