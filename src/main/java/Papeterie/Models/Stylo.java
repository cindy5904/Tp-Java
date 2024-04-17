package Papeterie.Models;
 import Papeterie.enums.Couleur;
public class Stylo extends ArticleUnitaire{
    private Couleur couleur;

    public Stylo(int id, String nom, double prixUnitaire, Couleur couleur) {
        super(id, nom, prixUnitaire);
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
