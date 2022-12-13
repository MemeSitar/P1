import java.util.Scanner;

public class NajblizjiElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rezultat;

        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] t = new int[n];

        ustvariTabelo(sc, n, t);

        rezultat = indexNajblizjegaElementa(t, k);
        System.out.println(rezultat);
    }

    public static int abs(int a, int b){
        int rezultat = a - b;
        if (rezultat < 0){
            rezultat = rezultat * -1;
        }
        return rezultat;
    }

    public static void ustvariTabelo(Scanner sc, int n, int[] t){
        for (int i = 0; i < n; i++){
            t[i] = sc.nextInt();
        }
    }

    public static int indexNajblizjegaElementa(int[] t, int k){
        int indeks = 0;
        int najmanjsaRazdalja = (int) Integer.MAX_VALUE;
        int absolutna;

        for (int i = 0; i < t.length; i++){
            absolutna = abs(t[i], k);
            if (absolutna < najmanjsaRazdalja){
                najmanjsaRazdalja = absolutna;
                indeks = i;
            }
        }
        return indeks;
    }
}