
/*
Samodejno testiranje:
tj.exe Cetrta.java . .

Testni primeri:

01, 02: primera iz besedila
03..06: u = 1
07..10: u = 2
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> prodajalci = new ArrayList<>();

        int stVrstic = sc.nextInt();
        int opcija = sc.nextInt();
        if (opcija == 2){
            String artikel = sc.next();
        }
        for (int i = 0; i < stVrstic; i++){
            String prodajalec =sc.next();
            if (!(prodajalci.contains(prodajalec))){
                prodajalci.add(prodajalec);
            }
            sc.next();
            sc.next();
        }
        prodajalci.sort(null);
        for (String prodajalec : prodajalci){
            System.out.println(prodajalec);
        }
    }
}
