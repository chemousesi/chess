package pieces;

import jeu.Deplacement;

public class Roi extends Piece {

    public Roi(boolean couleur) {
        super("roi", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Piece pi) {
        // TODO Auto-generated method stub
        return false;
    }
}
