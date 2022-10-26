import java.util.Scanner;

public class Zgoscenke{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int stZgo = sc.nextInt();
        int velZgo = sc.nextInt();
        int velDat = 0;
        int stevec = 1;
        int zapisano = 0;


        while (sc.hasNextInt() && stevec <= stZgo){
            velDat = sc.nextInt();
            zapisano = zapisano + velDat;
            if (zapisano <= velZgo){
                System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", velDat, stevec, zapisano);
            } else {
                zapisano = velDat;
                stevec++;
                if (stevec > stZgo){
                    break;
                } else {
                    System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", velDat, stevec, zapisano);
                }
            }

        }
    }
}