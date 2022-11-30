public class Knjiznica{
    private int[][] clani;
    private int[] knjige;

    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov){
        this.clani = new int[stClanov][stNaslovov];
        this.knjige = new int[stNaslovov];
        for (int i = 0; i < stNaslovov; i++){
            knjige[i] = stIzvodovNaNaslov;
        }
    }

    public boolean posodi(int clan, int naslov){
        if (this.clani[clan][naslov] == 0){
            this.clani[clan][naslov] += 1;
            return true;
        } else {
            return false;
        }
    }
}