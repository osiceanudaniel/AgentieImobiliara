package agentie;

import java.text.NumberFormat;
import java.util.Locale;

public class AgentVanzari extends Persoana {

    private double salariu;
    
    Locale locale = new Locale("fr", "FR");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    public AgentVanzari(String nume, int varsta, double salariu) {
        super(nume, varsta);
        this.salariu = salariu;
    }

    public boolean verificareBani(double buget, double pret) {
        return buget >= pret;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return getNume() + "   |   " + getVarsta() + "   |   " + currencyFormatter.format(getSalariu());
    }
    
    

}   //AgentVanzari
