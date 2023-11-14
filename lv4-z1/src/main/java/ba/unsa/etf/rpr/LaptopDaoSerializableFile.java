package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.io.*;

public class LaptopDaoSerializableFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoSerializableFile(File file) {
        this.file = file;
        this.laptopi = new ArrayList<>();
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, true))) {
            oos.writeObject(laptop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException {
        for (Laptop laptop : laptopi) {
            if (laptop.getProcesor().equals(procesor)) {
                return laptop;
            }
        }
        throw new NeodgovarajuciProcesorException("Nema laptopa sa zadatim procesorom: " + procesor);
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }

    @Override
    public void vratiPodatkeIzDatoteke() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Laptop laptop = (Laptop) ois.readObject();
                    laptopi.add(laptop);
                } catch (EOFException e) {
                    break; // Kraj datoteke
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
