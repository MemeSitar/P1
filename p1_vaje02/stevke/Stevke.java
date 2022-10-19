import java.util.Scanner;

public class Stevke{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long stevilo = sc.nextLong();
        long izpis = 0;

        while (stevilo > 0){
            izpis = stevilo % 10;
            System.out.println(izpis);
            stevilo = stevilo / 10;

        }
    }
}