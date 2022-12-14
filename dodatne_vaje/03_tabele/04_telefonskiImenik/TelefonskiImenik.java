import java.util.Scanner;

public class TelefonskiImenik{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] t = new String[n][2];
        ustvariTabelo(sc, n, t);

        int k = sc.nextInt();
        String niz = ""
        // glavni loop
        for (int i = 0; i < k; i++){
            niz = sc.nextString();
            System.out.println(poisciVTabeli(niz, t));
        }
    }

    public static void ustvariTabelo(Scanner sc, int n, String[][] t){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                t[i][j] = sc.nextString();
            }

        }
    }

    public static String poisciVTabeli(String niz, String[][] t){
        for (int i = 0; i < t.length; i++){
            if (t[i][0].equals(niz)){
                return t[i][1];
            }
        }
        return "NEZNANA";
    }
}