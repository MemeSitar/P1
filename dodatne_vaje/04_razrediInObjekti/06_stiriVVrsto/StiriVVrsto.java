import java.util.*;

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
        } else {
            this.dodajVStolpec(stolpec, trenutniIgralec);
            this.zamenjajIgralca();
            return true;
        }
    }

    public int naPotezi(){
        return this.trenutniIgralec;
    }

    public int vsebina(int vrstica, int stolpec){
        if (this.polje[vrstica][stolpec] == 0){
            return -1;
        } else {
            return this.polje[vrstica][stolpec] - 100;
        }
    }

    public void zamenjajIgralca(){
        if (trenutniIgralec == 0){
            trenutniIgralec = 1;
        } else if (trenutniIgralec == 1){
            trenutniIgralec = 0;
        }
    }

    public boolean stolpecPoln(int stolpec){
        for (int i = 0; i < this.vrniSteviloVrstic(); i++){
            if (this.polje[i][stolpec] == 0){
                return false;
            }
        }
        return true;
    }

    public void dodajVStolpec(int stolpec, int trenutniIgralec){
        for (int i = 0; i < stVrstic; i++){
            if (polje[i][stolpec] == 0){
                polje[i][stolpec] = trenutniIgralec + 100;
                break;
            }
        }
    }

    public void print(){
        for (int i = this.vrniSteviloVrstic() - 1; i >= 0; i--){
            System.out.println(Arrays.toString(polje[i]));
        }
    }
}