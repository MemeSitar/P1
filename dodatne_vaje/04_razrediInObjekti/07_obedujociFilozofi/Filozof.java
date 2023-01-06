public class Filozof {
    private String ime;
    private Filozof levi;
    private Filozof desni;
    public boolean levaPalcka;
    public boolean desnaPalcka;

    public Filozof(String ime){
        this.ime = ime;
        levaPalcka = false;
        desnaPalcka = false;
    }

    public String vrniIme(){
        return this.ime;
    }

    public void nastaviSoseda(Filozof levi, Filozof desni){
        this.levi = levi;
        this.desni = desni;
    }

    public boolean jeLeviSosedOd(Filozof f){
        return f.levi.equals(this);
    }

    public boolean jeDesniSosedOd(Filozof f){
        return f.desni.equals(this);
    }

    public Filozof[] vrniSoseda(){
        return new Filozof[] {levi, desni};
    }

    public int kolikoPalicicDrzi(){
        int rezultat = 0;
        if (levaPalcka){
            rezultat++;
        }
        if (desnaPalcka){
            rezultat++;
        }
        return rezultat;
    }

    public boolean primiLevo(){
        if (levi.desnaPalcka){
            return false;
        }
        levaPalcka = true;
        return true;
    }

    public boolean primiDesno(){
        if (desni.levaPalcka){
            return false;
        }
        desnaPalcka = true;
        return true;
    }

    public void izpustiLevo(){
        levaPalcka = false;
    }

    public void izpustiDesno(){
        desnaPalcka = false;
    }

    public static int steviloJedcev(Filozof[] filozofi){
        int rezultat = 0;
        for (Filozof f : filozofi){
            if (f.kolikoPalicicDrzi() == 2){
                rezultat++;
            }
        }
        return rezultat;
    }

    public int steviloFilozofov(){
        Filozof prvi = this;
        int rezultat = 0;
        Filozof f = this.desni;
        while (!f.equals(prvi)){
            rezultat++;
            f = f.desni;
        }
        return rezultat;
    }
}
