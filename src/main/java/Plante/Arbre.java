package Plante;

public class Arbre extends Plante{
    protected int circonferenceTronc;

    public Arbre(String nom, int hauteur, String couleurFeuilles, int circonferenceTronc) {
        super(nom, hauteur, couleurFeuilles);
        this.circonferenceTronc = circonferenceTronc;
    }

    public int getCirconferenceTronc() {
        return circonferenceTronc;
    }

    public void setCirconferenceTronc(int circonferenceTronc) {
        this.circonferenceTronc = circonferenceTronc;
    }

//    @Override
//    public void afficher() {
//        super.afficher();
//        this.circonference();
//    }
//
//    public void circonference() {
//        System.out.println("Circonférence de l'arbre : " + circonferenceTronc);
//    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Circonféreces de l'arbre : " +circonferenceTronc;
    }

}
