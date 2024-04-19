package Tp_Hotel.Models;

public class Reservation {
    private int numero;
    private boolean statut;
    private Client client;
    private Chambre chambre;

    public Reservation(int numero, boolean statut, Client client, Chambre chambre) {
        this.numero = numero;
        this.statut = statut;
        this.client = client;
        this.chambre = chambre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
}
