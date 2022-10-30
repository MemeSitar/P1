import java.util.Scanner;

public class DN02_63220294{
    public static void main(String[] args){
        // setup
        Scanner sc = new Scanner(System.in);
        int rezultat = 0;

        // osnovni vnosi.
        int tipTipkovke = sc.nextInt();
        int d = sc.nextInt();
        int steviloVnosov = sc.nextInt();

        switch (tipTipkovke){
            case 1:
                rezultat = Raznovrstnica(d);
                break;
            case 2:
                rezultat = Kvadratnica(d);
                break;
            case 3:
                rezultat = Piramidnica(d);
                break;
            case 4:
                rezultat = Spiralnica(d);
                break;
        }

        System.out.println(rezultat);
    }

    public static int Raznovrstnica(int dolzina){
        for (int i = 0; i < steviloVnosov; i++){
            // nekaj
        }
        return 1;
    }

    public static int Kvadratnica(int stranica){
        return 2;
    }

    public static int Piramidnica(int visina){
        return 3;
    }

    public static int Spiralnica(int stranica){
        return 4;
    }

    // sprejme dva inta, vrne absolutno vrednost. samoumevno.
    public static int Absolutna(int a, int b){
        int tmp = a - b;
        int vrednost = tmp >= 0 ? tmp : -tmp;
        return vrednost;
    }
}