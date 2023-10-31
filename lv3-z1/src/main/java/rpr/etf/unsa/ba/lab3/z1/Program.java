package rpr.etf.unsa.ba.lab3.z1;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Imenik imenik = new Imenik();
        Scanner ulaz = new Scanner(System.in);

        while (true) {
            System.out.println("Odaberite opciju:");
            System.out.println("1. Dodaj osobu u imenik");
            System.out.println("2. Pretraži osobu po imenu");
            System.out.println("3. Pretraži osobu po broju");
            System.out.println("4. Izađi iz programa");

            int opcija = ulaz.nextInt();
            ulaz.nextLine(); // Prazni unos

            try {
                switch (opcija) {
                    case 1:
                        System.out.println("Unesite ime osobe:");
                        String ime = ulaz.nextLine();
                        System.out.println("Odaberite vrstu broja:");
                        System.out.println("1. Fiksni broj");
                        System.out.println("2. Mobilni broj");
                        System.out.println("3. Međunarodni broj");
                        int vrstaBroja = ulaz.nextInt();
                        ulaz.nextLine(); // Prazni unos

                        TelefonskiBroj telefonskiBroj;

                        switch (vrstaBroja) {
                            case 1:
                                System.out.println("Unesite grad (SARAJEVO, TUZLA, ZENICA...):");
                                Grad grad = Grad.valueOf(ulaz.nextLine().toUpperCase());
                                System.out.println("Unesite broj (npr. '123-456'):");
                                String broj = ulaz.nextLine();
                                telefonskiBroj = new FiksniBroj(grad, broj);
                                break;

                            case 2:
                                System.out.println("Unesite mobilnu mrežu (60-67):");
                                int mobilnaMreza = ulaz.nextInt();
                                ulaz.nextLine(); // Prazni unos
                                System.out.println("Unesite broj (npr. '987-654'):");
                                broj = ulaz.nextLine();
                                try {
                                    telefonskiBroj = new MobilniBroj(mobilnaMreza, broj);
                                }
                                catch(IllegalArgumentException e){
                                    System.out.println("Doslo je do greske: "+e.getMessage());
                                    System.out.println("Unesite mobilnu mrežu (60-67):");
                                    mobilnaMreza = ulaz.nextInt();
                                    ulaz.nextLine(); // Prazni unos
                                    System.out.println("Unesite broj (npr. '987-654'):");
                                    broj = ulaz.nextLine();
                                    telefonskiBroj = new MobilniBroj(mobilnaMreza, broj);
                                }
                                break;

                            case 3:
                                System.out.println("Unesite državni pozivni broj (npr. '+387'):");
                                String drzava = ulaz.nextLine();
                                System.out.println("Unesite broj (npr. '123-456'):");
                                broj = ulaz.nextLine();
                                telefonskiBroj = new MedunarodniBroj(drzava, broj);
                                break;

                            default:
                                System.out.println("Nevažeća opcija. Molimo odaberite ponovo.");
                                continue;
                        }

                        imenik.dodaj(ime, telefonskiBroj);
                        System.out.println("Osoba dodana u imenik.");
                        break;

                    case 2:
                        System.out.println("Unesite ime osobe koju želite pretražiti:");
                        String imeZaPretragu = ulaz.nextLine();
                        String brojOsobe = imenik.dajBroj(imeZaPretragu);
                        System.out.println("Telefonski broj osobe: " + brojOsobe);
                        break;

                    case 3:
                        System.out.println("Unesite broj osobe koju želite pretražiti:");
                        String brojZaPretragu = ulaz.nextLine();
                        String imeOsobe = imenik.dajIme(new MedunarodniBroj("+387", brojZaPretragu)); // Promijenite vrstu broja prema vašim potrebama
                        System.out.println("Ime osobe: " + imeOsobe);
                        break;

                    case 4:
                        System.out.println("Izlaz iz programa.");
                        ulaz.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Nevažeća opcija. Molimo odaberite ponovo.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Unijeli ste nevažeće podatke.");
            }
        }
    }
}
