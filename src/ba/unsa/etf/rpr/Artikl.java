package ba.unsa.etf.rpr;
public class Artikl {
    double cijena = 0;
    String kod = new String("");
    String naziv = new String("");

    Artikl(String naziv, double cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod=kod;
    }

    public String getKod() {
        return this.kod;
    }


    // dakle artikl ima konstruktor

}
