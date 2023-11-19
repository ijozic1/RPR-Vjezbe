package rpr.etf.unsa.ba.lab5.z1;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaPoruka {
    private List<String> poruke;
    public KolekcijaPoruka(List<Object> objekti) {
        this.poruke = new ArrayList<>();
        for (Object objekt : objekti) {
            if (objekt instanceof InformacijeOStudentu) {
                InformacijeOStudentu informacije=(InformacijeOStudentu) objekt;
                poruke.add(informacije.predstavi());
            }
            else if (objekt instanceof InformacijeONastavniku) {
                InformacijeONastavniku informacije=(InformacijeONastavniku) objekt;
                poruke.add(informacije.predstavi());
            }
            else if (objekt instanceof LicneInformacije) {
                LicneInformacije informacije = (LicneInformacije) objekt;
                poruke.add(informacije.predstavi());
            }
            else if (objekt instanceof Predmet) {
                Predmet predmet=(Predmet) objekt;
                poruke.add(predmet.predstavi());
            }
        }
    }
    public List<String> getPoruke(){
        return poruke;
    }
}
