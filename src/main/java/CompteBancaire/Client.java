package CompteBancaire;

import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private String identifiant;
    private String numeroTelephone;

    private List<CompteBancaire> listeComptes;

    public Client(String nom, String prenom, String identifiant, String numeroTelephone ) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.numeroTelephone = numeroTelephone;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public List<CompteBancaire> getListeComptes() {
        return listeComptes;
    }

    public void setListeComptes(List<CompteBancaire> listeComptes) {
        this.listeComptes = listeComptes;
    }
}
