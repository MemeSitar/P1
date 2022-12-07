public class BesedilnaDatoteka extends Datoteka{
    private int stZnakov;

    public BesedilnaDatoteka(String ime, int stZnakov){
        super(ime);
        this.stZnakov = stZnakov;
    }

    @Override
    public String toString(){
        String izpis = super.toString() + "b "+ this.velikost() + "]";
        return izpis;
    }

    @Override 
    public int velikost(){
        return this.stZnakov;
    }
}