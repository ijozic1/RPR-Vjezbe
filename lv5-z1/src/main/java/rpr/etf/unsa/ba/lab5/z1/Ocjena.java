package rpr.etf.unsa.ba.lab5.z1;

public class Ocjena {
    LicneInformacije osoba;
    int ocjena;
    Ocjena(LicneInformacije osoba, int ocjena){
        if(ocjena<0 || ocjena>10) throw new IllegalArgumentException("Neispravna ocjena");
        this.osoba=osoba;
        this.ocjena=ocjena;
    }
    public void setOcjena(int o){
        if(o>0 && o<10) this.ocjena=o;
    }
}
