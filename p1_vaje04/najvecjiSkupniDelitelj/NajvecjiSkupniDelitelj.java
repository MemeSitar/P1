import java.util.Scanner;

public class NajvecjiSkupniDelitelj{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = 1;
        int q = 1;
        int zgornjaMeja = sc.nextInt();
        int najvecjiDelitelj = sc.nextInt();
        
        // p nastavimo na najvecji skupni delitelj, to je najmanjsa mozna vrednost.
        p = najvecjiDelitelj;
        while (p <= zgornjaMeja){
            q = p;
            while (q <= zgornjaMeja){
                if (gcd(p, q) == najvecjiDelitelj){
                    System.out.printf("(%d, %d)\n", p, q);
                }
                // potem p in q iteriramo po najmanjsem skupnem delitelju.
                // prisparamo ogromno casa.
                q += najvecjiDelitelj;
            }
            p += najvecjiDelitelj;
        }
    }

    // funkcija za iskanje najvecjega skupenga delitelja a in b.
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}