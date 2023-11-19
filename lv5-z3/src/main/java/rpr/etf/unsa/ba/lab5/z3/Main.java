package rpr.etf.unsa.ba.lab5.z3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
    }
}