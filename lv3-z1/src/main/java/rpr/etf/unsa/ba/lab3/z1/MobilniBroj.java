package rpr.etf.unsa.ba.lab3.z1;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {
    private String broj;
    int mobilnaMreza;

    MobilniBroj(int mobilnaMreza, String broj){
        if(mobilnaMreza<60 || mobilnaMreza>67)
            throw new IllegalArgumentException("Nepostojeca mobilna mreza!");
        this.mobilnaMreza=mobilnaMreza;
        this.broj= broj;
        //this.broj=String.format("0%03d/%s", mobilnaMreza, broj);
    }

    @Override
    public String ispisi() {
        return "0"+this.mobilnaMreza+"/"+this.broj;
    }
    /*@Override
    public int hashCode(){
        return mobilnaMreza + broj.hashCode();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilniBroj that)) return false;
        return mobilnaMreza == that.mobilnaMreza && Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(broj, mobilnaMreza);
    }
}
