package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Supermarket {

    Artikl[] artikli = new Artikl[1000];
    int broj_popunjenih = 0;

    public void dodajArtikl(Artikl a) {
        if (broj_popunjenih < 1000) {
            artikli[broj_popunjenih++] = a;

        }
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;

        for (int i = 0; i < broj_popunjenih; i++) {
            if (artikli[i]!=null && artikli[i].getKod().equals(kod)) {
                a = artikli[i];
                artikli[i] = null;

            }
        }
        return a;
    }

    public int getBroj_popunjenih() {
        return broj_popunjenih;
    }
}
