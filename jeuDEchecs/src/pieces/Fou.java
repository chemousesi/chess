package pieces;

import jeu.*;

public class Fou extends Piece {

    public Fou(boolean couleur) {
        super("fou", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {

        super.estValide(dep, p);
        if (dep.typeDeplacement() == 'd')
            return true;
        else
            return false;

    }
}
