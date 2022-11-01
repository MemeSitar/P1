import java.util.Scanner;

public class testSpiralnica{
    // scanner prestavljen ven da je dostopen vsem metodam.
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        // setup
        int rezultat = 0;
        int stevilka = 0;
        stevilka = sc.nextInt();

        // osnovni vnosi.
        //int tipTipkovke = sc.nextInt();
        //int d = sc.nextInt();
        //int steviloVnosov = sc.nextInt();
        
        //rezultat = Spiralnica(d, steviloVnosov);
        SpirKoord(stevilka);
        // edini output
        //System.out.println(rezultat);
    }
    
    public static int Spiralnica(int stranica, int stVnos){
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
    
    public static void SpirKoord(int stevilka){
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
        // rec ne dela za stevilka == 0, bog ve zakaj.
        if (stevilka == 0){
            x = 0;
            y = 0;
        }
        System.out.printf("%d, krog: %d, koordinate: (%d, %d)\n", stevilka, stKroga, x, y);
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
}