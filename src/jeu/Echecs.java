package jeu;

import pieces.Piece;

public class Echecs {

    public static boolean joueur = true;// true pour le blanc et false pour le noir

    static Plateau p = new Plateau(8, 8);

    public static void main(String[] args) {
        // initialisation du plateau avec des pièces
        System.out.println("\n\n*****Bienvenue Au Jeu D'Echecs****\n\n");
        p.afficher();

        Deplacement d = new Deplacement(1, 1, 2, 2);

        System.out.println(d.typeDeplacement());
        System.out.println(d.dist());

        jouerTour(d, joueur);
        p.afficher();
    }

    public static void jouerTour(Deplacement d, boolean joueur) {
        // vider la case de départ, vider la case d'arrivée s'il elle appartient à un
        // adversaire
        // remlir la case d'arrivée avec la nouvelle pièce
        Case caseDepart = p.getCase(d.getX0(), d.getY0());
        // Case caseArrivee = p.getCase(d.getX1(), d.getY1());
        Piece piece;

        if (!caseDepart.estVide()) {
            System.out.println("case de départ non vide");
            System.out.println("la piece est : " + caseDepart.getPiece().toString());

            piece = caseDepart.getPiece();

            if (piece.estValide(d, p))
            // le test si la case d'arrivé est vide se fait au niveau de la fonction
            // estValidee()
            {
                System.out.println(" it s valid");
                p.videCase(d.getX0(), d.getY0());
                p.remplirCase(d.getX1(), d.getY1(), piece);
            }
        }

    }

}
