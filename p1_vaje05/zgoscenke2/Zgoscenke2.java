import java.util.Scanner;
import java.util.Arrays;

public class Zgoscenke2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stZgoscenk = sc.nextInt();
        int velikostZgoscenk = sc.nextInt();
        int[] zgoscenke = new int[stZgoscenk];
        // naredimo array s praznim prostorom zgoscenk
        // negativen, najvec negativna je cisto prazna, 0 je polna.
        for (int i = 0; i < stZgoscenk; i++){
            zgoscenke[i] = -velikostZgoscenk;
        }
        while(sc.hasNextInt()){

        }
    }
}