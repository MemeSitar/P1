import java.util.Arrays;

public class Stanovanje {
    private Oseba[] stanovalci;
    private Stanovanje[] sosedi;

    public Stanovanje(Oseba[] stanovalci) {
        this.sosedi = new Stanovanje[4];
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
        this.sosedi[0] = levi;
        this.sosedi[1] = zgornji;
        this.sosedi[2] = desni;
        this.sosedi[3] = spodnji;
    }

    public Oseba starostaSosescine() {
        Oseba najstarejsaOs = this.starosta();
        int najStarost = 0;
        Oseba[] najstarejsi = new Oseba[4];
        for (int i = 0; i < 4; i++){
            if (this.sosedi[i] != null){
                najstarejsi[i] = this.sosedi[i].starosta();
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
        Oseba[] rezultat = new Oseba[0];
        Sosedje sosedje = new Sosedje(rezultat);
        // iterira cez vse sosede.
        for (int i = 0; i < 4; i++){
            if (sosedi[i] == null){
                continue;
            }
            for (int j = i; j < i + 2; j++){
                if (sosedi[i].sosedi[j % 4] == null){
                    continue;
                }
                sosedje.dodajTabelo(sosedi[i].sosedi[j % 4].vrniStanovalce());
            }
        }
        rezultat = Arrays.copyOf(sosedje.vrniTabeloSosedov(), sosedje.vrniSteviloSosedov());
        System.out.println(Arrays.toString(rezultat));
        return rezultat;
    }

    public Oseba[] vrniStanovalce(){
        return this.stanovalci;
    }

    public class Sosedje{
        private Oseba[] sosedje;
        private int stOsebVtabeli;
        private final int increment = 5;

        public Sosedje(Oseba[] stanovalci){
            stOsebVtabeli = stanovalci.length;
            sosedje = Arrays.copyOf(stanovalci, stOsebVtabeli + increment);
        }

        public void dodajSoseda(Oseba sosed){
            if (stOsebVtabeli >= sosedje.length){
                this.povecajTabelo(1);
            }
            stOsebVtabeli++;
            sosedje[stOsebVtabeli] = sosed;
        }

        public void dodajTabelo(Oseba[] vecSosedov){
            if (stOsebVtabeli + vecSosedov.length >= sosedje.length){
                this.povecajTabelo(vecSosedov.length);
            }
            for (int i = 0; i < vecSosedov.length; i++){
                this.dodajSoseda(vecSosedov[i]);
            }
        }

        private void povecajTabelo(int dodatnaVelikost){
            sosedje = Arrays.copyOf(sosedje, sosedje.length + increment + dodatnaVelikost);
        }

        private Oseba[] vrniTabeloSosedov(){
            return this.sosedje;
        }

        private int vrniSteviloSosedov(){
            return this.stOsebVtabeli;
        }
    }
}
