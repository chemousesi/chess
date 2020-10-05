package pieces;

import jeu.*;

public class Dame extends Piece {

    public Dame(boolean couleur) {
        super("dame", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {
        super.estValide(dep, p);
        return true;

    }
}
