package ovh.wazo.discotruc;

/**
 * <br>
 * Author : <a href="https://git-01.dev.uhcwork.net/u/Rapace">Wazo</a><br>
 * Project discotruc
 * <br>
 */
public class Chanson {

    private String titre;
    private int duree;

    public Chanson(String titre, int duree) {
        this.titre = titre;
        this.duree = duree;
    }


    public String getTitre() {
        return titre;
    }

    public int getDuree() {
        return duree;
    }


    @Override
    public String toString() {
        return "Chanson{" +
                "titre='" + titre + '\'' +
                ", duree=" + duree +
                '}';
    }
}
