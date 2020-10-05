package jeu;

import pieces.*;

public class Plateau {

    int longueur;
    int largeur;
    Case[][] cases;

    public Plateau(int longueur, int largeur) {
        this.cases = new Case[longueur][largeur];

        this.longueur = longueur;
        this.largeur = largeur;

        boolean alter = false;

        for (int i = 0; i < longueur; i++) {

            boolean alter1 = alter;
            for (int j = 0; j < largeur; j++) {
                cases[i][j] = new Case(alter1);
                alter1 = !alter1;
            }
            alter = !alter;

        }

        initialisation5x4();

    }

    public boolean horsLimite(int l, int c) {
        if ((l < 0) || (l > largeur) || (c < 0) || (c > longueur))
            return true;
        else
            return false;
    }

    public boolean horsLimite(Deplacement deplacement) {
        if ((deplacement.getX1() < 0) || (deplacement.getX1() > longueur) || (deplacement.getY1() < 0)
                || (deplacement.getY1() > largeur))
            return true;
        else
            return false;
    }

    public Case getCase(int l, int c) {
        return cases[l][c];
    }

    public void videCase(int l, int c) {
        cases[l][c].enleverPiece();
    }

    public void remplirCase(int l, int c, Piece p) {
        cases[l][c].remplirPiece(p);
    }

    public void afficher() {

        System.out.println(" here :" + this.largeur);
        System.out.println(" here :" + this.longueur);

        for (int i = 0; i < this.longueur; i++) {
            for (int j = 0; j < this.largeur; j++) {
                System.out.print(cases[i][j] + " | ");
            }
            System.out.println();
        }

    }

    public void initialisation5x4() {

        // coté blanc
        // premiere ligne
        remplirCase(0, 0, new Tour(true));
        remplirCase(0, 1, new Cavalier(true));
        remplirCase(0, 2, new Fou(true));
        remplirCase(0, 3, new Dame(true));
        remplirCase(0, 4, new Roi(true));

        // deuxième ligne
        remplirCase(1, 0, new Pion(true));
        remplirCase(1, 1, new Pion(true));
        remplirCase(1, 2, new Pion(true));
        remplirCase(1, 3, new Pion(true));
        remplirCase(1, 4, new Pion(true));

        /******** */

        // côté noir
        remplirCase(4, 0, new Tour(false));
        remplirCase(4, 1, new Cavalier(false));
        remplirCase(4, 2, new Fou(false));
        remplirCase(4, 3, new Dame(false));
        remplirCase(4, 4, new Roi(false));

        // deuxième ligne
        remplirCase(3, 0, new Pion(false));
        remplirCase(3, 1, new Pion(false));
        remplirCase(3, 2, new Pion(false));
        remplirCase(3, 3, new Pion(false));
        remplirCase(3, 4, new Pion(false));

    }
}
