package rpr.etf.unsa.ba.lab3.z1;

public class MobilniBroj extends TelefonskiBroj {
    private String broj;
    int mobilnaMreza;

    MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj= "0"+mobilnaMreza+"/"+broj;
        //this.broj=String.format("0%03d/%s", mobilnaMreza, broj);
    }

    @Override
    public String ispisi() {
        return this.broj;
    }
    @Override
    public int hashCode(){
        return mobilnaMreza + broj.hashCode();
    }
}
