package pieces;

import jeu.*;

public class Fou extends Piece {

    public Fou(boolean couleur) {
        super("fou", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {
        // TODO Auto-generated method stub
        return false;
    }
}
