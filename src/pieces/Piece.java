package pieces;

import jeu.*;

public abstract class Piece {

    boolean couleur;
    String nom;

    public Piece(String nom, boolean couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        if (this.couleur) {// en miniscule si la pièce est blanche
            return nom;
        } else// première lettre en mmajuscule si la pièce est noire
        {
            return nom.substring(0, 1).toUpperCase() + nom.substring(1);
        }

    }

    public abstract boolean estValide(Deplacement dep, Piece pi);

}
