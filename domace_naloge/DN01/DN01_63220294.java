import java.util.Scanner;

public class DN01_63220294{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stKvadratov = 0;
        int stranicaA = sc.nextInt();
        int stranicaB = sc.nextInt();

        // obrne stranici, ce je stranicaA vecja od stranicaB
        // pravokotnik je vedno vodoraven
        // stranicaB je vodoravna stranica, vedno vecja.
        if (stranicaA > stranicaB){
            int temp = stranicaA;
            stranicaA = stranicaB;
            stranicaB = temp;
        }

        stranicaA -= 1;
        stranicaB -= 1;
        while (stranicaB >= 1){
            stKvadratov = stranicaA * stranicaB;
            stranicaA -= 1;
            stranicaB -= 1;
        }
        System.out.println(stKvadratov);
    }
}