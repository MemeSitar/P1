
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static class Tocka {
        private double x;
        private double y;

        public Tocka(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double vrniX() {
            return this.x;
        }

        public double vrniY() {
            return this.y;
        }

        public double razdaljaDo(Tocka t){
            return Math.sqrt(Math.pow(this.x - t.vrniX(), 2) + Math.pow(this.y - t.vrniY(), 2));
        }
    }

    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() {
            String[] najditelji = new String[najdbe.length];
            int stevec = 0;
            for (Najdba n : najdbe){
                najditelji[stevec] = n.vrniNajditelja();
                stevec++;
            }
            return najditelji;
        }

        @Override
        public String toString() {
            return this.id;
        }
    }

    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) {
            double rezultat = zacetna.razdaljaDo(zakladi[0].vrniPolozaj());
            for (int i = 1; i < zakladi.length; i++){
                rezultat += zakladi[i].vrniPolozaj().razdaljaDo(zakladi[i-1].vrniPolozaj());
            }
            rezultat += zacetna.razdaljaDo(zakladi[zakladi.length - 1].vrniPolozaj());
            return rezultat;
        }

        public Zaklad nazadnjeOdkrit() {
            int najvecjiCas = 0;
            Zaklad rezultat = null;
            for (Zaklad z : zakladi){
                if (z.vrniNajdbe().length == 0){
                    continue;
                }
                if (z.vrniNajdbe()[0].vrniCas() > najvecjiCas){
                    najvecjiCas = z.vrniNajdbe()[0].vrniCas();
                    rezultat = z;
                }
            }
            return rezultat;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
