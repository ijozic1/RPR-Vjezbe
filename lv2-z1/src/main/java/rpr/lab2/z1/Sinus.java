package rpr.lab2.z1;

import java.lang.Math;
import static rpr.lab2.z1.Faktorijel.faktoriel;

public class Sinus {
    public static double sinus(double n){
        double sinus=0;
        for(int i=0; i<5; i++){
            int znak=(i%2==0) ? 1 : -1;
            double temp=Math.pow(n,2*i+1)/faktoriel(2*i+1);
            sinus+=znak*temp;
        }
        return sinus;
    }
}
