package rpr.etf.unsa.ba.lab9.z1;

public class Drzava {
    private String naziv;
    private int id;

    public Drzava(){}

    public Drzava(int id, String naziv){
        this.id=id;
        this.naziv=naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
