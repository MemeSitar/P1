import java.util.Scanner;

public class Priklic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] stevila = new int[n];
        for (int i = 0; i < n; i++){
            stevila[i] = sc.nextInt();
        }
        System.out.println(vsota(stevila));
        System.out.println(indeksMaksimuma(stevila));
    }

    public static int vsota(int[] t){
        int sestevek = 0;
        for (int element: t){
            sestevek += element;
        }
        return sestevek;
    }

    public static int indeksMaksimuma(int[] t){
        int indeksNaj = 0;
        for (int i = 0; i < t.length; i++){
            if (t[i] > t[indeksNaj]){
                indeksNaj = i;
            }
        }
        return indeksNaj;
    }
}