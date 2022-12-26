public class Pismo{
    private Posta izvorna;
    private Posta ciljna;
    private boolean jePriporoceno;
    private int razdalja;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja){
        this.izvorna = izvorna;
        this.ciljna = ciljna;
        this.jePriporoceno = jePriporoceno;
        this.razdalja = razdalja;
    }

    public String toString(){
        char vrsta = 'N';
        if (jePriporoceno){
            vrsta = 'P';
        }
        return String.format("%s -> %s (%d km) [%c]", izvorna.toString(), ciljna.toString(), this.razdalja, vrsta);
    }
}