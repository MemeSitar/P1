import java.util.Scanner;

public class DN01_63220294{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stKvadratov = 0;
        int stranicaA = sc.nextInt();
        int stranicaB = sc.nextInt();
        
        // glavni loop
        while (stranicaB > 1 && stranicaA > 1){
            stKvadratov += (stranicaA - 1) * (stranicaB - 1);
            stranicaA--;
            stranicaB--;
        }
        System.out.println(stKvadratov);
    }
}