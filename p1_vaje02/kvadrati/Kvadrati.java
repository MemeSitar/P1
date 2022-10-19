import java.util.Scanner;

public class Kvadrati{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int stevec = a;
        int kvadrat = 0;

        while (stevec <= b){
            kvadrat = stevec*stevec;
            System.out.println(kvadrat);
            stevec++;
        }
    }
}