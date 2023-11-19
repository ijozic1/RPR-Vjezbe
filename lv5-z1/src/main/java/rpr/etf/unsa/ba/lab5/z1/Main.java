package rpr.etf.unsa.ba.lab5.z1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<InformacijeOStudentu> studenti= new ArrayList<>();
        List<InformacijeONastavniku> nastavnici=new ArrayList<>();

        InformacijeOStudentu s1= new InformacijeOStudentu("Ivona", "Jozic", "2","19357");
        studenti.add(s1);
        InformacijeOStudentu s2=new InformacijeOStudentu("Ismar", "Muslic","2","19304");
        studenti.add(s2);
        InformacijeONastavniku n1=new InformacijeONastavniku("Hamza", "Iseric", "strucnjak iz prakse");
        nastavnici.add(n1);

        System.out.println("S1: "+s1.getIme()+" "+s1.getPrezime()+", broj indeksa "+s1.getBrIndexa());
        System.out.println("S2: "+s2.getIme()+" "+s2.getPrezime()+", broj indeksa "+s2.getBrIndexa());
        System.out.println("N1: "+n1.getIme()+" "+n1.getPrezime()+", titula: "+n1.getTitula());

        boolean noviBroj=true;
        while(noviBroj){
            System.out.println("Zelite li dodati osobu? Ako da unesite 1, a ako ne 0: ");
            Scanner ulaz=new Scanner(System.in);
            int br=0;
            br=ulaz.nextInt();
            switch(br){
                case 1:
                    System.out.println("Za novog studenta unesite 1, a za nastavnika 2: ");
                    int osoba=0;
                    osoba=ulaz.nextInt();
                    switch(osoba){
                        case 1:
                            System.out.println("Unesite ime studenta: ");
                            String ime, prezime, godStudija, brIndeksa;
                            ulaz.nextLine();
                            ime=ulaz.nextLine();
                            System.out.println("Unesite prezime studenta: ");
                            prezime=ulaz.nextLine();
                            System.out.println("Unesite godinu studija studenta: ");
                            godStudija=ulaz.nextLine();
                            System.out.println("Unesite broj indeksa studenta: ");
                            brIndeksa=ulaz.nextLine();
                            InformacijeOStudentu s= new InformacijeOStudentu(ime, prezime, godStudija, brIndeksa);
                            System.out.println("Student: "+s.getIme()+" "+s.getPrezime()+", broj indeksa "+s.getBrIndexa());
                            studenti.add(s);
                            break;
                        case 2:
                            ulaz.nextLine(); 
                            System.out.println("Unesite ime nastavnika: ");
                            String imeN, prezimeN, titula;
                            imeN=ulaz.nextLine();
                            System.out.println("Unesite prezime nastavnika: ");
                            prezimeN=ulaz.nextLine();
                            System.out.println("Unesite titulu nastavnika: ");
                            titula=ulaz.nextLine();
                            InformacijeONastavniku n= new InformacijeONastavniku(imeN, prezimeN, titula);
                            System.out.println("Nastavnik: "+n.getIme()+" "+n.getPrezime()+", titula: "+n.getTitula());
                            nastavnici.add(n);
                            break;
                        default:
                            System.out.println("Pogresan unos!");
                    }
                    break;
                case 0:
                    noviBroj=false;
                    break;
                default:
                    System.out.println("Pogresan unos! Pokusajte ponovno: ");
            }
        }
        System.out.println("\nSvi uneseni studenti: ");
        for(InformacijeOStudentu s : studenti){
            System.out.println(s.getIme()+" "+s.getPrezime()+", broj indeksa "+s.getBrIndexa());
        }
        System.out.println("\nSvi unesesni nastavnici: ");
        for(InformacijeONastavniku nast : nastavnici){
            System.out.println(nast.getIme()+" "+nast.getPrezime()+", titula: "+nast.getTitula());
        }
    }
}
