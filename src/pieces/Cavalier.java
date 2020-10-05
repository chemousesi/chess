package pieces;

import jeu.*;

public class Cavalier extends Piece {

    public Cavalier(boolean couleur) {
        super("cavalier", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {
        // TODO Auto-generated method stub
        return false;
    }
}
