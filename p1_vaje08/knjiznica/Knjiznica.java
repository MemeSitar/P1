public class Knjiznica{
    private int[][] clani;
    private int[] knjige;
    private int stIzvodovNaNaslov;

    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov){
        this.stIzvodovNaNaslov = stIzvodovNaNaslov;
        this.clani = new int[stClanov][stNaslovov];
        this.knjige = new int[stNaslovov];
        for (int i = 0; i < stNaslovov; i++){
            knjige[i] = stIzvodovNaNaslov;
        }
    }

    public boolean posodi(int clan, int naslov){
        if (this.clani[clan][naslov] == 0 && this.knjige[naslov] > 0){
            this.clani[clan][naslov] += 1;
            this.knjige[naslov] -= 1;
            return true;
        } else {
            return false;
        }
    }

    public void clanVrne(int clan){
        for (int i = 0; i < this.clani[clan].length; i++){
            if (this.clani[clan][i] == 1){
                this.clani[clan][i] = 0;
                this.knjige[i] += 1;
            }
        }
    }

    public int posojeni(int naslov){
        int posojeni = this.stIzvodovNaNaslov - this.knjige[naslov];
        return posojeni;
    }

    public int priClanu(int clan){
        int stevec = 0;
        for (int i = 0; i < this.clani[clan].length; i++){
            if (this.clani[clan][i] == 1){
                stevec++;
            }
        }
        return stevec;
    }

    public int najNaslov(){
        int najmanj = this.stIzvodovNaNaslov;
        int najNaslov = 0;
        return najNaslov;
    }

}