package agentie;

import java.text.NumberFormat;
import java.util.Locale;

public class ClientCumparator extends Persoana {
    Locale locale = new Locale("fr", "FR");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    double buget;

    public ClientCumparator(String nume, int varsta, double buget) {
        super(nume, varsta);
        
        if(buget < 0) {
            throw new IllegalArgumentException("Bugetul nu poate sa fie negativ!");
        } else {
           this.buget = buget;
           statut = "cumparator";
        }
    }

    public double getBuget() {
        return buget;
    }

    public void setBuget(float buget) {
        if(buget < 0) {
            throw new IllegalArgumentException("Bugetul nu poate sa fie negativ!");
        } else {
            this.buget = buget;
        }
    }

    public void afisare() {
        System.out.println("    Nume: " + getNume());
        System.out.println("    Varsta: " + getVarsta() + " ani");
        System.out.println("    Buget: " + getBuget() + " EUR");
    }

    @Override
    public String toString() {
        return getNume() + "  |  " + getVarsta() + "  |  " + currencyFormatter.format(getBuget()) + "  |  " + getStatut();
    }
    
    

}   //ClientCumparator
