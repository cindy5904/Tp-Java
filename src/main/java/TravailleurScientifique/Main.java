package TravailleurScientifique;

import TravailleurScientifique.Models.Scientifique;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom de la personne :");
        String nom = scanner.nextLine();

        System.out.println("Entrez le prénom de la personne :");
        String prenom = scanner.nextLine();

        System.out.println("Entrez le numéro de téléphone de la personne :");
        String numeroTel = scanner.nextLine();

        System.out.println("Entrez l'email de la personne :");
        String email = scanner.nextLine();

        System.out.println("Entrez le nom de l'entreprise :");
        String nomEntreprise = scanner.nextLine();

        System.out.println("Entrez l'adresse de l'entreprise :");
        String adresseEntreprise = scanner.nextLine();

        System.out.println("Entrez le téléphone professionnel :");
        String telephoneProfessionnel = scanner.nextLine();

        System.out.println("Entrez la discipline du scientifique :");
        String discipline = scanner.nextLine();

        System.out.println("Entrez le type du scientifique :");
        String typeScientifique = scanner.nextLine();


        Scientifique scientifique = new Scientifique(nom, prenom, numeroTel, email,
                nomEntreprise, adresseEntreprise, telephoneProfessionnel,
                discipline, typeScientifique);

        System.out.println("\nInformations du scientifique :");
        System.out.println(scientifique.toString());

    }
}
