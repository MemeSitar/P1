import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    
    public static int fib(int n){
        if (n <= 1) {
            return n;
        }
        // tukaj se poklice fib() se tolikokrat, da vsak pride do n <= 1
        // torej da pp in p dokoncata svoja fibbonacijeva zaporedja
        int pp = fib(n - 2); // predprejsnji clen
        int p = fib(n - 1); // prejsnji clen
        return pp + p;
    }
}