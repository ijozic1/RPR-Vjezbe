package rpr.etf.unsa.ba.lab5.z1;

public class InformacijeONastavniku extends LicneInformacije{
    private String titula;
    InformacijeONastavniku(){}
    InformacijeONastavniku(String ime, String prezime, String titula){
        this.setIme(ime);
        this.setPrezime(prezime);
        this.titula=titula;
    }
    public String getTitula() {
        return titula;
    }
    public void setTitula(String titula) {
        this.titula = titula;
    }
}
