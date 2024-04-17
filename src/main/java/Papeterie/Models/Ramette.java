package Papeterie.Models;

public class Ramette extends ArticleUnitaire{
    private double grammage;

    public Ramette(int id, String nom, double prixUnitaire, double grammage) {
        super(id, nom, prixUnitaire);
        this.grammage = grammage;
    }

    public double getGrammage() {
        return grammage;
    }

    public void setGrammage(double grammage) {
        this.grammage = grammage;
    }
}
