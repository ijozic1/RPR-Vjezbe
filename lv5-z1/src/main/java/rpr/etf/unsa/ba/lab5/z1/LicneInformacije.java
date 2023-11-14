package rpr.etf.unsa.ba.lab5.z1;

public class LicneInformacije {
    private String ime, prezime;
    public LicneInformacije(){}
    public LicneInformacije(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
}