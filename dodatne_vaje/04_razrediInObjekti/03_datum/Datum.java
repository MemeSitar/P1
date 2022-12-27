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

    public Datum naslednik(){
        if (this.toString() == "31.12.2999"){
            return null;
        }
        if (ustvari(this.dan + 1, this.mesec, this.leto) != null){
            return ustvari(this.dan + 1, this.mesec, this.leto);
        } else if (ustvari(1, this.mesec + 1, this.leto) != null){
            return ustvari(1, this.mesec + 1, this.leto);
        } else {
            return ustvari(1, 1, this.leto + 1);
        }
    }

    public Datum predhodnik(){
        if (this.toString() == "01.01.1583"){
            return null;
        }
        if (ustvari(this.dan - 1, this.mesec, this.leto) != null){
            return ustvari(this.dan - 1, this.mesec, this.leto);
        } else if (ustvari(stDVM(mesec - 1, this.leto), this.mesec - 1, this.leto) != null){
            return ustvari(stDVM(mesec - 1, this.leto), this.mesec - 1, this.leto);
        } else {
            return ustvari(31, 12, this.leto - 1);
        }
    }

    public Datum cez(int stDni){
        Datum datum = this;
        if (stDni > 0){
            for (int i = 0; i < stDni; i++){
            datum = datum.naslednik();
            }
        } else {
            stDni *= -1;
            for (int i = 0; i < stDni; i++){
                datum = datum.predhodnik();
            }
        }
        return datum;
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

    private static int stDVM(int mesec, int leto){
        int feb = 28;
        if (jePrestopno(leto)){
            feb = 29;
        }
        int[] tabelaDni = new int[]{0, 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return tabelaDni[mesec];
    }
}