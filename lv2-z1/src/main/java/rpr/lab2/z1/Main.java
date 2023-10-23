package rpr.lab2.z1;

import java.lang.Exception;
import java.lang.Math;
import java.util.Scanner;

import static rpr.lab2.z1.Faktorijel.faktoriel;
import static rpr.lab2.z1.Sinus.sinus;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite broj za koji zelite izracunati sinus i faktorijel: ");
        Scanner ulaz=new Scanner(System.in);
        double broj=0;
        broj=ulaz.nextDouble();

        try {
            System.out.println("Faktorijel broja " + broj + " je " + faktoriel((long)broj));
        }
        catch(Exception e){
            System.out.println("Greska: " + e.getMessage());
        }
        System.out.println("Sinus broja " + broj + " je " +sinus(broj));
    }
}