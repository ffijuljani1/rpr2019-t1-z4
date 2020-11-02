package ba.unsa.etf.rpr;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {


    @AfterAll
    static void integracijskiTest() {

        Korpa korpa = new Korpa();

        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "6"));

        assertEquals(6, korpa.getBroj_popunjenih());

        int cijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(6000, cijena);
        int broj_izbacenih=0;
        korpa.izbaciArtiklSaKodom("3");

        for(int i=0; i< korpa.getBroj_popunjenih(); i++) {
            if(korpa.artikli[i] == null) broj_izbacenih++;
        }
        assertEquals(1, broj_izbacenih);

    }


    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        assertEquals(2, korpa.getBroj_popunjenih());
        // dakle nakon unosa u niz, velicina niza se povecava, na taj nacin vrsimo provjeru
    }




    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "9"));
        korpa.izbaciArtiklSaKodom("2");
        korpa.izbaciArtiklSaKodom("9");
        int broj_izbacenih = 0;
        for(int i=0; i< korpa.getBroj_popunjenih(); i++) {
            if(korpa.artikli[i] == null) broj_izbacenih++;
        }

        assertEquals(2, broj_izbacenih);


    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        int cijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(2000, cijena);

        //vrsimo provjeru pomocu postojece metode dajUkupnuCijenuArtikala.

    }

    // integracijski test ??



}