package agentie;

public class Locuinta {

    private double suprafata;
    private int nrCamere;
    private String adresa;
    private double pretVanzare;
    private double pretInchiriere;

    public Locuinta() {
    }

    public Locuinta(double suprafata, int nrCamere, String adresa, double pretVanzare, double pretInchiriere) {
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
        this.pretVanzare = pretVanzare;
    }

    public void setPretInchiriere(double pretInchiriere) {
        this.pretInchiriere = pretInchiriere;
    }

    public void afisare() {
        System.out.println("    Suprafata: " + getSuprafata() + " mp");
        System.out.println("    Numar camere: " + getNrCamere());
        System.out.println("    Adresa locuinta: " + getAdresa());
        System.out.println("    Pret vanzare: " + getPretVanzare() + " EUR");
        System.out.println("    Pret inchiriere: " + getPretInchiriere() + " EUR/luna");
    }

}   //Locuinta
