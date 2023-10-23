package rpr.lab2.z3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StatistickiKalkulator {
    private List<Double> lista = new ArrayList<>();
    private void dodajElement(double el){
        this.lista.add(el);
    }
    private double dajMin(){
        double min=this.lista.get(0);
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i)<min) min=this.lista.get(i);
        }
        return min;
    }
    private double dajMax(){
        double max=this.lista.get(0);
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i)>max) max=this.lista.get(i);
        }
        return max;
    }
    private boolean daLiJePrazna(){
        if(this.lista.isEmpty()) return true;
        return false;
    }
    private double dajAritmetickuSredinu(){
        double suma=0;
        for(int i=0; i<this.lista.size(); i++){
            suma+=this.lista.get(i);
        }
        return suma/this.lista.size();
    }
    private double dajStandardnuDevijaciju(){
        double aritmetickaSredina=this.dajAritmetickuSredinu();
        double suma=0;
        for(int i=0; i<this.lista.size(); i++){
            suma+=Math.pow(this.lista.get(i)-aritmetickaSredina,2);
        }
        suma/=this.lista.size();
        return Math.sqrt(suma);
    }

    public static void main(String[] args) {
        StatistickiKalkulator brojevi = new StatistickiKalkulator();
        Scanner ulaz = new Scanner(System.in);
        String uneseno;

        System.out.println("Unesite brojeve ili 'stop' za kraj unosa: ");

        while (true) {
            uneseno = ulaz.next();
            if (uneseno.equals("stop")) {
                break;
            }

            try {
                double br = Double.parseDouble(uneseno);
                brojevi.dodajElement(br);
            } catch (NumberFormatException e) {
                System.out.println("Unesite valjani broj ili 'stop' za kraj unosa.");
            }
        }

        if (brojevi.daLiJePrazna()) {
            System.out.println("Nema unesenih brojeva.");
        } else {
            double min = brojevi.dajMin();
            double max = brojevi.dajMax();
            double mean = brojevi.dajAritmetickuSredinu();
            double stdDev = brojevi.dajStandardnuDevijaciju();

            System.out.println("Minimum: " + min);
            System.out.println("Maksimum: " + max);
            System.out.println("Srednja vrijednost: " + mean);
            System.out.println("Standardna devijacija: " + stdDev);
        }
    }
}