import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] t = {2, 12, 17, 20, 23, 42, 50, 67, 70, 99, 120, 123, 127};
        int n = sc.nextInt();
        
        //int[] stevila = new int[n];
        //for (int i = 0; i < n; i++){
        //    stevila[i] = sc.nextInt();
        //}
        //int n = sc.nextInt();

        System.out.println(indexIskanega(t, 0, t.length - 1, n));

    }

    public static int indexIskanega(int[] t, int spMeja, int zgMeja, int stevilo){
        int sredina = (int) ((zgMeja - spMeja)/2);
        if (t[sredina] == stevilo){
            return sredina;
        } else if (t[sredina] < stevilo){
            return indexIskanega(t, spMeja, sredina, stevilo);
        } else if (t[sredina] > stevilo){
            return indexIskanega(t, sredina, zgMeja, stevilo);
        } else {
            return -1;
        }
    }

}