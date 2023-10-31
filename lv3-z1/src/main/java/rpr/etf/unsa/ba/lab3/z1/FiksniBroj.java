package rpr.etf.unsa.ba.lab3.z1;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {

    private String broj;
    private Grad grad;
    FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj= grad.getOpis()+"/"+broj;
    }
    public Grad dajGrad(){
        return this.grad;
    }

    @Override
    public String ispisi() {
        return this.broj;
    }

    /*@Override
    public int hashCode(){
        return grad.hashCode() + broj.hashCode();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FiksniBroj that)) return false;
        return Objects.equals(broj, that.broj) && grad == that.grad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(broj, grad);
    }
}
