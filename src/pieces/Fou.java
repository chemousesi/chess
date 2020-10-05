package pieces;

import jeu.Deplacement;

public class Fou extends Piece {

    public Fou(boolean couleur) {
        super("fou", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Piece pi) {
        // TODO Auto-generated method stub
        return false;
    }
}
