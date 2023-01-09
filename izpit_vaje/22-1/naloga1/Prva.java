
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        boolean[] prastevila = new boolean[1001];
        Scanner sc = new Scanner(System.in);
        int spMeja = sc.nextInt();
        int zgMeja = sc.nextInt();
        prastevila = prastevilaTabela(prastevila);
        int stevec = 0;
        for (int i = spMeja; i <= zgMeja; i++){
            if (!prastevila[i]){
                continue;
            }
            if (Chen(i)){
                stevec++;
            }
        }
        System.out.println(stevec);
    }

    public static boolean[] prastevilaTabela(boolean[] stevila){
        for (int i = 2; i <= 1000; i++){
            if (stevila[i]){
                continue;
            }
            if (jePrastevilo(i)){
                stevila[i] = true;
            }
        }
        return stevila;
    }

    public static boolean jePrastevilo(int stevilo){
        int koren = (int) Math.sqrt(stevilo);
        int i = 3;
        if (stevilo % 2 == 0){
            return false;
        }
        while (i <= koren){
            if (stevilo % i == 0){
                return false;
            }
            i = i + 2;
        }
        return true;
    }

    public static boolean Chen(int prastevilo){
        int stevilo = prastevilo + 2;
        int stevec = 0;
        for (int i = 1; i <= stevilo; i++){
            if (stevec > 4){
                return false;
            }
            if (stevilo % i == 0){
                stevec++;
            }
        }
        return (stevec >= 4);
    }

}
