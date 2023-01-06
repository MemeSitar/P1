public class StiriVVrsto{
    private int[][] polje;
    private int stVrstic;
    private int stStolpcev;
    private int trenutniIgralec;

    // konstrutkor
    public StiriVVrsto(int stVrstic, int stStolpcev){
        this.polje = new int[stVrstic][stStolpcev];
        this.stVrstic = stVrstic;
        this.stStolpcev = stStolpcev;
        trenutniIgralec = 0;
        // kljucno: polje[0][0] je SPODAJ LEVO, ne ZGORAJ LEVO.
        // tako da padajo zetoni najprej v [0][0], potem v [1][0]...
    }

    public int vrniSteviloVrstic(){
        return stVrstic;
    }

    public int vrniSteviloStolpcev(){
        return stStolpcev;
    }

    public boolean vrzi(int stolpec){
        if (this.stolpecPoln(stolpec)){
            return false;
        }
        this.dodajVStolpec(stolpec, trenutniIgralec);
        this.zamenjajIgralca();
        return true;
    }

    public void zamenjajIgralca(){
        if (trenutniIgralec == 0){
            trenutniIgralec = 1;
        } else {
            trenutniIgralec = 0;
        }
    }

    public boolean stolpecPoln(int stolpec){
        for (int i = 0; i < stVrstic; i++){
            if (polje[i][stolpec] == 0){
                return false;
            }
        }
        return true;
    }

    public void dodajVStolpec(int stolpec, int trenutniIgralec){
        
    }
}