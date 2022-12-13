import java.util.Scanner;
import java.util.Random;

public class ZdolgocasenaMojca{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int seme = sc.nextInt();
        Random rand = new Random(seme);

        int stKock = sc.nextInt();
        int stDni = sc.nextInt();

        for (int i = 1; i <= stDni; i++){
            System.out.printf("%d. dan:\n", i);
            simulirajDan(rand, stKock);
        }
    }

    public static void simulirajDan(Random rand, int stKock){
        int vsota = 0;
        int stevec = 1;
        do {
            System.out.printf("    %d. met:", stevec);
            vsota = sestevekNkock(stKock, rand);
            System.out.printf(" | vsota = %d\n", vsota);
            stevec++;
        } while (jePrastevilo(vsota) != true);
    }

    public static boolean jePrastevilo(int stevilo){
        if (stevilo == 1){
            return false;
        }
        int sqrt = (int)Math.sqrt(stevilo);
        for (int i = 2; i <= sqrt; i++){
            if (stevilo % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int sestevekNkock(int stKock, Random rand){
        int suma = 0;
        int stPik = 0;
        for (int i = 0; i < stKock; i++){
            stPik = stPik(rand);
            System.out.printf(" %d", stPik);
            suma += stPik;
        }
        return suma;
    }

    public static int stPik(Random rand){
        int stPik = rand.nextInt(6) + 1;
        return stPik;
    }
}