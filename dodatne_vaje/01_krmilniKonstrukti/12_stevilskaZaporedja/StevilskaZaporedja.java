import java.util.Scanner;

public class StevilskaZaporedja{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int korak = sc.nextInt();

        if (korak == 0 || (korak > 0 && a < b) || (korak < 0 && a > b)){
            System.out.println("NAPAKA");
        } else {
            if (a > b){
                int tmp = b;
                b = a;
                a = tmp;
                korak = -korak;
            }
            while (a <= b){
                System.out.println(a + i*korak);
                i++;
            }
        }
    }
}