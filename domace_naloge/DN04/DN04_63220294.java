import java.util.Scanner;

public class DN04_63220294{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // osnovni vnosi
        long rezultat = 0;
        int povabljeni = sc.nextInt();
        int srecnoStevilo = sc.nextInt();

        // ustvari tabelco
        int[] stevilke = new int[1001];
        for (int i = 0; i < povabljeni; i++){
            stevilke[sc.nextInt()]++;
        }
        int meja = 1;
        if (srecnoStevilo > 1000){
            meja = srecnoStevilo - 1000;
        }
        
        // algoritem tukaj
        for (int i = meja; i < srecnoStevilo/2+1; i++){
            int pristevek = 0;
            if (i == srecnoStevilo-i){
                pristevek = stevilke[i]*stevilke[i];
            } else {
                pristevek = stevilke[i]*stevilke[srecnoStevilo-i]*2;
            }
            rezultat += pristevek;
        }
        // rezultat
        System.out.println(rezultat);
    }
}