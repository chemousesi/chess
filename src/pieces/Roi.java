package pieces;

import jeu.*;

public class Roi extends Piece {

    public Roi(boolean couleur) {
        super("roi", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {
        // TODO Auto-generated method stub
        return false;
    }
}
