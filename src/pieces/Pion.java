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

        if ((dep.typeDeplacement() != 'v') || (dep.dist() != 1)) {
            System.out.println("déplacement non vertical ou il dépasse une distance d'une case");
            return false;

        } else if ((dep.typeDeplacement() == 'd') && (caseCible.getPiece().couleur != this.couleur)) {
            System.out.println("pas de déplacement diagonal sauf dans le cas ou manger une pièce adversaire");
            return true;
        } else
            return true;
    }
}
