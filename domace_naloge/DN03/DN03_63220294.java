import java.util.Scanner;

public class DN03_63220294{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long rezultat = 0;

        int visina = sc.nextInt();
        int sirina = sc.nextInt();
        int eksponent = sc.nextInt();

        int potenca = (int) Math.pow((double) 2, (double) eksponent);

        if (visina % potenca == 0 && sirina % potenca == 0){
            rezultat = PrviPrimer(visina, sirina, potenca);
        } else if (visina % potenca == 0 && sirina % potenca != 0){
            rezultat = DrugiPrimer(visina, sirina, potenca);
        } else if (visina % potenca != 0 && sirina % potenca != 0){
            rezultat = TretjiPrimer(visina, sirina, potenca);
        }

        System.out.println(rezultat);
    }

    public static int PrviPrimer(int visina, int sirina, int potenca){
        return (visina / potenca) * (sirina / potenca);
    }

    public static int DrugiPrimer(int visina, int sirina, int potenca){
        return 2;
    }

    public static int TretjiPrimer(int visina, int sirina, int potenca){
        return 3;
    }
}