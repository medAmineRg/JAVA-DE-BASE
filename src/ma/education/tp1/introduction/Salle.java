package ma.education.tp1.introduction;

public class Salle {
      long id;
      String nom;

    public Salle() {

    }

    public Salle(String nom) {
        this.nom = nom;
    }

    public Salle(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    /**/
    public static boolean equals(long id1, long id2) {
        return id1 == id2;
    }
}
