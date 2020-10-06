package jeu;

import java.util.*;

/**
 * Communication
 */
public class Communication {

    Scanner scanner = new Scanner(System.in);

    public Deplacement demanderDeplacement(boolean joueur) {
        System.out.println("Entrez les coordonées de votre déplacement (ligne1 colonne1 ligne2 colonne2): ");

        try {
            String[] reponse = scanner.nextLine().split(" ");
            int[] reponseInt = stringArrayToInt(reponse);
            return new Deplacement(reponseInt[0], reponseInt[1], reponseInt[2], reponseInt[3]);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("fausse entrée de coordonnées");
            return null;
        }

    }

    public int[] stringArrayToInt(String[] array) {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] = Integer.parseInt(array[i]);
        }
        return res;

    }

}