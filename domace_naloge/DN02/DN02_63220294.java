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

        // glavni switch
        switch (tipTipkovke){
            case 1:
                rezultat = Raznovrstnica(d, steviloVnosov);
                break;
            case 2:
                rezultat = Kvadratnica(d, steviloVnosov);
                break;
            case 3:
                rezultat = Piramidnica(d, steviloVnosov);
                break;
            case 4:
                rezultat = Spiralnica(d);
                break;
        }

        // edini output
        System.out.println(rezultat);
    }

    public static int Raznovrstnica(int dolzina, int stVnos){
        int rezultat = 0;
        int vnos = 0;
        int buffer = 0;

        // glavni loop
        buffer = sc.nextInt();
        for (int i = 1; i < stVnos; i++){
            vnos = sc.nextInt();
            rezultat += Absolutna(vnos, buffer);
            buffer = vnos;
        }
        return rezultat;
    }

    public static int Kvadratnica(int stranica, int stVnos){
        int rezultat = 0;
        int vnos = 0;
        int buffer = 0;

        // glavni loop
        buffer = sc.nextInt();
        for (int i = 1; i < stVnos; i++){
            vnos = sc.nextInt();
            rezultat += AbsRazKvad(buffer, vnos, stranica);
            buffer = vnos;
        }
        return rezultat;
    }

    public static int Piramidnica(int visina, int stVnos){
        int rezultat = 0;
        int vnos = 0;
        int buffer = 0;

        buffer = sc.nextInt();
        int by = KoY2(buffer);
        int bx = KoX2(by, visina, buffer);
        for (int i = 1; i < stVnos; i++){
            vnos = sc.nextInt();
            int vy = KoY2(vnos);
            int vx = KoX2(vy, visina, vnos);
            rezultat += AbsRazKo(bx, by, vx, vy);
            buffer = vnos;
            by = vy;
            bx = vx;
        }
        return rezultat;
    }

    public static int Spiralnica(int stranica){
        int rezultat = 0;
        return rezultat;
    }
    
    // sklepa da je kvadratni koordinatni sistem, izracuna X in Y obeh, vrne razdaljo.
    public static int AbsRazKvad(int prvaCifra, int drugaCifra, int stranica){
        return AbsRazKo(KoordX(prvaCifra, stranica), KoordY(prvaCifra, stranica),
         KoordX(drugaCifra, stranica), KoordY(drugaCifra, stranica));
    }

    // vrne absolutno razliko koordinat (razdaljo)
    // |(x1, y1) - (x2, y2)|
    public static int AbsRazKo(int x1, int y1, int x2, int y2){
        int vrednost = 0;
        vrednost = Absolutna(x1, x2) + Absolutna(y1, y2);
        return vrednost;
    }

    // sprejme dva inta, vrne absolutno vrednost. samoumevno.
    public static int Absolutna(int a, int b){
        int tmp = a - b;
        int vrednost = tmp >= 0 ? tmp : -tmp;
        return vrednost;
    }

    // vrne koordinato X stevila v kvadratu s stranico d
    public static int KoordX(int stevilka, int d){
        return stevilka % d;
    }

    // -||- za Y
    public static int KoordY(int stevilka, int d){
        return stevilka / d;
    }

    public static int KoX2(int koordY, int d, int stevilka){
        int offset = stevilka - (koordY * koordY);
        int rezultat = d - 1 - koordY + offset;
        return rezultat;
    }

    public static int KoY2(int stevilka){
        return (int) Math.sqrt(stevilka);
    }
}