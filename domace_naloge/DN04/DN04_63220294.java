import java.util.Scanner;

public class DN04_63220294{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // osnovni vnosi
        long rezultat = 0;
        int povabljeni = sc.nextInt();
        int srecnoStevilo = sc.nextInt();

        // ustvari tabelco
        int[] stevilke = new int[povabljeni];
        for (int i = 0; i < povabljeni; i++){
            stevilke[i] = sc.nextInt();
        }
        
        // algoritem tukaj
        for (int i = 0; i < povabljeni; i++){
            if (stevilke[i] > srecnoStevilo){
                continue;
            }
            for (int j = 0; j < povabljeni; j++){
                if (stevilke[j] > srecnoStevilo){
                    continue;
                } else if (stevilke[i] + stevilke[j] == srecnoStevilo){
                    rezultat++;
                }
            }
        }
        // rezultat
        System.out.println(rezultat);
    }
}