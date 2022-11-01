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
                rezultat = Spiralnica(d, steviloVnosov);
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

    public static int Spiralnica(int stranica, int stVnos){
        int rezultat = 0;
        int vnos = 0;
        int buffer = 0;

        // glavni loop
        buffer = sc.nextInt();
        for (int i = 1; i < stVnos; i++){
            vnos = sc.nextInt();
            rezultat += AbsRazKo(SpirKoord(buffer, "x"), SpirKoord(buffer, "y"),
             SpirKoord(vnos, "x"), SpirKoord(vnos, "y"));
            buffer = vnos;
        }
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

    // X koordinata za piramido 
    // d - 1 - i + offset (razdalja od zacetka vrstice do stevilke)
    public static int KoX2(int koordY, int d, int stevilka){
        int offset = stevilka - (koordY * koordY); // oddaljenost stevilke od prve v vrsti
        int rezultat = d - 1 - koordY + offset; // oddaljenost od (0, i) (prazen prostor)
        return rezultat;
    }

    // Y koordinate za piramido
    public static int KoY2(int stevilka){
        return (int) Math.sqrt(stevilka);
    }
    
    // funkcija vzame notri stevilko iz spiralnice
    // preko tega, v katerem krogu je stevilka izracuna njegovo x ali y koordinato.
    // drugo koordinato dobi iz oddaljenosti od prvega kvadrata v krogu.
    // XaliY je string, ki poskrbi da funkcija pri inputu "x" flikne ven x, sicer pa y 
    public static int SpirKoord(int stevilka, String XaliY){
        int koren = (int) Math.sqrt(stevilka);
        int manjsiKvadrat = koren * koren;
        int prviKvadratKroga = 0;
        int x = 0;
        int y = 0;
        int stKroga = 0;
        int stranicaKroga = 0;
        int razdOdZacKroga = 0;

        // poiscemo prvi kvadrat v krogu (torej kvadrati lihih stevil -- 1, 9, 25, 49 ...)
        // koren potem spremenimo v koren sodega kvadrata, da dobimo pravilno stevilko za kroge.
        if (koren % 2 == 1){
            prviKvadratKroga = koren * koren;
            koren += 1;
            stKroga = (koren + 1) / 2;
        } else {
            prviKvadratKroga = (koren - 1) * (koren - 1);
            stKroga = koren / 2;
        }

        razdOdZacKroga = stevilka - prviKvadratKroga;
        stranicaKroga = 2 * stKroga;

        // kolikokrat razdalja od zacetka kroga (torej 1, 9, 25 ...) preseze stranico kroga
        // stranica kroga je dva krat stevilka kroga
        if (razdOdZacKroga <= stranicaKroga){
            y = stKroga;
            x = -stKroga + razdOdZacKroga;
        } else if (razdOdZacKroga <= 2 * stranicaKroga){
            x = stKroga;
            y = stKroga - (razdOdZacKroga - stranicaKroga);
        } else if (razdOdZacKroga <= 3 * stranicaKroga){
            y = -stKroga;
            x = stKroga - (razdOdZacKroga - 2 * stranicaKroga);
        } else if (razdOdZacKroga <= 4 * stranicaKroga){
            x = -stKroga;
            y = -stKroga + (razdOdZacKroga - 3 * stranicaKroga);
        }
        // uporabljeno za debuggiranje
        //System.out.printf("%d, krog: %d, koordinate: (%d, %d)\n", stevilka, stKroga, x, y);

        // rec ne dela za stevilka = 0, bog ve zakaj.
        if (stevilka == 0){
            x = 0;
            y = 0;
        }

        // odloci ali je output x ali y
        if (XaliY == "x"){
            return x;
        } else {
            return y;
        }
    }
}