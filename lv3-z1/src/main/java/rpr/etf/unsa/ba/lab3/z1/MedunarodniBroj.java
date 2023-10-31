package rpr.etf.unsa.ba.lab3.z1;

public class MedunarodniBroj extends TelefonskiBroj{
    private String broj, drzava;

    MedunarodniBroj(String drzava, String broj){
        this.broj= drzava+" "+broj;
        this.drzava=drzava;
    }

    @Override
    public String ispisi() {
        return this.broj;
    }
    @Override
    public int hashCode(){
        return drzava.hashCode() + broj.hashCode();
    }
}
