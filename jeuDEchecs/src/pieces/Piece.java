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
        } else
        // première lettre en mmajuscule si la pièce est noire
        {
            return nom.substring(0, 1).toUpperCase() + nom.substring(1);
        }

    }

    public boolean estValide(Deplacement dep, Plateau p) {
        // une pièce ne peut pas se déplacer vers une case occupée par une pièce de la
        // même coueleur // à implémenter ici

        Case caseCible = p.getCase(dep.getX1(), dep.getY1());

        if (p.getCase(dep.getX0(), dep.getY0()).estVide())
        // case de départ vide
        {
            System.out.println("case de départ vide");
            return false;
        }

        else if (p.horsLimite(dep)) {
            // hors limite
            System.out.println("Hors limite");
            return false;
        }

        else if ((Echecs.joueur != this.couleur)) {
            // piece n'appartient pas au joueur
            System.out.println("ce n'est votre tour");
            return false;
        }

        else if ((!caseCible.estVide()) && (caseCible.getPiece().couleur == this.couleur)) {
            // case cible contient une pièce de la même couleur
            System.out.println("vous ne pouvez pas manger votre pièce,  xD");
            return false;
        }

        else // reste des cas on valide
            return true;

        // attention il me reste le cas de nno validité s'il reste une pièce sur le
        // chemin de déplacement

    }

    public boolean estRoi() {
        return false;
    }

}
