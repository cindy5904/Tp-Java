package Papeterie.Models;

import java.time.LocalDate;
import java.util.HashMap;

public class Facture {

    private int id;
    private Ligne[] ligne;
    private String Client;
    private LocalDate date;

    private int quantite;


    private int nbreDeLigne;
    private static final int quantiteMax = 10;

    public Facture(int id, String client, LocalDate date) {
        this.id = id;
        this.ligne = new Ligne[quantiteMax];
        Client = client;
        this.date = date;
        this.nbreDeLigne = 0;
    }

    public void ajouterLigne(int id, int quantite) {
        Article articleTrouve = Article.getArticles(id);
        if (nbreDeLigne < ligne.length) {
            ligne[nbreDeLigne] = new Ligne(articleTrouve, quantite);
            nbreDeLigne++;
        } else {
            System.out.println("Limite de lignes atteinte. Impossible d'ajouter une nouvelle ligne.");
        }
    }

    public double getPrixTotal() {
        double prixTotal = 0;
        for (Ligne ligne : ligne) {
            if (ligne != null) {
                prixTotal += ligne.getArticleUnitaire().getPrixUnitaire() * quantite;
            }
        }
        return prixTotal;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ligne[] getLigne() {
        return ligne;
    }

    public void setLigne(Ligne[] ligne) {
        this.ligne = ligne;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
