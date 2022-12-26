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
        this.p = a;
        this.q = b;
    }

    public String toString(){
        return String.format("%d/%d", this.p, this.q);
    }
    
    public boolean jeEnakKot(Ulomek u){
        return (this.p == u.p && this.q == u.q);
    }

    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}