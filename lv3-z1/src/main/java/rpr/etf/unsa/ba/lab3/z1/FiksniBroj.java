package rpr.etf.unsa.ba.lab3.z1;

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
    @Override
    public int hashCode(){
        return grad.hashCode() + broj.hashCode();
    }
}
