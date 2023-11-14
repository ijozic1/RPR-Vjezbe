package rpr.etf.unsa.ba.lab5.z1;

public class Main {
    public static void main(String[] args){
        InformacijeOStudentu s1= new InformacijeOStudentu("Ivona", "Jozic", "2","19357");
        InformacijeOStudentu s2=new InformacijeOStudentu("Ismar", "Muslic","2","19304");
        InformacijeONastavniku n1=new InformacijeONastavniku("Hamza", "Iseric", "strucnjak iz prakse");

        System.out.println("S1: "+s1.getIme()+" "+s1.getPrezime()+", broj indeksa "+s1.getBrIndexa());
        System.out.println("S2: "+s2.getIme()+" "+s2.getPrezime()+", broj indeksa "+s2.getBrIndexa());
        System.out.println("N1: "+n1.getIme()+" "+n1.getPrezime()+", titula: "+n1.getTitula());
    }
}
