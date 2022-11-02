import java.util.Scanner;

public class PostevankaIII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int faktor = sc.nextInt();
        int maxRezultat = sc.nextInt();

        for (int i = 1; faktor*i <= maxRezultat; i++){
            System.out.printf("%d * %d = %d\n", faktor, i, faktor*i);
        }
    }
}