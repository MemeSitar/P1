import java.util.Scanner;
import java.util.Arrays;

public class VsiRazlicniII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] t = new int[k];
        ustvariTabelo(sc, k, t);

        t = urediTabelo(t);
        System.out.println(Arrays.toString(t));

        System.out.println(aliSoRazlicni(t));
    }

    public static void ustvariTabelo(Scanner sc, int n, int[] t){
        for (int i = 0; i < n; i++){
            t[i] = sc.nextInt();
        }
    }

    public static int[] urediTabelo(int[] t){
        int[] rezultat = new int[t.length];
        int najmanjsi = Integer.MAX_VALUE;
        int meja;
        for (int i = 0; i < rezultat.length; i++){
            for (int j = 0; j < t.length - 1; j++){
                if (najmanjsi == Integer.MAX_VALUE){
                    najmanjsi = t[0];
                }
                if (t[j] <= t[j+1] && t[j] > meja){
                    najmanjsi = t[j];
                } 
            meja = najmanjsi;
            rezultat[i] = meja;
            }
        }
        return rezultat;
    }

    public static String aliSoRazlicni(int[] t){
        int temp;
        for (int i = 0; i < t.length - 1; i++){
            System.out.println("Bong!");
            System.out.println(t[i]);
            if (t[i] == t[i+1]){
                temp = t[i];
                System.out.println("Bingo!");
                return Integer.toString(temp);
            }
        }

        return "RAZLICNI";
    }
}