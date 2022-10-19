import java.util.Scanner;

public class Romanje{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int p = sc.nextInt();
        int z = sc.nextInt();

        int prehojeno = p;
        int dan = 1;
        int dolzina = d;

        while ((d > 0) && (prehojeno > 0)){
            dolzina = d - prehojeno;
            if (dolzina < 0){
                dolzina = 0;
            }
            prehojeno = prehojeno - z;
            System.out.println(dan + ": " + d + " -> " + dolzina);
            d = dolzina;
            dan++;
        }
    }
}