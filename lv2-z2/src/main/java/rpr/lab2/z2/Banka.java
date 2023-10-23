package rpr.lab2.z2;

import java.util.List;

public class Banka {
    private int brojRacuna=0;
    private List<Korisnik>korisnici;
    private List<Uposlenik>uposlenici;

    Banka(){}
    /*public void setBrojRacuna(int n){
        this.brojRacuna=n;
    }*/
    public int getBrojRacuna(){
        return this.brojRacuna;
    }

    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik k=new Korisnik(ime, prezime);
        this.korisnici.add(k);
        return k;
        //zasto mora vracati ovo - mozda kroz main da dodam korisnika u listu
        //a ovdje samo da ga posalje konstruktoru klase Korisnik
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik u=new Uposlenik(ime, prezime);
        this.uposlenici.add(u);
        return u;
        //isti komentar kao i u dodajKorisnika
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k){
        this.brojRacuna++;
        Racun r=new Racun(this.brojRacuna, k);
        k.dodajRacun(r);
        return r;
        //zasto vraca racun
    }


}
