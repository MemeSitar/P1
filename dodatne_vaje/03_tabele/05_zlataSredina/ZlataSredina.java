import java.util.Scanner;

public class ZlataSredina{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = scanner.nextInt();
        int[] t = new int[2*k+1];
        ustvariTabelo(sc, 2*k+1, t);

        
    }

    public static void ustvariTabelo(Scanner sc, int n, int[] t){
        for (int i = 0; i < n; i++){
            t[i] = sc.nextInt();
        }
    }
}