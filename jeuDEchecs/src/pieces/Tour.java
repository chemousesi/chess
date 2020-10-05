
package pieces;

import jeu.*;

public class Tour extends Piece {

    public Tour(boolean couleur) {
        super("tour", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {

        super.estValide(dep, p);

        if ((dep.typeDeplacement() != 'h') || (dep.typeDeplacement() != 'v'))
            return false;
        else
            return true; // à revoir aussi pour le problème du chemin de déplacement
    }
}
