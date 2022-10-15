import java.util.Scanner;

public class DN00_63220294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevBon =  sc.nextInt();
        int stevPrjatu = sc.nextInt();

        int delBon = stevBon / stevPrjatu;
        int darjaBon = stevBon % stevPrjatu;

        System.out.println(delBon);
        System.out.println(darjaBon);
    }
}