import java.util.Scanner;

public class Postevanka{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stevilka = sc.nextInt();
        for (int stevec1 = 1; stevec1 <= stevilka; stevec1++){
            for (int stevec2 = 1; stevec2 <= stevilka; stevec2++){
                System.out.print(stevec1*stevec2 + " ");
            }
            System.out.println();
        }
    }
}