import java.util.Scanner;

public class DN03_63220294{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long rezultat = 0;

        long visina = sc.nextInt();
        long sirina = sc.nextInt();
        long eksponent = sc.nextInt();

        long potenca = (long) Math.pow((double) 2, (double) eksponent);

        // v primeru da je potenca VELIKO prevelika.
        while (potenca > visina || potenca > sirina){
            potenca = potenca / 2;
        }

        if (visina % potenca == 0 && sirina % potenca == 0){
            rezultat = PrviPrimer(visina, sirina, potenca);
        } else if (visina % potenca == 0 && sirina % potenca != 0){
            rezultat = DrugiPrimer(visina, sirina, potenca);
        } else if (sirina % potenca == 0 && visina % potenca != 0){ // obrnjen drugi
            rezultat = DrugiPrimer(sirina, visina, potenca);
        } else if (visina % potenca != 0 && sirina % potenca != 0){
            rezultat = TretjiPrimer(visina, sirina, potenca);
        }

        System.out.println(rezultat);
    }

    public static long PrviPrimer(long visina, long sirina, long potenca){
        return (long) ((visina / potenca) * (sirina / potenca));
    }

    public static long DrugiPrimer(long visina, long sirina, long potenca){
        long rezultat = 0;
        // ce smo prisli do pravokotnika, ki ima obe stranici deljivi s potenco, lahko koncamo.
        if (visina % potenca == 0 && sirina % potenca == 0){
            return PrviPrimer(visina, sirina, potenca);
        }
        // sicer izracunamo del pravokotnika, ki je deljiv.
        long stPloscicVisina = visina / potenca;
        long stVelikihPloscicSirina = sirina / potenca;
        rezultat += stPloscicVisina * stVelikihPloscicSirina;
        // izracunamo ostanek in potenco delimo z 2 (zmanjsamo eksponent za 1) in ponovimo vajo.
        long ostanekSirina = sirina % potenca;
        long novaPotenca = potenca / 2;
        return (long) (rezultat + DrugiPrimer(visina, ostanekSirina, novaPotenca));
    }

    public static long TretjiPrimer(long visina, long sirina, long potenca){
        long rezultat = 0;
        // se par exit caseov
        // izogni se delitvi z 0
        if (visina == 1 || sirina == 1 || potenca == 1){
            return visina * sirina;
        }
        // najprej preverimo ce ze velja drugi primer.
        if (visina % potenca == 0 && sirina % potenca != 0){
            return DrugiPrimer(visina, sirina, potenca);
        } else if (sirina % potenca == 0 && visina % potenca != 0){ // ali obrnjenemu drugemu
            return DrugiPrimer(sirina, visina, potenca);
        }

        // izracunamo tisto kar lahko takoj.
        long stVelikihPloscicVisina = visina / potenca;
        long stVelikihPloscicSirina = sirina / potenca;
        rezultat += stVelikihPloscicVisina * stVelikihPloscicSirina;
        // poiscemo ostanek
        long ostanekVisina = visina % potenca;
        long ostanekSirina = sirina % potenca;
        // dobimo tri pravokotnike ki ostanejo:
        //    a          b
        // ostanekV * ostanekS, <- pusti kot tretji primer, ponovi z manjso potenco.
        // ostanekV * (sirina - ostanekS) <- ponovi z isto potenco.
        // ostanekS * (visina - ostanekV) <- ponovi z isto potenco.
        long novaPotenca = potenca / 2;
        long desniPravokotnik = TretjiPrimer(visina - ostanekVisina, ostanekSirina, novaPotenca);
        long spodnjiPravokotnik = TretjiPrimer(ostanekVisina, sirina - ostanekSirina, novaPotenca);
        long kotniPravokotnik = TretjiPrimer(ostanekVisina, ostanekSirina, novaPotenca);
        return (long) (rezultat + desniPravokotnik + spodnjiPravokotnik + kotniPravokotnik);
    }
}