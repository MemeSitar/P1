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
}