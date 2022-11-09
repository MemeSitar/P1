import java.util.Scanner;

public class Fibonacci2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // memo[i] == 0 pomeni da vrednost se ni izracunana
        // memo[i] > 0 pomeni da je vrednost izracunana. uporabi vrednost.
        int[] memo = new int[n + 1];
        System.out.println(fib(n, memo));
    }
    
    public static int fib(int n, int[] memo){
        if (n <= 1) {
            return n;
        }
        if (memo[n] > 0){
            return memo[n];
        }
        // tukaj se poklice fib() se tolikokrat, da vsak pride do n <= 1
        // torej da pp in p dokoncata svoja fibbonacijeva zaporedja
        int pp = fib(n - 2, memo); // predprejsnji clen
        int p = fib(n - 1, memo); // prejsnji clen
        memo[n] = pp + p;
        return memo[n];
    }
}