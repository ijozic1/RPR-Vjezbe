package rpr.etf.unsa.ba.lab9.z1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private GeografijaDAO dao=GeografijaDAO.getInstance();

    Main(){}
    String ispisiGradove(){
        String ispis = "";
        try {
            ArrayList<Grad> gradovi = dao.gradovi();
            for (Grad g : gradovi) {
                String s = g.getNaziv() + " (" + g.getImeDrzave() + ") - " + g.getBroj_stanovnika() + "\n";
                ispis += s;
            }
        }
        catch(NullPointerException e){
            ispis=e.getMessage();
        }
        return ispis;
    }
    void glavniGrad(){
        try {
            Scanner unos = new Scanner(System.in);
            System.out.println("Unesite naziv drzave za koju trazite glavni grad: ");
            String naziv = unos.nextLine();
            Drzava d = dao.nadjiDrzavu(naziv);
            Grad glavni = dao.glavniGrad(d.getNaziv());
            if (glavni == null) {
                System.out.println("Nepostojeca drzava");
            } else {
                System.out.println("Glavni grad drzave " + naziv + " je " + glavni.getNaziv());
            }
        }
        catch(NullPointerException e){
            System.out.println("Nepostojeca drzava");
        }
    }

    public static void main(String[] args){
        Main m=new Main();
        System.out.println("Ako zelite izlistati postojece gradove pritisnite 1: ");
        Scanner unos=new Scanner(System.in);
        int broj =unos.nextInt();
        if(broj==1) {
            String ispis=m.ispisiGradove();
            System.out.println(ispis);
        }
        System.out.println("Ako zelite pretraziti neku drzavu unesite 1: ");
        broj=unos.nextInt();
        if(broj==1) m.glavniGrad();
    }
}
