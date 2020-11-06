package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        assertEquals(4, supermarket.getBroj_popunjenih());

    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();

        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "4"));

        supermarket.izbaciArtiklSaKodom("3");
        int broj_izbacenih = 0;
        for(int i=0; i<supermarket.getBroj_popunjenih(); i++) {
            if(supermarket.artikli[i] == null) broj_izbacenih++;
        }
        assertEquals(1, broj_izbacenih);

    }
}