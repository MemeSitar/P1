
public class Stanovanje {
    private Oseba[] stanovalci;
    private Stanovanje[] stanovanja;

    public Stanovanje(Oseba[] stanovalci) {
        this.stanovanja = new Stanovanje[4];
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
        this.stanovanja[0] = levi;
        this.stanovanja[1] = zgornji;
        this.stanovanja[2] = desni;
        this.stanovanja[3] = spodnji;
    }

    public Oseba starostaSosescine() {
        Oseba najstarejsaOs = this.starosta();
        int najStarost = 0;
        Oseba[] najstarejsi = new Oseba[4];
        for (int i = 0; i < 4; i++){
            if (this.stanovanja[i] != null){
                najstarejsi[i] = this.stanovanja[i].starosta();
            }
        }
        for (int i = 0; i < 4; i++){
            if (najstarejsi[i] != null && najstarejsi[i].vrniStarost() > najStarost){
                najstarejsaOs = najstarejsi[i];
                najStarost = najstarejsaOs.vrniStarost();
            }
        }
        return najstarejsaOs;
    }

    public Oseba[] sosedjeSosedov() {
        int velikostTabele = this.steviloSosedovSosedov();
        Oseba[] sosedjeSosedov = new Oseba[velikostTabele];
        int j = 0;
        for (int i = 0; i < 4; i++){
            if (this.stanovanja[i] == null){
                continue;
            }
            //this.stanovanja[i].sosednjeOsebe[]
        }
        return null;
    }

    public Oseba[] sosednjeOsebe(int zacetniIndeks){
        // ta funkcija preveri samo zacetni indeks, in naslednji indeks.
        int j = 0;
        int velikostTabele = this.steviloSosedovOseb(zacetniIndeks);
        Oseba[] sosedje = new Oseba[velikostTabele];
        int temp = 0;
        for (int i = zacetniIndeks; i < zacetniIndeks + 2; i++){
            temp = i % 4;
            if (stanovanja[i] == null) {
                continue;
            }
            for (int k = 0; k < stanovanja[i].steviloStanovalcev(); k++){
                sosedje[j] = stanovanja[i].stanovalci[k];
                j++;
            }
        }
        return sosedje;
    }

    public int steviloSosedovOseb(int zacetniIndeks){
        // ta funkcija vrne velikost tabele za sosednjeOsebe.
        int stOseb = 0;
        int temp = 0;
        for (int i = zacetniIndeks; i < zacetniIndeks + 2; i++){
            temp = i % 4;
            if (this.stanovanja[temp] != null){
                stOseb += this.steviloStanovalcev();
            }
        }
        return stOseb;
    }

    public int steviloSosedovSosedov(){
        int stOseb = 0;
        for (int i = 0; i < 4; i++){
            if (this.stanovanja[i] == null){
                continue;
            }
            stOseb += this.stanovanja[i].steviloSosedovOseb(i);
        }
        return stOseb;
    }
}
