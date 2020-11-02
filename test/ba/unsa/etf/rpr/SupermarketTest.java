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


    /*public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;

        for (int i = 0; i < broj_popunjenih; i++) {
            if (artikli[i]!=null && artikli[i].getKod().equals(kod)) {
                a = artikli[i];
                artikli[i] = null;
            }
        }
        return a;
    }*/


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

    }
}