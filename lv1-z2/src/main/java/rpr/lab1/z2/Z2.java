package rpr.lab1.z2;

import java.util.Scanner;

public class Z2 {
    public static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma=suma+(n%10);
            n/=10;
        }
        return suma;
    }
    public static boolean djeljivSumomCifara(int n){
        if(n%sumaCifara(n)==0) return true;
        return false;
    }
    public static void main(String[] args) {
        int br=0;
        System.out.println("Unesite broj:");
        Scanner ulaz = new Scanner(System.in);
        br = ulaz.nextInt();
        System.out.println("Brojevi djeljivi sumom svojih cifara:");
        for(int i=1; i<=br; i++){
            if(djeljivSumomCifara(i))
                System.out.println(i);
        }
    }
}