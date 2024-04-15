package Plante;

public class Plante {
    protected String nom;
    protected int hauteur;
    protected String couleurFeuilles;

    public Plante(String nom, int hauteur, String couleurFeuilles) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuilles = couleurFeuilles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuilles() {
        return couleurFeuilles;
    }

    public void setCouleurFeuilles(String couleurFeuilles) {
        this.couleurFeuilles = couleurFeuilles;
    }

    public String toString() {
        return getClass().getSimpleName() + "\n" + "-----" + "\n" +
                "Nom de la plante : " + nom + "\n" +
                "Hauteur de la plante : " + hauteur + "\n" +
                "FCouleur des feuilles : " + couleurFeuilles;
    }

}
