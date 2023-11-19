package rpr.etf.unsa.ba.lab5.z3;

public class Pobjednik {
    private String ime, prezime;
    private int brojZnakova;
    public Pobjednik(KolekcijaImena kolekcijaImena) {
        String najduzeIme = kolekcijaImena.getNajduzeIme();
        String[] dijelovi = najduzeIme.split(" ");
        this.ime = dijelovi[0];
        this.prezime = dijelovi.length > 1 ? dijelovi[1] : "";
        this.brojZnakova = najduzeIme.length();
    }
    public Pobjednik(KolekcijaImenaIPrezimena kolekcijaImenaIPrezimena) {
        int najduziIndeks = kolekcijaImenaIPrezimena.getIndexNajduzegPara();
        this.ime = kolekcijaImenaIPrezimena.getImeiPrezime(najduziIndeks);
        this.brojZnakova = this.ime.length();
        String[] dijelovi = this.ime.split(" ");
        this.prezime = dijelovi.length > 1 ? dijelovi[1] : "";
    }
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojZnakova() {
        return brojZnakova;
    }
}
