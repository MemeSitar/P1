import java.util.Scanner;

public class CasovnaRazlikaII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int casMin1 = 0;
        int casMin2 = 0;
        int razlikaVseMin = 0;

        int ur1 = sc.nextInt();
        int min1 = sc.nextInt();
        int ur2 = sc.nextInt();
        int min2 = sc.nextInt();

        casMin1 = ur1*60+min1;
        casMin2 = ur2*60+min2;
        razlikaVseMin = casMin2 - casMin1;
        int razlikaH = razlikaVseMin / 60;
        int razlikaMin = razlikaVseMin % 60;
        
        System.out.printf("%d:%02d\n", razlikaH, razlikaMin);
    }
}