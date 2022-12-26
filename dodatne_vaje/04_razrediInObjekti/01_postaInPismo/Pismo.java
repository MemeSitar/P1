public class Pismo{
    private Posta izvorna;
    private Posta ciljna;
    private boolean jePriporoceno;
    private int razdalja;
    private static int r;
    private static int c;
    private static int p;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja){
        this.izvorna = izvorna;
        this.ciljna = ciljna;
        this.jePriporoceno = jePriporoceno;
        this.razdalja = razdalja;
    }

    public String toString(){
        char vrsta = 'N';
        if (this.jePriporoceno){
            vrsta = 'P';
        }
        return String.format("%s -> %s (%d km) [%c]", izvorna.toString(), ciljna.toString(), this.razdalja, vrsta);
    }

    public boolean izviraOd(Posta posta){
        return this.izvorna.equals(posta);
    }

    public boolean staIzvorInCiljIsta(){
        return this.izvorna.equals(this.ciljna);
    }

    public boolean imaIstiCiljKot(Pismo pismo){
        return this.ciljna.equals(pismo.ciljna);
    }

    public static boolean imataIstiCilj(Pismo p1, Pismo p2){
        return p1.ciljna.equals(p2.ciljna);
    }

    public int cena(){
        int cena = 0;
        cena = ((this.razdalja / (this.r)) + 1)*this.c;
        if (this.jePriporoceno){
            cena += this.p;
        }
        return cena;
    }

    public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina){
        r = enotaRazdalje;
        c = enotaCene;
        p = priporocnina;
    }

    public boolean jeDrazjeOd(Pismo pismo){
        return (this.cena() > pismo.cena());
    }

    public static Pismo vrniDrazje(Pismo p1, Pismo p2){
        if (p1.cena() > p2.cena()){
            return p1;
        }
        return p2;
    }

    public Pismo izdelajPovratno(){
        return new Pismo(this.ciljna, this.izvorna, this.jePriporoceno, this.razdalja);
    }
}