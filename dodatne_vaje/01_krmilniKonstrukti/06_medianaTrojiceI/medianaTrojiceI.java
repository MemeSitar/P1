import java.util.Scanner;

public class medianaTrojiceI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rezultat = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && b >= c || a <= b && b <= c){
            rezultat = b;
        } else if (a >= c && c >= b || a <= c && c <= b){
            rezultat = c;
        } else {
            rezultat = a;
        }
        System.out.println(rezultat);
    }
}