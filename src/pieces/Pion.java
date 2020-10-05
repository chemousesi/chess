package pieces;

import jeu.Deplacement;

public class Pion extends Piece {

    public Pion(boolean couleur) {
        super("pion", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Piece pi) {
        // TODO Auto-generated method stub
        return false;
    }
}
