package Tp_Hotel.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    private String nom;
    private List<Chambre> chambres;
    private List<Reservation> reservations;
    private List<Client> clients;

    public Hotel(String nom) {
        this.nom = nom;
        this.chambres = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.clients = new ArrayList<>();
    }
    public void ajouterClient(Client client) {
        clients.add(client);
    }
//    public void randomChambre(int nbreChambre) {
//        Random random = new Random();
//
//
//    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
