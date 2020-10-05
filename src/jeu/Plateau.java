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
        System.out.print("   ");
        for (int i = 0; i < cases.length; i++) {
            System.out.print(" " + i + " |");
        }
        System.out.println("\n  ----------------------------------");

        for (int i = 0; i < this.longueur; i++) {
            System.out.print(i + " | ");
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
        remplirCase(0, 5, new Fou(true));
        remplirCase(0, 6, new Cavalier(true));
        remplirCase(0, 7, new Tour(true));

        // deuxième ligne
        for (int i = 0; i < 8; i++) {
            remplirCase(1, i, new Pion(true));
        }

        /******** */

        // côté noir
        remplirCase(7, 0, new Tour(false));
        remplirCase(7, 1, new Cavalier(false));
        remplirCase(7, 2, new Fou(false));
        remplirCase(7, 3, new Dame(false));
        remplirCase(7, 4, new Roi(false));
        remplirCase(7, 5, new Fou(false));
        remplirCase(7, 6, new Cavalier(false));
        remplirCase(7, 7, new Tour(false));

        // deuxième ligne

        for (int i = 0; i < 8; i++) {
            remplirCase(6, i, new Pion(false));
        }

    }
}
