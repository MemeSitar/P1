import java.util.scanner;

public class DN01_63220294{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int stranicaA = sc.nextInt();
        int stranicaB = sc.nextInt();

        // obrne stranici, ce je stranicaA vecja od stranicaB
        // pravokotnik je vedno vodoraven
        if (stranicaA > stranicaB){
            int temp = stranicaA;
            stranicaA = stranicaB;
            stranicaB = temp;
        }

        
    }
}