package agentie;

import java.text.NumberFormat;
import java.util.Locale;

public class ClientVanzator extends Persoana {
    Locale locale = new Locale("fr", "FR");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    Locuinta locuinta;

    public ClientVanzator(String nume, int varsta, Locuinta locuinta) {
        super(nume, varsta);
        this.locuinta = locuinta;
        statut = "vanzator";
    }

    public Locuinta getLocuinta() {
        return locuinta;
    }

    public void setLocuinta(Locuinta locuinta) {
        this.locuinta = locuinta;
    }

    public void afisare() {
        System.out.println("    Nume: " + getNume());
        System.out.println("    Varsta: " + getVarsta() + " ani");
        System.out.println("Locuinta sa: ");
        locuinta.afisare();
        System.out.println("");
    }

    @Override
    public String toString() {
        return getNume() + "  |  " + getVarsta() + "  |  " + currencyFormatter.format(getLocuinta().getPretVanzare()) + "  |  " + getStatut();
    }

}   //ClientVanzator
