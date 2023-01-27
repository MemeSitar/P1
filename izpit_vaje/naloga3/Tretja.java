
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02..04: kli"cejo samo metodo dolzinaVrste
 * 05..07: kli"cejo samo metodo steviloDokumentov
 * 08..10: kli"cejo samo metodo natisni
 *
 * Skriti testni primeri: 
 * 01..16: kli"cejo samo metodo dolzinaVrste
 * 17..33: kli"cejo samo metodo steviloDokumentov
 * 34..50: kli"cejo samo metodo natisni
 *
 * (Vsi testni primeri kli"cejo konstruktor in metodo prejmi, a ta dva se ne to"ckujeta.)
 */

import java.util.*;

public class Tretja {

    public static abstract class Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Profesor extends Pedagog {
        // po potrebi dopolnite ...
		Profesor() {}
    }

    public static class Docent extends Pedagog {
        // po potrebi dopolnite ...
		Docent() {}
    }

    public static class Asistent extends Pedagog {
        // po potrebi dopolnite ...
		Asistent() {}
    }

    public static class Tiskalnik {

        private LinkedList<String> profesorji;
        private LinkedList<String> docenti;
        private LinkedList<String> asistenti;

        public Tiskalnik() {
            profesorji = new LinkedList<>();
            docenti = new LinkedList<>();
            asistenti = new LinkedList<>();

        }

        public void prejmi(Pedagog pedagog, String dokument) {
            if (pedagog instanceof Profesor){
                profesorji.add(dokument);
            } else if (pedagog instanceof Docent){
                docenti.add(dokument);
            } else if (pedagog instanceof Asistent){
                asistenti.add(dokument);
            }
        }

        public int dolzinaVrste() {
            int rezultat = 0;
            rezultat = profesorji.size() + asistenti.size() + docenti.size();
            return rezultat;
        }

        public int steviloDokumentov(Pedagog pedagog) {
            if (pedagog instanceof Profesor){
                return profesorji.size();
            } else if (pedagog instanceof Docent){
                return docenti.size();
            } else if (pedagog instanceof Asistent){
                return asistenti.size();
            }
            return -1;
        }

        public String natisni() {
            if (!profesorji.isEmpty()){
                return profesorji.remove();
            } else if (!docenti.isEmpty()){
                return docenti.remove();
            } else if (!asistenti.isEmpty()){
                return asistenti.remove();
            }
            return null;
        }

    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
