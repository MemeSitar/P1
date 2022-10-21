import java.util.Scanner;

public class NajblizjiVeckratnik{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int firstInt = sc.nextInt();
        int secondInt = sc.nextInt();
        int stevec = 1;
        int trenutnaVrednost = 0;
        int manjsaVrednost = 0;
        while (trenutnaVrednost <= secondInt){
            trenutnaVrednost = firstInt*stevec;
            stevec++;
        } 
        if (trenutnaVrednost == secondInt){
            System.out.println(trenutnaVrednost);
        } else if (trenutnaVrednost > secondInt){
            manjsaVrednost = firstInt*(stevec-1);
        } else {
            manjsaVrednost = trenutnaVrednost;
            trenutnaVrednost = firstInt*(stevec+1);
        }
        if ((trenutnaVrednost - secondInt) == (secondInt - manjsaVrednost)){
            System.out.println(manjsaVrednost);
        } else if ((trenutnaVrednost - secondInt) > (secondInt - manjsaVrednost)) {
            System.out.println(manjsaVrednost);
        } else {
            System.out.println(manjsaVrednost);
        }
    }
}