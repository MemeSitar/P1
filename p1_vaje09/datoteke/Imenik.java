public class Imenik extends Datoteka{
    private Datoteka[] datoteke;

    public Imenik(String ime, Datoteka[] datoteke){
        super(ime);
        this.datoteke = datoteke;
    }

    @Override
    public String toString(){
        String izpis = super.toString() + "i " + this.datoteke.length + "]";
        return izpis;
    }

    @Override 
    public int velikost(){
        int velikost = 256;
        for (int i = 0; i < datoteke.length; i++){
            velikost += datoteke[i].velikost();
        }
        return velikost;
    }

    public int steviloVecjihSlik(int prag){
        int j = 0;
        for (int i = 0; i < datoteke.length; i++){
            if (!(datoteke[i] instanceof SlikovnaDatoteka)){
                continue;
            }
            SlikovnaDatoteka slika = (SlikovnaDatoteka) datoteke[i];
            if (slika.jeVecjeOd(prag)){
                j++;
            }
        }
        return j;
    }

    public String poisci(String ime){
        String izpis = null;
        for (Datoteka datoteka: this.datoteke){
            if (datoteka.vrniIme().equals(ime)){
                return String.format("./%s", ime);
            }
        }
        for (Datoteka datoteka: this.datoteke){
            if (datoteka instanceof Imenik){
                Imenik direktorija = (Imenik) datoteka;
                izpis = direktorija.poisci("./", ime);
                if (izpis != null){
                    return izpis;
                }
            }
        }
        return null;
    }

    private String poisci(String pot, String ime){
        String izpis = String.format("%s%s/", pot, this.vrniIme());
        String rezultat;
        for (Datoteka datoteka: this.datoteke){
            if (datoteka.vrniIme().equals(ime)){
                izpis = String.format("%s%s", izpis, ime);
                return izpis;
            }
        }
        for (Datoteka datoteka: this.datoteke){
            if (datoteka instanceof Imenik){
                Imenik direktorija = (Imenik) datoteka;
                rezultat = direktorija.poisci(izpis, ime);
                if (rezultat != null){
                    return rezultat;
                }
            }
        }
        return null;
    }
}