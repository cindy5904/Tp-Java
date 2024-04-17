package Papeterie.Models;

public class ArticleUnitaire extends Article{
    private String Nom;
    private double prixUnitaire;

    public ArticleUnitaire(int id, String nom, double prixUnitaire) {
        super(id);
        Nom = nom;
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
