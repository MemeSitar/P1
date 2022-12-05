
public class Tocka {
    private double xKoordinata;
    private double yKoordinata;

    public Tocka(double x, double y) {
        this.xKoordinata = x;
        this.yKoordinata = y;
    }

    public double vrniX() {
        return this.xKoordinata;
    }

    public double vrniY() {
        return this.yKoordinata;
    }

    public String toString() {
        return String.format(java.util.Locale.US, "(%.2f, %.2f)", this.xKoordinata, this.yKoordinata);
    }

    // ustrezno dopolnite/popravite ...
    public static Tocka izhodisce() {
        Tocka tocka = new Tocka(0,0);
        return tocka;
    }

    // ustrezno dopolnite/popravite ...
    public double razdalja(Tocka t) {
        double xRazdalja = (t.xKoordinata - this.xKoordinata);
        double yRazdalja = t.yKoordinata - this.yKoordinata;
        double razdalja = Math.sqrt(Math.pow(xRazdalja, 2) + Math.pow(yRazdalja, 2));
        return razdalja;
    }

    // ustrezno dopolnite/popravite ...
    public double razdaljaOdIzhodisca() {
        double razdalja = Math.sqrt(Math.pow(this.xKoordinata, 2) + Math.pow(this.yKoordinata, 2));
        return razdalja;
    }
}
