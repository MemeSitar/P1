import java.util.Scanner;

public class Piramida{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int visina = sc.nextInt();
        int zvezdice = 0;
        int stevec = 1;

        while (visina >= 1){
            for (int presledek = (visina - 1); presledek > 0; presledek--){
                System.out.print(" ");
            }
            for (int j = stevec * 2 - 1; j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
            stevec++;
            visina--;
        }
    }
}