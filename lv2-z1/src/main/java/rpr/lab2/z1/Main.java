package rpr.lab2.z1;

import java.lang.Exception;
import java.lang.Math;
import java.util.Scanner;

import static rpr.lab2.z1.Faktorijel.faktoriel;
import static rpr.lab2.z1.Sinus.sinus;

import java.lang.Math;
public class Main
{
    public static void main( String[] args ) {
        if(args.length==0) {
            System.out.println("Nisu proslijeđeni konzolni parametri!");
            return;
        }
        double doubleVrijednost = Double.parseDouble(args[0]);
        int integerVrijednost = (int) doubleVrijednost;
        System.out.println("Faktorijel zadanog broja iznosi: " + Faktorijel.faktoriel(integerVrijednost) + "\n");
        System.out.println("Sinus zadanog broja iznosi: " + Sinus.sinus(doubleVrijednost) + "\n");
        System.out.println("Sinus (bibliotecki) iznosi: " + Math.sin(doubleVrijednost) + "\n");
    }
}