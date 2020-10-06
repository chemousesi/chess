package pieces;

import jeu.*;

public class Dame extends Piece {

    public Dame(boolean couleur) {
        super("dame", couleur);
    }

    @Override
    public boolean estValide(Deplacement dep, Plateau p) {
        super.estValide(dep, p);

        if ((dep.typeDeplacement() == 'd') || (dep.typeDeplacement() == 'h') || (dep.typeDeplacement() == 'v')) {
            return true;
        } else {
            System.out.println("Deplacement non valide pour la Dame");
            return false;
        }

    }
}
