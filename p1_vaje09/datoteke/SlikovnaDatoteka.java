public class SlikovnaDatoteka extends Datoteka{
    private int sirina;
    private int visina;

    public SlikovnaDatoteka(String ime, int sirina, int visina){
        super(ime);
        this.sirina = sirina;
        this.visina = visina;
    }

    @Override 
    public String toString(){
        String izpis = super.toString() + "s " + sirina + " x " + visina + "]";
        return izpis;
    }


    @Override 
    public int velikost(){
        int velikost = 3 * sirina * visina + 54;
        return velikost;
    }

}