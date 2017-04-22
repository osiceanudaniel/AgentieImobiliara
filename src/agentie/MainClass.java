package agentie;

public class MainClass {

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.setVisible(true);
        /*Locuinta locuinta1 = null;
        Locuinta locuinta2 = null;
        Locuinta locuinta3 = null;
        try{
            locuinta1 = new Locuinta(50, 3, "Strada Buzasti, nr. 68", 20000, 150);
            locuinta2 = new Locuinta(43, 2, "Vasile Alecsandri, nr. 69", 15000, 110);
            locuinta3 = new Locuinta(63, 100, "Splaiul Independentei, nr. 290", 30000, 180);
            
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        ClientCumparator clientCumparator1 = new ClientCumparator("Ion", 35, 25000);
        ClientCumparator clientCumparator2 = new ClientCumparator("Alina", 30, 30000);
        ClientCumparator clientCumparator3 = new ClientCumparator("Marius", 40, 10000);

        ClientVanzator clientVanzator1 = new ClientVanzator("Marin", 40, locuinta1);

        AgentVanzari agent1 = new AgentVanzari("Andreea", 31);

        Agentie agentie = new Agentie("Casa ta", "Strada Rozelor, nr. 39", 250000);

        ServiciuCumparator cumparare = new ServiciuCumparator(agent1, agentie);
        ServiciuVanzator vanzare = new ServiciuVanzator(agent1, agentie);

        agentie.adaugaClientCumparator(clientCumparator1);
        agentie.adaugaClientCumparator(clientCumparator2);
        agentie.adaugaClientCumparator(clientCumparator3);

        agentie.adaugaClientVanzator(clientVanzator1);

        agentie.adaugaLocuinta(locuinta2);
        agentie.adaugaLocuinta(locuinta3);

        agentie.afisare();
        
        //cumparare apartament
//        try{
//            cumparare.vindeLocuinta(clientCumparator1, locuinta3);
//            System.out.println("AFISARE DUPA MODIFICARE: \n\n\n");
//        
//            agentie.afisare();
//        } catch (BaniInsuficientiException e) {
//            System.err.println(e.getMessage());
//        }
    
    //inchiriere apartament
//        try{
//            cumparare.inchiriazaLocuinta(clientCumparator2, locuinta3, 12);
//            System.out.println("AFISARE DUPA MODIFICARE: \n\n\n");
//        
//            agentie.afisare();
//        } catch (BaniInsuficientiException e) {
//            System.err.println(e.getMessage());
//        }
       //cumparare locuinta de la client(vanzare) 
        try{
            vanzare.cumparaLocuinta(clientVanzator1);
            System.out.println("AFISARE DUPA MODIFICARE: \n\n\n");
        
            agentie.afisare();
        } catch (BaniInsuficientiException e) {
            System.err.println(e.getMessage());
        }
*/
    }
}   //MainClass
