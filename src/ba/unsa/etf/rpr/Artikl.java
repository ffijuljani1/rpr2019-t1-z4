package ba.unsa.etf.rpr;
public class Artikl {
    int cijena = 0;
    String kod = new String("");
    String naziv = new String("");

    Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod=kod;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }

    public String getNaziv() {
        return naziv;
    }


    // dakle artikl ima konstruktor

}
