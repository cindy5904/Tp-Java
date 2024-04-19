package Tp_Hotel;

import Tp_Hotel.Models.Client;
import Tp_Hotel.Models.Hotel;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel("Hotel 1");
        int choix;
        do{
            afficheMenuBase();
            choix = scanner.nextInt();


            switch (choix){
                case 1 -> choixOne(scanner, hotel);
                case 2 -> choixTwo();
                case 3 -> choixThree();
                case 4 -> choixFour();
                case 5 -> choixFive();
                case 6 -> choixSix();
                case 0 -> System.out.println("Au revoir !!!");
                default -> System.out.println("Choix invalide !!!!");
            }

        } while (choix != 0);

    }
            public static void afficheMenuBase(){
                System.out.println("##### Menu Base #####");
                System.out.println("1. Ajouter un nouveau client");
                System.out.println("2. Afficher la liste des clients");
                System.out.println("3. Afficher les réservations d'un client");
                System.out.println("4. Ajouter une réservation");
                System.out.println("5. Annuler une réservation");
                System.out.println("6. Afficher la liste des réservations");
                System.out.println("0. Quitter");
                System.out.print("Votre choix : ");

            }
            public static void choixOne(Scanner scanner, Hotel hotel){
                System.out.println("Vous avex fait le choix d'ajouter un nouveau client");
                System.out.print("Nom : ");
                String nom = scanner.next();
                System.out.print("Prénom : ");
                String prenom = scanner.next();
                System.out.print("Téléphone : ");
                String telephone = scanner.next();

                UUID clientId = UUID.randomUUID();

                Client nouveauClient = new Client(clientId, nom, prenom, telephone);
                hotel.ajouterClient(nouveauClient);


            }

            public static void choixTwo(){
                System.out.println("Vous avex fait le choix d'afficher la liste des clients");
            }

            public static void choixThree(){
                System.out.println("Vous avex fait le choix d'afficher la réservation d'un client");
            }

            public static void choixFour(){
                System.out.println("Vous avex fait le choix d'ajouter une réservation");
            }

        public static void choixFive(){
            System.out.println("Vous avex fait le choix d'annuler une réservation");
        }

        public static void choixSix(){
            System.out.println("Vous avex fait le choix d'ajouter une réservation");
        }





    }
}
