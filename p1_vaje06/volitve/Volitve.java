
public class Volitve {

    public static void main(String[] args) {
        // dopolnite po potrebi ...
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int sestevek = 0;
        for (int volisce = 0; volisce < t[leto][stranka].length; volisce++){
            sestevek += t[leto][stranka][volisce];
        }
        return sestevek;
    }

    public static int[][] glasovi(int[][][] t) {
        int[][] rezultati = new int[t.length][t[0].length];
        for (int leto = 0; leto < t.length; leto++){
            for (int stranka = 0; stranka < t[0].length; stranka++){
                rezultati[leto][stranka] = steviloGlasov(t, leto, stranka);
            }
        }
        return rezultati;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int topRezultat = 0;
        int topVolisce = 0;
        int[] voliscaSestevek = new int[t[0][stranka].length];
        for (int leto = 0; leto < t.length; leto++){
            for (int volisce = 0; volisce < t[0][stranka].length; volisce++){
                voliscaSestevek[volisce] += t[leto][stranka][volisce];
            }
        }
        for (int volisce = 0; volisce < voliscaSestevek.length; volisce++){
            if (voliscaSestevek[volisce] > topRezultat){
                topRezultat = voliscaSestevek[volisce];
                topVolisce = volisce;
            }
        }
        return topVolisce;
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        // popravite / dopolnite
        return -1;
    }
}
