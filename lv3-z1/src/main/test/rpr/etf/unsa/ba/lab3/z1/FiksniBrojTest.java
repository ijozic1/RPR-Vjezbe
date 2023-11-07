package rpr.etf.unsa.ba.lab3.z1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiksniBrojTest {
    @Test
    void testKonstruktora(){
        FiksniBroj broj=new FiksniBroj(Grad.SARAJEVO,"625-988");
        System.out.println("Objekat je kreiran");
        System.out.println("Telefonski broj je iz grada: "+broj.dajGrad().toString());
    }
    @org.junit.jupiter.api.Test
    void dajGrad() {
        FiksniBroj broj=new FiksniBroj(Grad.TUZLA,"625-900");
        System.out.println("Telefonski broj je iz grada: "+broj.dajGrad().toString());
    }

    @org.junit.jupiter.api.Test
    void ispisi() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
    }
}