import java.util.Scanner;

public class DigitalneCrtice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        ustvariTabelo(sc, n, t);

        int sumaStevilke = 0;
        int maxStevilka = 0;
        int maxSuma = 0;

        for (int stevilka : t){
            sumaStevilke = sumaStevilke(stevilka);
            if (sumaStevilke > maxSuma){
                maxSuma = sumaStevilke;
                maxStevilka = stevilka;
            }
        }

        System.out.println(maxStevilka);
    }

    public static void ustvariTabelo(Scanner sc, int n, int[] t){
        for (int i = 0; i < n; i++){
            t[i] = sc.nextInt();
        }
    }

    public static int sumaStevilke(int a){
        int[] lut = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int suma = 0;
        int mod = 0;
        do {
            mod = a % 10;
            a = a / 10;
            suma += lut[mod];
        } while (a != 0);
        return suma;
    }
}