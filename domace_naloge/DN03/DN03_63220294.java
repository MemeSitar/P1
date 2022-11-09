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

    public static long PrviPrimer(int visina, int sirina, int potenca){
        return (visina / potenca) * (sirina / potenca);
    }

    public static long DrugiPrimer(int visina, int sirina, int potenca){
        long rezultat = 0;
        // ce smo prisli do pravokotnika, ki ima obe stranici deljivi s potenco, lahko koncamo.
        if (visina % potenca == 0 && sirina % potenca == 0){
            return PrviPrimer(visina, sirina, potenca);
        }
        // sicer izracunamo del pravokotnika, ki je deljiv.
        int stPloscicVisina = visina / potenca;
        int stVelikihPloscicSirina = sirina / potenca;
        rezultat += stPloscicVisina * stVelikihPloscicSirina;
        // izracunamo ostanek in potenco delimo z 2 (zmanjsamo eksponent za 1) in ponovimo vajo.
        int ostanekSirina = sirina % potenca;
        int novaPotenca = potenca / 2;
        return rezultat + DrugiPrimer(visina, ostanekSirina, novaPotenca);
    }

    public static long TretjiPrimer(int visina, int sirina, int potenca){
        return 3;
    }
}