package rpr.etf.unsa.ba.lab9.z1;

public class Drzava {
    private String naziv;
    private int id, glavni_grad;

    public Drzava(){}

    public Drzava(int id, String naziv, int glvGrad){
        this.id=id;
        this.naziv=naziv;
        this.glavni_grad=glvGrad;
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

    public int getGlavni_grad() {
        return glavni_grad;
    }

    public void setGlavni_grad(int glavni_grad) {
        this.glavni_grad = glavni_grad;
    }
}
