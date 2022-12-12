public class Oseba{
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    public Oseba oce;
    public Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva,
        Oseba oce, Oseba mati){
            this.ime = ime;
            this.priimek = priimek;
            this.spol = spol;
            this.letoRojstva = letoRojstva;
            this.oce = oce;
            this.mati = mati;
        }

    public String vrniIme(){
        return this.ime;
    }

    public String toString(){
        String izpis;
        izpis = String.format("%s %s (%c), %d", this.ime, this.priimek, 
            this.spol, this.letoRojstva);
        return izpis;
    }

    public int starost(int leto){
        int rezultat = leto - this.letoRojstva;
        return rezultat;
    }
    
    public int vrniLR(){
        return letoRojstva;
    }
    public boolean jeStarejsaOd(Oseba os){
        if (this.letoRojstva < os.vrniLR()){
            return true;
        }
        return false;
    }

    public static Oseba starejsa(Oseba a, Oseba b){
        if (a.jeStarejsaOd(b)){
            return a;
        } else if (b.jeStarejsaOd(a)){
            return b;
        }
        return null;
    }

    public String imeOceta(){
        if (this.oce == null){
            return null;
        }
        return this.oce.vrniIme();
    }

    public boolean jeBratAliSestraOd(Oseba os){
        if (this.oce == os.oce || this.mati == os.mati){
            return true;
        }
        return false;
    }

    public boolean jeSestraOd(Oseba os){
        if (this.spol == 'Z' && this.jeBratAliSestraOd(os)){
            return true;
        }
        return false;
    }

    public boolean jeTetaOd(Oseba os){
        if (this.jeSestraOd(os.oce) || this.jeSestraOd(os.mati)){
            return true;
        }
        return false;
    }

    public boolean jeOcetovskiPrednikOd(Oseba os){
        if (os == this.oce){
            return true;
        } else if (this.oce == null){
            return false;
        }
        return this.oce.jeOcetovskiPrednikOd(os);
    }
}