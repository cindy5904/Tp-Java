package Trader;

import Trader.Models.Trader;
import Trader.Models.Transaction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 400),
                new Transaction(brian, 2012, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 410),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));


        // Question 1 :
        System.out.println(
                transactions.stream()
                        .filter(e -> e.getYear() == 2011)
                        .sorted(Comparator.comparingInt(Transaction::getValue))
                        .toList()
        );

        // Question 2 :
        List<String> villeUnique = transactions.stream()
                .map(e -> e.getTrader().getCity())
                .distinct()
                .toList();
        System.out.println(villeUnique);

        // Question 3 :
        System.out.println(
                transactions.stream()
                        .map(e -> e.getTrader().getName())
                        .distinct()
                        .sorted()
                        .collect(Collectors.joining(" "))
        );

        // Question 4 :

        boolean personneBaseMilan = transactions.stream()
                .anyMatch(e -> e.getTrader().getCity().equals("Milan"));

        System.out.println(personneBaseMilan);

        // Question 5

        Optional<Integer> valeurPlusEleve = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

                if (valeurPlusEleve.isPresent()) {
                    System.out.println(valeurPlusEleve.get());
                } else {
                    System.out.println("Il n'y a aucune transaction.");
                }

        // Question 6

        List<Trader> TraderCambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .toList();

        System.out.println(TraderCambridge);

        // Question 7

        List<Integer> transactionCambridge = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .toList();

        System.out.println(transactionCambridge);


        // Question 8 :

        Optional<Transaction> valeurPlusPetite = transactions.stream()
                .min(Comparator.comparingInt(Transaction::getValue));

        System.out.println(valeurPlusPetite);
    }




}
