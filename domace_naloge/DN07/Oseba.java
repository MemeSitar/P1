
public class Oseba {
    private String ip;
    private char spol;
    private int starost;

    public Oseba(String ip, char spol, int starost) {
        this.ip = ip;
        this.spol = spol;
        this.starost = starost;
    }

    public String toString() {
        String sporocilo = String.format("%s, %c, %d", ip, spol, starost);
        return sporocilo;
    }

    public boolean jeStarejsaOd(Oseba os) {
        if (this.starost > os.vrniStarost()){
            return true;
        } else {
            return false;
        }
    }

    public int vrniStarost() {
        return this.starost;
    }
}
