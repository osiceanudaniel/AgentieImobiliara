package agentie;

public class ServiciuCumparator {

    AgentVanzari agent;
    Agentie agentie;

    public ServiciuCumparator() {
    }

    public ServiciuCumparator(AgentVanzari aget, Agentie a) {
        this.agent = aget;
        this.agentie = a;
    }

    public AgentVanzari getAget() {
        return agent;
    }

    public void setAget(AgentVanzari aget) {
        this.agent = aget;
    }

    //agentia vinde locuinta din vectorul de locuinte
    public void vindeLocuinta(ClientCumparator c, Locuinta l) {
        double bugetClient = c.getBuget();
        double pretLocuinta = l.getPretVanzare();

        if (agent.verificareBani(bugetClient, pretLocuinta) == true) {
            agentie.stergeClientCumparator(c);
            agentie.stergeLocuinta(l);
        } else {
            throw new BaniInsuficientiException("Clientul nu are suficienti bani pentru locuinta!");
        }
    }

    //inchirierea se face pe 3 luni.
    public void inchiriazaLocuinta(ClientCumparator c, Locuinta l, int perioada) {
        double pretInchiriere = l.getPretInchiriere();
        double bugetClient = c.getBuget();

        //pretul este stabilit si platit pe o anumita perioada(luni).
        if (agent.verificareBani(bugetClient, pretInchiriere * perioada) == true) {
            agentie.adaugaLocuintaInchiriata(l);
        } else {
            throw new BaniInsuficientiException("Clientul nu are bani suficienti"
                    + " pentru a inchiria acest apartament!");
        }
    }

}   //ServiciuCumparator
