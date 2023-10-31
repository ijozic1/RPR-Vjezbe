package rpr.etf.unsa.ba.lab3.z1;

public enum Grad {
    BIHAC("037"), ORASJE("031"), TUZLA("035"), ZENICA("032"), GORAZDE("038"),
    TRAVNIK("030"), MOSTAR("036"), SIROKI_BRIJEG("039"), SARAJEVO("033"), LIVNO("034"),
    BRCKO("049"), MRKONJIC_GRAD("050"), BANJA_LUKA("051"), PRIJEDOR("052"), DOBOJ("053"),
    SAMAC("054"), BIJELJINA("055"), ZVORNIK("056"), PALE("057"), FOCA("058"), TREBINJE("059");

    private final String opis;
    Grad(String opis){
        this.opis=opis;
    }
    public String getOpis(){
        return opis;
    }
}
