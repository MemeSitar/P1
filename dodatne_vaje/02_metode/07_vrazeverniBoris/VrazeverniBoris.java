import java.util.Scanner;
import java.util.Random;

public class VrazeverniBoris{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int seme = sc.nextInt();
        Random rand = new Random(seme);
        int stDni = sc.nextInt();

        for (int i = 1; i <= stDni; i++){
            iteracija(i, rand);
        }
    }

    public static int stPik(Random rand){
        int stPik = rand.nextInt(6) + 1;
        return stPik;
    }

    public static void iteracija(int i, Random rand){
        int meja = 0;
        int stevec = 0;
        int stevec2 = 0;
        int stPik = 0;
        System.out.printf("%4d ", i);
        if (i % 7 == 0){
            meja = 5;
            System.out.printf("(N):");
        } else {
            meja = 3;
            System.out.printf("(D):");
        }
        while (stevec < meja){
            stevec2++;
            stPik = stPik(rand);
            if (stPik % 2 == 1){
                stevec++;
            }
            System.out.printf(" %d", stPik);
        }
        System.out.printf(" [%d]\n", stevec2);
    }
}