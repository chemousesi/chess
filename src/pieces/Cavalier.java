package pieces;

import jeu.Deplacement;

public class Cavalier extends Piece {

    public Cavalier(boolean couleur) {
        super("cavalier", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Piece pi) {
        // TODO Auto-generated method stub
        return false;
    }
}
