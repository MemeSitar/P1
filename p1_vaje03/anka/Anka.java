import java.util.Scanner;

public class Anka{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int meja = sc.nextInt();
        int delitelj = sc.nextInt();
        int stevec = 0;

        for (int i = 1; i < 10; i += 2){
            for (int j = 1; j < 10; j++){
                if (j > meja){
                    for (int k = 0; k < 10; k++){
                        if (k % delitelj == 0){
                            System.out.printf("%d-%d-%d\n", i, j, k);
                            stevec++;
                        }
                    }
                }
            }
        }
        System.out.println(stevec);
    }
}
