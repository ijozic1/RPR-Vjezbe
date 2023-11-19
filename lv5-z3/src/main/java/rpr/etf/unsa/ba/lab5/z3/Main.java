package rpr.etf.unsa.ba.lab5.z3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Provjera za KolekcijaImena: ");
        List<String> imenaIPrezimena = new ArrayList<>();
        imenaIPrezimena.add("Ivona Jozić");
        imenaIPrezimena.add("Ismar Muslić");
        imenaIPrezimena.add("Hamza Išerić");

        KolekcijaImena kolekcijaImena = new KolekcijaImena(imenaIPrezimena);
        System.out.println("Najduže ime: " + kolekcijaImena.getNajduzeIme());

        Pobjednik pobjednik = new Pobjednik(kolekcijaImena);
        System.out.println("Ime: " + pobjednik.getIme());
        System.out.println("Prezime: " + pobjednik.getPrezime());
        System.out.println("Broj znakova: " + pobjednik.getBrojZnakova());

        //Nakon sto je dodana KolekcijaImenaIPrezimena
        System.out.println("\nProvjera za KolekcijaImenaIPrezimena: ");
        List<String> imena = List.of("Ivona", "Ismar", "Hamza");
        List<String> prezimena = List.of("Jozic", "Muslic", "Iseric");

        KolekcijaImenaIPrezimena novaKolekcija = new KolekcijaImenaIPrezimena(imena, prezimena);
        Pobjednik pobjednikSaNovomKolekcijom = new Pobjednik(novaKolekcija);

        System.out.println("Ime: " + pobjednikSaNovomKolekcijom.getIme());
        System.out.println("Prezime: " + pobjednikSaNovomKolekcijom.getPrezime());
        System.out.println("Broj znakova: " + pobjednikSaNovomKolekcijom.getBrojZnakova());
    }
}