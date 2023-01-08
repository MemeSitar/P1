public class Krozek {
    private String naziv;
    private int dan;
    private int ura;
    private int kvota;
    private int steviloClanov;

    public Krozek(String naziv, int dan, int ura, int kvota){
        this.naziv = naziv;
        this.dan = dan;
        this.ura = ura;
        this.kvota = kvota;
        this.steviloClanov = 0;
    }

    public String vrniNaziv(){
        return this.naziv;
    }

    public int steviloClanov(){
        return steviloClanov;
    }

    public boolean dodajClana(){
        if (this.steviloClanov < this.kvota){
            steviloClanov++;
            return true;
        }
        return false;
    }

    public void odstraniClana(){
        if (this.steviloClanov > 0){
            this.steviloClanov--;
        }
    }

    public boolean sePrekrivata(Krozek k){
        if (this.dan != k.dan){
            return false;
        }
        return !(Math.abs(this.ura-k.ura) >= 2 );
    }
}
