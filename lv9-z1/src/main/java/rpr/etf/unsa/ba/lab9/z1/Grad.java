package rpr.etf.unsa.ba.lab9.z1;

public class Grad {
    private int id, broj_stanovnika;
    private String naziv;

    public Grad(){}
    public Grad(int id, String naziv, int broj_stanovnika){
        this.id=id;
        this.naziv=naziv;
        this.broj_stanovnika=broj_stanovnika;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBroj_stanovnika() {
        return broj_stanovnika;
    }

    public void setBroj_stanovnika(int broj_stanovnika) {
        this.broj_stanovnika = broj_stanovnika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
