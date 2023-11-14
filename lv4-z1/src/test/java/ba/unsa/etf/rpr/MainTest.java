package ba.unsa.etf.rpr;

import junit.framework.Test;
import junit.framework.TestCase;
import org.mockito.Mockito;

public class MainTest extends TestCase {
    //@Test
    void testDodajNoviLaptop() {
        // Kreiranje mock objekta za LaptopDao
        LaptopDao laptopDaoMock = Mockito.mock(LaptopDao.class);

        // Pravljenje instance klase koju testiramo
        Main laptopService = new Main(laptopDaoMock);

        // Pozivanje metode koju testiramo
        Laptop laptop = new Laptop();
        laptop.setBrend("Dell"); laptop.setModel("Inspiron"); laptop.setCijena(200.0); laptop.setRam(8);
            laptop.setHdd(1000); laptop.setSsd(256); laptop.setProcesor("i5"); laptop.setGrafickaKartica("Nvidia");
            laptop.setVelicinaEkrana(15.6);
        laptopService.dodajNoviLaptop(laptop);
    }
}