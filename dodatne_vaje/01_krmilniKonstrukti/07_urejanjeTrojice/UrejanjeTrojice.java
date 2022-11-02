import java.util.Scanner;

public class UrejanjeTrojice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int najvecje;
        int srednje;
        int najmanjse;

        int vnos1 = sc.nextInt();
        najmanjse = vnos1;
        int vnos2 = sc.nextInt();
        if (vnos2 <= najmanjse){
            srednje = vnos1;
            najmanjse = vnos2;
        } else {
            srednje = vnos2;
        }
        int vnos3 = sc.nextInt();
        if (vnos3 >= srednje){
            najvecje = vnos3;
        } else if (vnos3 <= srednje && vnos3 >= najmanjse){
            najvecje = srednje;
            srednje = vnos3;
        } else {
            najvecje = srednje;
            srednje = najmanjse;
            najmanjse = vnos3;
        }


        System.out.printf("%d %d %d", najmanjse, srednje, najvecje);
    }
}