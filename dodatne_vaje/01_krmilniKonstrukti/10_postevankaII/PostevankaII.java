import java.util.Scanner;

public class PostevankaII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int faktor = sc.nextInt();
        int maxFaktor = sc.nextInt();

        for (int i = 1; i <= maxFaktor; i++){
            System.out.printf("%d * %d = %d\n", faktor, i, faktor*i);
        }
    }
}