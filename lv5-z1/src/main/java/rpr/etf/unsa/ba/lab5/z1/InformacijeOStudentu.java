package rpr.etf.unsa.ba.lab5.z1;

public class InformacijeOStudentu {
    private String ime, prezime, brIndexa, godinaStudija;
    InformacijeOStudentu(){}
    InformacijeOStudentu(String ime, String prezime, String brIndexa, String godinaStudija){
        this.ime=ime;
        this.prezime=prezime;
        this.brIndexa=brIndexa;
        this.godinaStudija=godinaStudija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
}
