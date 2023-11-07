package rpr.etf.unsa.ba.lab3.z1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedunarodniBrojTest {

    @Test
    void ispisi() {
        MedunarodniBroj br=new MedunarodniBroj("+387"," 62 331 - 221");
        System.out.println(br.ispisi());
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}