public class Datum{
    private int leto;
    private int mesec;
    private int dan;

    public static Datum ustvari(int dan, int mesec, int leto){
        if (leto < 1583 || leto > 2999 || 
            mesec < 1 || mesec > 12 ||
            dan < 1 || dan > 31){
            return null;
        }
        if (!(preveriMesecDan(dan, mesec, leto))){
            return null;
        }
        return new Datum(dan, mesec, leto);
    }

    private Datum(int dan, int mesec, int leto){
        this.dan = dan;
        this.mesec = mesec;
        this.leto = leto;
    }

    public String toString(){
        return String.format("%02d.%02d.%d", this.dan, this.mesec, this.leto);
    }

    public boolean jeEnakKot(Datum d){
        return (this.leto == d.leto && this.mesec == d.mesec && this.dan == d.dan);
    }

    public boolean jePred(Datum d){
        if (this.leto > d.leto){
            return false;
        } else if (this.leto < d.leto){
            return true;
        }
        if (this.mesec > d.mesec){
            return false;
        } else if (this.mesec < d.mesec){
            return true;
        }
        if (this.dan > d.dan){
            return false;
        } else if (this.dan < d.dan){
            return true;
        }
        return false;
    }

    private static boolean jePrestopno(int leto){
        return (leto % 400 == 0 || leto % 100 != 0 && leto % 4 == 0);
    }

    private static boolean preveriMesecDan(int dan, int mesec, int leto){
        int feb = 28;
        if (jePrestopno(leto)){
            feb = 29;
        }
        int[] tabelaDni = new int[]{0, 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dan > tabelaDni[mesec]){
            return false;
        }
        return true;

    }
}