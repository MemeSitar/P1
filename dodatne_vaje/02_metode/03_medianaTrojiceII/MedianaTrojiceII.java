import java.util.Scanner;

public class MedianaTrojiceII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int st1 = sc.nextInt();
        int st2 = sc.nextInt();
        int st3 = sc.nextInt();
        int prviMax = max(st1, st2);
        int drugiMax = max(st1, st3);
        int tretjiMax = max(st2, st3);
        int minimalniMax = min(prviMax, min(drugiMax, tretjiMax));
        System.out.println(minimalniMax);

    }

    public static int min(int st1, int st2){
        if (st1 <= st2){
            return st1;
        } else {
            return st2;
        }
    }

    public static int max(int st1, int st2){
        if (st1 >= st2){
            return st1;
        } else {
            return st2;
        }
    }
}