package ba.unsa.etf.rpr;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainTest {

    @Test
    void ispisArtikala() {

    }

    @Test
    void main() {
        Korpa korpa = new Korpa();
        Supermarket supermarket = new Supermarket();

        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "4"));

        //dodavanje artikla u korpu
        Artikl a = supermarket.izbaciArtiklSaKodom("2");
        korpa.dodajArtikl(a);

        assertEquals(1, korpa.getBroj_popunjenih());
        int brojac=0;

        for(Artikl artikl : supermarket.artikli) {
            if(artikl != null) brojac++;
        }
        assertEquals(3, brojac);




    }


}