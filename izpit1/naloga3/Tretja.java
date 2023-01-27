
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01..03: toString
04..06: equals
07..10: hashCode

01, 04, 07: rocno izdelani; isti podatki v vseh treh razredih
*/

import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;
        }

        @Override
        public String toString(){
            int prviDel = stevilo / 100;
            int drugiDel = stevilo % 100;
            String izpis = String.format("%c%c %d-%d", kraj[0], kraj[1], prviDel, drugiDel);
            return izpis;
        }

        @Override
        public boolean equals(Object t){
            if (this == t){
                return true;
            }
            if (!(t instanceof Tablica)){
                return false;
            }
            Tablica tablica = (Tablica) t;
            if (this.kraj[0] == tablica.kraj[0] && this.kraj[1] == tablica.kraj[1]
                && this.stevilo == tablica.stevilo && this.zacasna == tablica.zacasna){
                    return true;
                }
            return false;
        }

        @Override
        public int hashCode(){
            int rezultat = 0;
            if (this.zacasna){
                rezultat += stevilo * 17 + 1;
            } else {
                rezultat += stevilo * 101;
            }

            Character crka1 = (Character) kraj[0];
            Character crka2 = (Character) kraj[1];
            rezultat += crka1.hashCode() * 29 + crka2.hashCode() * 31;
            
            return rezultat;
        }
    }
}
