package rpr.etf.unsa.ba.lab5.z1;

import java.util.ArrayList;
import java.util.List;

public class InformacijeONastavniku extends LicneInformacije{
    private String titula;
    private List<Ocjena> ocjene;
    InformacijeONastavniku(){
        this.ocjene = new ArrayList<>();
    }
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
    public List<Ocjena> getOcjene() {
        return ocjene;
    }
    public Ocjena ocijeni(int ocjena) {
        Ocjena novaOcjena = new Ocjena(null, ocjena);
        ocjene.add(novaOcjena);
        return novaOcjena;
    }
}
