package jeu;

import pieces.Piece;

public class Echecs {

    public static boolean joueur = true;// true pour le blanc et false pour le noir

    static Plateau p = new Plateau(8, 8);
    static boolean roiCapture = false;

    public static void main(String[] args) {
        // initialisation du plateau avec des pièces
        System.out.println("\n\n*****Bienvenue Au Jeu D'Echecs****\n\n");
        p.afficher();
        jouerPartie();
    }

    public static boolean jouerTour(Deplacement d, boolean joueur)
    // cette méthode retourne true si tout ce fait correctement

    {
        // vider la case de départ, vider la case d'arrivée s'il elle appartient à un
        // adversaire
        // remlir la case d'arrivée avec la nouvelle pièce
        Case caseDepart = p.getCase(d.getX0(), d.getY0());
        Case caseArrivee = p.getCase(d.getX1(), d.getY1());
        Piece piece;

        if (!caseDepart.estVide()) {
            System.out.println("case de départ non vide");
            System.out.println("la piece est : " + caseDepart.getPiece().toString());

            piece = caseDepart.getPiece();

            if (piece.estValide(d, p))
            // le test si la case d'arrivé est vide se fait au niveau de la fonction
            // estValidee()
            {

                System.out.println("Mouvement Valide");

                if (caseArrivee.getPiece() != null) {
                    if (caseArrivee.getPiece().estRoi()) {
                        roiCapture = true;
                    }
                }
                p.videCase(d.getX0(), d.getY0());
                p.remplirCase(d.getX1(), d.getY1(), piece);
                return true;
            }

        }
        return false;
    }

    public static void jouerPartie() {
        boolean validInput;
        boolean stop = false;
        Communication communication = new Communication();
        Deplacement deplacementActuel = null;
        while (!stop) {
            validInput = false;
            while (!validInput) {
                System.out.println("Tour du joueur avec les pièces " + ((joueur) ? "blanches" : "noires"));
                deplacementActuel = communication.demanderDeplacement(joueur);

                if (deplacementActuel != null) {
                    validInput = true;
                } else {
                    System.out.println("entrée non valide");
                }
            }

            // si l'entrée est valide on lance le tour
            jouerTour(deplacementActuel, joueur);

            if (roiCapture)
            // Shah Mat !!!
            {
                System.out.println("fin de partie");
                System.out.println("le joueur " + joueur + " a gagné cette partie");
                stop = true; // on arrêtele jeu
            } else
                joueur = !joueur;// pour alterner les tours

            p.afficher();

        }

    }
}
