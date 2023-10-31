package rpr.etf.unsa.ba.lab3.z1;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import rpr.etf.unsa.ba.lab3.z1.TelefonskiBroj;
import rpr.etf.unsa.ba.lab3.z1.Grad;
public class Imenik {
    private HashMap<String, TelefonskiBroj> mapa=new HashMap<>();

    public Imenik(){}

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime){
        TelefonskiBroj broj=mapa.get(ime);
        if (broj != null) {
            return broj.ispisi();
        }
        else {
            return "Osoba s imenom " + ime + " nije pronađena u imeniku.";
        }
    }

    public String dajIme(TelefonskiBroj broj){
        for (String ime : mapa.keySet()) {
            if (mapa.get(ime).equals(broj))
                return ime;
        }
        return "Telefonski broj " + broj.ispisi() + " nije pronađen u imeniku.";
    }

    public String naSlovo(char s) {
        ArrayList<String> popis = new ArrayList<>();
        for (String ime : mapa.keySet()) {
            if (ime.length() > 0 && ime.charAt(0) == s) {
                popis.add(ime + " - " + mapa.get(ime).ispisi());
            }
        }
        return String.join("\n", popis);
    }

    public Set<String> izGrada(Grad g) {
        Set<String> osobeIzGrada = new TreeSet<>(); // TreeSet za sortiranje abecedno

        for (String ime : mapa.keySet()) {
            TelefonskiBroj broj = mapa.get(ime);
            if (broj instanceof FiksniBroj) {
                FiksniBroj fiksniBroj = (FiksniBroj) broj;
                if (fiksniBroj.dajGrad() == g) {
                    osobeIzGrada.add(ime);
                }
            }
        }

        return osobeIzGrada;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> brojeviIzGrada = new TreeSet<>((o1, o2) -> o1.ispisi().compareTo(o2.ispisi()));

        for (String ime : mapa.keySet()) {
            TelefonskiBroj broj = mapa.get(ime);
            if (broj instanceof FiksniBroj) {
                FiksniBroj fiksniBroj = (FiksniBroj) broj;
                if (fiksniBroj.dajGrad() == g) {
                    brojeviIzGrada.add(fiksniBroj);
                }
            }
        }

        return brojeviIzGrada;
    }

}
