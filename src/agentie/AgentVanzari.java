package agentie;

public class AgentVanzari extends Persoana {
    
    public AgentVanzari(String nume, int varsta) {
        super(nume, varsta);
    }
    
    public boolean verificareBani(double buget, double pret) {
        return buget >= pret;
    }
    
}   //AgentVanzari
