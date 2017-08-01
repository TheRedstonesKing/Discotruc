package ovh.wazo.discotruc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Compositeur monCompositeur = new Compositeur("Norbert", "Pichot");
        System.out.println(monCompositeur);

        Chanson c1, c2, c3;
        c1 = new Chanson("love", 2);
        c2 = new Chanson("pas Love", 30);
        c3 = new Chanson("Un peu love", 46);

        System.out.println(c1 + " & " + c2 + " & " + c3);

        List<Chanson> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Disque dd = new Disque("Lover", monCompositeur, Genre.BOUSIN, list);
        System.out.println(dd);
        System.out.println("Durée : " + dd.getDuree());

    }
}



/*

Disque : titre + compositeur + liste de chansons + genre
Compositeur : nom + prenom
Chanson : durée + nom du morceau

Les information d'un disque avec sa durée.

 */