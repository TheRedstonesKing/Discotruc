package ovh.wazo.discotruc;

import java.util.List;

/**
 * <br>
 * Author : <a href="https://git-01.dev.uhcwork.net/u/Rapace">Wazo</a><br>
 * Project discotruc
 * <br>
 */
public class Disque {


    private String titre;

    private Compositeur compositeur;

    private Genre genre;

    private List<Chanson> chansonList;

    public Disque(String titre, Compositeur compositeur, Genre genre, List<Chanson> chansonList) {
        this.titre = titre;
        this.compositeur = compositeur;
        this.genre = genre;
        this.chansonList = chansonList;
    }


    public String getTitre() {
        return titre;
    }

    public Compositeur getCompositeur() {
        return compositeur;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<Chanson> getChansonList() {
        return chansonList;
    }

    public int getDuree(){
        int duree = 0;
        for(Chanson chanson : chansonList){
            duree += chanson.getDuree();
        }
        return duree;
    }

    @Override
    public String toString() {
        return "Disque{" +
                "titre='" + titre + '\'' +
                ", compositeur=" + compositeur +
                ", genre=" + genre +
                ", chansonList=" + chansonList +
                '}';
    }
}
