package rpr.etf.unsa.ba.lab5.z1;

public class InformacijeOStudentu extends LicneInformacije{
    private String brIndexa, godinaStudija;
    InformacijeOStudentu(){}
    InformacijeOStudentu(String ime, String prezime, String godinaStudija, String brIndexa){
        this.setIme(ime);
        this.setPrezime(prezime);
        this.brIndexa=brIndexa;
        this.godinaStudija=godinaStudija;
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
