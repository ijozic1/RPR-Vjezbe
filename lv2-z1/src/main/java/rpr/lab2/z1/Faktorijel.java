package rpr.lab2.z1;

public class Faktorijel {
    public static long faktoriel(long n){
        if(n<0) throw new IllegalArgumentException("Ne mozete racunati faktoriel negativnog broja");
        if(n==0) return 1;
        return n*faktoriel(n-1);
    }
}
