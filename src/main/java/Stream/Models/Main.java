package Stream.Models;

import Stream.Models.Models.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Eren",
                "Mikasa",
                "Armin",
                "Levi",
                "Historia",
                "Jean",
                "Connie",
                "Sasha",
                "Reiner",
                "Annie",
                "Annie"
        );
        System.out.println();
        System.out.println(" Filter : ");
        names.stream()
                .filter(p -> p.startsWith("A"))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Count : ");
        System.out.println("Le nombre de personnage dont le prenom commence par 'A' : " + names.stream()
                .filter(p -> p.startsWith("A"))
                .count());

        System.out.println("Distinct : ");
        names.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Limit : ");
        names.stream().limit(4).forEach(System.out::println);

        System.out.println();

        System.out.println(" Sorted : ");
        System.out.println();
        names.stream().sorted().forEach(System.out::println);

        System.out.println(" Sorted inverse : ");
        System.out.println();
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Création d'une liste de Personne

        List<Person> personList = Arrays.asList(
                new Person("Jaeger", "Eren", 19),
                new Person("Ackerman", "Mikasa", 19),
                new Person("Levi", "Rivaille", 30),
                new Person("Jaeger", "Eren", 19),
                new Person("Ackerman", "Mikasa", 19),
                new Person("Levi", "Rivaille", 30),
                new Person("Arlert", "Armin", 19),
                new Person("Yeager", "Grisha", 49),
                new Person("Zoe", "Hange", 34)

        );
        System.out.println();

        double totalAge = personList.stream()
                .mapToDouble(e-> e.getAge())
                .sum();

        System.out.println("total des âges : " +totalAge);

        System.out.println();


        Optional<Person> person = personList.stream()
                .filter(p -> p.getAge() >= 40)
                .findFirst();

        System.out.println("Le premier personnaage qui a au moins 40 ans : " + person.get());

        if(person.isPresent()) {
            System.out.println("Le premier personnage qui a au moins 40 ans : " + person.get());
        } else {
            System.out.println("Aucun personnage d'au moins cette âge !!!");
        }


    }
}
