
public class Stanovanje {
    private Oseba[] stanovalci;

    public Stanovanje(Oseba[] stanovalci) {
        this.stanovalci = stanovalci;
    }

    public int steviloStanovalcev() {
        int stevilo = this.stanovalci.length;
        return stevilo;
    }

    public int steviloStarejsihOd(Oseba os) {
        int stevec = 0;
        int starostOs = os.vrniStarost();
        for (int i = 0; i < this.steviloStanovalcev(); i++){
            if (this.stanovalci[i].vrniStarost() > starostOs){
                stevec++;
            }
        }
        return stevec;
    }

    public int[] mz() {
        // dopolnite/popravite ...
        return null;
    }

    public Oseba starosta() {
        // dopolnite/popravite ...
        return null;
    }

    public void nastaviSosede(Stanovanje levi, Stanovanje zgornji,
            Stanovanje desni, Stanovanje spodnji) {
        // dopolnite ...
    }

    public Oseba starostaSosescine() {
        // dopolnite/popravite ...
        return null;
    }

    public Oseba[] sosedjeSosedov() {
        // dopolnite/popravite ...
        return null;
    }
}
