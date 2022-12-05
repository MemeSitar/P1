
public class Stanovanje {
    private Oseba[] stanovalci;
    private Stanovanje levi;
    private Stanovanje zgornji;
    private Stanovanje desni;
    private Stanovanje spodnji;

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
        int[] mz = new int[2];
        for (int i = 0; i < this.steviloStanovalcev(); i++){
            if (this.stanovalci[i].vrniSpol()) {
                mz[0] += 1;
            } else {
                mz[1] += 1;
            }
        }
        return mz;
    }

    public Oseba starosta() {
        int maxStarost = 0;
        int najstarejsaOs = 0;
        if (this.steviloStanovalcev() == 0){
            return null;
        } else {
            for (int i = 0; i < this.steviloStanovalcev(); i++){
                if (this.stanovalci[i].vrniStarost() > maxStarost){
                    maxStarost = this.stanovalci[i].vrniStarost();
                    najstarejsaOs = i;
                }
            }
            return this.stanovalci[najstarejsaOs];
        }
    }

    public void nastaviSosede(Stanovanje levi, Stanovanje zgornji,
            Stanovanje desni, Stanovanje spodnji) {
        this.levi = levi;
        this.zgornji = zgornji;
        this.desni = desni;
        this.spodnji = spodnji;
    }

    public Oseba starostaSosescine() {
        Oseba najstarejsaOs = this.starosta();
        int najStarost = 0;
        Oseba[] najstarejsi = new Oseba[4];
        if (this.levi != null){
            najstarejsi[1] = this.levi.starosta();
        }
        if (this.desni != null){
            najstarejsi[2] = this.desni.starosta();
        }
        if (this.zgornji != null){
            najstarejsi[3] = this.levi.starosta();
        }
        if (this.zgornji != null){
            najstarejsi[0] = this.levi.starosta();
        }
        for (int i = 0; i < 5; i++){
            if (najstarejsi[i] != null && najstarejsi[i].vrniStarost() > najStarost){
                najstarejsaOs = najstarejsi[i];
                najStarost = najstarejsaOs.vrniStarost();
            }
        }
        return najstarejsaOs;
    }

    public Oseba[] sosedjeSosedov() {
        
        return null;
    }
}
