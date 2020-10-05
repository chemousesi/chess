package pieces;

import jeu.*;

public class Piece {

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

    public boolean estValide(Deplacement dep, Plateau p) {
        // une pièce ne peut pas se déplacer vers une case occupée par une pièce de la
        // même coueleur // à implémenter ici

        Case caseCible = p.getCase(dep.getX1(), dep.getY1());

        if (p.horsLimite(dep))
            return false;
        else if (caseCible.getPiece().couleur == this.couleur)
            return false;
        else
            return true;
    }

}
