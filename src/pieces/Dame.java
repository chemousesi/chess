package pieces;

import jeu.Deplacement;

public class Dame extends Piece {

    public Dame(boolean couleur) {
        super("dame", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Piece pi) {
        // TODO Auto-generated method stub
        return false;
    }
}
