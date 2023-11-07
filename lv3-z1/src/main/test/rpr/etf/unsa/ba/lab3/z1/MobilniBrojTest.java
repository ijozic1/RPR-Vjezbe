package rpr.etf.unsa.ba.lab3.z1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilniBrojTest {
    @Test
    void testKonstruktora(){
        try{
            MobilniBroj broj=new MobilniBroj(68,"111-111");
            System.out.println("Objekat je kreiran");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            MobilniBroj broj=new MobilniBroj(61,"222-222");
            System.out.println("Objekat je kreiran");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    void ispisi() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}