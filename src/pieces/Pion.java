package pieces;

import jeu.*;

public class Pion extends Piece {

    public Pion(boolean couleur) {
        super("pion", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {
        super.estValide(dep, p);

        Case caseCible = p.getCase(dep.getX1(), dep.getY1());

        if ((dep.typeDeplacement() != 'v') || (dep.dist() != 1))
            return false;
        else if ((dep.typeDeplacement() == 'd') && (caseCible.getPiece().couleur != this.couleur))
            return true;
        else
            return false;
    }
}
