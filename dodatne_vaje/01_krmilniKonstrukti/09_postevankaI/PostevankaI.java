import java.util.Scanner;

public class PostevankaI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int faktor = sc.nextInt();
        int maxFaktor = sc.nextInt();

        for (int i = 1; i <= maxFaktor; i++){
            System.out.println(faktor*i);
        }
    }
}