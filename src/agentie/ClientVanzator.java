package agentie;

public class ClientVanzator extends Persoana {

    Locuinta locuinta;

    public ClientVanzator(String nume, int varsta, Locuinta locuinta) {
        super(nume, varsta);
        this.locuinta = locuinta;
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

}   //ClientVanzator
