
public class Premica {
    private double k;
    private double n;

    public Premica(double k, double n) {
        this.k = k;
        this.n = n;
    }

    public double vrniK() {
        return this.k;
    }

    public double vrniN() {
        return this.n;
    }

    public String toString() {
        String string = String.format(java.util.Locale.US, "y = %.2f x + %.2f", this.k, this.n);
        return string;
    }

    public Tocka tockaPriX(double x) {
        double y = this.k * x + this.n;
        Tocka tocka = new Tocka(x, y);
        return tocka;
    }

    public static Premica skoziTocko(double k, Tocka t) {
        double n = t.vrniY() - t.vrniX() * k;
        Premica premica = new Premica(k, n);
        return premica;
    }

    public Premica vzporednica(Tocka t) {
        Premica vzporednica = Premica.skoziTocko(this.k, t);
        return vzporednica;
    }

    public Premica pravokotnica(Tocka t) {
        double noviK = -1 / this.k;
        Premica pravokotnica = Premica.skoziTocko(noviK, t);
        return pravokotnica;
    }

    public Tocka presecisce(Premica p, double epsilon) {
        if (Math.abs(this.k - p.k) < epsilon){
            return null;
        } else {
            double noviX = (p.n - this.n)/(this.k - p.k);
            Tocka tocka = tockaPriX(noviX);
            return tocka;
        }
    }

    public Tocka projekcija(Tocka t) {
        Premica vzporednica = vzporednica(t);
        Premica pravokotnica = vzporednica.pravokotnica(t);
        Tocka presecisce = this.presecisce(pravokotnica, 0);
        return presecisce;
    }

    public double razdalja(Tocka t) {
        double razdalja = t.razdalja(this.projekcija(t));
        return razdalja;
    }

    public double razdaljaOdIzhodisca() {
        Tocka t = Tocka.izhodisce();
        double razdalja = this.razdalja(t);
        return razdalja;
    }

    public double razdalja(double n) {
        Premica pravokotnica = this.pravokotnica(Tocka.izhodisce());
        Premica premica2 = new Premica(this.k, n);
        Tocka presecisce = this.presecisce(pravokotnica, 0);
        double skupnaRazdalja = premica2.razdalja(presecisce);
        return skupnaRazdalja;
    }
}
