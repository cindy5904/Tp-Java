package org.example.Citerne;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Citernes citernes1 = new Citernes(20, 10, 10);
            Citernes citernes2= new Citernes(10, 10, 5);

        System.out.println("Poids total de la citerne 1 : " + citernes1.poidsTotal());
        System.out.println("Poids total de la citerne 2 : " + citernes2.poidsTotal());
        System.out.println("----------------------");

        System.out.println("Quantité d'eau dans la citerne 1 : " + citernes1.getNiveauRemplissage());

        System.out.println("Quantité d'eau dans la citerne 2 : " + citernes2.getNiveauRemplissage());

        System.out.println("Quantité d'eau dans toutes les citernes : " + Citernes.getTotaliteCiternes());

        System.out.println("----------------------");

       float excessWater = citernes1.remplir(11);
        System.out.println("Quantité d'eau dans la citerne 1 après ajout de 11 litres: " + citernes1.getNiveauRemplissage() + "/" + citernes1.getCapaciteMaximale());
        System.out.println("Excès d'eau récupéré : " + excessWater);

        float quantiteAretirer = citernes2.vider(11);
        System.out.println("Quantité d'eau dans la citerne 2 après tentative de retrait de 11 litres: " + citernes2.getNiveauRemplissage() + "/" + citernes2.getCapaciteMaximale());
        System.out.println("Quantité d'eau récupérée : " + quantiteAretirer);

        System.out.println("----------------------");

        System.out.println("Quantité d'eau dans la citerne 1 : " + citernes1.getNiveauRemplissage());

        System.out.println("Quantité d'eau dans la citerne 2 : " + citernes2.getNiveauRemplissage());

        System.out.println("Quantité d'eau dans toutes les citernes : " + Citernes.getTotaliteCiternes());




    }
}