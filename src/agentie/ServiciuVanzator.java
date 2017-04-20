package agentie;

public class ServiciuVanzator {

    AgentVanzari agent;
    Agentie agentie;

    public ServiciuVanzator() {
    }

    public ServiciuVanzator(AgentVanzari agent, Agentie a) {
        this.agent = agent;
        this.agentie = a;
    }

    public AgentVanzari getAgent() {
        return agent;
    }

    public void setAgent(AgentVanzari agent) {
        this.agent = agent;
    }

    //Agentia cumpara locuinta
    public void cumparaLocuinta(ClientVanzator c) {
        Locuinta loc = c.getLocuinta();
        double pretLocuinta = loc.getPretVanzare();
        double bugetAgentie = agentie.getBuget();

        if (agent.verificareBani(bugetAgentie, pretLocuinta) == true) {
            agentie.adaugaLocuinta(loc);
            agentie.stergeClientVanzator(c);
            double bugetNouAgentie = bugetAgentie - pretLocuinta;
            agentie.setBuget(bugetNouAgentie);
        } else {
            throw new BaniInsuficientiException("Agentia nu are suficienti bani pentru aceasta locuinta!");
        }
    }

}   //ServiciuVanzator
