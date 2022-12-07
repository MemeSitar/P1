public abstract class Datoteka{
    private String ime;

    public Datoteka(String ime){
        this.ime = ime;
    }

    public String toString(){
        String delniIzpis = ime + " [";
        return delniIzpis;
    };
    public abstract int velikost();
}