package Papeterie;

import Papeterie.Models.*;
import Papeterie.enums.Couleur;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Article article1 = new Stylo(1, "Stylo Bic", 1.5, Couleur.BLEU);
        Article article2 = new Ramette(2, "Ramette 1", 3.0, 5);

        Facture facture = new Facture(1, "Client1", LocalDate.now());

        facture.ajouterLigne(1, 3);
        facture.ajouterLigne(2, 2);

        System.out.println("Montant total : " + facture.getPrixTotal());
    }
}
