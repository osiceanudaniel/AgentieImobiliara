package agentie;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class Agentie {

    private String nume;
    private String adresa;
    private double buget;
    private ArrayList<ClientCumparator> clientiCumparatori = new ArrayList<>();
    private ArrayList<ClientVanzator> clientiVanzatori = new ArrayList<>();
    private ArrayList<Locuinta> locuinte = new ArrayList<>();
    private ArrayList<Locuinta> locuinteInchiriate = new ArrayList<>();
    private ServiciuCumparator cumparare;
    private ServiciuVanzator vanzare;

    public Agentie(String nume, String adresa, double buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.buget = buget;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getBuget() {
        return buget;
    }

    public void setBuget(double buget) {
        this.buget = buget;
    }

    public ArrayList<ClientCumparator> getClientiCumparatori() {
        return clientiCumparatori;
    }

    public void setClientiCumparatori(ArrayList<ClientCumparator> clientiCumparatori) {
        this.clientiCumparatori = clientiCumparatori;
    }

    public ArrayList<ClientVanzator> getClientiVanzatori() {
        return clientiVanzatori;
    }

    public void setClientiVanzatori(ArrayList<ClientVanzator> clientiVanzatori) {
        this.clientiVanzatori = clientiVanzatori;
    }

    public ArrayList<Locuinta> getLocuinte() {
        return locuinte;
    }

    public void setLocuinte(ArrayList<Locuinta> locuinte) {
        this.locuinte = locuinte;
    }

    public ArrayList<Locuinta> getLocuinteInchiriate() {
        return locuinteInchiriate;
    }

    public void setLocuinteInchiriate(ArrayList<Locuinta> locuinteInchiriate) {
        this.locuinteInchiriate = locuinteInchiriate;
    }

    public ServiciuCumparator getCumparare() {
        return cumparare;
    }

    public void setCumparare(ServiciuCumparator cumparare) {
        this.cumparare = cumparare;
    }

    public ServiciuVanzator getVanzare() {
        return vanzare;
    }

    public void setVanzare(ServiciuVanzator vanzare) {
        this.vanzare = vanzare;
    }

    public void adaugaClientCumparator(ClientCumparator c) {
        clientiCumparatori.add(c);
    }

    public void adaugaClientVanzator(ClientVanzator c) {
        clientiVanzatori.add(c);
    }

    public void stergeClientCumparator(ClientCumparator c) {
        int index = clientiCumparatori.indexOf(c);
        clientiCumparatori.remove(index);
    }

    public void stergeClientVanzator(ClientVanzator c) {
        int index = clientiVanzatori.indexOf(c);
        clientiVanzatori.remove(index);
    }

    public void adaugaLocuinta(Locuinta l) {
        locuinte.add(l);
    }

    //locuinta este locuinta din vectorul de locuinte
    public void adaugaLocuintaInchiriata(Locuinta locuinta) {
        locuinteInchiriate.add(locuinta);
        int index = locuinte.indexOf(locuinta);
        locuinte.remove(index);
    }

    public void stergeLocuinta(Locuinta l) {
        int index = locuinte.indexOf(l);
        locuinte.remove(index);
    }

    public void eliberareLocuintaInchiriata(Locuinta l) {
        locuinte.add(l);
        locuinteInchiriate.remove(l);
    }

    public void afisare() {
        System.out.println("Nume agentie: " + getNume());
        System.out.println("Adresa agentie: " + getAdresa());
        System.out.println("Buget agentie: " + getBuget() + " EUR");

        //afisare clienti cumparatori
        System.out.println("------------------------------\n Clienti cumparatori: ");
        if (clientiCumparatori.isEmpty()) {
            System.out.println("    Nu exista clienti cumparatori!");
        } else {
            for (ClientCumparator clientCumparator : clientiCumparatori) {
                clientCumparator.afisare();
                System.out.println("    ________________");
            }
        }

        //afisare clienti vanzatori
        System.out.println("------------------------------\n Clienti vanzatori: ");
        if (clientiVanzatori.isEmpty()) {
            System.out.println("    Nu exista clienti vanzatori!");
        } else {
            for (ClientVanzator clientVanzator : clientiVanzatori) {
                clientVanzator.afisare();
                System.out.println("    ________________");
            }
        }

        //afisare locuinte
        System.out.println("------------------------------\n Locuinte agentie: ");
        if (locuinte.isEmpty()) {
            System.out.println("    Nu exista locuinte inregistrate in agentie!");
        } else {
            for (Locuinta locuinta : locuinte) {
                locuinta.afisare();
                System.out.println("    ________________");
            }
        }

        //afisare locuinte inchiriate
        System.out.println("------------------------------\n Locuinte inchiriate: ");
        if (locuinteInchiriate.isEmpty()) {
            System.out.println("    Nu exista locuinte inchiriate!");
        } else {
            for (Locuinta locuintaInchiriata : locuinteInchiriate) {
                locuintaInchiriata.afisare();
                System.out.println("    ________________");
            }
        }
    }
    
}   //Agentie
