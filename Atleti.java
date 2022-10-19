import java.util.Scanner;

public class Atleti{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Koliko atletov tekmuje? ");
        int stAtletov = sc.nextInt();
        int rezultat = 0;
        int maxRezultat = 0;
        int bestAtlet = 0;
        for (int stevec = 1; stevec <= stAtletov; stevec++){
            System.out.print("Vnesite rezultat " + stevec + ". atleta: ");
            rezultat = sc.nextInt();
            if (rezultat > maxRezultat){
                maxRezultat = rezultat;
                bestAtlet = stevec;
            }
        }
        System.out.println("Najboljsi je " + bestAtlet + ". atlet, z rezultatom "+ maxRezultat);
    }
}