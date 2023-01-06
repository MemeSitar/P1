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

    public int najdaljseZaporedje(int igralec){
        int rezultat = 0;
        int stevec = 0;
        rezultat = this.najdaljseZaporedjeVrstice(igralec);
        stevec = this.najdaljseZaporedjeStolpci(igralec);
        if (stevec > rezultat){
            rezultat = stevec;
        }
        stevec = this.najdaljseZaporedjeDiagonale(igralec);
        if (stevec > rezultat){
            rezultat = stevec;
        }
        return rezultat;
    }

    public int izid(){
        int rezultat0 = this.najdaljseZaporedje(0);
        int rezultat1 = this.najdaljseZaporedje(1);
        if (rezultat0 > 3 && rezultat1 < 4){
            return 0;
        } else if (rezultat0 < 4 && rezultat1 > 3){
            return 1;
        } else {
            return -1;
        }
    }

    private int najdaljseZaporedjeVrstice(int igralec){
        int rezultat = 0;
        int stevec = 0;
        for (int j = 0; j < this.vrniSteviloVrstic(); j++){
            stevec = 0;
            for (int i = 0; i < this.vrniSteviloStolpcev(); i++){
                if (this.vsebina(j, i) == igralec){
                    stevec++;
                } else {
                    if (stevec > rezultat){
                        rezultat = stevec;
                    }
                    stevec = 0;
                }
            }
            if (stevec > rezultat){
                rezultat = stevec;
            }
        }
        return rezultat;
    }

    private int najdaljseZaporedjeStolpci(int igralec){
        int rezultat = 0;
        int stevec = 0;
        for (int i = 0; i < this.vrniSteviloStolpcev(); i++){
            stevec = 0;
            for (int j = 0; j < this.vrniSteviloVrstic(); j++){
                if (this.vsebina(j, i) == igralec){
                    stevec++;
                } else {
                    if (stevec > rezultat){
                        rezultat = stevec;
                    }
                    stevec = 0;
                }
            }
            if (stevec > rezultat){
                rezultat = stevec;
            }
        }
        return rezultat;
    }

    private int najdaljseZaporedjeDiagonale(int igralec){
        // ful faking annoying ane
        // rocno pisat algoritem za tale drek...
        int rezultat = 0;
        int stevec = 0;
        // prva diagonala.
        for (int k = 0; k <= (stStolpcev + stVrstic - 2); k++){
            for (int i = Math.min(k, stVrstic - 1); i <= stVrstic -1; i++){
                stevec = 0;
                for (int j = Math.min(k, stStolpcev - 1); j <= stStolpcev -1; j++){
                    if (this.vsebina(k - j, j) == igralec){
                        stevec++;
                    } else {
                        if (stevec > rezultat){
                            rezultat = stevec;
                        }
                        stevec = 0;
                    }
                }
                if (stevec > rezultat){
                    rezultat = stevec;
                }
            }
        }
        // pa se druga diagonala...
        for (int k = 0; k <= (stStolpcev + stVrstic -2); k++){
            while (j >= 0 && )
        }

        return rezultat;
    }

    private void zamenjajIgralca(){
        if (trenutniIgralec == 0){
            trenutniIgralec = 1;
        } else if (trenutniIgralec == 1){
            trenutniIgralec = 0;
        }
    }

    private boolean stolpecPoln(int stolpec){
        for (int i = 0; i < this.vrniSteviloVrstic(); i++){
            if (this.polje[i][stolpec] == 0){
                return false;
            }
        }
        return true;
    }

    private void dodajVStolpec(int stolpec, int trenutniIgralec){
        for (int i = 0; i < stVrstic; i++){
            if (polje[i][stolpec] == 0){
                polje[i][stolpec] = trenutniIgralec + 100;
                break;
            }
        }
    }

    private void print(){
        for (int i = this.vrniSteviloVrstic() - 1; i >= 0; i--){
            System.out.println(Arrays.toString(polje[i]));
        }
    }
}