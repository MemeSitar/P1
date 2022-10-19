import java.util.Scanner;

public class AbsolutnaVrednost{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int vnos = sc.nextInt();

        if (vnos < 0){
            vnos = -vnos;
        }
        
        System.out.println(vnos);
    }
}