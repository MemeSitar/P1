import java.util.Scanner;

public class VrstaZbor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean nobeden = true;
        int n = sc.nextInt();
        // ustvari tabelo in jo napolni
        int vrsta[] = new int[n];
        for (int i = 0; i < n; i++){
            vrsta[i] = sc.nextInt();
        }
        for (int i = 0; i < vrsta.length; i++){
            if (i == 0){ // prvi clen, nima levih sosedov
                if(vrsta[i] <= vrsta[i+1]){
                    System.out.println(i);
                    nobeden = false;
                }
            } else if (i == vrsta.length - 1){ // zadnji clen, nima desnih sosedov
                if(vrsta[i] >= vrsta[i-1]){
                    System.out.println(i);
                    nobeden = false;
                }
            } else if (vrsta[i] >= vrsta[i-1] && vrsta[i] <= vrsta[i+1]){
                System.out.println(i);
                nobeden = false;
            }
        }
        if (nobeden){
            System.out.println("NOBEDEN");
        }
    }
}