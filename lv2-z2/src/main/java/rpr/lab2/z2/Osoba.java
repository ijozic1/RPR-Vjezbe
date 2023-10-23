package rpr.lab2.z2;

public class Osoba {
    private String ime, prezime;
    Osoba(){}
    Osoba(String Ime, String Prezime){
        this.ime=Ime;
        this.prezime=Prezime;
    }
    public void setIme(String Ime){
        this.ime=Ime;
    }
    public void setPrezime(String Prezime){
        this.prezime=Prezime;
    }
    //public static String toString(){}
}
