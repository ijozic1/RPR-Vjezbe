package rpr.etf.unsa.ba.lab9.z1;

public class Drzava {
    private String naziv;
    private int id, glavniGrad;

    public Drzava(){}

    public Drzava(int id, String naziv, int glavniGrad){
        this.id=id;
        this.naziv=naziv;
        this.glavniGrad=glavniGrad;
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

    public int getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(int glavniGrad) {
        this.glavniGrad = glavniGrad;
    }
}
