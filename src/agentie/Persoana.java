package agentie;

public class Persoana {

    String nume;
    int varsta;
    String statut;

    public Persoana(String nume, int varsta) {
        if(varsta < 18) {
            throw new IllegalArgumentException("Clientul nu poate fi minor!");
        } else {
            this.nume = nume;
            this.varsta = varsta;
        }
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        if(varsta < 18) {
            throw new IllegalArgumentException("Clientul nu poate fi minor!");
        } else {
            this.varsta = varsta;
        }
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getStatut() {
        return statut;
    }

}   //Persoana
