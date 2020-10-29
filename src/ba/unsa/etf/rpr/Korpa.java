package ba.unsa.etf.rpr;

public class Korpa {

    Artikl[] artikli = new Korpa[50];
    int broj_popunjenih = 0;


    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl (Artikl a) {

        if(broj_popunjenih+1<50) {
            artikli[broj_popunjenih++] = a;
            return true;
        }
        return false;

    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom (String kod) {
        for(int i=0; i<broj_popunjenih; i++) {

            if(artikli[i].getKod() == kod) {
                for(int j=i; j<broj_popunjenih-1; j++) {
                    artikli[j] = artikli[j+1];
                }
            }
        }


    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0; i<broj_popunjenih; i++) {
            suma = suma + artikli[i].cijena;
        }
        return suma;
    }

}
