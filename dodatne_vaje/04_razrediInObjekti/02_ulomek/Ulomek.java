public class Ulomek{
    private int p;
    private int q;
    public Ulomek(int a, int b){
        int gcd = gcd(a, b);
        do {
            a = a / gcd;
            b = b / gcd;
            gcd = gcd(a, b);
        } while (gcd > 1);
        if (b < 0 && a > 0){
            a *= -1;
            b *= -1;
        }
        this.p = a;
        this.q = b;
    }

    public String toString(){
        return String.format("%d/%d", this.p, this.q);
    }
    
    public boolean jeEnakKot(Ulomek u){
        return (this.p == u.p && this.q == u.q);
    }

    public Ulomek negacija(){
        return new Ulomek(-p, q);
    }

    public Ulomek obrat(){
        return new Ulomek(q, p);
    }

    public Ulomek vsota(Ulomek u){
        int lcm = lcm(this.q, u.q);
        int skalar1 = lcm / this.q;
        int skalar2 = lcm / u.q;
        int noviP = (this.p * skalar1) + (u.p * skalar2);
        return new Ulomek(noviP, lcm);
    }

    public Ulomek razlika(Ulomek u){
        return this.vsota(u.negacija());
    }

    public Ulomek zmnozek(Ulomek u){
        return new Ulomek(this.p * u.p, this.q * u.q);
    }

    public Ulomek kolicnik(Ulomek u){
        return this.zmnozek(u.obrat());
    }

    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b){
        return ((a * b) / gcd(a, b));
    }
}