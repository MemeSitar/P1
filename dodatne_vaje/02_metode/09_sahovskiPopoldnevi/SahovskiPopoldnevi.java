import java.util.Random;
import java.util.Scanner;

public class SahovskiPopoldnevi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int seme = sc.nextInt();
        Random rand = new Random(seme);

        int verA = sc.nextInt();
        int verB = sc.nextInt();
        int stPartij = sc.nextInt();
        int stZmag = sc.nextInt();
        int stDni = sc.nextInt();

        for (int i = 1; i <= stDni; i++){
            System.out.printf("%d. dan: ", i);
            simulirajDan(verA, verB, rand, stZmag, stPartij);
        }
    }

    public static void simulirajDan(int verA, int verB, Random rand, int stZmag, int stPartij){
        int zmageA = 0;
        int zmageB = 0;
        int i = 0;
        char rezultat = ' ';

        while (Math.max(zmageA, zmageB) < stZmag && i < stPartij){
            rezultat = simulirajPartijo(verA, verB, rand);
            switch (rezultat){
                case 'A' :
                    zmageA++;
                    break;
                case 'B' :
                    zmageB++;
                    break;
                case 'r' :
                    break;
                }
            i++;
        }
        System.out.printf(" (%d)\n", i);
    }

    public static char simulirajPartijo(int verA, int verB, Random rand){
        char rezultat = ' ';
        int stevilka = 0;
        stevilka = rand.nextInt(100);
        if (stevilka < verA){
            rezultat = 'A';
        } else if (stevilka >= (verA + verB)){
            rezultat = 'r';
        } else if (stevilka >= verA && stevilka < (verA + verB)){
            rezultat = 'B';
        }
        System.out.print(rezultat);
        return rezultat;
    }
}