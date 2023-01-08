import java.util.*;

public class Ucenec {
    static int MAKSOBREMENITEV;
    private String ime;
    private String priimek;
    private ArrayList<Krozek> krozki;

    public static void nastaviMaksObremenitev(int maksobremenitev){
        MAKSOBREMENITEV = maksobremenitev;
    }

    public Ucenec(String ime, String priimek){
        this.ime = ime;
        this.priimek = priimek;
        this.krozki = new ArrayList<Krozek>(MAKSOBREMENITEV);
    }

    public String vrniIP(){
        return String.format("%s %s", ime, priimek);
    }

    public boolean vclani(Krozek krozek){
        if (krozki.contains(krozek))
            return true;
        if (krozki.size() >= MAKSOBREMENITEV)
            return false;
        for (Krozek k : krozki){
            if (krozek.sePrekrivata(k)){
                return false;
            }
        }
        if (krozek.dodajClana()){
            krozki.add(krozek);
            return true;
        }
        return false;
    }

    public void izclani(Krozek krozek){
        if (krozki.contains(krozek)){
            krozki.remove(krozek);
            krozek.odstraniClana();
        }
    }

    public int steviloKrozkov(){
        return krozki.size();
    }
}
