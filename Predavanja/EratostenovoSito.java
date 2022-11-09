import java.util.Scanner;

public class EratostenovoSito{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int visjaMeja = (int) Math.sqrt(stevilo);

        // po defaultu so vsi elementi v arrayu false.
        boolean[] sestavljeno = new boolean[stevilo + 1];
        // sestavljeno stevilo bo true
        // sestavljeno[i] == true sledi da je i sestavljeno stevilo

        // prvo stevilo ki ga bomo testirali
        int p = 2;
        while (p <= visjaMeja){
            for (int i = 2 * p; i <= stevilo; i += p){
                sestavljeno[i] = true;
            }
            // p povecujemo do prvega neprecrtanega stevila 
            // kandidata za prastevilo
            do {
                p++;
            } while (p <= visjaMeja && sestavljeno[p]);
        }
        for (int i = 0; i <= stevilo; i++){
            if (!sestavljeno[i]){
                System.out.println(i);
            }
        }
    }
}