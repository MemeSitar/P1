import java.util.Scanner;

public class ZlataSredina{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int stElementov = 2 * k + 1;
        int[] t = new int[stElementov];
        ustvariTabelo(sc, stElementov, t);

        int[] urejenaTabela = urediTabelo(t);
        System.out.println(urejenaTabela[k]);
    }

    public static void ustvariTabelo(Scanner sc, int n, int[] t){
        for (int i = 0; i < n; i++){
            t[i] = sc.nextInt();
        }
    }

    public static int[] urediTabelo(int[] t){
        int[] rezultat = new int[t.length];
        int najmanjsaCifra = (int) Integer.MAX_VALUE;
        int trenutnaCifra = (int) Integer.MIN_VALUE;
        for (int i = 0; i < rezultat.length; i++){
            najmanjsaCifra = (int) Integer.MAX_VALUE;
            for (int j = 0; j < t.length; j++){
                if (t[j] < najmanjsaCifra && t[j] > trenutnaCifra){
                    najmanjsaCifra = t[j];
                }
            }
            rezultat[i] = najmanjsaCifra;
            trenutnaCifra = najmanjsaCifra;
        }
        return rezultat;
    }
}