package rpr.etf.unsa.ba.lab5.z3;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaImena {
    private List<String> imenaIPrezimena;
    public KolekcijaImena(){
        imenaIPrezimena=new ArrayList<>();
    }
    public void dodajImeIPrezime(String ime){
        this.imenaIPrezimena.add(ime);
    }
    public void setImenaIPrezimena(List<String> imena){
        this.imenaIPrezimena=imena;
    }
    public List<String> getImenaIPrezimena(){
        return this.imenaIPrezimena;
    }
    public String getNajduzeIme(){
        String najduzeIme=new String();
        for(String ime : this.imenaIPrezimena){
            if(ime.length()>najduzeIme.length()) najduzeIme=ime;
        }
        return najduzeIme;
    }
}
