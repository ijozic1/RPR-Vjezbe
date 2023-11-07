package rpr.etf.unsa.ba.lab3.z1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    private Imenik imenik;

    @BeforeEach
    public void beforeEachTest() {
        this.imenik = new Imenik();
    }

    @Test
    public void dodaj() {
        this.imenik.dodaj("Name", Mockito.mock(TelefonskiBroj.class));
        assertEquals(1, this.imenik.velicina());
    }

    @Test
    public void dajBroj() {
        this.imenik.dodaj("Name", new MobilniBroj(10, "123-456"));
        assertEquals("010/123-456", this.imenik.dajBroj("Name"));
    }

    @Test
    public void dajBrojNoMatch() {
        assertNull(this.imenik.dajBroj("Name"));
    }

    @Test
    public void dajIme() {
        this.imenik.dodaj("Name", new MobilniBroj(10, "123-456"));
        assertEquals("Name", this.imenik.dajIme(new MobilniBroj(10, "123-456")));
    }

    @Test
    public void dajImeNoMatch() {
        assertNull(this.imenik.dajIme(new MobilniBroj(10, "123-456")));
    }

    @Test
    public void naSlovo() {
        this.imenik.dodaj("Name", new MobilniBroj(10, "123-456"));

        try { assertEquals("Name [010/123-456]\n", this.imenik.naSlovo('N')); }
        catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void naSlovoNoMatch() {
        try { assertEquals(this.imenik.naSlovo('N'), ""); }
        catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void naSlovoException() {
        assertThrows(IllegalArgumentException.class, () -> this.imenik.naSlovo('0'));
    }
}