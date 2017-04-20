package agentie;

public class ClientCumparator extends Persoana {

    double buget;

    public ClientCumparator(String nume, int varsta, double buget) {
        super(nume, varsta);
        this.buget = buget;
    }

    public double getBuget() {
        return buget;
    }

    public void setBuget(float buget) {
        this.buget = buget;
    }

    public void afisare() {
        System.out.println("    Nume: " + getNume());
        System.out.println("    Varsta: " + getVarsta() + " ani");
        System.out.println("    Buget: " + getBuget() + " EUR");
    }

}   //ClientCumparator
