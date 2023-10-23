package ba.unsa.rpr.t1;

import java.util.Scanner;
public class Z1 {
    public static void main(String[] args) {
        int br1 = 0, br2 = 0;
        System.out.println("Unesite prvi broj:");
        Scanner ulaz = new Scanner(System.in);
        br1 = ulaz.nextInt();
        System.out.println("Unesite drugi broj:");
        br2 = ulaz.nextInt();
        System.out.println("br1 = " + br1);
        System.out.println("br2 = " + br2);
    }
}
