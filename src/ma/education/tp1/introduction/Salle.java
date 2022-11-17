package ma.education.tp1.introduction;

public class Salle {
    /*Class Salle attributes*/
      long id;
      String nom;

      /*Class Salle default constructor*/
    public Salle() {

    }

    /*Class Salle constructor with 1 parameter*/
    public Salle(String nom) {
        this.nom = nom;
    }

    /*Class Salle constructor with 2 parameter*/
    public Salle(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    /**/
    public static boolean equals(long id1, long id2) {
        return id1 == id2;
    }
}
