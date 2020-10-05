package pieces;

import jeu.*;

public class Cavalier extends Piece {

    public Cavalier(boolean couleur) {
        super("cavalier", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {
        super.estValide(dep, p);
        if (dep.typeDeplacement() == 'c')
            return true;
        else
            return false;
    }
}
