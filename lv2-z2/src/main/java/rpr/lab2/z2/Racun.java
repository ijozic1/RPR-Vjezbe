package rpr.lab2.z2;

public class Racun {
    private long brojRacuna;
    private double dozvoljenoPrekoracenje, stanjeRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja=false;

    Racun(){}
    Racun(long brRacuna, Osoba o){
        this.brojRacuna=brRacuna;
        this.korisnikRacuna=o;
    }
    private boolean provjeriOdobrenjePrekoracenja(double prekoracenje){
        //if(prekoracenje>this.dozvoljenoPrekoracenje) return false;
        if(!this.odobrenjePrekoracenja){
            this.odobrenjePrekoracenja=true;
            return true;
        }
        else{
            this.odobrenjePrekoracenja=false;
            return false;
        }
    }

    public boolean izvrsiUplatu(double iznos){
        if(iznos<=0) return false;
        this.stanjeRacuna+=iznos;
        return true;
    }

    public boolean izvrsiIsplatu(double iznos){
        if(iznos<=0) return false;
        if(this.stanjeRacuna<iznos) return false;
        this.stanjeRacuna-=iznos;
        return true;
    }

    public void odobriPrekoracenje(double prekoracenje){
        if(this.provjeriOdobrenjePrekoracenja(prekoracenje)){
            this.dozvoljenoPrekoracenje-=prekoracenje;
        }
    }
}
