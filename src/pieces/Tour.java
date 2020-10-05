
package pieces;

import jeu.Deplacement;

public class Tour extends Piece {

    public Tour(boolean couleur) {
        super("tour", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Piece pi) {
        // TODO Auto-generated method stub
        return false;
    }
}
