package agentie;

import java.text.NumberFormat;
import java.util.Locale;

public class Locuinta {

    Locale locale = new Locale("fr", "FR");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    private String regex = ".*[^0-9].*";
    private double suprafata;
    private int nrCamere;
    private String adresa;
    private double pretVanzare;
    private double pretInchiriere;
    private String tip;

    public Locuinta() {
    }

    public void validareDate() {

        if ((pretVanzare < 0) || (pretInchiriere < 0)) {
            throw new IllegalArgumentException("Ai introdus un numar negativ!");
        }
  
        if (suprafata < 0) {
            throw new IllegalArgumentException("Suprafata nu poate fi negativa!");
        }
        
    }

    public Locuinta(double suprafata, int nrCamere, String adresa, double pretVanzare, double pretInchiriere, String tip) {
        validareDate();
        
        this.tip = "disponibila";
        this.suprafata = suprafata;
        this.nrCamere = nrCamere;
        this.adresa = adresa;
        this.pretVanzare = pretVanzare;
        this.pretInchiriere = pretInchiriere;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public String getAdresa() {
        return adresa;
    }

    public double getPretVanzare() {
        return pretVanzare;
    }

    public double getPretInchiriere() {
        return pretInchiriere;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setPretVanzare(double pretVanzare) {
       if (pretVanzare < 0) {
            throw new IllegalArgumentException("Ai introdus un numar negativ la pret vanzare!");
        } else if(!String.valueOf(pretVanzare).matches(regex)) {
            throw  new NumberFormatException("Introdu numere!");
        } else {
            this.pretVanzare = pretVanzare;
        }
    }

    public void setPretInchiriere(double pretInchiriere) {
        if (pretInchiriere < 0) {
            throw new IllegalArgumentException("Ai introdus un numar negativ la pret inchiriere!");
        } else if(!String.valueOf(pretInchiriere).matches(regex)) {
            throw  new NumberFormatException("Introdu numere!");
        } else {
            this.pretInchiriere = pretInchiriere;
        }
    }

    public void setSuprafata(double suprafata) {
       if (suprafata < 0) {
            throw new IllegalArgumentException("Suprafata nu poate fi negativa!");
        } else {
            this.suprafata = suprafata;
       }
    }

    public void setNrCamere(int nrCamere) {
        if(nrCamere < 1) {
            throw new IllegalArgumentException("O casa are cel putin o camera!");
        } else {
            this.nrCamere = nrCamere;
        }
    }

    public void afisare() {
        System.out.println("    Suprafata: " + getSuprafata() + " mp");
        System.out.println("    Numar camere: " + getNrCamere());
        System.out.println("    Adresa locuinta: " + getAdresa());
        System.out.println("    Pret vanzare: " + getPretVanzare() + " EUR");
        System.out.println("    Pret inchiriere: " + getPretInchiriere() + " EUR/luna");
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return getAdresa() + "  |  " + getSuprafata() + "  |  "
                + getNrCamere() + "  |  " + currencyFormatter.format(getPretVanzare()) + "  |  "
                + currencyFormatter.format(getPretInchiriere()) + "/luna" + "  |  " + getTip();
    }

}   //Locuinta
