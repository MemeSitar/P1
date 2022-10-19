import java.util.Scanner;

public class Trihotomija{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int firstIn = sc.nextInt();
        int secondIn = sc.nextInt();

        if (firstIn > secondIn){
            System.out.println(1);
        } else if (firstIn < secondIn){
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}