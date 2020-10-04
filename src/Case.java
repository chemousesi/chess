import Pieces.*;

public class Case {

    private boolean couleur;
    private Piece piece = null;

    public Case(boolean couleur) {
        this.couleur = couleur;
    }

    public Piece getPiece() {
        return piece;
    }

    public boolean estVide() {
        return (this.piece == null);
    }

    public void remplirPiece(Piece p) {
        this.piece = p;
    }

    public void enleverPiece() {
        this.piece = null;
    }

    public void setCouleur(boolean couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        if (!this.estVide()) {
            return this.piece.toString().substring(0, 1);
        } else if (couleur) {
            return "-";
        } else
            return "*";

    }

}
