import java.util.Scanner;

public class Potenca{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        int eksponent = sc.nextInt();
        int rezultat = stevilo;

        for (int i = 1; i < eksponent; i++){
            rezultat = rezultat*stevilo;
            //System.out.println(rezultat);
        }
        if (eksponent == 0){
            rezultat = 1;
        }
        System.out.println(rezultat);
    }
}