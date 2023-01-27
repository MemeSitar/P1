
/*
Samodejno testiranje:
tj.exe Prva.java . .

Testni primeri:

01: primer iz besedila
02..04: na vhodu je 42 "stevil
01, 05..10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tmpVsota = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxVsota = a + b;
        while(sc.hasNextInt()){
            a = b;
            b = sc.nextInt();
            tmpVsota = a + b;
            if (tmpVsota > maxVsota){
                maxVsota = tmpVsota;
            }
        }
        System.out.println(maxVsota);
    }
}
