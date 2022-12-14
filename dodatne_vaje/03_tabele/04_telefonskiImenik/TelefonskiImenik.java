import java.util.Scanner;
import java.util.Arrays;

public class TelefonskiImenik{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[][] t = new String[n][2];
        ustvariTabelo(sc, n, t);
        
        int k = sc.nextInt();
        sc.nextLine();
        String niz = "";
        // glavni loop
        for (int i = 0; i < k; i++){
            niz = sc.nextLine();
            System.out.println(poisciVTabeli(niz, t));
        }
    }

    public static void ustvariTabelo(Scanner sc, int n, String[][] t){
        for (int i = 0; i < n; i++){
            t[i] = sc.nextLine().split(" ");
            //System.out.println(Arrays.toString(t[i]));
            //System.out.println(i);
        }
    }

    public static String poisciVTabeli(String niz, String[][] t){
        for (int i = t.length - 1; i >= 0; i--){
            if (t[i][0].equals(niz)){
                return t[i][1];
            }
        }
        return "NEZNANA";
    }
}