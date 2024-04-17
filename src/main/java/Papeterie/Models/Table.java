package Papeterie.Models;

import java.util.HashMap;
import Papeterie.Models.Ramette;
import Papeterie.Models.Stylo;

public class Table {
    public static HashMap<String, Article> tableDeHachage = new HashMap<>();

    public Table() {
        tableDeHachage.put("1", new Ramette(1,"Ramette A4",80, 8 ));
        tableDeHachage.put("2", new Ramette(2,"Ramette A3", 100, 20));
        tableDeHachage.put("3", new Ramette(3,"Ramette A4", 90, 5));
        tableDeHachage.put("4", new Ramette(4,"Ramette A5", 70, 5));


    }
}
