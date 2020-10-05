package pieces;

import jeu.*;

public class Roi extends Piece {

    public Roi(boolean couleur) {
        super("roi", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {

        super.estValide(dep, p);

        if (dep.dist() == 1)
            return true;
        else
            return false;

    }
}
