package rpr.etf.unsa.ba.lab3.z1;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{
    private String broj, drzava;

    MedunarodniBroj(String drzava, String broj){
        this.broj= broj;
        this.drzava=drzava;
    }

    @Override
    public String ispisi() {
        return this.drzava+" "+this.broj;
    }

    /*@Override
    public int hashCode(){
        return drzava.hashCode() + broj.hashCode();
    }*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedunarodniBroj that)) return false;
        return Objects.equals(broj, that.broj) && Objects.equals(drzava, that.drzava);
    }

    @Override
    public int hashCode() {
        return Objects.hash(broj, drzava);
    }
}
