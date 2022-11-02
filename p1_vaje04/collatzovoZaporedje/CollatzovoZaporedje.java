import java.util.Scanner;

public class CollatzovoZaporedje{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int najdaljsaStevilka = 0;
        int najdaljsaDolzina = 0;
        int spodnjaMeja = sc.nextInt();
        int zgornjaMeja = sc.nextInt();

        for (int i = spodnjaMeja; i <= zgornjaMeja; i++){
            if (Collatz(i) > najdaljsaDolzina){
                najdaljsaDolzina = Collatz(i);
                najdaljsaStevilka = i;
            }
        }
        System.out.println(najdaljsaStevilka);
        System.out.println(najdaljsaDolzina);
    }

    public static int Collatz(int stevilka){
        int stevec = 1;

        while (stevilka != 1){
            if (stevilka % 2 == 0){
                stevilka = stevilka / 2;
            } else {
                stevilka = stevilka * 3 + 1;
            }
            stevec++;
        }
        return stevec;
    }
}