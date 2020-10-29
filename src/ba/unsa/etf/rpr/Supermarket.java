package ba.unsa.etf.rpr;
public class Supermarket {


    Artikl[] artikli = new Artikl[1000];
    int broj_popunjenih = 0;

    public void dodajArtikl(Artikl a) {
        if(broj_popunjenih < 1000) {
            artikli[broj_popunjenih++]=a;

        }

    }


    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for(int i=0; i<broj_popunjenih; i++) {

            if(artikli[i].getKod() == kod) {
                for(int j=i; j<broj_popunjenih-1; j++) {
                    artikli[j] = artikli[j+1];
                }
            }
        }

    }


}
