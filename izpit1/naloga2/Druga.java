
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01: primer iz besedila
02..04: vsaka beseda je sestavljena iz ene same "crke
01, 05..10: splo"sni primeri

01, 02, 05, 06: ro"cno izdelani
*/

import java.util.*;

public class Druga {

    public static boolean krizankaOK(char[][] besede, char[][] polozaji) {
        char[][] krizanka = new char[18][18];
        int zacetniPolozajX = 0;
        int zacetniPolozajY = 0;

        for (int i = 0; i < besede.length; i++){
            zacetniPolozajY = polozaji[i][0] % 48;
            zacetniPolozajX = polozaji[i][1] % 48;
            //System.out.printf("X: %d, Y: %d\n", zacetniPolozajX, zacetniPolozajY);
            for (char crka : besede[i]){
                //System.out.println(crka);
                if (krizanka[zacetniPolozajY][zacetniPolozajX] != crka && krizanka[zacetniPolozajY][zacetniPolozajX] != '\u0000'){
                    return false;
                } else {
                    krizanka[zacetniPolozajY][zacetniPolozajX] = crka;
                }
                if (polozaji[i][2] == 'v'){
                    zacetniPolozajX++;
                } else {
                    zacetniPolozajY++;
                }
                //System.out.printf("X: %d, Y: %d\n", zacetniPolozajX, zacetniPolozajY);
            }
        }
        return true;
    }
}
