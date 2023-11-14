package ba.unsa.etf.rpr;

public class Main {
    private LaptopDao laptopDao;

    public Main(LaptopDao laptopDao) {
        this.laptopDao = laptopDao;
    }

    public void dodajNoviLaptop(Laptop laptop) {
        laptopDao.dodajLaptopUListu(laptop);
        laptopDao.dodajLaptopUFile(laptop);
    }
}
