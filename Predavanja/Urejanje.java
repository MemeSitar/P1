import java.util.Arrays;

public class Urejanje{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int[] t = {2, 12, 17, 20, 23, 42, 130, 13, 28, 50, 67, 70, 99, 120, 123, 127};
        uredi(t);

        System.out.println(Arrays.toString(t));
    }

    // void ker spreminja ISTO tabelo ceprav je v drugem bloku.
    // nekej nekej reference namesto primitive
    public static void uredi(int[] t){
        // i je ena ker zacne urejat pri drugem elementu
        // prvi element je ze urejen
        for (int i = 1; i < t.length; i++){
            // vstavimo element t[i] v podtabelo t[0...i-1]
            int element = t[i];
            int j = i - 1;
            while (j >= 0 && t[j] > element){
                t[j + 1] = t[j]; // premik desno ze urejenih elementov
                j--;
            }
            t[j + 1] = element;
        }
    }
}