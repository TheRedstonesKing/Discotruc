package ovh.wazo.discotruc;

/**
 * <br>
 * Author : <a href="https://git-01.dev.uhcwork.net/u/Rapace">Wazo</a><br>
 * Project discotruc
 * <br>
 */
public class Compositeur {

    private String nom, prenom;

    public Compositeur(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    @Override
    public String toString() {
        return "Compositeur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
