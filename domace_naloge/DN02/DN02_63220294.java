import java.util.Scanner;

public class DN02_63220294{
    // scanner prestavljen ven da je dostopen vsem metodam.
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        // setup
        int rezultat = 0;

        // osnovni vnosi.
        int tipTipkovke = sc.nextInt();
        int d = sc.nextInt();
        int steviloVnosov = sc.nextInt();

        switch (tipTipkovke){
            case 1:
                rezultat = Raznovrstnica(d, steviloVnosov);
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

    public static int Raznovrstnica(int dolzina, int stVnos){
        int rezultat = 0;
        int vnos = 0;
        int buffer = -1;

        // glavni loop
        for (int i = 1; i < stVnos; i++){
            // ce se vnos izvede prvic
            if (buffer == -1){
                buffer = sc.nextInt();
            }

            vnos = sc.nextInt();
            rezultat += Absolutna(vnos, buffer);
            buffer = vnos;
        }
        return rezultat;
    }

    public static int Kvadratnica(int stranica){
        int rezultat = 0;
        return rezultat;
    }

    public static int Piramidnica(int visina){
        int rezultat = 0;
        return rezultat;
    }

    public static int Spiralnica(int stranica){
        int rezultat = 0;
        return rezultat;
    }

    // sprejme dva inta, vrne absolutno vrednost. samoumevno.
    public static int Absolutna(int a, int b){
        int tmp = a - b;
        int vrednost = tmp >= 0 ? tmp : -tmp;
        return vrednost;
    }
}